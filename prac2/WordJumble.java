//Merissa Joubert u15062440
import java.util.ArrayList;
import java.util.Collections;

public class WordJumble {
    
    public ArrayList<String> permutations = new ArrayList<String>();
    
    public void solve(String word,int index)
    {
        /*put your code here*/
	    //else
	    //int numChars = 0;
	    //int numWords = 0;
	 int numChars = word.length();
	    int fact = 1;
	    int fact2 = 1;
	    for (int i = 1; i<=numChars;i++)
		fact*=i;
	    
	    int numPermutations = fact;
	    
	    //System.out.println("P"+numPermutations);
	  addToList(word);
	    char [] myword = word.toCharArray();
	    if(permutations.contains(word))
	    {
		if((index<word.length()-1)&&index>=0)
		{
			//System.out.println(index);
			char temp ;
			temp = myword[index+1];
		        myword[index+1]= myword[index];
		        myword[index]= temp;
			word = String.valueOf(myword);
			index++;
			solve(word,index);
			
		}
		
		else if (permutations.size()< (numPermutations))
		{
			
			
				//reset();
			//index = 0;
			int tempI = 0;
			char temp ;
			temp = myword[0];
		        myword[0]= myword[index];
		        myword[index]= temp;
			word = String.valueOf(myword);
			solve(word,tempI++);
			
			
				
		}
	
	   }
		else  if(!permutations.contains(word))
		{
			permutations.remove(word);
			solve(word,index+1);
		}
		else
			return;
		    
	    
	    
	   /* addToList(word);
	    
	    char myWord[] = word.toCharArray();
	    char solvedWord [] = new char [word.length()] ;
	    char temp = myWord[index];
	    String toAdd = new String("");
	    int tempI = 0;
	    
	    if(solvedWord[index]<word.length())
	    {
		    solvedWord[index] = myWord[index];
		    while (tempI< word.length())
		    {
			    solvedWord[tempI] = myWord[tempI];
			    tempI++;
		    }
		    
		    toAdd = String.valueOf(solvedWord);
		    addToList(toAdd);
		    index++;
	    }
	    else if (permutations.size()< numPermutations)
	    {
		    solve(word,index+1);
	    }
	    else
		    
		    return;*/
	    
	    
	    
	    
    }
    
    public void addToList(String add)
    {
        permutations.add(add);
    }
    
    public void printList()
    {
	Collections.sort(permutations);
        System.out.println(permutations);
    }
    
    public void reset()
    {
        permutations = new ArrayList<String>();
    }
    
}
