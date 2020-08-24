
package entity;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal {
	
	
	//@Column(nullable=false) // cannot be used when using SINGLE_TABLE strategy
	private int size;	
		
	
	
	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	@Override
	public String makeNoise() {
		return "meow meow..";
	}
	
}




