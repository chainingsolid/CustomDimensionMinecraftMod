package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem.planning.traveltypes;

import java.util.Random;

public enum EnumTravelTypes {
	
	///types for oceans and continents
	LAND,
	WATER,
	LAND_AND_WATER,
	//types for connections
	RIVER,
	LAND_BRIDGE
	;
	
	public static EnumTravelTypes getRandomTypeAny(Random rand){
		return EnumTravelTypes.values()[rand.nextInt(EnumTravelTypes.values().length)];
	}
	
}
