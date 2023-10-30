import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Hello World");
            writer.write("Hi");
            writer.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
