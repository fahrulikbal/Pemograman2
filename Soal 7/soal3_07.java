 public class soal3_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n = 1;
		int k = 0;
		int i = 0;
		int j = 0;
 
		do{
			i=0;
			do{
				k=0;
				do{
					n = n*2;
					System.out.println(n);
					k++;
				}
				while(k<2);
				
				i++;
			}
			while(i<4);
			
			j++;
		}
		while(j<6);
	}
}