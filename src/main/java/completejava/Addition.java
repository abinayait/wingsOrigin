package completejava;

public class Addition {

	public static void divide(int x, int y) {
	try {
		int k=x/y;
		
		if(k==0) {
			throw new telusko("do not contain zero");
			
		}
	}
		
		catch(telusko e) {
			System.out.println("erro"+ " "+e.getMessage());
		}
	}
}
