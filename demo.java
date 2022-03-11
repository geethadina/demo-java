package HOME;

public class Calculator {

	public int Add(int a, int b)
	{
		return a + b;
	}
	public float Add(float a, float b)
	{
		return a +b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		//System.out.println(cal.Add(10, 11));
		System.out.println(cal.Add(10.3f, 122.23f));
	}

}
