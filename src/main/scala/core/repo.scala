package sltc.core

import com.novus.salat._
import com.novus.salat.global._
import com.mongodb.casbah.Imports._

abstract class Repo[M <: CaseClass] {

  def collection: MongoCollection

  def mapper: Grater[M]

  def index() = {}

  def drop() { collection remove MongoDBObject.empty }

  def save(obj: M) { collection insert serialize(obj) }

  def remove(obj: M) { collection remove serialize(obj) }

  def findAll: Iterator[M] = find(MongoDBObject())

  def find(query: MongoDBObject): Iterator[M] =
     collection find query map unserialize

  def unserialize(dbo: DBObject): M = mapper asObject dbo

  def serialize(obj: M): DBObject = mapper asDBObject obj
}
