package tij4.chapter_10.exercise_6.packageb;


import tij4.chapter_10.exercise_6.packagea.Interface;

import static petrs.Utils.print;

public class BaseB {
	protected class InnerB implements Interface {
		public InnerB() { print("BaseB.InnerB()"); }
		public String f() {return "BaseB.InnerB.f()"; }
	}
}
