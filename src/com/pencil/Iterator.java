package com.pencil;
public class Iterator implements PencilIterator {

	 private Pencil[] pencil;
	 private int current = 0;
     
    public Iterator(Pencil[] pencil) {
 		this.pencil = pencil;
 	}
	@Override
	public boolean IsComplete() {
		if (pencil[current] == null || current >= pencil.length )
	    {
			      return false;
	    }        
	    else
	    {
	            return true;
	    }
	}
	@Override
	public Pencil Next() {
		Pencil p =  pencil[current];
        current += 1;
        return p;
	}
}
