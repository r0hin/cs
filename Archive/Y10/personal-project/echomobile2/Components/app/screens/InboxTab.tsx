import React from "react";
import { View, Text, Button } from "react-native";

import firebase from 'firebase/app';
import 'firebase/auth';
import 'firebase/firestore'

export default function TabExplore({navigation}: {navigation: any}) {
  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <Text>Home screen</Text>
      <Button
        title="Go to Details"
        onPress={() => navigation.navigate('Details')}
      />

<Button
        title="sign out"
        onPress={() => firebase.auth().signOut()}
      />
    </View>
  );
}