package datastructure;


import java.util.stream.IntStream;

import io.reactivex.*;
public class dsMain {

	public static void main(String[] args) {
		//OnlyStaticFactoryMethod t = new TryToInher();
		//System.out.print(t.getInstance());

		//Observable.<Integer>just(1,2,3).zipWith(Observable.fromCallable(()->10) , (n1,n2)-> n1+n2).subscribe();

		int sum = IntStream.of(1,2,3).reduce(1,(a,b) -> a+b);
	
		System.out.println(sum);
	}

}
