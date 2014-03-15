package controllers

import play.api._
import play.api.mvc._
// import akka.actor._
import dispatch._
import scala.io.Source

import play.api.Play.current
import scala.concurrent.duration.DurationInt
import play.api.libs.concurrent.Akka
import play.api.libs.concurrent.Execution.Implicits._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def hoge = Action {
    Ok(views.html.aaa(List("aaa","bbb","ccc")))
  }

  def registration = Action {
    Ok(views.html.registration())
  }

  def list = Action {
    Ok(views.html.list(List(
      ("進捗どうですか？", "締め切りという絶対的存在に挑み、そして儚く散っていった者たちの物語"),
      ("だばだー","だばだーだー"))
    ))
  }
}