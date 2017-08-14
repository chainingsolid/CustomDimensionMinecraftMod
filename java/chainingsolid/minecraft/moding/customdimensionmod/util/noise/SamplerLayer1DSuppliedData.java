package chainingsolid.minecraft.moding.customdimensionmod.util.noise;

public class SamplerLayer1DSuppliedData extends SamplerLayer1D {
	
	
	public double[] suppliedData;
	public int shiftDataCellsInLayerByX;
	
	public SamplerLayer1DSuppliedData(double[] cellWeights, int shiftCellWeightsInLayerByX, double[] suppliedData, int shiftDataCellsInLayerByX) {
		super(cellWeights, shiftCellWeightsInLayerByX);
		this.suppliedData = suppliedData;
		this.shiftDataCellsInLayerByX = shiftDataCellsInLayerByX;
	}
	
	@Override
	public double getValue(int worldX) {
		int shiftedX = (int) (worldX*scaleingX);
		return suppliedData[shiftedX+shiftDataCellsInLayerByX];
	}
	
	
}
