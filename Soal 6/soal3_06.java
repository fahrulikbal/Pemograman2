public class soal3_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n = 1;
        int k = 0;
		int i = 0;
		
		do{
			i=0;
			do{
				n = n*2;
				System.out.println(n);
				i++;
			}while(i<4);
			k++;
		}
		while(k<2);
    }
}