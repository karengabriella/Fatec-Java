package EDexercicios;
public class metodosrecursivos {
	

 //---Exercicio 02, 06 - Fatorial
      
      public int fatorial(int num){
    	  
       	  if(num == 0){
  	    return 1;
  	   }
  	   return num * fatorial(num-1);
       }
  	        
//Exercicio 07 - Soma Total
   
   public int somatotal(int num){
    
	   if(num == 0){
	     return num;
	   }
	   return num += somatotal(num-1);
    }  
    
//Exercicio 08 - Soma dos Pares
   
   public int somapares(int num, int aux){  
	   
	   if(num % 2 == 0 || num == 2){
	      aux += num;
	   }
	   if(num == 0){
	      return aux;
	   }
	   return num = somapares(num-1,aux); 
    }

//Exercicio 09 - Soma dos ímpares
   
   public int somaimpares(int num, int aux){
	   
	   if(num % 2 != 0){
	      aux += num;
	   }
	   
	   if(num == 0){
	     return aux;
           }
	   return num = somaimpares(num-1,aux);   
    }
   
 }

		 
		
		  
        
	
		
	
	

	
	
	

