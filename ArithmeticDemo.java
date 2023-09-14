public class ArithmeticDemo{
	public static void main(String [] args){
		int m = 45;
        int x = m << 1;
        int y = m >> 1;
        int z = m >>> 1;
        System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(z));
	}
}
