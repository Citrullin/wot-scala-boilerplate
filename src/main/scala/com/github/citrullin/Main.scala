package com.github.citrullin

import scala.jdk.CollectionConverters._
import java.net.URI
import city.sane.wot._
import city.sane.wot.thing._

object Main {
  def main(args: Array[String]): Unit = {
    val wot: Wot = DefaultWot.clientOnly()

    try {
      val thing = wot.fetch(new URI("coap://[YOUR_IPV6]/.well-known/wot-thing-description")).get()
      thing.toString().map(print(_))
    } catch {
      case e : Throwable => {
        println("Error while fetching the Thing description")
        println(e)
      }
    }

    ()
  }
}