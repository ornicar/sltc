package blog.model

import doc.model._
import util.StringHelper.slugify
import org.scala_tools.time.Imports.DateTime

case class Entry(
  val title: String = "",
  val slug: String = "",
  val createdAt: DateTime = DateTime.now,
  val updatedAt: Option[DateTime] = None,
  val summary: String = "",
  val body: String = "",
  val authorName: String = "",
  val authorBio: String = "",
  val isPublished: Boolean = false,
  val publishedAt: Option[DateTime] = None,
  val relatedPublications: String = "",
  val reference: String = "",
  val readMore: String = ""
) extends Doc {

  def reTitle(t: String) = this.copy(title = t)
}
