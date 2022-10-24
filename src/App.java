import java.util.LinkedList;
import java.util.Queue;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("MQ START");
    
    Message smsMessage = new Message("sms", "This is SMS Message.");
    Message emailMessage = new Message("email", "This is E-Mail Message.");
    Message lineMessage = new Message("line", "This is LINE Message.");

    App.MessageQueue mq = new App.MessageQueue();
    
    mq.sendMessage(smsMessage);
    mq.sendMessage(emailMessage);
    mq.sendMessage(lineMessage);

    while (!mq.isEmpty()) {
      Message mp = mq.poll();
      System.out.println("div : " + mp.getDiv() + ", msg : " + mp.getMsg());
    }

    Message lastq = mq.poll();
    System.out.println(lastq.getDiv() + ", msg : " + lastq.getMsg());
  }

  static class MessageQueue {
    private Queue<Message> queue;

    public MessageQueue() {
      queue = new LinkedList<Message>();
    }

    public boolean isEmpty() {
      return queue.isEmpty();
    }

    public void sendMessage(Message msg) {
      queue.add(msg);
    }

    public Message poll() {
      if (!queue.isEmpty()) {
        return queue.poll();
      } else {
        return new Message("empty", "Queue is Empty!");
      }
    }
  }
}
