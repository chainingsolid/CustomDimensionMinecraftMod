package chainingsolid.minecraft.moding.customdimensionmod.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

public class TeleportationCommand extends CommandBase {
	
	@Override
	public String getName(){
		return "TeleportationCommandFromChainingsolidsCustomDimensionMod";
	}
	
	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public List<String> getAliases() {
		return new ArrayList();
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if(sender instanceof EntityPlayerMP){
			EntityPlayerMP player = (EntityPlayerMP)sender;
			server.getPlayerList().transferPlayerToDimension(player, Integer.parseInt(args[0]), new TestingTeleporter(player.getServerWorld()));
		}
		
	}
	
	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		// TODO Auto-generated method stub
		return new ArrayList();
	}
	
	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		// TODO Auto-generated method stub
		return false;
	}

}
