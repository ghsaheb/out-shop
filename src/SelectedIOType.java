public class SelectedIOType {
    private IO io;
    public SelectedIOType(IO io){
        this.io = io;
    }
    public String read(){
        return io.read();
    }

    public void print(String command){
        io.print(command);
    }
}