package chainingsolid.minecraft.moding.customdimensionmod.util;

public class UtilMath {
	
	public static double getDistance2D(double x0, double y0, double x1, double y1){
		return Math.sqrt(
							((x0-x1)*(x0-x1))+
							((y0-y1)*(y0-y1))
						);
	}
	
	public static int cutIntDownToNextLowestMultipleOf(int intToCut, int toMultipleOf){
		int amountToCutBy = intToCut % toMultipleOf;
		return intToCut - amountToCutBy;
	}
	
	
	
}
