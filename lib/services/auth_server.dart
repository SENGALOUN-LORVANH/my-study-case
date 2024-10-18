import 'dart:convert';

import 'package:get/get.dart';
import 'package:get_storage/get_storage.dart';

class AuthService extends GetConnect {
  String api = 'https://hsdqwvptbexpgufmcoyb.auth.ap-southeast-1.nhost.run/v1';

  final box = GetStorage();

  void saveUserData(session) {
    box.write('token', session['accessToken']);
    box.write('refreshToken', session['refreshToken']);
    box.write('user', jsonEncode(session['user']));
  }

  Future<bool> signIn(String email, String password) async {
    try {
      final req = await post(
          "$api/signin/email-password", {"email": email, "password": password});
      if (req.statusCode == 200) {
        saveUserData(req.body['session']);
        return true;
      }
      print(req.body);
      return false;
    } catch (e) {
      print("$e");
      return false;
    }
  }

  Future<bool> signUp(String email, String password, String displayName) async {
    try {
      final req = await post(
          "$api/signup/email-password", {
            "email": email, "password": password,
            "options": { "displayName": displayName }
          });
      if (req.statusCode == 200) {
        saveUserData(req.body['session']);
        return true;
      }
      print(req.body);
      return false;
    } catch (e) {
      print("$e");
      return false;
    }
  }
}
