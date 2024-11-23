package Actions;

import Entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveMember {
    private static final ArrayList<Member> members = DisplayMembers.getMembers();

    public static void execute(Scanner scanner) {
        System.out.print("Nhập tên thành viên cần xóa: ");
        String name = scanner.nextLine();

        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equalsIgnoreCase(name)) {
                members.remove(i);
                System.out.println("Thành viên đã được xóa.");
                return;
            }
        }
        System.out.println("Không tìm thấy thành viên với tên \"" + name + "\".");
    }
}
