package Actions;

import Entities.Member;
import Entities.Coach;
import java.util.ArrayList;

public class Statistics {
    private static final ArrayList<Member> members = DisplayMembers.getMembers();
    private static final ArrayList<Coach> coaches = DisplayCoaches.getCoaches();

    public static void execute() {
        System.out.println("\n=== Thong Ke ===");
        System.out.println("Tong so thanh vien: " + members.size());
        System.out.println("Tong so huan luyen vien: " + coaches.size());
        int basic = 0, standard = 0, premium = 0;
        for (Member member : members) {
            switch (member.getPackageType().toLowerCase()) {
                case "co ban" -> basic++;
                case "tieu chuan" -> standard++;
                case "cao cap" -> premium++;
            }
        }

        System.out.println("So thanh vien theo goi:");
        System.out.println("- Co ban: " + basic);
        System.out.println("- Tieu chuan: " + standard);
        System.out.println("- Cao cap: " + premium);
    }
}
