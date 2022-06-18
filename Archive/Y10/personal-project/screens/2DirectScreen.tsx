import * as React from 'react';
import { StyleSheet, Text, View } from 'react-native';


export default function DirectScreen() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Direct Page</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  title: {
    fontSize: 20,
    fontWeight: 'bold',
  },
  separator: {
    marginVertical: 30,
    height: 1,
    width: '80%',
  },
});
