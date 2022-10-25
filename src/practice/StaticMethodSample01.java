package practice;

public class StaticMethodSample01 {
	int instanceField = 100;
	static int staticField = 999;

	void instanceMethod() {
	}

	static void otherStaticMethod() {
	}

	class InstanceInnerClass{
	}

	static class StaticInnerClass {
	}


	static void staticMethod(int argument) {
		System.out.println(staticField);
		System.out.println(argument);
		otherStaticMethod();
		StaticInnerClass c1 = new StaticInnerClass();

		//System.out.println(instanceField);
		//instanceMethod();
		//this.instanceMethod();
		//super.toString();
		//InstanceInnerClass c2 = new InstanceInnerClass();
	}
}
