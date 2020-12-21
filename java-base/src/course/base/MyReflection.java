package course.base;

public class MyReflection {
	public static void main(String[] args){
		Achi ac = new Achi();
		Class acClass = ac.getClass();
		System.out.println(acClass.getName());
		//Fields[] fields = acClass.getFields().toString();
		//System.out.println(acClass.getConstructor(int,String,int,String);
		
		Class<Achi> ac2 = Achi.class;
		System.out.println(ac2.getName());
		
		
		try {
			//String ac3 = null;
			Class ac3 = Class.forName("course.base.Achi");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
