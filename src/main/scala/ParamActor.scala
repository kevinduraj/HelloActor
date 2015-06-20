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
    var cnt=0;
    val params = msg.asInstanceOf[Array[String]]
    println("\n")
    for (i <- 0 to params.size) {
      println(cnt + " " + params(i))
      cnt+=1
    }
  }
}
