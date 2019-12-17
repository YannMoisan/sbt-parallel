import java.lang.management.ManagementFactory

import org.scalatest.{FlatSpec, Matchers}

class Foo1Test extends FlatSpec with Matchers {

  "Foo1" should "print Foo1" in {
    (1 to 5).foreach {
      i =>
        println(s"Foo1[$i][${ManagementFactory.getRuntimeMXBean().getName()}]")
        Thread.sleep(1000)
    }
  }
}
