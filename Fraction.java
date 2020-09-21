public class Fraction{

	private int num1;
	private int num2;
	

	public Fraction(){
		this.num1 = 0;
		this.num2 = 0;
	}

	public Fraction(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	//getter
	public int num1(){
		return num1;
	}

	public int num2(){
		return num2;
	}

	//setter
	public void set_num1(int num1){
		this.num1 = num1;
	}

	public void set_num2(int num2){
		this.num2 = num2;
	}


	public String to_String(){
		return num1+"/"+num2;

	}
}