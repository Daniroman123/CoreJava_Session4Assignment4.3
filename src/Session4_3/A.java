/*Assignment 4_3*/

package Session4_3;

class C {

	public void test() {
		System.out.println("This is the test method of class C");
	}
}

class B extends C {

	public void test() {
		System.out.println("This is the test method of class B");
	}
}

public class A extends B {

	public static void main(String[] args) {

	}

	public void test() {
		super.test(); // call method of parent

		System.out.println("This is the test method of class A");
	}

}

// Solution : it cannot be E: C.test() because as per question we cannot create
// new instance of C method
// it cannot be B: super.test because this will call method of B only
// it cannot be C : super.super.test() , this is wrong
// it cannot be A : test(); or D : ::test();
// Only answer left is , F : it is not possible.