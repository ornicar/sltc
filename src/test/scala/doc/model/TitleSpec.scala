import org.specs2._
import doc.model.Title
import org.scala_tools.time.Imports.DateTime

class TitleSpec extends mutable.Specification {

  "A short title" should {
    "be short" in {
      val t = new Title {
        val title = "this is a very very long title with a colon : separation"
      }
      t.shortTitle must_== "this is a very very long title with a colon"
    }
    "not be too short" in {
      val t = new Title {
        val title = "a short title : the meat is after the colon"
      }
      t.shortTitle must_== "a short title : the meat is after the colon"
    }
  }
}
