package programmingHandin1.GCD;

public class GCD
{
  // Euclidean algorithm is the most simple to implement

  public int findGCD1(int a, int b)
  {

    // Implement your method here that uses for loop
    int greastdivisor = 1;
    for (int i = 1; i <= a; i++)
    {
      if (b%i == 0 && a%i == 0){
        greastdivisor = i;
      }else {
      }
    }
    return greastdivisor;
  }

  public int findGCD2(int a, int b)
  {

    int greastdivisor = 1;
    int counter = 0;
    while (counter <= a){
      counter++;

      if (b%counter == 0 && a%counter == 0){
        greastdivisor = counter;
      }

    }
    // Implement your method here that uses a while loop
    return greastdivisor;
  }

  public int findGCD3(int a, int b)
  {
    // Implement your method here that uses for loop
    return findGCD3(b % a, a);
  }
}
