import 'dart:convert';

import 'package:flutter_hello/services/auth_server.dart';
import 'package:get/get.dart';

class AppController extends GetxController {
  final auth = AuthService();
  final hidePassword = true.obs;
  final loading = false.obs;
  final isLoged = false.obs;
  final user = {}.obs;
  void initUser() {
    var token = auth.box.read<String>('token') ?? '';
    isLoged.value = token.isNotEmpty;
    if (token.isNotEmpty) {
      user.value = jsonDecode(auth.box.read('user'));
    }
  }
  @override
  void onInit() {
    // TODO: implement onInit
    super.onInit();
    initUser();
  }

}