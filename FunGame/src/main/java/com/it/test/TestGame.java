package com.it.test;
import org.junit.Test;
/**
 * 
 * @author Jacob
 *	aim:
 *			游戏，逢三的倍数喊"Fizz",逢五的倍数喊"Buzz",同时是三和五的倍数喊"FizzBuzz",其他喊数字即可。
 */
public class TestGame {
	@Test
	public void testGame(){
		int total = 100;
		for (int i = 1; i <= total; i++) {
			if(i %3 == 0 && i % 5 == 0 ){
				System.out.println("FizzBuzz" + "\n");
			}else if( i % 3 == 0){
					System.out.println("Fizz" + "\n");
			}else if( i %5 == 0 ){
				System.out.println("Buzz" + "\n");
			}else{
					System.out.println(i + "\n");
			}
		}
	}
}
