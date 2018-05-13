package jp.co.valus.example.common;

/**
 * エンティティ
 */
public interface Entity<IdT extends Identifier> {

  IdT getId();
}
