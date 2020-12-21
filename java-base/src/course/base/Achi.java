package course.base;

/**
 * @author ike
 *
 */
public class Achi {
	private int id;
	private String name;
	private int age;
	private String hobby;
	
	public Achi() {}
	public Achi(int id, String name, int age, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	public String day() {
		return "sleeping...";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Achi [id=" + id + ", name=" + name + ", age=" + age + ", hobby=" + hobby + "]";
	}
	
}
