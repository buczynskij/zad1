package zad1.abstractTrees;

import java.util.ArrayList;
import java.util.List;

import zad1.abstractParts.Leaf;
import zad1.concreteParts.Branch;
import zad1.concreteParts.Trunk;
import zad1.interfaces.Growable;

public abstract class Tree implements Growable {
	
	protected Trunk trunk;
	protected List<Branch> branches;
	protected List<Leaf> leaves;

	public Tree() {
		trunk = new Trunk();
		System.out.println("Trunk (creating)");
	}
	
	@Override
	public void grow() {
		if(branches == null) {
			branches = new ArrayList<Branch>();
		}
		branches.add(new Branch());
		System.out.println("Branch (growing)");
	}

	public Trunk getTrunk() {
		return trunk;
	}

	public void setTrunk(Trunk trunk) {
		this.trunk = trunk;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	public List<Leaf> getLeaves() {
		return leaves;
	}

	public void setLeaves(List<Leaf> leaves) {
		this.leaves = leaves;
	}
	
	
}
