//Merissa Joubert u15062440

public class main {
	public static void main(String[] args) {	
            /* Task1 - Recursion warmup */
            
            Recursion task1 = new Recursion();
            System.out.println("==========Task1==============");
            System.out.print("Case 1:");
            System.out.println(task1.recursion(1));
            System.out.print("Case 2:");
            System.out.println(task1.recursion(8));
            System.out.print("Case 3:");
            System.out.println(task1.recursion(5));
            System.out.print("Case 4:");
            System.out.println(task1.recursion(11));
            
            System.out.println("==========Task2==============");
            WordJumble task2 = new WordJumble();
            String myString = "Jim";
            task2.solve(myString, 0);
            task2.printList();
            System.out.println("Total permutations: " + task2.permutations.size());
            task2.reset();
            String myString2 = "Ki";
            task2.solve(myString2, 0);
            task2.printList();
            System.out.println("Total permutations: " + task2.permutations.size());
	           task2.reset();
	    String myString3 = "Mer";
            task2.solve(myString3, 0);
            task2.printList();
            System.out.println("Total permutations: " + task2.permutations.size());
            task2.reset();
            	   String myString4 = "Juan";
            task2.solve(myString4, 0);
            task2.printList();
            System.out.println("Total permutations: " + task2.permutations.size());
            task2.reset();
	   // myString4 = "Juani";
            //task2.solve(myString4, 0);
            //task2.printList();
            //System.out.println("Total permutations: " + task2.permutations.size());
            //task2.reset();
	   /* myString4 = "Merissa";
            task2.solve(myString4, 0);
            task2.printList();
            System.out.println("Total permutations: " + task2.permutations.size());
            task2.reset();*/
            
		
		
		/*
			Below, you will find the expected output for the code above. 
			NOTE: These simple test cases are only intended to give you an idea of whether you are on the right track or not. 
			If your code gives all the output below correctly, that does not necessarily mean that you will receive good marks. 
			There might be some cases that are not tested by the code here, but are tested by Fitchfork.
			It is thus very important that once you get the output below, you also come up with your own test cases to make sure that all possible edge cases are covered.
			******************************************
			Expected output for Recursion
			******************************************
                        recursion
                        ==========Task1==============
                        Case 1:0
                        Case 2:18
                        Case 3:23
                        Case 4:11
			******************************************
			Expected output for the WordJumble 
			******************************************
                        ==========Task2==============
                        [Jim, Jmi, iJm, imJ, mJi, miJ]
                        Total permutations: 6
                        [Ki, iK]
                        Total permutations: 2
		*/
		
	}
	
	
}