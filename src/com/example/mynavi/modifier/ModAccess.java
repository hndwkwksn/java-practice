package com.example.mynavi.modifier;

public class ModAccess {
	public String pub_var = "public";
	protected String prot_var = "protected";
	String pack_var = "packcage private";
	private String pri_var = "private";

	public void test() {
		System.out.println(this.pub_var);
		System.out.println(this.prot_var);
		System.out.println(this.pack_var);
		System.out.println(this.pri_var);
	}

	public static void main(String[] args) {
		ModAccess m = new ModAccess();
		m.test();
	}
}
