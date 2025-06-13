// Question 2
package Problem_12_06_25;

class pen_distribution{
	public static void main(String[] args){
		int pens = 14;
		int students = 3;

		int pen_per_student = pens/students;
		int non_distributed_pen = pens%students;

		System.out.print(" The Pen Per Student is "+ pen_per_student +" and the remaining pen not distributed is "+ non_distributed_pen);
	}

}