package Arrays.BasicPrograms;

public class FindOneMissingNumInArray {
    public static void main (String[] args){

                int [] numbers = {1, 2, 4, 5, 6};
                int totalNumbers = 6;
                int totalSumOfAllNumbers = (totalNumbers * (totalNumbers + 1)) / 2;
                System.out.println(totalSumOfAllNumbers);

                // total Sum of the given array
                int sum = 0;

                for (int i = 0; i < numbers.length; i++) {
                    sum = sum + numbers[i];
                }

                System.out.println(sum);

                System.out.println("The missing number is " + (totalSumOfAllNumbers - sum));
            }
        }


