package jp.co.valus.example.model.user;

import java.util.List;

/**
 * ユーザリポジトリ
 */
public interface UserRepository {

  User findOne(UserId id);

  List<User> findAll();

  void save(User user);
}
