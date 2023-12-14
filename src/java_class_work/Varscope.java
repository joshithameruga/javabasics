package java_class_work;

public class Varscope {
           static String globalscope = "global variable";
           
           public String instancevariable ="instancevariable";
           
           final String x = "x is final variable" ;
           
           public String method1() {
        	   String localscope ="local variable";
        	   return localscope;
           }
           
           public static void main(String[] args) {
        	   Varscope a = new Varscope();
        	   System.out.println(globalscope);
        	   System.out.println(a.instancevariable);
        	   System.out.println(a.method1());
        	   System.out.println(a.x);
        	   
           }
           
}
