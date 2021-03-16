package tableandcalendercontrol;

public class isnumeric {

	
	public static boolean isempty(CharSequence cs)
	{
		return cs==null||cs.length()==0;
	}
	
	
	
	
	
	public static boolean isnumeric(CharSequence cs)
	
	{
		if(isempty(cs)){
			return false;
			
		}
		//if(cs==null||cs.length()==0){
			//return false;
		//}
		
		
		for(int i=0;i<cs.length();i++){
			if( ! Character.isDigit(cs.charAt(i))){
				return false;
			}
			
		}
		return true;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isnumeric(null));
		System.out.println(isnumeric(""));
		System.out.println(isnumeric("  "));
		System.out.println(isnumeric("0"));//true
		System.out.println(isnumeric("swaraj"));
		System.out.println(isnumeric("1233"));//true
		System.out.println(isnumeric("1 2 4"));//false
		System.out.println(isnumeric("swaraj234"));//false
		System.out.println(isnumeric("+123"));
		System.out.println(isnumeric("-123"));
		System.out.println(isnumeric("123swa"));
		System.out.println(isnumeric("\u0969"));//true unicode

	}

}
