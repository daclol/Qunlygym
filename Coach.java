package Entities;

public class Coach {
    private final String name;
    private final String dateOfBirth;
    private final String expertise;
    private final String phoneNumber;

    public Coach(String name, String dateOfBirth, String expertise, String phoneNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.expertise = expertise;
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Ngày sinh: " + dateOfBirth);
        System.out.println("Chuyên môn: " + expertise);
        System.out.println("Số điện thoại: " + phoneNumber);
    }
}
