package zad1.abstractTrees;

import java.util.ArrayList;

import zad1.abstractParts.Leaf;
import zad1.concreteParts.FlatLeaf;

public abstract class LeafyTree extends Tree {
	
	@Override
	public void grow() {
		super.grow();
		if(leaves == null) {
			leaves = new ArrayList<Leaf>();
		}
		leaves.add(new FlatLeaf());
		System.out.println("Flat leaves (growing)");
	}

}
