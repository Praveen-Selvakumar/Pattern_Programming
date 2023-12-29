import java.util.*;
   
   
   
@SuppressWarnings("unchecked")
class Pattern1{
	
    

  public static void main(String[] args){
	  
	  
	  /*
	  
	  * * * * *
	  * * * * *
	  * * * * *
	  * * * * *
	  * * * * *
	  
	  */
	  
	  
	  for(int i=0;i<5;i++){
		  for(int j=0;j<5;j++){
			   System.out.print("*  ");
		  }
		  System.out.println();
	  }
	  
	  System.out.println();
	  int i=0, j=0;
	  
	  while(i < 5){
		  while(j < 5){
		  System.out.print("*  ");
		  j++;
	     }
		 System.out.println();
		 j=0;
		 i++;
	  }
	 
	
	
	 
	 
 
  }
  
        
   
   
   
}