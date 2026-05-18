package StringManipulation;

public class ReverseTheLastWordInString {

    public static void main(String[] args){

        String s = "I work at Infosys";
        char [] charOutput = s.toCharArray();

        for(int i = charOutput.length-1;i >=0; i--){
            if(charOutput[i] != ' '){
                System.out.print(charOutput[i]);
            }
            else {
                break;
            }



        }



    }
}
