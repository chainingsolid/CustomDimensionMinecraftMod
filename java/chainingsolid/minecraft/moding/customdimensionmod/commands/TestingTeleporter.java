package chainingsolid.minecraft.moding.customdimensionmod.commands;

import net.minecraft.entity.Entity;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class TestingTeleporter extends Teleporter {
	
	public TestingTeleporter(WorldServer worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void placeInPortal(Entity entityIn, float rotationYaw){
		
		
	}
	@Override
	public boolean placeInExistingPortal(Entity entityIn, float rotationYaw){
		return true;
	}
	@Override
	public void removeStalePortalLocations(long worldTime){
		
		
	}
	
	@Override
	public boolean makePortal(Entity entityIn){
		return false;
	}
	
	
}
