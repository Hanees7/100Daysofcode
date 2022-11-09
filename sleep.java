import java.util.*;
import java.lang.Thread;

class sleep {
	public static void main(String[] args)
	{
		try {
			for (int i = 0; i <=5; i++) {
		
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
