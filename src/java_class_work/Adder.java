package java_class_work;

public class Adder {
	
      /*public static int add(int n1 ,int n2) {
		
		return n1+n2;
	}
	public static int addchar(char a , char b) {
    	  return (a+b);  
      }
       public static float addfloat(float x , float y) {
    	  return x+y;
      }   
      public static boolean andboolean(int x , int y) {
    	  return x > y;
      }
	public static void main(String[] args) {
		
		int n3 = add(50,75);
		System.out.println(n3);
		
		int c =addchar('i' , 'n');
		System.out.println(c);
	
	    float z = addfloat(25.45f , 20.65f);
	    System.out.println(z);
	
        boolean result = andboolean(30 , 5);
        System.out.println(result);
	} */
	
	

	    public Integer addInt(Integer x, Integer y) {
	        Integer result = x + y;
	        return result;
	    }
	    public Character addChar(Character x, Character y) {
	        Character result = (char) (x + y);
	        return result;
	    }
	    public Boolean addBoolean(Boolean x, Boolean y) {
	        Boolean result = x && y;
	        return result;
	    }
	    public Float addFloat(Float x, Float y) {
	        Float result = x + y;
	        return result;
	    }

	    public static void main(String[] args) {
	        Adder ad = new Adder();
	        Integer intresult = ad.addInt(50, 65);
	        Character charresult = ad.addChar('I', 'N');
	        Boolean booleanresult = ad.addBoolean(true, false);

	        
	        Float floatresult = ad.addFloat(20.65f, 30.55f);
	        
	        System.out.println("Result of adding integers: " + intresult);
	        System.out.println("Result of adding charcters: " + charresult);
	        System.out.println("Result of adding booleans: " + booleanresult);
	        System.out.println("Result of adding Floats: " + floatresult);
	    }
	}

	

