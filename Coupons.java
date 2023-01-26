public class Coupons {
    private int cps = 15;

    public int getCandy() {
        if(cps>=10){
            System.out.println("You can get a candy bar");
            cps = cps - 10;
            return 1;
        } else if(cps >= 3) {
            System.out.println("You can get a gumball");
            cps = cps - 3;
            return 1;

        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        
    }
}
