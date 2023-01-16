package Chapter28;


import java.util.Optional;

public class Wrap {
    public static void showCompAddr(Optional<Friend> f){
        String addr = f.map(Friend::getCmp)
                        .map(Company::getcInfo)
                        .map(ContInfo::getAdrs)
                        .orElse("없어요...");
        System.out.println(addr);
    }
}

