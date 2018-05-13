package jp.co.valus.example.model.user;

import lombok.Value;

import jp.co.valus.example.common.LongIdentifier;

/**
 * ユーザID
 */
@Value(staticConstructor = "of")
public class UserId implements LongIdentifier<UserId> {
  long value;
}
