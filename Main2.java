import java.util.Scanner;

/**
 * @Auther:Cui LiHuan
 * @Date: 2018/10/14 19:37
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] ssplit = s.split("\\s+");
        for (int i = 0; i < ssplit.length; i++) {
            System.out.println(ssplit[i]);
            System.out.println("再次提交再再提交");
            System.out.println("修改了");

        }
    }
}
