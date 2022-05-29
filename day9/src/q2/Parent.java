package q2;

public class Parent {
  final int number;
  Parent(int x){
	  number = x;
  }
  void method1() {
	  System.out.println("this method1 belongs to Parent class");
	  if(number>=1 && number<=10)
		  System.out.println(number);
	  else
		  System.out.println("Invalid number");
  }
  final void method2() {
	  System.out.println("this method2 belongs to Parent class");
  }
  void method3(){
	  System.out.println("this method3 belongs to Parent class");
  }
}
