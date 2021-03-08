class StaticComp{
    static int stavar;
    static{
        System.out.println("From Static Block");
        stavar = 10;
        System.out.println(stavar);
    }
    static void method1(){
        System.out.println("From Statiic method");
        //stavar = 20;
        System.out.println(stavar);
    }
}
public class Static {
    static{
        System.out.println("Static");
    }
    public static void main(String args[]){
        StaticComp.stavar = 25;
        StaticComp.method1();
        //System.out.println(stavar);
    }
}
