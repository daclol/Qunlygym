package Actions;

import Entities.Member;

import java.util.ArrayList;

public class DisplayMembers {
    private static final ArrayList<Member> members = new ArrayList<>();

    public static ArrayList<Member> getMembers() {
        return members;
    }

    public static void execute() {
        if (members.isEmpty()) {
            System.out.println("Chưa có thành viên nào.");
        } else {
            System.out.println("Danh sách thành viên:");
            for (Member member : members) {
                member.displayInfo();
                System.out.println("-------------------");
            }
        }
    }
}
