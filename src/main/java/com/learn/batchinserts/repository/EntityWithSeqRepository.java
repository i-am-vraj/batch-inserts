package com.learn.batchinserts.repository;

import com.learn.batchinserts.entity.EntityWithSeq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityWithSeqRepository extends JpaRepository<EntityWithSeq, Long> {}
