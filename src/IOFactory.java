public class IOFactory {
    public IO getIOType(String type){
        if(type.equals("commandline")){
            return new CommandLineIO();
        }
        return null;
    }
}