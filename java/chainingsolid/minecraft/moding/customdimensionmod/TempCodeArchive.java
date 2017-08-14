package chainingsolid.minecraft.moding.customdimensionmod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class TempCodeArchive {
	
	
	
	/** testing of useing perlain noise for travel type mappings
	 * 
	 double[] noiseArrayWater = noiseWater.generateNoiseOctaves(null, chunkBeingGeneratedX*16, 0, chunkBeingGeneratedY*16, 16, 1, 16, 0.1, 1, 0.1);
		double[] noiseArrayLand = noiseLand.generateNoiseOctaves(null, chunkBeingGeneratedX*16, 0, chunkBeingGeneratedY*16, 16, 1, 16, 0.1, 1, 0.1);
		double[] noiseArrayBoth = noiseBoth.generateNoiseOctaves(null, chunkBeingGeneratedX*16, 0, chunkBeingGeneratedY*16, 16, 1, 16, 0.1, 1, 0.1);
		double[][] noiseArrays = new double[3][];
		Block[] blocks = new Block[3];
		noiseArrays[0] = noiseArrayWater;
		blocks[0] = Blocks.WATER;
		
		noiseArrays[1] = noiseArrayLand;
		blocks[1] = Blocks.DIRT;
		
		noiseArrays[2] = noiseArrayBoth;
		blocks[2] = Blocks.SPONGE;
		
		int i = 0;
		for(int x = 0; x < 16; x++){
			for(int z = 0; z < 16; z++){
				Block b = Blocks.GLASS;
				double strenght = -99999999D;
				for(int index = 0; index < 3; index++){
					if(noiseArrays[index][i] > strenght){
						strenght = noiseArrays[index][i];
						b = blocks[index];
					}
				}
				if(b == Blocks.GLASS){
					System.out.println("-");
					for(int index = 0; index < 3; index++){
						System.out.println("B: "+blocks[index]+" : "+noiseArrays[index][i]);
					}
				}
				primer.setBlockState(x, 1, z, b.getDefaultState());
				i++;
			}
		}
		
	 
	 
	 
	 
	 
	 */
	
	
	
	
	
	
	
	
	
	
}
