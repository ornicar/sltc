package util

object StringHelper extends StringHelper

trait StringHelper {

  private object Slugifier {
    def slugify(text: String) = trimUnderscores(removeNonWord(text))

    def removeNonWord(text: String) = """\W+""".r.replaceAllIn(text, "_")

    def trimUnderscores(text: String) = """^\_|\_$""".r.replaceAllIn(text, "")
  }

  def slugify(text: String): String = Slugifier.slugify(text)
}
