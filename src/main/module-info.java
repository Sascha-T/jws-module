// :)
module org.java_websocket {
  requires java.base;
 
  exports org.java_websocket;
  exports org.java_websocket.client;
  exports org.java_websocket.drafts;
  exports org.java_websocket.enums;
  exports org.java_websocket.exceptions;
  exports org.java_websocket.extensions;
  exports org.java_websocket.extensions.permessage_deflate;
  exports org.java_websocket.framing;
  exports org.java_websocket.handshake;
  exports org.java_websocket.interfaces;
  exports org.java_websocket.protocols;
  exports org.java_websocket.util;
  exports org.java_websocket.server;
 
  opens org.java_websocket;
  opens org.java_websocket.client;
  opens org.java_websocket.drafts;
  opens org.java_websocket.enums;
  opens org.java_websocket.exceptions;
  opens org.java_websocket.extensions;
  opens org.java_websocket.extensions.permessage_deflate;
  opens org.java_websocket.framing;
  opens org.java_websocket.handshake;
  opens org.java_websocket.interfaces;
  opens org.java_websocket.protocols;
  opens org.java_websocket.util;
  opens org.java_websocket.server;
}
