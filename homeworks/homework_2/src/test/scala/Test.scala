import Exercises._
import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
      assert(Exercises.divBy3Or7(-5, -1) == Seq(-3))
    }
    'test_sumOfDivBy3Or5 - {
      assert(sumOfDivBy3Or5(1, 3) == 3)
      assert(sumOfDivBy3Or5(-3, -1) == -3)
      assert(sumOfDivBy3Or5(0, 0) == 0)
      assert(sumOfDivBy3Or5(-10, 10) == 0)
      assert(sumOfDivBy3Or5(25, 30) == 25 + 27 + 30)
    }
    'test_primeFactor - {
      assert(primeFactor(0) == Seq())
      assert(primeFactor(1) == Seq())
      assert(primeFactor(80) == Seq(2, 5))
      assert(primeFactor(98) == Seq(2, 7))
    }
    'test_sumScalars - {
      assert(sumScalars(Vector2D(0, 0), Vector2D(1, 0), Vector2D(0, 0), Vector2D(0, 1)) == 0.0)
      assert(sumScalars(Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0)) == 0)
      assert(sumScalars(Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1)) == 1 + 1 + 1 + 1)
      assert(sumScalars(Vector2D(1, 1), Vector2D(1, 1), Vector2D(-1, 1), Vector2D(1, -1)) == 0)
    }
    'test_sumCosines - {
      assert(sumCosines(Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1)) - 2 <= 0.0001)
      assert(sumCosines(Vector2D(1, -1), Vector2D(1, 1), Vector2D(1, -1), Vector2D(1, 1)) - 0 <= 0.0001)
    }
    'test_sortByHeavyweight - {
      assert(sortByHeavyweight(Map("First" -> (1, 1), "Second" -> (1, 2))) == Seq("First", "Second"))

      val balls: Map[String, (Int, Double)] = Map(
        "Aluminum" -> (3, 2.6889), "Tungsten" -> (2, 19.35), "Graphite" -> (12, 2.1), "Iron" -> (3, 7.874),
        "Gold" -> (2, 19.32), "Potassium" -> (14, 0.862), "Calcium" -> (8, 1.55), "Cobalt" -> (4, 8.90),
        "Lithium" -> (12, 0.534), "Magnesium" -> (10, 1.738), "Copper" -> (3, 8.96), "Sodium" -> (5, 0.971),
        "Nickel" -> (2, 8.91), "Tin" -> (1, 7.29), "Platinum" -> (1, 21.45), "Plutonium" -> (3, 19.25),
        "Lead" -> (2, 11.336), "Titanium" -> (2, 10.50), "Silver" -> (4, 4.505), "Uranium" -> (2, 19.04),
        "Chrome" -> (3, 7.18), "Cesium" -> (7, 1.873), "Zirconium" -> (3, 6.45)
      )

      assert(sortByHeavyweight(balls) ==
        Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten",
          "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium",
          "Magnesium", "Potassium", "Graphite"))
    }
  }
}
