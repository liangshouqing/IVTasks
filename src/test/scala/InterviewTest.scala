import org.scalatest.BeforeAndAfter
import org.scalatest.BeforeAndAfterAll
import org.scalatest.FunSuite
import org.scalatest.Matchers

/**
 * Created by SQL on 2015/9/21.
 */

class InterviewTest extends FunSuite with BeforeAndAfterAll with BeforeAndAfter with Matchers{

  override def beforeAll(): Unit = {
    println("before all")
  }

  override def afterAll(): Unit = {
    println("after all")
  }

  before{ println("before") }

  after{ println("after") }

  test("Basic Case Test") {
    Interview.validateSinglePur( 10 ) should be (true)
    Interview.validateSinglePur( -1 ) should be (false)
    Interview.validateSinglePur( 400 ) should be (true)
    Interview.validateSinglePur( 1000 ) should be (false)
    Interview.validateSinglePur( 901 ) should be (false)
  }

  test("Purs") {
    //val purs = Map(("a"-> 100), ("b" -> 400), ("b" -> 400), ("b" -> 400))

    val obj = Interview

    obj.validatePurs("a", 100) should be (true)
    obj.validatePurs("b", 400) should be (true)
    obj.validatePurs("b", 400) should be (true)
    obj.validatePurs("b", 400) should be (false)

  }

  test("Java Collections and Maps test demo"){
    Array(1, 2) should be (Array(1, 2))

    val m: Map[Int, String] = Map(1 -> "One", 2 -> "Two")
    val array = Array(1, 2, 3, 4, 5, 6)
    val lst = List(1, 2, 3, 4, 5, 6)
    lst shouldBe a [List[_]]
    lst shouldBe sorted
    lst should contain noneOf (7, 8, 9)
    //array should contain 6
    array should not contain 7
    m should have size 2
    m.size should be < 3
    m should contain ((1 -> "One"))
    //m should contain (Entry(1, "One"))
    m should contain key 1
    m should contain value "One"
    Some(0) should contain noneOf (7, 8, 9)
    "12345" should contain noneOf ('7', '8', '9')
    List(1, 2, 3, 4, 5) should contain oneOf (5, 7, 9)
    Some(7) should contain oneOf (5, 7, 9)
    "howdy" should contain oneOf ('a', 'b', 'c', 'd')
    "abbccxxx" should startWith regex ("a(b*)(c*)" withGroups ("bb", "cc"))
    //import org.scalactic.Explicitly._
    //import org.scalactic.StringNormalizations._
    //(Array("Doe", "Ray", "Me") should contain oneOf ("X", "RAY", "BEAM")) (after being lowerCased)
  }

}
