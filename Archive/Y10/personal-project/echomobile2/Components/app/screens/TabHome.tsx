import React, { Component, Dispatch, SetStateAction } from 'react';
import { View, StyleSheet, Text, Animated } from 'react-native';
import Post from '../../app/elements/Post';

export interface TabHomeProps {
  colors: any,
  posts: any[],
  setOwnMounted: Dispatch<SetStateAction<boolean>>,
  shown: boolean,
}
 
export interface TabHomeState {
  posts: any[],
  postUpdate: number,
  onFirst: boolean,
}

class TabHome extends Component<TabHomeProps, TabHomeState> {
  state: TabHomeState = {
    posts: [],
    postUpdate: 0,
    onFirst: true,
  }

  shouldComponentUpdate() {
    return true
  }

  componentDidUpdate(prevProps: any) {
    console.log(this.props);
  }

  componentDidMount() {
    if (this.state.onFirst) {
  
      this.setState({
        onFirst: false,
      })

      this.props.setOwnMounted(true)
      console.log('Mount call.');
    }
  }


  render() {
    const styles = StyleSheet.create({
      title: {
        padding: 36,
        paddingTop: 58,
        fontSize: 36,
        fontFamily: 'Ubuntu_700Bold',
        display: this.state.onFirst ? 'none' : 'flex',
      },
    })

    const colors = this.props.colors

    return (
      <View style={{display: this.props.shown ? 'flex' : 'none'}}>
        <Text style={[styles.title, {color: colors.text}]}>Relevant Posts</Text>

        {this.props.posts.map(post => {
          return (
            <Post key={post.id} data={post} />
          )
        })} 
      </View>
    );
  }
}

export default TabHome