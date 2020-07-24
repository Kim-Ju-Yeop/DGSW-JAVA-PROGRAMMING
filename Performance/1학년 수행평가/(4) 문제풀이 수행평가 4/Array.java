
public class Array {
	public static void main(String[] args) {
		int i,j;
		
		char [][]arr = new char[5][5];
		
		for(i = 0; i < arr.length; i++){
			for(j = 0; j < arr.length; j++){
				if(j==0) {
					arr[i][i] = '$';
				}
			}	
	     }
		
		for(i = 0; i < arr.length; i++) {
			for(char[] e : arr) { 
				if(e[i] == '$') {
					System.out.print(e);
				}
			}
			System.out.println();
		}
	}
}
