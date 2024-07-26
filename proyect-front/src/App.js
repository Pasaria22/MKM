import React, { Component } from 'react';
import { Provider } from 'react-redux';
import { configureSagaStore } from './store/store'
import './App.css';

export const store = configureSagaStore();

export default function App() {

  return (
    <Provider store={store}>

    </Provider>
  )

}


