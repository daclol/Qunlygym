package Actions;

import Entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMember {
    private static final ArrayList<Member> members = DisplayMembers.getMembers();

    public static void execute(Scanner scanner) {
        System.out.print("Nhập tên thành viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập gói tập (Cơ bản/Tiêu chuẩn/Cao cấp): ");
        String packageType = scanner.nextLine();

        members.add(new Member(name, dateOfBirth, packageType));
        System.out.println("Thành viên mới đã được thêm.");
    }
}
