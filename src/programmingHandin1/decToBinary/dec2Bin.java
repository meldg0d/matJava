package programmingHandin1.decToBinary;

import java.util.Scanner;

public class dec2Bin
{
  public static String convertDec2Bin(int n)
  {
    // We initialise an output as a string
    String binaryNum = "";

    // We throw an exception if there is an illegal input
    if (n < 0)
      throw new IllegalArgumentException();

    // TODO implement method

    int disvor = n;


    while (disvor >= 1){
      if (disvor %2 == 1){
        binaryNum += 1;
        disvor = ((disvor)/2);
      }else {
        binaryNum += 0;
        disvor = (disvor)/2;
      }
    }

    // Reverse the binaryNum string
    StringBuilder reversedBinaryNum = new StringBuilder(binaryNum);
    reversedBinaryNum.reverse();
    binaryNum = reversedBinaryNum.toString();

    return binaryNum;
  }

  public static void main(String[] args)
  {
    while (true)
    {
      System.out.println("Type input:");
      Scanner in = new Scanner(System.in);
      int read = in.nextInt();
      System.out.println(convertDec2Bin(read));
      System.out.println();
    }
  }
}
