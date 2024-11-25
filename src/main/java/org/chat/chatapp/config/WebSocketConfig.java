package org.chat.chatapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Define the WebSocket endpoint that the client will connect to
        // 'withSockJS()' enables SockJS fallback options for older browsers
        // 'setAllowedOrigins' restricts the allowed origins for WebSocket connections
        registry.addEndpoint("/chat")
                .setAllowedOrigins("http://localhost:8080")
                .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Set the prefix for messages bound for the message broker (topics)
        // '/topic' is used for broadcasting messages to multiple subscribers
        registry.enableSimpleBroker("/topic");
        // Define the prefix for messages sent from clients to the server (application destination)
        registry.setApplicationDestinationPrefixes("/app");
    }

}
