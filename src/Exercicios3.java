
public class Exercicios3 {
	
	public static void main (String[] args){
		
		/*
		// 150 a 300
		
		for (int i = 150; i <= 300; i++){
			System.out.println(i);
		}
		*/
		
		/*
		int a = 0;
		for(int i = 0; i <= 1000; i++){
			//a = a + i;
			// ou
			a += i;
			
		}
		System.out.println(a);
		*/
		
		/*
		for (int i = 0; i <= 100; i++){
			if (i % 3 == 0){
				System.out.println(i);
			}
			
		}
		
		
		long fatorial = 1;
		for(long n = 1; n <= 1000; n++){
			
			//fatorial = fatorial * n;
			//ou
			fatorial *= n;
			
			System.out.println(fatorial);
			
		}
		*/
		/*
		int n1 = 1;
		int n2 = 1;
		int total = 0;
		for(int n = 0; n <= 100; n++){
			System.out.print(total+", ");
			n2 = total;
			total += n1;
			n1 = n2;
			
			if (total > 100) { break; }
		}
		
		/*
		 *  total = 0
		 *  n2(1) = total (0) ==> n2 = 0
		 *  total(0) += n1(1) ==> total = 1
		 *  n1(1) = n2(0) ==> n1 == 0
		 *  
		 *  total = 1
		 *  n2(0) = total(1) ==> n2 = 1
		 *  total(1) += n1(0) ==> total = 1
		 *  n1(0) = n2(1) ==> n1 = 1
		 *  
		 *  total = 1
		 *  n2(1) = total(1) ==> n2 = 1
		 *  total(1) += n1(1) ==> total = 2
		 *  n1(1) = n2(1) ==> n1 = 1
		 * */
		
		/*
		int x = 13;
		int resultado = 0; 
		
		System.out.print(x +" - ");
		
		do {
			
			if (x % 2 == 0){
				resultado = x / 2; 
			}else{
				resultado = 3 * x + 1;
			}			
						
			x = resultado;
			System.out.print(resultado+" - ");
		}
		while (x > 1);
		*/
		int resultado = 0;
		for(int i = 13; i > 1; ) {
			
			if (i % 2 == 0){ 
				resultado = i /= 2; 
			} else { 
				resultado = i *= 3 + 1; 
			}
			
			System.out.println(resultado);
		}
		
		
		
		
	}

}
