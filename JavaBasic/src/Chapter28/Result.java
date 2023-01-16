package Chapter28;

import java.util.Optional;

import static Chapter28.Wrap.showCompAddr;

public class Result {
    public static void main(String[] args) {
        ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
//        Company cp = new Company("YaHo Co. Ltd", ci); //->Republic of Korea
        Company cp = null; //-> 없어요
        Friend frn = new Friend("Lee Su", cp);
        showCompAddr(Optional.of(frn));
    }
}
