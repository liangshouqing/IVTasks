/**
 * Created by SQL on 2015/9/21.
 */
import scala.collection.mutable.Map

object Interview {

  def interviewDemo(n : Int) = {
    n
  }

  def validateSinglePur(mount : Int) : Boolean = {
    mount match {
      case n : Int if n < 0 => println("Wrong Mount");false
      case n : Int if n <= 10 => true
      case n : Int if n > 900 => false
      case _ => true
    }
  }

  val map: Map[String, Int] = Map()

  def validatePurs(useremail: String, mount: Int): Boolean = {
    if (validateSinglePur(mount)) {
      val result = map.get(useremail) match {
        case acc: Some[Int] =>
          acc.get + mount
        case _ =>
          mount
      }
      if (result < 1000) {
        map += (useremail -> result)
        return true
      }else false
    }
    else false
  }

}
