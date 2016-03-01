//Merissa Joubert u15062440
public class Recursion {
    
        public int recursion(int num)
        {
            /*put your code here*/
		if( num<=1)
			return 0;
		else if (num>10)
			return num;
		else  
			return recursion(3+(recursion(num*2-1)));
        //    return 0;
            
        }
 
}
