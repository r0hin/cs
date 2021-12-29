import React, { Component, Dispatch, SetStateAction } from 'react';
import { View, StyleSheet, Text, Animated} from 'react-native';
import { Feather } from '@expo/vector-icons';
import { Button, Dialog, Paragraph, Portal, ProgressBar, TextInput } from 'react-native-paper';
import {logout} from './Firebase';

import * as firebase from 'firebase';
import 'firebase/auth';
import 'firebase/functions';
const auth = firebase.auth()

export interface CompleteProfileProps {
  colors: any,
  modifyFunction: Dispatch<SetStateAction<boolean>>,
}
 
class CompleteProfile extends Component<CompleteProfileProps> {

  state = {
    opacity: new Animated.Value(0),
    input_name: '',
    input_username: '',
    visible: false,
    progress: 0.0,
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
      textField: {
        marginTop: 12,
        marginBottom: 24,
      },
      subtitle: {
        fontSize: 16,
        textAlign: 'left',
        fontFamily: 'Ubuntu_400Regular',
        width: '100%',
        margin: 8,
        marginTop: 19,
      },
      container: {
        padding: 36,
        paddingTop: 58,
        textAlign: 'center',
      },
      container2: {
        width: '100%',
        textAlign: 'center',
        justifyContent: 'center',
        alignItems: 'center',
        padding: 24,
      },
      field: {
        marginTop: 8,
      },
      button: {
        maxWidth: 290,
        marginTop: 24,
      }
    })
    const colors = this.props.colors

    const createAccount = () => {
      const createAccount = firebase.functions().httpsCallable("createAccount");
      console.log(this.state.input_name, this.state.input_username);
      createAccount({username: this.state.input_username, displayname: this.state.input_name}).then(async (result) => {
        // Account created pog!
        if (result.data) {
          // Success
          await firebase.auth().currentUser?.updateProfile({displayName: this.state.input_name})
          this.props.modifyFunction(true)
        }
        else {
          // Errored out
          console.log('Error');
        }
      })
    }

    const complete = () => {
      // Invoke cloud function and display loader
      createAccount()
      showDialog();
      const interval = setInterval(() => {
        this.setState({progress: this.state.progress + 0.01})
        if (this.state.progress === 1) {
          clearInterval(interval)
          hideDialog()
        }
      }, 100)
      // this.props.modifyFunction(true)
    }

    const showDialog = () => this.setState({visible: true});
    const hideDialog = () => this.setState({visible: false});

    return (
      <Animated.View {...this.props} style={[ { opacity: this.state.opacity, transform: [ { scale: this.state.opacity.interpolate({ inputRange: [0, 1], outputRange: [0.85, 1], }) }, ], }, ]} >
        <Portal>
          <Dialog visible={this.state.visible}>
            <Dialog.Content>
              <View style={styles.container2}>
                <Paragraph style={[styles.subtitle, {color: colors.text}]}>Please wait while we create your account.</Paragraph>
              </View>
              <ProgressBar progress={this.state.progress} color={colors.primary} />
            </Dialog.Content>
          </Dialog>
        </Portal>
        <View style={styles.container}>
          <Feather name="plus-square" size={32} color={colors.text} />
          <Text style={[styles.title, {color: colors.text}]}>Complete Your Profile</Text>
          <Text style={[styles.subtitle, {color: colors.text}]}>Enter your username:</Text>
          <TextInput style={styles.textField} label="Username" value={this.state.input_username} onChangeText={text => this.setState({input_username: text.replace(/\s/g, '')})}/>
          <Text style={[styles.subtitle, {color: colors.text}]}>What's your full name?</Text>
          <TextInput style={styles.textField} label="Name" value={this.state.input_name} onChangeText={text => this.setState({input_name: text})}/>
          {/* <Button onPress={logout} mode="outlined">Sign Out</Button> */}
          <View style={styles.container2}>
            <Button onPress={complete} style={styles.button} mode="contained">Fake Complete Profile</Button>
          </View>
        </View>
      </Animated.View>
    );
  }
}

export default CompleteProfile