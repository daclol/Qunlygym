package Actions;

import Entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class ChoosePackage {
    private static final ArrayList<Member> members = DisplayMembers.getMembers();

    public static void execute(Scanner scanner) {
        System.out.print("Nhập tên thành viên cần đổi gói: ");
        String name = scanner.nextLine();

        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                System.out.print("Nhập gói mới (Cơ bản/Tiêu chuẩn/Cao cấp): ");
                String newPackage = scanner.nextLine();
                member.setPackageType(newPackage);
                System.out.println("Gói tập của thành viên đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy thành viên với tên \"" + name + "\".");
    }
}
