import java.util.*;

public class Pannogenrator {
    // alphabet
    static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // numeric
    static final String numeric = "0123456789";
    // generatePAN 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        String s = sc.next();
        char s1=s.charAt(0);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<4;i++){
            str.append(getRandomCharacter(alphabet));
        }
        StringBuilder num=new StringBuilder();
        for(int i=0;i<4;i++){
            num.append(getRandomCharacter(numeric));
        }
        char chars=getRandomCharacter(alphabet);
        String pan=str.toString()+s1+num.toString()+chars;
        System.out.println("Generated PAN:" + pan);

    }
    private static char getRandomCharacter(String characters){
        Random r=new Random();
        return characters.charAt(r.nextInt(characters.length()));
    }
}