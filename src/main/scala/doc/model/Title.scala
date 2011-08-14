package doc.model

trait Title {
  val title: String

  private object Shortener {
    val shortSize = 40
    val shortSep = ':'

    def shortify(title: String): String = title takeWhile (shortSep !=) match {
      case short if (short.size > shortSize) => short.trim
      case _ => title
    }
  }

  def shortTitle: String = Shortener.shortify(title)
}
