import React, { Component } from 'react';
import { View, StyleSheet, Text, Animated } from 'react-native';
import { useFonts, Ubuntu_400Regular, Ubuntu_700Bold } from '@expo-google-fonts/ubuntu';

export interface TabInboxProps {
  colors: any,
  shown: boolean,
}
 
class TabInbox extends Component<TabInboxProps> {
  state = {
  }

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
    })
    const colors = this.props.colors

    return (
      <View style={{display: this.props.shown ? 'flex' : 'none'}}>
        <Text style={[styles.title, {color: colors.text}]}>Inbox</Text>
      </View>
    );
  }
}

export default TabInbox