public class Calc_Test {

    private static Calc tmp = new Calc();

    public static void testSum(){
        tmp.setDoubleSumFlag(true);
        if (tmp.getDoubleSumFlag()){
            System.out.println(tmp.add(Double.MIN_VALUE,0d) == Double.MIN_VALUE ? "double add min: Successful" : "double add min: Failed");
            System.out.println(tmp.add(300000d,300000d) == 600000d ? "double add mid: Successful" : "double add mid: Failed");
            System.out.println(tmp.add(Double.MAX_VALUE,0d) == Double.MAX_VALUE ? "double add max: Successful" : "double add max: Failed");
        }
        System.out.println(tmp.add(Integer.MIN_VALUE,0) == Integer.MIN_VALUE ? "int add min: Successful" : "int add min: Failed");
        System.out.println(tmp.add(300000,300000) == 600000 ? "int add mid: Successful" : "int add mid: Failed");
        System.out.println(tmp.add(Integer.MAX_VALUE,1) == Integer.MIN_VALUE ? "int add max: Successful" : "int add max: Failed");
    }

    public static void testMul(){
        tmp.setDoubleMulFlag(true);
        if (tmp.getDoubleSumFlag()){
            System.out.println(tmp.mul(Double.MIN_VALUE,1d) == Double.MIN_VALUE ? "double mul min: Successful" : "double mul min: Failed");
            System.out.println(tmp.mul(300000d,2d) == 600000d ? "double mul mid: Successful" : "double mul mid: Failed");
            System.out.println(tmp.mul(Double.MAX_VALUE,1d) == Double.MAX_VALUE ? "double mul max: Successful" : "double mul max: Failed");
        }
        System.out.println(tmp.mul(Integer.MIN_VALUE,1) == Integer.MIN_VALUE ? "int mul min: Successful" : "int mul min: Failed");
        System.out.println(tmp.mul(300000,2) == 600000 ? "int mul mid: Successful" : "int mul mid: Failed");
        System.out.println(tmp.mul(Integer.MAX_VALUE,1) == Integer.MAX_VALUE ? "int mul max: Successful" : "int mul max: Failed");
    }

    public static void testSub(){
        tmp.setFloatSubFlag(true);
        if (tmp.getFloatSubFlag()){
            System.out.println(tmp.sub(Float.MIN_VALUE,0f) == Float.MIN_VALUE ? "float sub min: Successful" : "float sub min: Failed");
            System.out.println(tmp.sub(300000f,150000f) == 150000f ? "float sub mid: Successful" : "float sub mid: Failed");
            System.out.println(tmp.sub(Float.MAX_VALUE,0f) == Float.MAX_VALUE ? "float sub max: Successful" : "float sub max: Failed");
        }
        System.out.println(tmp.sub(Integer.MIN_VALUE,0) == Integer.MIN_VALUE ? "int sub min: Successful" : "int sub min: Failed");
        System.out.println(tmp.sub(300000,150000) == 150000 ? "int sub mid: Successful" : "int sub mid: Failed");
        System.out.println(tmp.sub(Integer.MAX_VALUE,0) == Integer.MAX_VALUE ? "int sub max: Successful" : "int sub max: Failed");
    }

    public static void testDiv(){
        tmp.setFloatDivFlag(true);
        if (tmp.getFloatDivFlag()){
            System.out.println(tmp.div(Float.MIN_VALUE,1f) == Float.MIN_VALUE ? "float div min: Successful" : "float div min: Failed");
            System.out.println(tmp.div(100f,0f) == Float.POSITIVE_INFINITY ? "float div null: Successful" : "float div null: Failed");
            System.out.println(tmp.div(300000f,150000f) == 2f ? "float div mid: Successful" : "float div mid: Failed");
            System.out.println(tmp.div(Float.MAX_VALUE,1f) == Float.MAX_VALUE ? "float div max: Successful" : "float div max: Failed");
        }
        System.out.println(tmp.div(Integer.MIN_VALUE,1) == Integer.MIN_VALUE ? "int div min: Successful" : "int div min: Failed");
        System.out.println(tmp.div(100,0) == -1 ? "int div null: Successful" : "int div null: Failed");
        System.out.println(tmp.div(300000,150000) == 2 ? "int div mid: Successful" : "int div mid: Failed");
        System.out.println(tmp.div(Integer.MAX_VALUE,1) == Integer.MAX_VALUE ? "int div max: Successful" : "int div max: Failed");
    }

}
