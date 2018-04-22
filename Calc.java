import com.sun.xml.internal.ws.api.model.ExceptionType;
import java.lang.Throwable;

public class Calc {
    private boolean isDoubleSum, isFloatDiv, isDoublemul, isFloatSub;

    public boolean getDoubleSumFlag(){
        return isDoubleSum;
    }

    public boolean getDoubleMulFlag(){
        return isDoublemul;
    }

    public boolean getFloatDivFlag(){
        return isFloatDiv;
    }

    public boolean getFloatSubFlag(){
        return isFloatSub;
    }

    public void setDoubleSumFlag(boolean a){
        isDoubleSum = a;
    }

    public void setDoubleMulFlag(boolean a){
        isDoublemul = a;
    }

    public void setFloatDivFlag(boolean a){
        isFloatDiv = a;
    }

    public void setFloatSubFlag(boolean a){
        isFloatSub = a;
    }

    public int add(int a, int b) {
            return a + b;
    }
    public double add(double a, double b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }
    public float sub(float a, float b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }
    public double mul(double a, double b){
        return a*b;
    }

    public int div(int a, int b){
        try {
            return a / b;
        }
        catch (ArithmeticException e){
            return -1;
        }
    }
    public float div(float a, float b){
            return a / b;
    }
}
