import java.lang.management.ManagementFactory

import org.scalatest.{FlatSpec, Matchers}

class Foo2Test extends FlatSpec with Matchers {

  "Foo2" should "print Foo2" in {
    (1 to 5).foreach {
      i =>
        println(s"Foo2[$i][${ManagementFactory.getRuntimeMXBean().getName()}]")
        Thread.sleep(1000)
    }
  }
}
