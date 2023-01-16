package Chapter28;

public class Friend {
    String name;
    Company cmp; //null일 수 있음
    
    public Friend(String n, Company c){
        name = n;
        cmp = c;
    }
    
    public String getName() {
        return name;
    }
    
    public Company getCmp() {
        return cmp;
    }
}
