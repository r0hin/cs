import React, { useState, createContext } from 'react';

const AuthUserContext = React.createContext({
  user: undefined,
  setUser: (user: firebase.User | null) => {}, // <-- indicate setUser is a function
});
export default AuthUserContext;

export const AuthUserProvider = ({ children } : {children: any}) => {
  return (
    <AuthUserContext.Provider value={{ user: undefined, setUser: (user: firebase.User | null) => {}}}>
      {children}
    </AuthUserContext.Provider>
  );
};