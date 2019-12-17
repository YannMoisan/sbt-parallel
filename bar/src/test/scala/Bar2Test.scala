import java.lang.management.ManagementFactory

import org.scalatest.{FlatSpec, Matchers}

class Bar2Test extends FlatSpec with Matchers {

  "Bar2" should "print Bar2" in {
    (1 to 5).foreach {
      i =>
        println(s"Bar2[$i][${ManagementFactory.getRuntimeMXBean().getName()}]")
        Thread.sleep(1000)
    }
  }
}
