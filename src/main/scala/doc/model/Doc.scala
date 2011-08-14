package sltc.doc.model

import org.scala_tools.time.Imports.DateTime

trait Doc extends Title with Slug {
  val createdAt: DateTime
  //val updatedAt: Option[DateTime]
  val summary: String
  val body: String
  val authorName: String
  val authorBio: String
  val isPublished: Boolean
  //val publishedAt: Option[DateTime]
  val relatedPublications: String
  val reference: String
  val readMore: String

  def updatedNow {
    //updatedAt = Some(DateTime.now)
  }
}
