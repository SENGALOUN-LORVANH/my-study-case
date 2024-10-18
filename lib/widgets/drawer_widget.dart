import 'package:flutter/material.dart';
import 'package:flutter_hello/controllers/app_controller.dart';
import 'package:get/get.dart';

class DrawerWidget extends StatelessWidget {
  const DrawerWidget({super.key});

  @override
  Widget build(BuildContext context) {
    final AppController controller = Get.find();
    return Drawer(
      child: Obx(() => controller.isLoged.value
          ? Column(
              children: [
                const SizedBox(
                  height: 60,
                ),
                CircleAvatar(
                  radius: 40,
                  child: Text(controller.user['displayName'][0]),
                ),
                Text('${controller.user['displayName']}'),
                Text('${controller.user['email']}'),
                const Divider(),
                ListTile(
                  title: const Text('Profile'),
                  onTap: () {
                    Navigator.pushNamed(context, '/profile');
                  },
                ),
                ListTile(
                  title: const Text('Setting'),
                  onTap: () {
                    Navigator.pushNamed(context, '/setting');
                  },
                ),
                ListTile(
                  title: const Text('Sign Out'),
                  onTap: () {
                    // remove token here
                    Navigator.pushNamedAndRemoveUntil(
                        context, '/signin', (route) => false);
                  },
                ),
              ],
            )
          : Column(
              children: [
                const SizedBox(
                  height: 50,
                ),
                ListTile(
                  title: const Text('Sign In'),
                  onTap: () {
                    Navigator.pushNamed(context, '/signin');
                  },
                ),
                ListTile(
                  title: const Text('Sign Up'),
                  onTap: () {
                    Navigator.pushNamed(context, '/signup');
                  },
                )
              ],
            )),
    );
  }
}
