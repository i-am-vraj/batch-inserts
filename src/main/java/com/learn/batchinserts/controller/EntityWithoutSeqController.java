package com.learn.batchinserts.controller;

import static com.learn.batchinserts.utils.Constants.ENTITY_WITHOUT_SEQ_CONTROLLER_MAPPING;
import static com.learn.batchinserts.utils.Constants.PATH_ALL;

import com.learn.batchinserts.service.EntityWithoutSeqService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = ENTITY_WITHOUT_SEQ_CONTROLLER_MAPPING)
public class EntityWithoutSeqController {

  private final EntityWithoutSeqService service;

  @Autowired
  public EntityWithoutSeqController(EntityWithoutSeqService service) {
    this.service = service;
  }

  @PostMapping(path = PATH_ALL)
  public ResponseEntity<Boolean> saveAll() {
    log.info("got a call to save all entities without seq");
    return new ResponseEntity<>(service.saveAll(), HttpStatus.OK);
  }
}
