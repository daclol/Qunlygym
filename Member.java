package Entities;

public class Member {
    private String name;
    private String dateOfBirth;
    private String packageType;

    public Member(String name, String dateOfBirth, String packageType) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.packageType = packageType;
    }

    public String getName() {
        return name;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Ngày sinh: " + dateOfBirth);
        System.out.println("Gói tập: " + packageType);
    }

    public String getPackageType() {
        return "";
    }
}
