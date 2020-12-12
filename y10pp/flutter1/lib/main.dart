import 'package:flutter/material.dart';

//Custom widgets
import 'JobsListView.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Reddit One',
      home: Scaffold(
        appBar: AppBar(
          title: Text('List of programming jobs'),
        ),
        body: Center(child: JobsListView()),
      ),
    );
  }
}
