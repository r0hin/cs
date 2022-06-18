import React, { Component } from 'react';
import { View, StyleSheet, Text, Animated } from 'react-native';
import { useFonts, Ubuntu_400Regular, Ubuntu_700Bold } from '@expo-google-fonts/ubuntu';

export interface TabExploreProps {
  colors: any,
  shown: boolean,
}
 
class TabExplore extends Component<TabExploreProps> {
  state = {
  }

  componentDidMount() {
;
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
        <Text style={[styles.title, {color: colors.text}]}>Explore</Text>
      </View>
    );
  }
}

export default TabExplore