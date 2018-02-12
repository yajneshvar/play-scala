
package models

import com.mohiva.play.silhouette.api.util.PasswordInfo


case class user(id: Int, name: String, email: String,
                password: String, fullName: String, isAdmin: Boolean)

case class profile(id: Int, email: String, password: String,
                   firstName: String, lastName:String,
                   fullname: String, passwordInfo: Int,isAdmin:Boolean)

case class Cat(name: String, color: String)


case class Dog(name: String, color: String)