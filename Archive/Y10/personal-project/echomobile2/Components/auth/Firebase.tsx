import * as firebase from 'firebase';
import 'firebase/auth';

const firebaseConfig = {
  apiKey: "AIzaSyDyiJGiWlgFaMtJA2lerw4lUkGK76Qoxvs",
  authDomain: "eongram-87169.firebaseapp.com",
  databaseURL: "https://eongram-87169.firebaseio.com",
  projectId: "eongram-87169",
  storageBucket: "eongram-87169.appspot.com",
  messagingSenderId: "725793838303",
  appId: "1:725793838303:web:7d110a03b153b6125c056a",
  measurementId: "G-RP86PL9L7B"
};

// Initialize Firebase App
initializefb()
export async function initializefb() {
  if (!firebase.apps.length) {
    console.log('Init');
    await firebase.initializeApp(firebaseConfig);
  }  
}
export const auth = firebase.auth();

export const loginWithEmail = (email: string, password: string) =>
  auth.signInWithEmailAndPassword(email, password);

export const registerWithEmail = (email: string, password: string) =>
  auth.createUserWithEmailAndPassword(email, password);

export const logout = () => auth.signOut();

export const passwordReset = (email: string) => auth.sendPasswordResetEmail(email);