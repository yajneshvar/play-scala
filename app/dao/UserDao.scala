package dao

import javax.inject.Inject

import models.user
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import slick.lifted.Tag

import scala.concurrent.ExecutionContext

class UserDao @Inject() (protected val dbConfigProvider: DatabaseConfigProvider)(implicit executionContext: ExecutionContext) extends HasDatabaseConfigProvider[JdbcProfile]{
  import profile.api._


  private class UserTable(tag: Tag) extends Table[user](tag, "users"){
    def id = column[Int]("id",O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")
    def password = column[String]("password")
    def fullName = column[String]("fullname")
    def isAdmin = column[Boolean]("isadmin")


  }


}
