package zad1.abstractTrees;

import java.util.ArrayList;

import zad1.abstractParts.Leaf;
import zad1.concreteParts.ConiferousLeaf;

public abstract class ConiferousTree extends Tree {
	
	@Override
	public void grow() {
		super.grow();
		if(leaves == null) {
			leaves = new ArrayList<Leaf>();
		}
		leaves.add(new ConiferousLeaf());
		System.out.println("Coniferous leaves (growing)");
	}

}
