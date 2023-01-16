package Chapter28;

public class Company {
    String name;
    ContInfo cInfo;//Null일 수 있음
    
    public Company(String cn, ContInfo ci){
        name = cn;
        cInfo = ci;
    }
    
    public String getName() {
        return name;
    }
    
    public ContInfo getcInfo() {
        return cInfo;
    }
}
