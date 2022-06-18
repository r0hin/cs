import React, { Component } from 'react';
import { View, StyleSheet, Text, Animated } from 'react-native';
import { useFonts, Ubuntu_400Regular, Ubuntu_700Bold } from '@expo-google-fonts/ubuntu';
import {logout} from '../../auth/Firebase'
import { Button } from 'react-native-paper';


export interface TabAccountProps {
  colors: any,
  shown: boolean,
}
 
class TabAccount extends Component<TabAccountProps> {

  componentDidMount() {
   
  }

  render() {
    const styles = StyleSheet.create({
      title: {
        padding: 36,
        paddingTop: 58,
        fontSize: 36,
        fontFamily: 'Ubuntu_700Bold',
      },
      signOutButton: {
        marginTop: 12,
      },
      container: {
        width: '100%',
        padding: 36,
        textAlign: 'center',
      }
    })
    const colors = this.props.colors

    return (
      <View style={{display: this.props.shown ? 'flex' : 'none'}}>
        <Text style={[styles.title, {color: colors.text}]}>Account</Text>
        <View style={styles.container}>
          <Button style={styles.signOutButton} onPress={logout} mode="outlined">Sign Out</Button>
        </View>
      </View>
    );
  }
}

export default TabAccount