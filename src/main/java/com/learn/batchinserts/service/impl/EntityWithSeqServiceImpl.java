package com.learn.batchinserts.service.impl;

import com.learn.batchinserts.entity.EntityWithSeq;
import com.learn.batchinserts.repository.EntityWithSeqRepository;
import com.learn.batchinserts.service.EntityWithSeqService;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityWithSeqServiceImpl implements EntityWithSeqService {

  private final EntityWithSeqRepository repository;
  private final Random random;

  @Autowired
  public EntityWithSeqServiceImpl(EntityWithSeqRepository repository) {
    this.repository = repository;
    random = new Random();
  }

  @Override
  public boolean saveAll() {
    List<EntityWithSeq> list = new LinkedList<>();
    for (int i = 0; i < 100; i++) {
      list.add(EntityWithSeq.builder().value(String.valueOf(random.nextInt())).build());
    }
    repository.saveAll(list);
    return true;
  }
}
