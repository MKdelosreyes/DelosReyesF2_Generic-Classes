package Arithmetic;

public class Arithmetic<T extends Number> {
    private T num1;
    private T num2;
    private Number value1;
    private Number value2;
    public Arithmetic(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
        //use doubleValue to encompass decimal and non-decimal nubers
        //also it is bigger than other .Values
        value1 = num1.doubleValue();
        value2 = num2.doubleValue();
    }

    public T add() {
        //return (T) value1.doubleValue() + value2.doubleValue();
        //Have to use Double.valueOf to turn 'double' primitive type back to object wrapper class
        //as T is an object so dapat compatible sya sa T
        return (T) Double.valueOf(value1.doubleValue() + value2.doubleValue());
    }
    public T subtract() {
        return (T) Double.valueOf(value1.doubleValue() - value2.doubleValue());
    }
    public T multiply() {
        return (T) Double.valueOf(value1.doubleValue() * value2.doubleValue());
    }
    public T divide() {
        if (num2.doubleValue() == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }

        return (T) Double.valueOf(value1.doubleValue() / value2.doubleValue());
    }
    public T getMin() {
        if (num2.doubleValue() > num1.doubleValue()) {
            return (T) Double.valueOf(value1.doubleValue());
        }

        return (T) Double.valueOf(value2.doubleValue());
    }
    public T getMax() {
        if (num2.doubleValue() > num1.doubleValue()) {
            return (T) Double.valueOf(value2.doubleValue());
        }

        return (T) Double.valueOf(value1.doubleValue());
    }
}
