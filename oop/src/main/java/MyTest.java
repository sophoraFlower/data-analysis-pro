public class MyTest {
    private final int finalParam;
    public static int nextId = 1;
    private int id;

    public MyTest(int finalParam) {
        this.finalParam = finalParam;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    // 静态方法访问静态字段
    public static int getNextId() {
        return nextId;
    }

    public int getFinalParam() {
        return finalParam;
    }

    public static void main(String[] args) {
        MyTest myTest = new MyTest(8);
        System.out.println(myTest.getFinalParam());  // 8
        System.out.println(MyTest.nextId);  // 1
        System.out.println(MyTest.getNextId());  // 2
        myTest.setId();
        System.out.println(nextId);  // 2
        System.out.println(myTest.getId());  // 1
        System.out.println(MyTest.nextId);  // 2
        System.out.println(MyTest.getNextId());  // 2
    }
}
