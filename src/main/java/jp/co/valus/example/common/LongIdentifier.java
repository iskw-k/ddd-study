package jp.co.valus.example.common;

/**
 * ID (数値)
 */
public interface LongIdentifier<T extends LongIdentifier> extends Identifier<T> {
  long getValue();

  @Override
  default int compareTo(T o) {
    long l0 = getValue();
    long l1 = o.getValue();
    if (l0 == l1) {
      return 0;
    }
    return l0 > l1 ? 1 : -1;
  }
}
