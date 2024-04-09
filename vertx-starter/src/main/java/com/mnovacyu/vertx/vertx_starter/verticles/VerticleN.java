package com.mnovacyu.vertx.vertx_starter.verticles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleN extends AbstractVerticle {

  private static final Logger LOG = LoggerFactory.getLogger(VerticleN.class);

  @Override
  public void start(final Promise<Void> startPromise) throws Exception {
    LOG.debug("Start " + getClass().getName() + " with config " + config().toString());
    startPromise.complete();
  }
}
