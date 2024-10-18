import 'package:flutter/material.dart';

class ProfileScreen extends StatelessWidget {
  const ProfileScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Profile'),
      ),
      body: ListView(
        children: [
          const CircleAvatar(
            child: Text('M'),
          ),
          const ListTile(
            title: Text('mark@email.com'),
            subtitle: Text('email'),
            trailing: Icon(Icons.edit),
          ),
          ListTile(
            title: const Text('setting'),
            trailing: const Icon(Icons.chevron_right),
            onTap: () {
              Navigator.pushNamed(context, '/setting');
            },
          )
        ],
      ),
    );
  }
}
