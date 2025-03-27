package strings;

public class demo {
	public static void main(String[] args) 
	{
		
		String s1="hello";
		System.out.println(s1);
		String s2=new String("World");
		System.out.println(s2);
		s1=s1+" "+s2;
		System.out.println(s1);
		s1=s1.concat(" Pradip");
		
		System.out.println(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.contains("hello "));
		
		StringBuffer strbf=new StringBuffer("String Buffer");
		System.out.println(strbf);
		strbf.append(" Hello");
		System.out.println(strbf);
			
		
		StringBuilder strbld=new StringBuilder("String Builder");
		System.out.println(strbld);
		strbld.append(" World");
		System.out.println(strbld);
	}
}

