import java.lang.management.ManagementFactory

import org.scalatest.{FlatSpec, Matchers}

class Bar1Test extends FlatSpec with Matchers {

  "Bar1" should "print Bar1" in {
    (1 to 5).foreach{
      i => println(s"Bar1[$i][${ManagementFactory.getRuntimeMXBean().getName()}]")
      Thread.sleep(1000)
    }
  }
}
