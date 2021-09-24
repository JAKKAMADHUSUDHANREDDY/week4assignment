package com.pencil;

public class PencilTest {

    public static void main(String args[])
    {
	Collector c = new Collector();
	PencilTypes type = new PencilTypes(c);
	type.print();
}
}