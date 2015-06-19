import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object Main extends App {

  val system = ActorSystem("HelloSystem")
  // default Actor constructor

  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "kevin"

}
