package com.github.citrullin

import java.net.URI
import city.sane.wot._
import city.sane.wot.thing._

object Main {
  def main(args: Array[String]): Unit = {
    val wot: Wot = new DefaultWot()
    //coap not supported
    val thing = wot.fetch(new URI("coap://[fe80::9c7c:12ff:fe70:8f55%tapbr0]/.well-known/wot-thing-description")).get();
    val consumedThing: ConsumedThing = wot.consume(thing);
    ()
  }
}