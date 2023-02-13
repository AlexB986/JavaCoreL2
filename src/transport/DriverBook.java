package transport;

import java.util.Arrays;

public class DriverBook<T> {
    private T[]array;
    public DriverBook(T[]array){
        this.array=array;
    }

    @Override
    public String toString() {
        return "DriverBook{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
