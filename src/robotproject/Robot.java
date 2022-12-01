package robotproject;

public class Robot {
	
	protected String nom;
	protected int vie;
	
	public Robot() {
		this.nom ="";
		this.vie=10;
	}
  public Robot (String a , int b) {
      this.nom = a;
      this.vie=b;
}
  public Robot(String a) {
	  this.nom = a ;
  }
 
  public String getVie() {
	  return nom;
  }
  public int getString() {
	  return vie;
  }
  public void setVie(int a) {
	  this.vie= a;
  }
  public void setName(String b) {
	  this.nom = b;
  }
  public String tostring() {
	  return "Robot "+this.nom;
  }
   Robot fire(Robot r ) {
	   Robot r2 = new Robot();
	   if (!isDead(r)) {
	   r.vie -=2;
	   System.out.println (r.nom+ "a ete touche par "+this.nom+".vie: "+r.vie);
	   }
	   return r;
   }

 public boolean isDead(Robot r) {
	 if (r.vie == 0) {
		 System.out.println(r.nom+ "est mort");
			// TODO Auto-generated method stub
			return false;
		}
	 return false;
		}	   
	   
   public static void main (String[]args) {
	   Robot bob =new Robot ("robot bob",10);
	   Robot john = new Robot ("robot john",10);
	   
	   System.out.println(bob.nom);
	   System.out.println(john.nom);
	   
	   bob.fire(john);
	  
	  
	  
  }
}




