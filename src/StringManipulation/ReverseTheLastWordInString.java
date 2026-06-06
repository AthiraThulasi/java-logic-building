package StringManipulation;

public class ReverseTheLastWordInString {

    public static void main(String[] args){

        String s = "I work at Infosys";

        String[] words = s.split(" ");

        String lastWord = words[words.length - 1];

        for (int i = lastWord.length() - 1; i >= 0; i--) {

            System.out.print(lastWord.charAt(i));
        }
    }
}













     /*
        String s = "I work at Infosys";
        char [] charOutput = s.toCharArray();

        for(int i = charOutput.length-1;i >=0; i--){
            if(charOutput[i] != ' '){
                System.out.print(charOutput[i]);
            }
            else {
                break;
            }  /*











