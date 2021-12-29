import React, { useEffect, useState } from "react";
import { View, Text } from "react-native";

import firebase from 'firebase/app';
import 'firebase/auth';
import 'firebase/firestore'
import Post from "../elements/Post";
const db = firebase.firestore();
// Make post request

export default function DetailsScreen({extraData}: {extraData: any | undefined}) {

  const [postData, setPostData] = useState<any>('')

  useEffect(() => {
    db.collection('new_posts').doc(extraData).get().then((doc => {
      setPostData(doc.data())
    }))
  }, []);

  return (
    <View>
      <Post noTap={true} data={postData}></Post>
    </View>
  );
}