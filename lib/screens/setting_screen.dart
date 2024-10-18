import 'package:flutter/material.dart';

class SettingScreen extends StatefulWidget {
  const SettingScreen({super.key});

  @override
  State<SettingScreen> createState() => _SettingScreenState();
}

class _SettingScreenState extends State<SettingScreen> {
  bool isDarkTheme = false;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Setting'),
      ),
      body: ListView(
        children: [
          SwitchListTile(
            title: const Text('Dark Mode'),
            value: isDarkTheme,
            onChanged: (val) {
              setState(() {
                isDarkTheme = val;
              });
              print(isDarkTheme);
            },
          ),
          ListTile(
            title: const Text('Language'),
            trailing: const Wrap(
              crossAxisAlignment: WrapCrossAlignment.center,
              alignment: WrapAlignment.center,
              children: [
                Text('English'),
                Icon(Icons.chevron_right, size: 24.0)
              ],
            ),
            onTap: () {},
          ),
          ListTile(
            title: const Text('Currency'),
            trailing: const Wrap(
              crossAxisAlignment: WrapCrossAlignment.center,
              alignment: WrapAlignment.center,
              children: [Text('USD'), Icon(Icons.chevron_right, size: 24.0)],
            ),
            onTap: () {},
          ),
          ListTile(
            title: const Text('About'),
            trailing: const Icon(Icons.chevron_right),
            onTap: () {},
          ),
        ],
      ),
    );
  }
}
