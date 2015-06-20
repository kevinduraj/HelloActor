import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class HelloActor extends Actor {

  def receive = {
    case "hello" => println("hello back at you")
    case "kevin" => kevin() 
    case _       => println("huh?")
  }
 
  def kevin(): Unit = {
    println("Yes sir, I am here")

  }

}
