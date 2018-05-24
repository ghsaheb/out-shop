import java.io.*;

public class CommandLineIO implements IO{
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String read() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void print(String command) {
        System.out.println(command);
    }
}
