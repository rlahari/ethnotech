 class sample1
{
void test(int a, int... b) { 
System.out.print("A");
 }
void test(int... b) {
System.out.print("B");
 }
 }
  class main1
 {
	 public static void main(String args[])
	 {
	 sample1 s=new sample1();
	 
		s.test(1, 2, 3);
		
	 }
 }   