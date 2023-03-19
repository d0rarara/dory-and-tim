public class SMS extends Message {
    
    private int contNum = 0;

    public SMS(String text, int contNum){
        super(text);
        this.contNum = contNum;
    }

    public int getContNum(){
        return contNum;
    }

    public void setContNum(int newContNum){
        this.contNum = newContNum;
    }

    public String toString(){
        return super.toString() + '\n' + "Contact number: " + contNum;
    }
}
