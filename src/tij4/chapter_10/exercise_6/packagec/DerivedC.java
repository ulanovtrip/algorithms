package tij4.chapter_10.exercise_6.packagec;

import tij4.chapter_10.exercise_6.packagea.Interface;
import tij4.chapter_10.exercise_6.packageb.BaseB;

import static petrs.Utils.print;

public class DerivedC extends BaseB {
	public Interface createInnerB() {
		return this.new InnerB();
	}
	public static void main(String[] args) {
		DerivedC obj = new DerivedC();
		print(obj.createInnerB().f());
	}
}

/* Output:
BaseB.InnerB()
BaseB.InnerB.f()
*/