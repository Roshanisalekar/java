import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
    String name[]={"roshani","ankush","savita","sagar","amol"};
    System.out.println("toString() : "+Arrays.toString(name));
    System.out.println("asList():" + Arrays.asList(name));
     int a[][]={{10,20},{30,40}};
			System.out.println("deepToString() : "+Arrays.deepToString(a));
				}
	}