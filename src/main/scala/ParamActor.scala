import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.Stash

class ParamActor extends Actor with Stash {

  def receive = {

    case msg     => processMessage(msg) 
    //case msg   => println("Received message: '%s' in actor %s".format(msg, self.path.name))
    //case msg   => stash()

  }
 
  def processMessage(msg: Any) {
    println("Message: '%s'".format(msg))
  }

  def kevin(): Unit = {
    println("Yes sir, I am here")

  }

}
