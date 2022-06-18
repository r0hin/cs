import React, { Component, Dispatch, SetStateAction } from 'react';
import { View, StyleSheet, Text, Animated} from 'react-native';
import { useFonts, Ubuntu_400Regular, Ubuntu_700Bold } from '@expo-google-fonts/ubuntu';
import { Feather } from '@expo/vector-icons';
import { Button, Dialog, Paragraph, Portal, TextInput } from 'react-native-paper';
import {logout} from './Firebase';

import * as firebase from 'firebase';
import 'firebase/auth';
const auth = firebase.auth()

export interface TabHomeProps {
  colors: any,
  modifyFunction: Dispatch<SetStateAction<boolean | undefined>>,
}
 
class Verified extends Component<TabHomeProps> {

  state = {
    visible: false,
    failedEmail: false,
    opacity: new Animated.Value(0),
    opacity2: new Animated.Value(0),
    sentEmail: false,
  }

  componentDidMount() {
    Animated.timing(this.state.opacity, {
      toValue: 1,
      duration: 500,
      useNativeDriver: true,
    }).start();
  }

  render() {
    const styles = StyleSheet.create({
      title: {
        marginTop: 12,
        fontSize: 26,
        fontFamily: 'Ubuntu_700Bold',
      },
      subtitle: {

      },
      container: {
        padding: 36,
        paddingTop: 58,
        textAlign: 'center',
      },
      container2: {
        padding: 36,
        textAlign: 'center',
      },
      field: {
        marginTop: 8,
      }
    })
    const colors = this.props.colors

    const verifyEmail = () => {
      this.setState({sentEmail: true})
      auth.currentUser?.sendEmailVerification()
      showDialog();
    }

    const hideDialog = () => {this.setState({visible: false})
      Animated.timing(this.state.opacity2, {
        toValue: 1,
        duration: 500,
        useNativeDriver: true,
      }).start(() => {
        console.log('After press', this.state.opacity2)
      });
    };
    const showDialog = () => this.setState({visible: true});
    const hideDialog2 = () => this.setState({failedEmail: false});
    const showDialog2 = () => this.setState({failedEmail: true});
    const checkVerification = async () => {
      await auth.currentUser?.reload();
      if (auth.currentUser?.emailVerified) {
        // Got to refresh app.tsx
        // Probably by updating a state.
        this.props.modifyFunction(true);
      }
      else {
        showDialog2();
      }
    }

    return (
      <Animated.View {...this.props} style={[ { opacity: this.state.opacity, transform: [ { scale: this.state.opacity.interpolate({ inputRange: [0, 1], outputRange: [0.85, 1], }) }, ], }, ]} >
        <Portal>
          <Dialog visible={this.state.visible} onDismiss={hideDialog}>
            <Dialog.Title>Success</Dialog.Title>
            <Dialog.Content>
              <Paragraph>Check your inbox for the confirmation email.</Paragraph>
            </Dialog.Content>
            <Dialog.Actions>
              <Button onPress={hideDialog}>Done</Button>
            </Dialog.Actions>
          </Dialog>
        </Portal>
        <Portal>
          <Dialog visible={this.state.failedEmail} onDismiss={hideDialog2}>
            <Dialog.Title>Error</Dialog.Title>
            <Dialog.Content>
              <Paragraph>Your email is not verified. Ensure you have clicked the link.</Paragraph>
            </Dialog.Content>
            <Dialog.Actions>
              <Button onPress={hideDialog2}>Done</Button>
            </Dialog.Actions>
          </Dialog>
        </Portal>
        <View style={styles.container}>
          <Feather name="plus-square" size={32} color={colors.text} />
          <Text style={[styles.title, {color: colors.text}]}>Verify Your Email</Text>
          {/* <TextInput label="Email" value={text} onChangeText={text => setText(text)}/> */}
          <Button onPress={verifyEmail} mode="text">Send Verification Email</Button>
          {/* <Button onPress={logout} mode="outlined">Sign Out</Button> */}
        </View>
          
        <Animated.View {...this.props} style={[ { opacity: this.state.opacity2, transform: [ { scale: this.state.opacity2.interpolate({ inputRange: [0, 1], outputRange: [0.85, 1], }) }, ], }, ]} >
          <View style={[styles.container2]}>
            <Text style={{color: this.props.colors.text}}>Tap the button below after confirmation.</Text>
            <Button onPress={checkVerification}>Check Verification</Button>
          </View>
        </Animated.View>
      </Animated.View>
    );
  }
}

export default Verified