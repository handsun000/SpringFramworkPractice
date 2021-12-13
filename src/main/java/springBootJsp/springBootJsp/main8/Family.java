package springBootJsp.springBootJsp.main8;

import lombok.Data;

@Data
public class Family {

    private String papaName;
    private String mamaName;
    private String sisterName;
    private String brotherName;

    public Family(String papaName, String mamaName) {
        this.papaName = papaName;
        this.mamaName = mamaName;
    }
}
