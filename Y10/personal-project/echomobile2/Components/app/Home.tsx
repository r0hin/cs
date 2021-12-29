import * as React from 'react';
import { Button, Text, View } from 'react-native';
import { createStackNavigator } from '@react-navigation/stack';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { Feather } from '@expo/vector-icons';

import TabHome from '../app/screens/HomeTab';
import TabExplore from '../app/screens/ExploreTab';
import TabInbox from '../app/screens/InboxTab';

import '../auth/Firebase'
import DetailsScreen from './navigation/Details'
import { useState } from 'react';

const HomeStack = createStackNavigator();

function HomeStackScreen() {
  const [activePost, setActivePost] = useState('')
  return (
    <HomeStack.Navigator>
      <HomeStack.Screen name="Home">
        {props => <TabHome {...props} extraData={setActivePost} />}
      </HomeStack.Screen>

      <HomeStack.Screen name="Details">
        {props => <DetailsScreen {...props} extraData={activePost} />}
      </HomeStack.Screen>
    </HomeStack.Navigator>
  );
}

const ExploreStack = createStackNavigator();

function ExploreStackScreen() {
  return (
    <ExploreStack.Navigator>
      <ExploreStack.Screen name="Explore" component={TabExplore} />
      <ExploreStack.Screen name="Details" component={DetailsScreen} />
    </ExploreStack.Navigator>
  );
}

const InboxStack = createStackNavigator();

function InboxStackScreen() {
  return (
    <InboxStack.Navigator>
      <InboxStack.Screen name="Inbox" component={TabInbox} />
      <InboxStack.Screen name="Details" component={DetailsScreen} />
    </InboxStack.Navigator>
  );
}


const Tab = createBottomTabNavigator();

export default function Home() {
  return (
    <Tab.Navigator tabBarOptions={{}}>
      <Tab.Screen name="Home" component={HomeStackScreen} options={{
        tabBarLabel: 'Home',
        tabBarIcon: ({ color, size }) => (
          <Feather name="home" size={size} color={color} />
        ),
      }} />
      <Tab.Screen name="Explore" component={ExploreStackScreen} options={{
        tabBarLabel: 'Explore',
        tabBarIcon: ({ color, size }) => (
          <Feather name="compass" size={size} color={color} />
        ),
      }}/>
      <Tab.Screen name="Inbox" component={InboxStackScreen} options={{
        tabBarLabel: 'Inbox',
        tabBarIcon: ({ color, size }) => (
          <Feather name="inbox" size={size} color={color} />
        ),
      }}/>
    </Tab.Navigator>
  );
}