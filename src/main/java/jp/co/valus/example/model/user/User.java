package jp.co.valus.example.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import jp.co.valus.example.common.AggregateRoot;

/**
 * ユーザ
 */
@Getter
@AllArgsConstructor
@ToString
public class User implements AggregateRoot<UserId> {

  /** ID */
  private UserId id;

  /** 名前 */
  @NonNull
  private String name;

  /**
   * 新規作成
   *
   * @param name 名前
   * @return 新規ユーザ
   */
  public static User create(String name) {
    return new User(null, name);
  }
}
