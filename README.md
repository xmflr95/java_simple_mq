## Simple Message Queue 구현

메시지 큐(Message Queue)를 간단하게 Java로 구현  

### 1. 간략 구조
- App
  - MessageQueue
- Message

### 2. 구현 설명
`Message.java`를 `App.java`에서 내부 클래스로 `MessageQueue`를 만들어 구현  
`MessageQueue` 클래스에는 `Queue`를 이용해 method를 이용하도록 함  
`sendMessage()`로 Queue에 메시지를 전송하고 `poll()`을 이용해 메시지를 순차적으로 Queue에서 빼낼 수 있도록 함
