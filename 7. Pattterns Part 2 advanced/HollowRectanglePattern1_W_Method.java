//Hollow Rectangle Pattern passing rows and columns as arguments With using the method. 
public class HollowRectanglePattern1_W_Method {
    public static void hallowRectPattern(int totrows, int totcols){
        //outer loop: rows
		for(int i = 1; i<=totrows; i++){
            //inner loop: columns
			for(int j = 1; j <= totcols; j++){
                //boundery cells
				if(i==1 || i==totrows || j==1 || j==totcols){
					System.out.print("* ");
				}else{
					System.out.print("  ");
			    }
		    }
				System.out.print("\n"); 
	    }
	}
	
	public static void main(String[] args){
		hallowRectPattern(4,15);
	}
}