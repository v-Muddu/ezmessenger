package ez.connection.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClientConnectionsRegister {

    private Map<String, ClientConnection> clientConnections;

    public ClientConnectionsRegister() {
        this.clientConnections = new ConcurrentHashMap<>();
    }

    public void registerConnection(String identity, ClientConnection clientConnection) {
        clientConnections.put(identity, clientConnection);
    }

    public void unregisterConnection(String identity) {
        clientConnections.remove(identity);
    }

    public Map<String, ClientConnection> getSnapshot() {
        return new ConcurrentHashMap<>(clientConnections);
    }

}
