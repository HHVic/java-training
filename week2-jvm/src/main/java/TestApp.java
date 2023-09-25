import java.lang.reflect.Method;

public class TestApp {

    public static void main(String[] args) throws Exception {
        TestClassLoader classLoader = new TestClassLoader("/Users/huan/IdeaProjects/java-training/week2-jvm/");
        Class<?> clz = classLoader.loadClass("Test");
        if (clz != null) {
            Object o = clz.getDeclaredConstructor().newInstance();
            Method method = clz.getMethod("say");
            method.invoke(o);
            System.out.println(o.getClass().getClassLoader().toString());
        }
    }
}
