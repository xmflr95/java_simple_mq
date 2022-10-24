public class Message {
  private String div;
  private String msg;

  public Message(String div, String msg) {
    this.div = div;
    this.msg = msg;
  }

  public void setDiv(String div) {
    this.div = div;
  }

  public String getDiv() {
    return div;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String getMsg() {
    return msg;
  }
}
