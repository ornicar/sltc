package blog.repo

import core.Repo
import blog.model.Entry
import com.novus.salat._
import com.novus.salat.global._
import com.mongodb.casbah.Imports._

object EntryRepo extends Repo[Entry] {

  lazy val collection = MongoConnection("localhost")("ltc")("blog_entry")

  lazy val mapper = grater[Entry]
}
