package com.learn.batchinserts.repository;

import com.learn.batchinserts.entity.EntityWithoutSeq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityWithoutSeqRepository extends JpaRepository<EntityWithoutSeq, Long> {}
