import { useTheme } from '@react-navigation/native';
import { BlurView } from 'expo-blur';
import React, { useEffect, useState } from 'react'

import { View, Text, Image, StyleSheet, Dimensions, TouchableHighlight} from 'react-native'
import { Card, Paragraph} from 'react-native-paper';

export default function Post(props: any) {
  const {colors} = useTheme();
  const [likes, setLikes] = useState(0)
  const [comments, setComments] = useState(0)
  
  useEffect(() => {
    // Gather likes and comments.
  }, [])

  return (
    <TouchableHighlight onPress={() => {
      if (props.noTap) {
        return;
      }
      props.navRef.navigate('Details');
      props.extraData(props.data.id)
    }}>
      <View style={[styles.post]}>
        {/* Header */}
        <PostContent data={props.data} />
        <View style={styles.postHeader}>
          <View style={{flexDirection: 'row', alignItems: 'center'}}>
            <Image style={styles.pfp} resizeMode='cover' source={{uri: props.data.photo_url}}></Image>
            <Text style={[styles.pfpname, props.data.file_url === 'echo-home-text_post' ? {color: colors.text} : {}]}>{props.data.username}</Text>
          </View>
          <View>
            <Text>Right aligned</Text>
          </View>
        </View>
        {/* Bottom Bar */}
        <View style={styles.postFooter}>
          <View style={styles.postFooterSide}></View>
          {/* @ts-ignore (Theme) */}
          <BlurView intensity={100} tint={colors.theme} style={styles.postFooterContent} />
          <View style={styles.postFooterSide}></View>
        </View>
      </View>
    </TouchableHighlight>
  )
}

function PostContent(props: any) {
  const [postShadow, setPostShadow] = useState('')
  const [postImgWidth, setPostImgWidth] = useState(0)
  const [postImgHeight, setPostImgHeight] = useState(0)

  if (props.data.file_url === 'echo-home-text_post') {
    console.log(props.data.caption)
    return (
      <View style={{position: 'relative'}}>
        <Card style={[{borderRadius: 20}, styles.postShadow]}>
          <Card.Content>
            <Paragraph>
              {'\n'} {'\n'}
              {props.data.url_content}
              {'\n'} {'\n'}
            </Paragraph>
          </Card.Content>
          {/* <Card.Cover source={{ uri: 'https://picsum.photos/700' }} /> */}
        </Card>
        <Text style={styles.postCaption}>{props.data.caption}</Text>
        <View style={{height: 35, backgroundColor: 'transparent'}}></View>
      </View>
    )
  }

  useEffect(() => {
    Image.getSize(props.data.file_url, (w, h) => {
      const screenWidth = Dimensions.get('window').width - 26 - 26
      const scaleFactor = w / screenWidth
      const imageHeight = h / scaleFactor
      setPostImgWidth(screenWidth);
      setPostImgHeight(imageHeight);
      console.log(h);
    });
  })

  return (
    <View style={{position: 'relative'}}>
      <View style={[styles.postShadow, {borderRadius: 20}, props.data.colorMap !== undefined ? {shadowColor: props.data.colorMap, 
      shadowOpacity: 0.5,
      shadowRadius: 27.00,
      shadowOffset: {height: 32, width: 0},
      elevation: 15,} : {}]}>
        <Image style={[styles.postImage, {height: postImgHeight, width: postImgWidth}, { }]} resizeMode='contain' source={{uri: props.data.file_url}} />
      </View>

      <Text style={styles.postCaption}>{props.data.caption}</Text>

      <View style={{height: 20, backgroundColor: 'transparent'}}></View>
    </View>
  )

}

const styles = StyleSheet.create({
  post: {
    marginLeft: 26,
    marginRight: 26,
    marginBottom: 26,
    margin: 8,
  },
  postImage: {
    width: '100%',
    borderRadius: 20,
    overflow: "hidden",
  },
  postHeader: {
    width: '100%',
    position: 'absolute',
    padding: 12,
    display: 'flex',
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center'
  },
  pfp: {
    width: 36,
    height: 36,
    overflow: "hidden",
    borderRadius: 16,
  },
  pfpname: {
    color: 'white',
    marginLeft: 8,
    lineHeight: 0,
    fontFamily: 'Ubuntu_500Medium',
  },
  postFooter: {
    position: 'absolute',
    flex: 1, flexDirection: 'row',
    height: 40, bottom: 20,
    width: '100%',
  },
  postFooterSide: {
    flex: 0.1,
  },
  postFooterContent: {
    flex: 0.8,
    
    overflow: 'hidden', 

    borderTopLeftRadius: 50,
    borderRadius: 50, 

    width: '100%', 

    shadowColor: "#000",
    shadowOffset: {
      width: 0,
      height: 3,
    },
    shadowOpacity: 0.38,
    shadowRadius: 17.00,

    elevation: 24,
  },
  caption: {

  },
  postCaption: {

  },
  postShadow: {
    shadowColor: "#000",
    shadowOffset: {
      width: 0,
      height: 3,
    },
    shadowOpacity: 0.28,
    shadowRadius: 32.00,

    elevation: 15,
  }
})