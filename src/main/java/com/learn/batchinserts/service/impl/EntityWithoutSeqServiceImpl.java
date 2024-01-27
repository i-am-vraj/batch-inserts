package com.learn.batchinserts.service.impl;

import com.learn.batchinserts.entity.EntityWithoutSeq;
import com.learn.batchinserts.repository.EntityWithoutSeqRepository;
import com.learn.batchinserts.service.EntityWithoutSeqService;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityWithoutSeqServiceImpl implements EntityWithoutSeqService {

  private final EntityWithoutSeqRepository repository;
  private final Random random;

  @Autowired
  public EntityWithoutSeqServiceImpl(EntityWithoutSeqRepository repository) {
    this.repository = repository;
    random = new Random();
  }

  @Override
  public boolean saveAll() {
    List<EntityWithoutSeq> list = new LinkedList<>();
    for (int i = 0; i < 100; i++) {
      list.add(EntityWithoutSeq.builder().value(String.valueOf(random.nextInt())).build());
    }
    repository.saveAll(list);
    return true;
  }
}
