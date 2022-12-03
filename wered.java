package javaapplication130;
public class wered {

    
    private int inboxNb;
    private String topic;
    private String sender;
    private int date;
    private String decisions;

    public wered() {
    }

    public wered(int inboxNb, String topic, String sender, int date, String decisions) {
        this.inboxNb = inboxNb;
        this.topic = topic;
        this.sender = sender;
        this.date = date;
        this.decisions = decisions;
    }

    public int getInboxNb() {
        return inboxNb;
    }

    public void setInboxNb(int inboxNb) {
        this.inboxNb = inboxNb;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDecisions() {
        return decisions;
    }

    public void setDecisions(String decisions) {
        this.decisions = decisions;
    }

    @Override
    public String toString() {
        return "wered{" + "inboxNb=" + inboxNb + ", topic=" + topic + ", sender=" + sender + ", date=" + date + ", decisions=" + decisions + '}';
    }
    
    
}
