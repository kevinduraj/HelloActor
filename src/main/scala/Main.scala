import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object Main extends App {

  val system = ActorSystem("HelloSystem")

  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "kevin"
  helloActor ! "no yo vole"

  val paramActor = system.actorOf(Props[ParamActor], name = "paramactor")

  val kevin1 = Array("name:Kevin Duraj"
                    , "city:Santa Monica"
                    , "title:Programmer"
                    , "language:Scala")

  paramActor ! kevin1
  system.shutdown()

}
