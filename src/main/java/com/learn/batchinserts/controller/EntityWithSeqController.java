package com.learn.batchinserts.controller;

import static com.learn.batchinserts.utils.Constants.ENTITY_WITH_SEQ_CONTROLLER_MAPPING;
import static com.learn.batchinserts.utils.Constants.PATH_ALL;

import com.learn.batchinserts.service.EntityWithSeqService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = ENTITY_WITH_SEQ_CONTROLLER_MAPPING)
public class EntityWithSeqController {

  private final EntityWithSeqService service;

  @Autowired
  public EntityWithSeqController(EntityWithSeqService service) {
    this.service = service;
  }

  @PostMapping(path = PATH_ALL)
  public ResponseEntity<Boolean> saveAll() {
    log.info("got a call to save all entities with seq");
    return new ResponseEntity<>(service.saveAll(), HttpStatus.OK);
  }
}
