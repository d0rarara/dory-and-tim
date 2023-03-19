public class Email extends Message {
    private String sender;
    private String receiver;
    private String subject;

    public Email(String text, int contNum, String sender, String receiver, String subject){
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;

    }

    public String getSender(){
        return sender;
    }

    public String getReceiver(){
        return receiver;
    }

    public String getSubject(){
        return subject;
    }

    public void setSender(String newSender){
        sender = newSender;
    }

    public void setReceiver(String newReceiver){
        receiver = newReceiver;
    }

    public void setSubject(String newSubject){
        subject = newSubject;
    }

    public String toString(){
        return super.toString() + '\n' + "Sender: " + sender + "Receiver: " + receiver + '\n' + "Subject: " + subject;
    }

    
}
