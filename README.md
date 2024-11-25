# Real Time Chat Application

A **Real-Time Chat Application** built with modern web technologies to demonstrate WebSocket-based messaging, featuring a user-friendly interface and real-time message updates.

![Chat App Screenshot]([src/main/java/org/chat/chatapp/images/web socket.PNG](https://raw.githubusercontent.com/ferhatseker180/WebChatApp/refs/heads/master/src/main/java/org/chat/chatapp/images/web%20socket.PNG))  
*Figure: Interface of the Real-Time Chat Application*

---

## 🔧 **Technologies Used**

### Backend
- **Spring Boot**: Simplifies Java development for creating RESTful APIs and WebSocket services.
- **Spring WebSocket**: For enabling real-time bidirectional communication between clients and the server.
- **STOMP Protocol**: Message handling over WebSockets.
- **SockJS**: Fallback options for browsers that don’t natively support WebSockets.

### Frontend
- **HTML5**: Structure and layout of the web interface.
- **Bootstrap**: Styling and responsive design.
- **JavaScript**: Interactivity and real-time WebSocket communication.
- **SockJS Client**: For establishing WebSocket connections.
- **STOMP.js**: For handling messaging over the WebSocket.

---

## 🚀 **Features**
- Real-time message delivery using WebSocket.
- User-friendly interface with Bootstrap styling.
- Name and message inputs for personalized chatting.
- Automatic scrolling to the latest message in the chat view.
- Fall-back mechanism for older browsers using **SockJS**.

---

## 📁 **Project Structure**
```plaintext
src/
├── main/
│   ├── java/org/chat/chatapp/
│   │   ├── config/       # WebSocket Configuration
│   │   ├── controller/   # Chat Controller
│   │   ├── model/        # Data Models (e.g., ChatMessage)
│   └── resources/
│       ├── static/       # Frontend files (HTML, CSS, JS)
│       └── application.properties
