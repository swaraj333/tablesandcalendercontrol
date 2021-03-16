package tableandcalendercontrol;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int j=1;j<=100;j++)
		{
			if(j % 3==0 && j % 5==0)
			{
				System.out.println("Resolver");
			}
			else if(j % 5 ==0)
			{
				System.out.println("MFive");
			}
			else if(j % 3 ==0 )
			{
				System.out.println("MThree");
			}
			else
			{
				System.out.println(String.valueOf(j));
			}
		}
		for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(i));
            }
        }

	}

}
