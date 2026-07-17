package StringManipulation;

public class PatternPrinting {

        public static  void main (String[] args){
            int totalNumberOfLines = 5;

            for(int row = 1; row <= totalNumberOfLines; row ++){
                for(int col = 1; col <= row;col++){
                    System.out.print(col); // instead of col - if u use * -- * will be printed
                    // don't use ln- nextline
                    // If asked to print a
                    //                    ab
                    //                   abc
                    // System.out.print((char)('a' + col - 1)) // print abc in triangle
                }
                System.out.println(" ");
            }



        }
    }


