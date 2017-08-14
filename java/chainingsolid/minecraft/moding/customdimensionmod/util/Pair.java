package chainingsolid.minecraft.moding.customdimensionmod.util;

public class Pair<A, B>{
	
	public A a;
	public B b;
	
	public Pair(A a, B b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int hashCode(){
		return a.hashCode() + b.hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Pair){
			Pair p = (Pair)obj;
			if(a.equals(p.a) && b.equals(p.b)){
				return true;
			}
		}
		return false;
	}
	
}
