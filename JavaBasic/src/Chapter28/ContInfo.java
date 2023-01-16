package Chapter28;

public class ContInfo {
    String phone; //Null일 수 있음 (가정)
    String adrs; //Null일 수 있음 (가정)
    
    public ContInfo(String ph, String ad){
        phone = ph;
        adrs = ad;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getAdrs() {
        return adrs;
    }
}
