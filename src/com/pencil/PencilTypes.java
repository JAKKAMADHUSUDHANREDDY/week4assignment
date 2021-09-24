package com.pencil;

public class PencilTypes {
	
	Collector collections;
	
	public PencilTypes(Collector collections) {
		super();
		this.collections = collections;
	}

	public void print()
	{
		PencilIterator iterator = collections.CreateIterator();
		System.out.println("Different types of Penciuls are as follows:");
		while(iterator.IsComplete())
		{
			Pencil p = (Pencil)iterator.Next();
			System.out.println(p.getPenciltype());
		}
		
		
	}
}
