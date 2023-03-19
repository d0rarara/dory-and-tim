public class Message{
    protected String text;
    
    public Message(String text){
        this.text = text;
    }


    public void setText(String newText){
        text = newText;
    }

    public String toString(){
        return "Text: " + text;
    }
}