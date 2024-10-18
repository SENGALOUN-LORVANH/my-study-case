import 'package:flutter/material.dart';
import 'package:flutter_hello/controllers/app_controller.dart';
import 'package:flutter_hello/services/auth_server.dart';
import 'package:get/get.dart';

class SignInScreen extends StatelessWidget {
  SignInScreen({super.key});

  final auth = AuthService();
  final email = TextEditingController();
  final password = TextEditingController();

  @override
  Widget build(BuildContext context) {
    final AppController controller = Get.find();
    return Scaffold(
      appBar: AppBar(
        title: Text('Sign In'),
      ),
      body: Obx(() => ListView(
            children: [
              Padding(
                padding: const EdgeInsets.all(18.0),
                child: Column(
                  children: [
                    const SizedBox(height: 20),
                    TextField(
                      controller: email,
                      decoration: const InputDecoration(
                          label: Text('Email'),
                          hintText: 'Email',
                          prefixIcon: Icon(Icons.email)),
                    ),
                    const SizedBox(height: 10),
                    TextField(
                      controller: password,
                      decoration: InputDecoration(
                        label: const Text('Password'),
                        hintText: 'Password',
                        prefixIcon: const Icon(Icons.lock),
                        suffixIcon: IconButton(
                          icon: Icon(controller.hidePassword.value
                              ? Icons.visibility_off_outlined
                              : Icons.visibility_outlined),
                          onPressed: () {
                            controller.hidePassword.toggle();
                          },
                        ),
                      ),
                      obscureText: controller.hidePassword.value,
                    ),
                    const SizedBox(height: 20),
                    SizedBox(
                      width: double.infinity,
                      child: ElevatedButton(
                        onPressed: () async {
                          if (email.text == '') {
                            Get.snackbar('Error', 'Please enter email');
                            return;
                          }
                          if (password.text == '') {
                            Get.snackbar('Error', 'Please enter password');
                            return;
                          }
                          controller.loading.toggle();
                          var req =
                              await auth.signIn(email.text, password.text);
                          controller.loading.toggle();
                          if (req) {
                            controller.initUser();
                            Get.snackbar('Success', 'Sign In Successful');
                            Navigator.pushNamedAndRemoveUntil(
                                context, '/', (route) => false);
                          } else {
                            Get.snackbar('Error', 'Sign In Failed',
                                snackPosition: SnackPosition.BOTTOM);
                          }
                        },
                        child: controller.loading.value
                            ? const SizedBox(
                                width: 8,
                                height: 8,
                                child: CircularProgressIndicator(),
                              )
                            : const Text('Sign In'),
                      ),
                    ),
                    Row(
                      children: [
                        Text('Don\'t have an account?'),
                        TextButton(
                          onPressed: () {
                            Navigator.pushNamed(context, '/signup');
                          },
                          child: Text('Sign Up'),
                        )
                      ],
                    ),
                  ],
                ),
              )
            ],
          )),
    );
  }
}
