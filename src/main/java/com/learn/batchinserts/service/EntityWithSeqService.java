package com.learn.batchinserts.service;

public interface EntityWithSeqService {

  /**
   * generates 100 random values; stores them in db.
   *
   * @return true if saved successfully; throws exception otherwise
   */
  boolean saveAll();
}
