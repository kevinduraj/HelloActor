import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object Main extends App {

  val system = ActorSystem("HelloSystem")
  // default Actor constructor

  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "kevin"
  helloActor ! "no yo vole"

  val paramActor = system.actorOf(Props[ParamActor], name = "paramactor")
  //paramActor ! "one|two|three|four|five|six|seven"
  val kevin1 = Array("Hello", "world", "it's", "me")
  paramActor ! kevin1

  system.shutdown()

}
