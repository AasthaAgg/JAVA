import java.io.*;
import java.util.*;
class noTillnWithExactly3Diivisors {
	
	// public int exactly3Divisors(int N){
    //     int count=0;
    //     for(int i=4; i<=N; i++){
    //         int countfact = 0;
    //         for(int j=2; j<i; j++){
    //             if(i % j == 0){
    //                 countfact++;
    //             }
    //             if(countfact>1){
			 //       break;
    //             }
    //         }
    //         if(countfact==1){
			 //   count++;
    //         }
    //     }
    //     return count;
    // }
    
    public static boolean isPrime(int N) {
      
		for(int i=2; i*i<=N; i++){
			if(N % i == 0){
				return false;
			}
		}
		return true;
    }
    
    public static int exactly3Divisors(int N){
        int count=0;
        for(int i=2; i*i<=N; i++){
            if(isPrime(i)){
			    count++;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		System.out.println(exactly3Divisors(N));
	}
		
}

    
