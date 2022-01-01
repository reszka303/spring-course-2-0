package pl.javastart.wholesaler.model;

import pl.javastart.wholesaler.constraint.SerialNo;

public class Equipment {

    private String name;
    private String usedId;
    @SerialNo(startsWith = "EQ", codeLength = 4)
    private String serialNumber;

    public Equipment(String name, String usedId, String serialNumber) {
        this.name = name;
        this.usedId = usedId;
        this.serialNumber = serialNumber;
    }
}
