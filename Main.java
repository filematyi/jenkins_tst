class Main{
	public static void main(String[] args) {
		System.out.println("Hello World");

		String sysEnvStr = System.getenv("string_parameter");
		System.out.println("String parameter value : " + sysEnvStr);
	}
}