package Chapter28;

import java.util.Optional;

public class ContInfo {
//    Optional<String> phone;
//    Optional<String> adrs;
//
//    public ContInfo(Optional<String> ph, Optional<String> ad){
//        phone = ph;
//        adrs = ad;
//    }
//
//    public Optional<String> getPhone() {
//        return phone;
//    }
//
//    public Optional<String> getAdrs() {
//        return adrs;
//    }
    
    
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

