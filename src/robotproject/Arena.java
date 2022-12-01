package robotproject;

public class Arena extends Robot{
	
	Robot r1, r2;
	
	public Arena() {}
	public Arena (Robot a , Robot b) {
		this.r1= a;
		this.r2= b;
		
	}
	public void fight(Robot r1, Robot r2) {
		while (r2.vie!=0){
		r1.fire(r2);
		if (r2.vie != 0){
			r2.fire(r1);
		}else {
			isDead (r2);
			System.out.println("combat terminer. "+r1.nom+" est victorieux");
			}
	}
		
	}
	public String toString() {
		return "combat d'arene";
		
}
	  public static void main (String[]args) {
		  Robot r1= new Robot("D2R2",10);
		  Robot r2= new Robot("Data",10);
		  Arena A = new Arena(r1,r2);
		  
		  A.fight(r1,r2);
	  }
}