package working_Excel_Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestReflaction {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String x ="click";
		Method method = TestReflaction.class.getMethod(x, String.class);
		method.invoke(method, "Hi There");
	}
	
	
public static void click(String x)	{

	System.out.println("Executing " +x);
}

}
