public class MainMSE {

    public static boolean containsKeyword(Message messageObject, String keyword){
        if(messageObject.toString().indexOf(keyword,0) >= 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Email e1 = new Email("Is your refrigerator running?" , 1112223344 , "Spongebob " , "Squidward" , "Funniest Joke Ever!!");
        Email e2 = new Email("I hate you." , 1113335544 , "Squidward" , "Spongebob " , "Funniest Joke Ever!!");
        SMS s1 = new SMS("Look behind you..." , 1122233445);

        
        assert containsKeyword(e2, "Is your refrigerator running?") == true;

        
        System.out.println(e1);
        System.out.println(s1);
    }
}
