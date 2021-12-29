import React, { useEffect, useState } from "react";
import { ScrollView } from "react-native-gesture-handler";
import { View, Text, Button } from "react-native";
import { useTheme } from "@react-navigation/native";

import firebase from 'firebase/app';
import 'firebase/auth';
import 'firebase/firestore'

import Post from "../elements/Post";
const db = firebase.firestore();

export default function TabHome({navigation, extraData}: {navigation: any, extraData: any}) {
  const {colors} = useTheme();

  const [posts, setPosts] = useState<any[] | []>([]);
  useEffect(() => {
    // Grab posts
    console.log('Status: Home loaded - grabbing posts.');
    setPosts([{"caption":"First colored post! ","colorMap":"rgb(137, 172, 206)","comments":1,"file_name":"unknown copy 21612144962237.png","file_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/users%2FL5NjKTveedYfrw8JK9AjThahsT13%2Funknown%20copy%2021612144962237.png?alt=media&token=7f4373fb-1845-4436-afc8-046d545d0784","latest_comment":"null","latest_comment_content":"all subsequent posts will have colored shadows also. (version 1.10.0) 🎉","latest_comment_name":"rohin","latest_comment_photo":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Fflash%20centered.png?alt=media&token=52bc8c63-8cf5-4a7b-815d-40d46dc81da3","latest_comment_uid":"L5NjKTveedYfrw8JK9AjThahsT13","likes":0,"name":"rohin","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Fflash%20centered.png?alt=media&token=52bc8c63-8cf5-4a7b-815d-40d46dc81da3","private":false,"report_weight":0,"reported":false,"status":true,"tags":[],"timestamp":{"seconds":1612144960,"nanoseconds":327000000},"uid":"L5NjKTveedYfrw8JK9AjThahsT13","username":"rohin","id":"z8H31rscovm0ecmWTD0h"},{"comments":1,"file":"echo-home-text_post","file_url":"echo-home-text_post","latest_comment":"null","latest_comment_content":"heyoo","latest_comment_name":"rohin","latest_comment_photo":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Fflash%20centered.png?alt=media&token=52bc8c63-8cf5-4a7b-815d-40d46dc81da3","latest_comment_uid":"L5NjKTveedYfrw8JK9AjThahsT13","likes":1,"name":"zachg","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2FnCc8tY722sQZpIx2YzrbcIELfbv1.png?alt=media","private":false,"report_weight":0,"reported":false,"status":true,"tags":["hello","greeting"],"timestamp":{"seconds":1611432201,"nanoseconds":457000000},"uid":"nCc8tY722sQZpIx2YzrbcIELfbv1","url_content":"hello","url_theme":"dark","username":"zachg","id":"yygFQuF4QPsZrpBHQta6"},{"caption":"New Puppy","comments":1,"file_name":"IMG_67071607022221446.png","file_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/users%2FgHK6TlDP33ZWmwCDPZUf64f7Dw52%2FIMG_67071607022221446.png?alt=media&token=b9ea5b53-8b6c-4cd8-b9b2-7244ccc767f5","latest_comment":"null","latest_comment_content":"🤗🤗🥺","latest_comment_name":"rohin","latest_comment_photo":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Fflash%20centered.png?alt=media&token=52bc8c63-8cf5-4a7b-815d-40d46dc81da3","latest_comment_uid":"L5NjKTveedYfrw8JK9AjThahsT13","likes":3,"name":"jlfree","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2FgHK6TlDP33ZWmwCDPZUf64f7Dw52.png?alt=media","private":false,"report_weight":0,"reported":false,"status":true,"tags":["Dog","Puppy"],"timestamp":{"seconds":1607022228,"nanoseconds":515000000},"uid":"gHK6TlDP33ZWmwCDPZUf64f7Dw52","username":"jlfree","id":"uR5mP5eqjOkZv2PYPk86"},{"comments":1,"file":"echo-home-text_post","file_url":"echo-home-text_post","latest_comment":"null","latest_comment_content":"Identify yourself 🔫🙂","latest_comment_name":"rohin","latest_comment_photo":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Fflash%20centered.png?alt=media&token=52bc8c63-8cf5-4a7b-815d-40d46dc81da3","latest_comment_uid":"L5NjKTveedYfrw8JK9AjThahsT13","likes":0,"name":"trevor","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2FusR3QTPNNVPm2lfzXudrlv0sVIG3.png?alt=media","private":true,"report_weight":0,"reported":false,"status":true,"tags":["test"],"timestamp":{"seconds":1606048074,"nanoseconds":364000000},"uid":"usR3QTPNNVPm2lfzXudrlv0sVIG3","url_content":"sup","url_theme":"dark","username":"trevor","id":"FDTCAlgH0P65BKChG448"},{"caption":"Eon bad","comments":1,"file_name":"WhoAskedTheWatcher1605578326587.png","file_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/users%2FgHK6TlDP33ZWmwCDPZUf64f7Dw52%2FWhoAskedTheWatcher1605578326587.png?alt=media&token=bc6ca67d-6bf2-4ba5-9806-c93590681b05","latest_comment":"null","latest_comment_content":"i asked 😢","latest_comment_name":"rohin","latest_comment_photo":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2Fflash%20centered.png?alt=media&token=52bc8c63-8cf5-4a7b-815d-40d46dc81da3","latest_comment_uid":"L5NjKTveedYfrw8JK9AjThahsT13","likes":2,"name":"jlfree","photo_url":"https://firebasestorage.googleapis.com/v0/b/eongram-87169.appspot.com/o/logos%2FgHK6TlDP33ZWmwCDPZUf64f7Dw52.png?alt=media","private":false,"report_weight":0,"reported":false,"status":true,"tags":["Hypixel","Skyblock","Hypixel Skyblock","Who Asked","Bad","Eon","Cring"],"timestamp":{"seconds":1605578328,"nanoseconds":304000000},"uid":"gHK6TlDP33ZWmwCDPZUf64f7Dw52","username":"jlfree","id":"y5sr3KDKc1Yfw2xrbA2T"}])    
    return;
    db.collection('timelines').doc(firebase.auth().currentUser?.uid).collection('posts').limit(5).orderBy('timestamp', 'desc').get().then(async (postsDocs) => {
      const posts: any[] = [];
      for (let i = 0; i < postsDocs.docs.length; i++) {
        const post = await db.collection('new_posts').doc(postsDocs.docs[i].id).get()
        if (!post.exists) {
          continue;
        }
        posts.push(post.data())
        posts[posts.length - 1 ].id = post.id
      }
      setPosts(posts)
      console.log(JSON.stringify(posts))
    })
  }, []);

  return (
    <ScrollView>
      <Text style={{color: colors.text}}>Home screen</Text>


      {
        (posts as any[]).map((item,i) => <Post navRef={navigation} extraData={extraData} data={item} key={item.id}/>)
      }



      {/* <Button
        title="Go to Details"
        onPress={() => navigation.navigate('Details')}
      /> */}
    </ScrollView>
  );
}