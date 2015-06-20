import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.Stash

class ParamActor extends Actor with Stash {

  def receive = {

    case msg     => peter(msg) 
    //case msg   => println("Received message: '%s' in actor %s".format(msg, self.path.name))
    //case msg   => stash()

  }
 
  def peter(msg: Any) {
    println("Message: '%s'".format(msg))
  }

  def kevin(): Unit = {
    println("Yes sir, I am here")

  }

}
