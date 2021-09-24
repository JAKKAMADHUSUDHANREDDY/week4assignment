package com.pencil;

public class Collector implements PencilCollector {

	Pencil[] list;  
    int items = 0;

	public Collector()
	{
		list = new Pencil[6];
		Add("Caryons");
		Add("Color Pencils");
		Add("Water Colors");
		Add("Carbon Pencils");
		Add("rapite Pencils");
		
	}
	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new Iterator(list);
	}

     public void Add(String pencil)
     {
    	 Pencil p = new Pencil(pencil);
    	 list[items] = p;
         items = items + 1;    	 
     }
     public Pencil getPencil(int pos)
     {
         return list[pos];
     }

}
