package com.it.test;
import org.junit.Test;
/**
 * 
 * @author Jacob
 *	aim:
 *			��Ϸ�������ı�����"Fizz",����ı�����"Buzz",ͬʱ��������ı�����"FizzBuzz",���������ּ��ɡ�
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
