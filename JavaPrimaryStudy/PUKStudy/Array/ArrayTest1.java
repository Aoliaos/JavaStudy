package Array;

import java.util.Arrays;
import java.lang.reflect.Array;


public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		//int[] a = new int[] {1,2,3,4,5};//两种都可以
		int[] b = new int[5];
		
		System.arraycopy(a, 0, b, 0,5);
		//c = Arrays.copyOf(a,0,b,0,a.length);
		for(int i=0; i< b.length; i++) {
			System.out.print(b[i]);
		}
		
//		byte[]  srcBytes = new byte[]{2,4,0,0,0,0,0,10,15,50};
//        byte[] destBytes = new byte[5];
//        System.arraycopy(srcBytes, 0, destBytes, 0, 5); 
//        for(int i = 0;i< destBytes.length;i++){
//            System.out.print("-> " + destBytes[i]);
//        }

	}

}
