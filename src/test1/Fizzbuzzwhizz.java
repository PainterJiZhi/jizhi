package test1;

public class Fizzbuzzwhizz {

	public static void main() {
		int i;
       for( i=1;i<=100;i++){
       if(i%3==0||i%10==3||i/10==3){
    	        System.out.println("Fizz");
            }else if(i%3==0&&i%5==0&&i%7==0){
            	System.out.println("FizzBuzzWhizz");
            }else if(i%3==0&&i%5==0){
            	System.out.println("FizzBuzz");
            }else if(i%3==0&&i%7==0){
            	System.out.println("Fizzwhizz");
            }else if(i%5==0&&i%7==0){
            	System.out.println("BuzzWhizz");
            }else if(i%5==0){
            	System.out.println("Buzz");
            }else if(i%7==0){
            	System.out.println("Whizz");
            }else{ 
            	System.out.println("i");
	   }
       }
	}
}
