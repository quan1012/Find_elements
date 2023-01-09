import java.util.Scanner;

public class Find_elements {
    public static void main(String[] args) {
        String[] students = {"Quân","Tùng","Huy","Nguyên","Nam"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh:");
        String name = scanner.nextLine();
        boolean Exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí học sinh" + name +"is:"+i);
                Exist = true;
                break;
            }
        }
        if (!Exist) {
            System.out.println("Not found" + name +"in the list");
        }
    }
}