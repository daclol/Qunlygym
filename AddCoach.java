package Actions;

import Entities.Coach;

import java.util.ArrayList;
import java.util.Scanner;

public class AddCoach {
    private static final ArrayList<Coach> coaches = DisplayCoaches.getCoaches();

    public static void execute(Scanner scanner) {
        System.out.print("Nhập tên huấn luyện viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập chuyên môn: ");
        String expertise = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();

        coaches.add(new Coach(name, dateOfBirth, expertise, phoneNumber));
        System.out.println("Huấn luyện viên mới đã được thêm.");
    }
}
