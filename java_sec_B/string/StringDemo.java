import java.lang.*;

public class StringDemo
{
	public static void main(String args[])
	{
		String s1 = "Hello";
		String s2 = "Java";
		String s3 = "World";
		
		String s4 = new String("Hello");
		String s5 = new String("OOP1");
		String s6 = new String("OOP1");
		
		String s7 = "Hello";
		String s8 = new String("Hello");
		
		String s9 = "";
		String s10 = new String();
		
		String msg1 = 20 + 21 + "Hello";
		String msg2 = "Hello" + 20 + 21;
		String msg3 = 20 + "Hello" + 21;
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		
		int age = 20;
		String msg = "I am " + age + " years old.";
		System.out.println(msg);
		
		/*int l = s1.length();
		System.out.println(l);*/
		
		System.out.println(s1.length());
		System.out.println(s5.length());
		System.out.println(msg.length());
		
		/* boolean e = s1.isEmpty();
		System.out.println(e);
		*/
		
		System.out.println(s1.isEmpty());
		System.out.println(s9.isEmpty());
		System.out.println(s10.isEmpty());
		
		char c = s1.charAt(2);
		System.out.println(c);
		
		System.out.println(s3.charAt(1));
		System.out.println(msg.charAt(6));
		
		
		String sub = msg.substring(3, 10);
		System.out.println(sub);
		
		System.out.println(msg.substring(2, 12));
		
		s1.concat(s3);
		System.out.println(s1);
		System.out.println(s3);
		
		String text = s1.concat(s2);
		
		System.out.println(text);
		System.out.println(s1);
		System.out.println(s2);
		
		s2 = "HelloWorld";
		
		s9 = s2.replace('l', 'a');
		
		System.out.println(s9);	
		System.out.println(s2);
		
		text.toUpperCase();
		System.out.println(text);
	
		text = text.toUpperCase();
		System.out.println(text);
		
		
		if(s1 == s7){System.out.println("1");}
		else{System.out.println("2");}
		
		if(s1.equals(s7)){System.out.println("3");}
		else{System.out.println("4");}
		
		if(s1 == s4){System.out.println("5");}
		else{System.out.println("6");}
		
		if(s1.equals(s4)){System.out.println("7");}
		else{System.out.println("8");}
		
		if(s4 == s8){System.out.println("9");}
		else{System.out.println("10");}
		
		if(s4.equals(s8)){System.out.println("11");}
		else{System.out.println("12");}
	}
}