import React, { useCallback, useEffect, useState } from 'react'
import { View, Image, Text, StyleSheet, Dimensions} from 'react-native';
import { useTheme } from '@react-navigation/native';
import { useFonts, Ubuntu_400Regular } from '@expo-google-fonts/ubuntu';
import { Feather } from '@expo/vector-icons';
import { Button, TextInput } from 'react-native-paper';
import { AppLoading, Font } from 'expo'
import { useComponentDidMount} from "../../Theme/Utils";

import { initializefb, logout } from '../auth/Firebase';
import { ScrollView } from 'react-native-gesture-handler';
import Sticky from 'react-stickynode';

import TabHome from './screens/TabHome'
import TabExplore from './screens/TabExplore'
import TabInbox from './screens/TabInbox'
import TabAccount from './screens/TabAccount'

import * as firebase from 'firebase';
import 'firebase/auth';
import 'firebase/firestore'

const db = firebase.firestore()
import Unverified from '../auth/Unverified';
import CompleteProfile from '../auth/completeProfile';

export default function Home() {
  
  const [profileComplete, setProfileComplete] = useState(false);
  const {colors} = useTheme();
  const [activeTab, setActiveTab] = useState(0);
  const [homeTabMounted, setHomeTabMounted] = useState(false);
  const wrapperSetParentState = useCallback(val => {
    gatherPosts()
  }, [homeTabMounted]);
  
  const [isLoading, setIsLoading] = useState(true);
  const [isFirst, setIsFirst] = useState(true)
  const [emailVerify, setEmailVerify] = useState(firebase.auth().currentUser?.emailVerified);
  
  // Refresh contexts
  const [relevantPosts, setRelevantPosts] = useState<any[]>([]);
  
  function gatherPosts() {
    console.log('Gathering Posts');
    setRelevantPosts([{"caption":"How To Get Rainbow Style (Check Comments)","comments":3,"file_name":"Screen Shot 2020-09-29 at 10.25.34 AM1601389703495.png","file_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/users%2F5aGbxAN0dROdz3e3kx8zFcbivHR2%2FScreen%20Shot%202020-09-29%20at%2010.25.34%20AM1601389703495.png?alt=media&token=a6709450-2047-45a9-9aea-1a7e824b0d8c","latest_comment":"null","latest_comment_content":"very cool","latest_comment_name":"Kid Cool","latest_comment_photo":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2FIhCcf2K86eWIpkFjwbMU4bJaKMA3.png?alt=media","latest_comment_uid":"IhCcf2K86eWIpkFjwbMU4bJaKMA3","likes":4,"name":"William","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2F5aGbxAN0dROdz3e3kx8zFcbivHR2.png?alt=media","private":false,"report_weight":0,"reported":false,"status":true,"tags":["Hacking","Rainbow","William","W","Javascript","Secret","Life Hacks","Lifestyle"],"timestamp":{"seconds":1601389704,"nanoseconds":614000000},"uid":"5aGbxAN0dROdz3e3kx8zFcbivHR2","username":"w","id":"1rys3atQlwLfSXSiHhSa"},{"comments":2,"file":"echo-home-text_post","file_url":"echo-home-text_post","latest_comment":"null","latest_comment_content":"This gone","latest_comment_name":"Rohin","latest_comment_photo":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Fflash%20centered.png?alt=media&token=52bc8c63-8cf5-4a7b-815d-40d46dc81da3","latest_comment_uid":"L5NjKTveedYfrw8JK9AjThahsT13","likes":1,"name":"Rohin","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Fflash%20centered.png?alt=media&token=52bc8c63-8cf5-4a7b-815d-40d46dc81da3","private":false,"report_weight":0,"reported":false,"status":false,"tags":["Gourmet Ice Nuggets"],"timestamp":{"seconds":1601950703,"nanoseconds":42000000},"uid":"L5NjKTveedYfrw8JK9AjThahsT13","url_content":"Gourmet Ice Nuggets","url_theme":"deep","username":"rohin","id":"3RU2IKlZDMmlN5fAjjez"},{"comments":0,"file":"echo-home-text_post","file_url":"echo-home-text_post","latest_comment":"null","latest_comment_photo":"null","likes":2,"name":"Josh","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2FC15yc865SYbpyWQ2eBRr9aT9oL83.png?alt=media","private":false,"report_weight":0,"reported":false,"status":true,"tags":["eonisoverparty","eoniscancelled"],"timestamp":{"seconds":1604072874,"nanoseconds":520000000},"uid":"C15yc865SYbpyWQ2eBRr9aT9oL83","url_content":"Eon is canclled","url_theme":"dark","username":"josh","id":"5Pn6FNfvsA5O4PpSUQ7j"},{"caption":"detective fiyah  just lost his memories but not his bars come to his tour","comments":1,"file_name":"0497b372903947b195378afc5572d1eb--goblin-gunslinger copy1604072467208.jpg","file_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/users%2Ft7rkBr8zA8fcx0RMxnt8qB01Y0W2%2F0497b372903947b195378afc5572d1eb--goblin-gunslinger%20copy1604072467208.jpg?alt=media&token=150cd411-ec5e-4015-8d34-725b0b4faa55","latest_comment":"null","latest_comment_content":"nice selfie bro 💜💙","latest_comment_name":"rohin","latest_comment_photo":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Fflash%20centered.png?alt=media&token=52bc8c63-8cf5-4a7b-815d-40d46dc81da3","latest_comment_uid":"L5NjKTveedYfrw8JK9AjThahsT13","likes":2,"name":"Ali","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Ft7rkBr8zA8fcx0RMxnt8qB01Y0W2.png?alt=media","private":false,"report_weight":0,"reported":false,"status":true,"tags":["jojo","dnd","rap","eonisoverparty"],"timestamp":{"seconds":1604072467,"nanoseconds":940000000},"uid":"t7rkBr8zA8fcx0RMxnt8qB01Y0W2","username":"ali","id":"7WGkAxVhIpHrkJSQ9z9S"},{"comments":0,"file":"echo-home-text_post","file_url":"echo-home-text_post","latest_comment":"null","latest_comment_photo":"null","likes":3,"name":"Josh","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2FC15yc865SYbpyWQ2eBRr9aT9oL83.png?alt=media","private":false,"report_weight":0,"reported":false,"status":true,"tags":["willian","jOHN LIU","rice"],"timestamp":{"seconds":1604072176,"nanoseconds":790000000},"uid":"C15yc865SYbpyWQ2eBRr9aT9oL83","url_content":"bRUh","url_theme":"deep","username":"josh","id":"9HjmVozzHf4lMArJFN5m"}])
    return;
    if (firebase.auth().currentUser) {
      const posts: any[] = [];
      db.collection('timelines').doc(firebase.auth().currentUser?.uid).collection('posts').limit(5).get().then(async (postsDocs) => {
        for (let i = 0; i < postsDocs.docs.length; i++) {
          // Make direct request
          const post = await db.collection('new_posts').doc(postsDocs.docs[i].data().id).get()
          posts.push(post.data())
          posts[posts.length - 1 ].id = post.id
        }
        setRelevantPosts(posts);
      })
    }
    else {
      console.log('Not user');
    }
  }
  
  useEffect(() => {
    if (firebase.auth().currentUser !== null) {
      if (firebase.auth().currentUser?.displayName) {
        setIsLoading(false)
        setProfileComplete(true)
      }
      else {
        setIsLoading(false)
        setProfileComplete(false)
      }
    }
    return () => {
    }
  })
  
  const tabItems = [{
    icon: <Feather name="home" size={24} color={colors.text} />,
    label: 'Home',
    active: true,
  }, 
  {
    icon: <Feather name="compass" size={24} color={colors.text} />,
    label: 'Explore',
  },
  {
    icon: <Feather name="inbox" size={24} color={colors.text} />,
    label: 'Inbox',
  },
  {
    icon: <Feather name="user" size={24} color={colors.text} />,
    label: 'Account',
  }]
  
  if (isLoading) {
    return (
      <Text style={{color: colors.text}}>Still Loading...</Text>
      )
    }
    else {
      return (
        <View style={{flex: 1}}>
        {emailVerify ?
          // is the profile complete?
          <View style={{flex: 1}}>
          {profileComplete ? 
            
            
            <View style={{flex: 1, marginTop: 20}}> <ScrollView style={{backgroundColor: 'blue'}}>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>

              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>
              <Text>Filler Text</Text>

              </ScrollView> <View style={{backgroundColor: "red", position: 'absolute', bottom:0}}> <Text>Footer</Text> </View> </View>
            
            
            // <View style={styles.screen}>
            //   <View style={{flex: .8}}>
            //     <TabHome shown={activeTab === 0} setOwnMounted={wrapperSetParentState} key={"TabHomeKey"} posts={relevantPosts} colors={colors}/>
            //     <TabExplore shown={activeTab === 1} colors={colors} />
            //     <TabInbox shown={activeTab === 2} colors={colors} />
            //     <TabAccount shown={activeTab === 3} colors={colors} />
            //   </View>
            //   <View style={{flex: .2}}>
            //     <TabBar style={styles.tabBar} items={tabItems} modifyFunction={setActiveTab}></TabBar>
            //       <View style={[styles.bottomBar, { //@ts-ignore (Theme)
            //         backgroundColor: colors.background2}]} />
            //   </View>
            // </View>
            :
            <CompleteProfile modifyFunction={setProfileComplete} colors={colors} />
          }
          </View>
          :
          <Unverified modifyFunction={setEmailVerify} colors={colors}/>
        }
        </View>
        )
      }
    }
    
    const styles = StyleSheet.create({
      bottomBar: {
        // To allow for the bar to return to home on IOS
        
        shadowOffset:{  width: 10,  height: 10,  },
        shadowColor: 'red',
        shadowOpacity: 1.0,
        
        height: 40,
      },
      tabBar: {
        borderBottomWidth: 0,
      },
      
      
    });