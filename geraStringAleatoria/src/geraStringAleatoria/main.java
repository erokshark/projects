package geraStringAleatoria;

import java.util.Date;
import java.util.Random;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtProcessing;

public class main {

	public static void main(String[] args) {
		
        long tStart = System.currentTimeMillis();
		Random rand = new Random();
		StringBuffer a = new StringBuffer(); 
        int x = 0;

        for (int i = 0; i < 10; i++){ //quantas strings
        	for (int z = 0; z < 5; z++){ //tamanho das strings
        		//x = rand.nextInt(25) + 65; //90 - alfabeto uppercase
        		x = rand.nextInt(77) + 48; //122 - caracteres especiais
        		char c = (char)x;
        		a.append(c);
        	}
        	System.out.println(a);
        	a.delete(0,a.length());
        }
        
        long tEnd = System.currentTimeMillis(); 
        long tResult = tEnd - tStart; 
        System.out.println("Tempo de Execução = "+tResult+" ms"); 
        
	}
	
	//System.out.println(horas());
	
	public static Date horas(){
		Date date = new Date();
		System.out.println(date);
		return date;
	}

}
