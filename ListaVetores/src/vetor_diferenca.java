import java.util.Scanner;
public class vetor_diferenca {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
	    int a[], b[], c[], i=0, j=0, k=0, cont=0, tamC=0;
	    a = new int[TAM];
	    b = new int[TAM];
	    c = new int[TAM];
		
	    for (i=0; i<TAM; i++) {
	    	System.out.print("Digite a " + (i+1) + "� posi��o do vetor A: ");
	        a[i] = ler.nextInt();
	    }
	        
	    for (i=0; i<TAM; i++) {
	    	System.out.print("Digite a " + (i+1) + "� posi��o do vetor B: ");
	        b[i] = ler.nextInt();
	      }

     for(i=0; i<TAM; i++){
     for(j=0; j<TAM; j++){
       if(a[i]!=b[j]){
        tamC++;
              }
            }
      }  
      
      c = new int[TAM];
		
	    for (i=0; i<TAM; i++) {
	    	k=0;
	    	for (j=0; j<TAM; j++) {
	    		if (a[i] == b[j]) {
	    			k++; 
	            }
	        }
	    	if (k==0) {
	    		c[cont] = a[i];
	            cont++;
	        }
	    }
	    
	    System.out.print("C[ ");
	    for (i=0; i<cont; i++) {
	    	System.out.print(c[i] + " ");
	    }
	    System.out.print("]");
		
			ler.close();
	}
}
