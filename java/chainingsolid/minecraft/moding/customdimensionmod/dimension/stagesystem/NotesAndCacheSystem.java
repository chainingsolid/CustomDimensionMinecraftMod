package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem;

import java.util.Collection;
import java.util.HashMap;

import chainingsolid.minecraft.moding.customdimensionmod.util.Pair;

public class NotesAndCacheSystem<D>{
	
	private HashMap<String, Pair<Integer, D>> storedData = new HashMap<String, Pair<Integer, D>>();
	
	public void putDataIntoStore(String id, Integer stageRunsWithHitNeededToRemoveFromStore, D data){
		storedData.put(id, new Pair(stageRunsWithHitNeededToRemoveFromStore, data));
	}
	
	public D getData(String id){
		Pair<Integer, D> data = storedData.get(id);
		if(data == null){
			return null;
		}else{
			data.a++;
			return data.b;
		}
	}
	
	public Pair<Integer, D> removeData(String id){
		return storedData.remove(id);
	}
	
	public void endOfStageRunDecramenting(){
		for(String s : storedData.keySet()){
			Pair<Integer, D> pair = storedData.get(s);
			pair.a--;
			if(pair.a == 0){
				storedData.remove(s);
			}
		}
	}
	
	
	
	
	
}
