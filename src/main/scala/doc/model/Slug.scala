package sltc.doc.model

import sltc.util.StringHelper

trait Slug extends Title {
  val slug: String

  def slugify(text: String): String = StringHelper.slugify(text)
}
