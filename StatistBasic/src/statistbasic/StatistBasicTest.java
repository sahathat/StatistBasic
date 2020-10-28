
package statistbasic;

public class StatistBasicTest {
    
    public static void main(String[] args) {
        StatistBasic list = new StatistBasic(10);
        list.add(5);
        list.add(12);
        list.add(7);
        System.out.println(list.toString());
        System.out.println("find 12 : " + list.find(12));
        System.out.println("find 16 : " + list.find(16));
        System.out.println("min : " + list.min());
        System.out.println("max : " + list.max());
        System.out.println("sum : " + list.sum());
        System.out.println("average : " + list.avg());
        System.out.println("median : " + list.med());
        System.out.println("standard devation : " + list.sd());
        System.out.println("variance : " + list.varian());
        System.out.println("range : " + list.range());
        System.out.println("coefficent of variation : " + list.cv());
        System.out.println("standard value of 12 : " + list.std(12));
    }
}
