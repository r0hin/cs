// In App.js in a new project

import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { AppearanceProvider, useColorScheme } from 'react-native-appearance';
import { AppLoading } from 'expo'

import { auth, initializefb } from './Components/auth/Firebase';
import AuthUserContext, { AuthUserProvider } from './Components/auth/AuthUserProvider';
import { Provider as PaperProvider, Text } from 'react-native-paper';
import { createStackNavigator } from '@react-navigation/stack';

import Landing from './Components/auth/Landing';
import Home from './Components/app/Home';
import { LightMode, DarkMode, LightModePaper, DarkModePaper } from './Theme/Colors';
import { useContext, useEffect, useState } from 'react';
import { StatusBar } from 'expo-status-bar';
import { useFonts, Ubuntu_400Regular, Ubuntu_300Light, Ubuntu_500Medium, Ubuntu_700Bold } from '@expo-google-fonts/ubuntu';

import * as firebase from 'firebase';
import 'firebase/auth';
import 'firebase/firestore';

initializefb()

const db = firebase.firestore()
const Stack = createStackNavigator();

function App() {
  const {user, setUser} = React.useContext(AuthUserContext)
  const [isLoading, setIsLoading] = useState(true);
  const [showHome, setShowHome] = useState(true);
  const colorScheme = useColorScheme();

  let [fontsLoaded, error] = useFonts({ 
    Ubuntu_400Regular,
    Ubuntu_700Bold,
    Ubuntu_300Light,
    Ubuntu_500Medium,
  })

  useEffect(() => {
    setIsLoading(true);
    // // onAuthStateChanged returns an unsubscriber
    const unsubscribeAuth = auth.onAuthStateChanged(async authUser => {
      await (authUser ? setUser(authUser) : setUser(null));

      if (authUser) {
        console.log('Signed in.');
        setShowHome(true)
      }
      else {
        console.log('Signed out.');
        setShowHome(false)
      }

      setIsLoading(false);

    }) 
    
    //   try {
    //     console.log('
    //   }
    //   console.log(authUser);
    //   if (!authUser) {
    //     setShowHome(false)
    //   }
    //   else {
    //     // Show home page
    //     setShowHome(true)
    //     console.log('Showing HOme');
    //   }New User!');
    //     await (authUser ? setUser(authUser) : setUser(null));
    //     setIsLoading(false);
    //   } catch (error) {
    //     console.log(error);
    // });

    // // unsubscribe auth listener on unmount
    return unsubscribeAuth;
  }, []);

  if (isLoading) {
    return (
      <Text>Loading!</Text>
    )
  }

  if (showHome) {
    return (
      <AuthUserProvider>
        <StatusBar style={colorScheme === 'dark' ? 'light' : 'dark'} />
        <PaperProvider theme={colorScheme === 'dark' ? DarkModePaper : LightModePaper}>
          <AppearanceProvider>
            <NavigationContainer theme={colorScheme === 'dark' ? DarkMode : LightMode}>
              <Stack.Navigator initialRouteName="Landing" screenOptions={{headerShown: false}}>
                <Stack.Screen name="Home" component={Home} />
              </Stack.Navigator>
            </NavigationContainer>
          </AppearanceProvider>
        </PaperProvider>
      </AuthUserProvider>
    );
  }

  return (
    <AuthUserProvider>
      <StatusBar style={colorScheme === 'dark' ? 'light' : 'dark'} />
      <PaperProvider>
        <AppearanceProvider>
          <NavigationContainer theme={colorScheme === 'dark' ? DarkMode : LightMode}>
            <Stack.Navigator initialRouteName="Landing" screenOptions={{headerShown: false}}>
              <Stack.Screen name="Landing" component={Landing} />
            </Stack.Navigator>
          </NavigationContainer>
        </AppearanceProvider>
      </PaperProvider>
    </AuthUserProvider>
  );
}

export default App;