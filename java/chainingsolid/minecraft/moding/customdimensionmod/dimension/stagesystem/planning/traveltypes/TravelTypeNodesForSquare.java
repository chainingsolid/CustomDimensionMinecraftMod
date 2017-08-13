package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem.planning.traveltypes;

import java.util.ArrayList;

public class TravelTypeNodesForSquare{
	
	public int roundedDownChunkCornerX, roundedDownChunkCornerY;
	public int size;
	
	public ArrayList<Double> xPos = new ArrayList<Double>();
	public ArrayList<Double> zPos = new ArrayList<Double>();
	public ArrayList<Double> nodeStrenghts = new ArrayList<Double>();
	public ArrayList<EnumTravelTypes> travelTypes = new ArrayList<EnumTravelTypes>();
	
	public TravelTypeNodesForSquare(int cornerX, int cornerY, int size){
		this.roundedDownChunkCornerX = cornerX;
		this.roundedDownChunkCornerY = cornerY;
		this.size = size;
	}
	
	public void addNode(double x, double z, double strenght, EnumTravelTypes type){
		xPos.add(x);
		zPos.add(z);
		nodeStrenghts.add(strenght);
		travelTypes.add(type);
	}
	
}
