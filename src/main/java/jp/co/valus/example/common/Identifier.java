package jp.co.valus.example.common;

/**
 * ID
 */
public interface Identifier<T extends Identifier> extends ValueObject, Comparable<T> {
}
