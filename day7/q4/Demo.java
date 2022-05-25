package q4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Bank obj = getBank("axis");
        if(obj != null)
        {
        	System.out.println("Enter branch name: ");
        	obj.branchName = scan.nextLine();
        	System.out.println("Enter IFSC code: : ");
        	obj.ifscCode = scan.nextLine();
        	scan.close();
            obj.displayDetails();
        }
        else
        {
        	System.out.println("Enter a valid bank");
        }
	}
	public static Bank getBank(String bank) {
        if(bank == "axis") {
    		Bank b1 = new AxisBank();
    		return b1;
        }
        else if(bank == "icici")
        {
        	Bank b2 = new ICICIBank();
        	return b2;
        }
        else
        {
        	return null;
        }
	}

}
