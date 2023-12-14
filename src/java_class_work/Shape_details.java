package java_class_work;

   
    class Shape {
    	
    	static float pi = 3.141592653589793238f;
	    public String getname() {
	        return ("I am a shape.");
	    }
	    public float getarea() {
	    	return 0 ;
	    }
	}
	class Circle extends Shape {
		
		float r;
	  
	    public Circle(int i) {
			r = i ;
		}
		public String getname() {
	        return("I am a circle.");
	    
	    }
	    public float getarea() {
	    	return (pi*r*r) ;
	    }
	}
	class Rectangle extends Shape {
		
		float len , brd ;
	    
	    public Rectangle(int i, int j) {
			len = i ;
			brd = j ;
		}
		public String getname() {
	        return("I am a rectangle.");
	    }
	    public float getarea() {
	    	return len * brd ;
	    }
	}
	public class Shape_details {
	    public static void main(String[] args) {
	        Shape shape = new Shape();
	        Shape circle = new Circle(5);
	        Shape rectangle = new Rectangle(7 , 9);

	       
	        System.out.println(shape.getname());
	        System.out.println(circle.getname());
	        System.out.println(rectangle.getname());
	        
	        System.out.println("area of shape is " + shape.getarea());
	        System.out.println("area of circle is " + circle.getarea());
	        System.out.println("area of rectangle is " + rectangle.getarea());
	    }

}
