import 'dart:math';

import 'package:flutter/material.dart';
import 'package:flutter_hello/services/auth_server.dart';
import 'package:get/get.dart';

class SignUpScreen extends StatelessWidget {
  SignUpScreen({super.key});

  final auth = AuthService();

  TextEditingController nameController = TextEditingController();
  TextEditingController emailController = TextEditingController();
  TextEditingController passwordController = TextEditingController();
  TextEditingController confirmPasswordController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Sign Up'),
      ),
      body: ListView(
        children: [
          Padding(
            padding: const EdgeInsets.all(18.0),
            child: Column(
              children: [
                const SizedBox(height: 20),
                TextField(
                  controller: nameController,
                  decoration: const InputDecoration(
                      label: Text('Name'),
                      hintText: 'Name',
                      prefixIcon: Icon(Icons.person)),
                ),
                const SizedBox(height: 20),
                TextField(
                  controller: emailController,
                  decoration: const InputDecoration(
                      label: Text('Email'),
                      hintText: 'Email',
                      prefixIcon: Icon(Icons.email)),
                ),
                const SizedBox(height: 10),
                TextField(
                  controller: passwordController,
                  decoration: const InputDecoration(
                    label: Text('Password'),
                    hintText: 'Password',
                    prefixIcon: Icon(Icons.lock),
                    suffixIcon: Icon(Icons.visibility_off_outlined),
                  ),
                  obscureText: true,
                ),
                const SizedBox(height: 10),
                TextField(
                  controller: confirmPasswordController,
                  decoration: const InputDecoration(
                    label: Text('Confirm Password'),
                    hintText: 'Confirm Password',
                    prefixIcon: Icon(Icons.lock),
                    suffixIcon: Icon(Icons.visibility_off_outlined),
                  ),
                  obscureText: true,
                ),
                const SizedBox(height: 20),
                SizedBox(
                  width: double.infinity,
                  child: ElevatedButton(
                    onPressed: () async {
                      if (passwordController.text !=
                          confirmPasswordController.text) {
                        Get.snackbar('Error', 'Password does not match');
                        return;
                      }

                      var res = await auth.signUp(emailController.text,
                          passwordController.text, nameController.text);
                      if (res) {
                        Get.snackbar('Success', 'Sign Up Successful');
                        Navigator.pushNamedAndRemoveUntil(
                            context, '/', (route) => false);
                        return;
                      }
                      Get.snackbar('Error', 'Sign Up Failed');  
                    },
                    child: Text('Sign Up'),
                  ),
                ),
                Row(
                  children: [
                    Text('I have an account?'),
                    TextButton(
                      onPressed: () {
                        Navigator.pushNamed(context, '/signin');
                      },
                      child: Text('Sign In'),
                    )
                  ],
                ),
              ],
            ),
          )
        ],
      ),
    );
  }
}
