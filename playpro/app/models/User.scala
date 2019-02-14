package models

import play.api.libs.json.Json

case class User(id: Long, name: String, age: Int)

object User {
  implicit val userFormat = Json.format[User]
}
