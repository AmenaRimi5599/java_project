class Triangle{
	double base,height;
	
	void area(){
		double result;
		result=.5*base*height;
		System.out.println(" Area of the triangle =" + result);
	}
	
	public static void main(String[] args){
		Triangle t1= new Triangle();
		t1.base=2.5;
		t1.height=10.0;
		t1.area();
		
	}
}

	