package Actions;

import Entities.Coach;

import java.util.ArrayList;

public class DisplayCoaches {
    private static final ArrayList<Coach> coaches = new ArrayList<>();

    public static ArrayList<Coach> getCoaches() {
        return coaches;
    }

    public static void execute() {
        if (coaches.isEmpty()) {
            System.out.println("Chưa có huấn luyện viên nào.");
        } else {
            System.out.println("Danh sách huấn luyện viên:");
            for (Coach coach : coaches) {
                coach.displayInfo();
                System.out.println("-------------------");
            }
        }
    }
}
