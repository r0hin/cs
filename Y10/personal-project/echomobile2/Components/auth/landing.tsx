import React, { useState } from 'react'
import { View, Image, Text, StyleSheet, ScrollView } from 'react-native';
import { useTheme } from '@react-navigation/native';
import { useFonts, Ubuntu_400Regular } from '@expo-google-fonts/ubuntu';
import { Button, TextInput, Portal, Dialog, Paragraph} from 'react-native-paper';
import { initializefb } from './Firebase';

initializefb()

import * as firebase from 'firebase';
import 'firebase/auth';


const auth = firebase.auth();

export default function Landing() {
  const {colors} = useTheme();
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')
  const [errorText, setErrorText] = useState('')
  const [visible, setVisible] = React.useState(false);
  const showDialog = () => setVisible(true);
  const hideDialog = () => setVisible(false);

  let [fontsLoaded] = useFonts({
    Ubuntu_400Regular,
  });


  async function login() {
    try {
      await auth.signInWithEmailAndPassword(email, password)
      console.log('Probably signed in. No state changes though !');
    } catch (error) {
      setErrorText(error.message)
      showDialog()
    }
  }

  async function signup() {
    try {
      await auth.createUserWithEmailAndPassword(email, password)
      console.log('Probably signed in. No state changes though !');
    } catch (error) {
      setErrorText(error.message)
      showDialog()
    }
  }

  return (
    <ScrollView contentContainerStyle={{ flex: 1, padding: 32, justifyContent: 'center', backgroundColor: colors.background }}>
      <View style={{alignItems: 'center', paddingBottom: 12}}>
        <Image style={styles.image} source={colors.card === 'rgb(255, 255, 255)' ? require('../../assets/Light.png') : require('../../assets/Dark.png')}></Image>
      </View>

      <TextInput style={{paddingBottom: 6}} mode='outlined' label="Email" value={email} onChangeText={text => setEmail(text)} />

      <TextInput style={{paddingBottom: 12}} mode='outlined' secureTextEntry={true} label="Password" value={password} onChangeText={text => setPassword(text)} />

      <Button onPress={login} mode='contained'> Login </Button> 

      <Text style={[styles.or, {color: colors.text}]}>- or -</Text>

      <Button onPress={signup} mode='text'> Sign Up </Button>
      <Portal>
        <Dialog visible={visible} onDismiss={hideDialog}>
          <Dialog.Title>Error</Dialog.Title>
          <Dialog.Content>
            <Paragraph>{errorText}</Paragraph>
          </Dialog.Content>
          <Dialog.Actions>
            <Button onPress={hideDialog}>Done</Button>
          </Dialog.Actions>
        </Dialog>
      </Portal>
    </ScrollView>
  )
}

const styles = StyleSheet.create({
  image: {
    width: 100,
    height: 100,
  },
  or: {
    padding: 12,
    textAlign: 'center',
    fontFamily: 'Ubuntu_400Regular',
  }
});