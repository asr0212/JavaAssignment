package q2;

final public class Child extends Parent{
	Child(int x){
		super(x);
	}
	  void method1() {
		  System.out.println("this method1 belongs to Child class");
		  if(number>=1 && number<=10)
			  System.out.println(number);
		  else
			  System.out.println("Invalid number");
	  }
	  void method4(){
		  System.out.println("this method4 belongs to Child class");
	  }
}
