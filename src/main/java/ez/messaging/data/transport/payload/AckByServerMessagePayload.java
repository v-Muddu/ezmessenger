package ez.messaging.data.transport.payload;

public class AckByServerMessagePayload {
    private String messageId;

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageId() {
        return messageId;
    }
}
