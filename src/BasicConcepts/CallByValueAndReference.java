package BasicConcepts;

public class CallByValueAndReference {
    int a = 20;
    int b = 30;

    public static void main(String[] args){
        int x = 30;
        int y = 40;
        CallByValueAndReference obj = new CallByValueAndReference();
        int z = obj.callByValue(x,y);
        System.out.println("Output of callByValue method: " + z);
        System.out.println("Before calling callByReference method, a: " + obj.a + ", b: " + obj.b);
        obj.callByReference(obj);
        System.out.println("After calling callByReference method, a: " + obj.a + ", b: " + obj.b);
    }
    public int callByValue(int a, int b){
        return a + b;
    }
    public void callByReference(CallByValueAndReference obj){
        int temp;
        temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }
}
