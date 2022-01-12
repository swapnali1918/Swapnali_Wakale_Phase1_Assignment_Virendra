package core.programs.string;

public class StringPool {

	public static void main(String[] args) {
		String t="Delhi";
		String o="Mumbai";
		String k= "delhi";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		
		if(o.equals(l))
			System.out.println("o equal to l True ");
		else
			System.out.println("o not equal to l false ");
		if(y.equals(p))
			System.out.println("y equal p True ");
		else
			System.out.println("y not equal to p false ");
		if(t.equals(o))
			System.out.println("t equal o True ");
		else
			System.out.println("t not equal to o false  ");
		if(k.equals(y))
			System.out.println("k equal y True  ");
		else
			System.out.println("k not equal to y false  ");
		if(p.equals(y))
			System.out.println("p equal y True  ");
		else
			System.out.println("p not equal to y false  ");
		
		if(o==l)
			System.out.println("o equal to l True ");
		else
			System.out.println("o not equal to l false ");
		if(y==p)
			System.out.println("y equal p True ");
		else
			System.out.println("y not equal to p false ");
		if(t==o)
			System.out.println("t equal o True ");
		else
			System.out.println("t not equal to o false  ");
		if(k==y)
			System.out.println("k equal y True  ");
		else
			System.out.println("k not equal to y false  ");
		if(p==y)
			System.out.println("p equal y True  ");
		else
			System.out.println("p not equal to y false  ");
	}

}
