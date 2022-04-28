package com.zensar.model.figure;

public class Picture {
	
	Parallelogram[] parallel=new Parallelogram[4];
	
	public boolean add(Parallelogram pgm) {
		boolean found=false;
		for(int i=parallel.length-1;i>0;i--) {
			if(parallel[i]==null) {
				parallel[i]=pgm;
			return true;
			}
		}
			return found;
		
	}

	public static void main(String[] args) {
		
		Parallelogram obj1=new Parallelogram(5, 10, 90);
		
		System.out.println(obj1.area());
		
		Picture obj2=new Picture();
		boolean found=obj2.add(obj1);
		System.out.println(found);
		
		
	}

}
 