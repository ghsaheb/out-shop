public class CalculateTotalFactory {
    public CalculateTotalStrategy getCalculationType(String type){
        if(type.equals("simple")){
            return new CalculateTotalSimple();
        }
        return null;
    }
}