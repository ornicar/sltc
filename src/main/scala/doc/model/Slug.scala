package doc.model

import util.StringHelper

trait Slug extends Title {
  val slug: String

  def slugify(text: String): String = StringHelper.slugify(text)
}
