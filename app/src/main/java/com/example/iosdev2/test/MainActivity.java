package com.example.iosdev2.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
import React, { Component } from 'react';
        import { Text, View } from 'react-native';

        export default class HelloWorldApp extends Component {
    render() {
        return (
                <View>
        <Text>Hello world!</Text>
      </View>
    );
    }
}