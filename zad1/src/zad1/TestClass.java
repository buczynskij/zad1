package zad1;

import zad1.abstractTrees.Tree;
import zad1.concreteTrees.Spruce;

public class TestClass {

	public static void main(String[] args) {
		
		growATree();

	}
	
	private static void growATree() {
		
		Tree spruce = new Spruce();
		spruce.grow();
		
	}

}
