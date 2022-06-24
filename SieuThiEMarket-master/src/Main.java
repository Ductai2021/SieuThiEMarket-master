import java.util.Scanner;
import Template.menuClient;
import Template.menuCustomer;
import Config.accountConfig;

public class Main {
    public static void main(String[] args) throws Exception {

        accountConfig accountConfig = new accountConfig();
        menuClient menuClient = new menuClient();
        menuCustomer menuCustomer = new menuCustomer();

        // 1 is client 2 is customer
        int role = accountConfig.roleCustomer;

        // -------------------------
        Scanner a = new Scanner(System.in);
        int key;
        do { 
            System.out.println("=========================MENU============================");
            System.out.println(">>0. Kết thúc                                            ");
            System.out.println(">>1. Đăng nhập                                           ");
            System.out.println(">>2. Đăng kí                                             ");
            System.out.println(">>3. Tra cứu hàng hóa                                    ");
            System.out.println("=========================================================");
            System.out.print("Chọn chức năng: ");
            key = a.nextInt();
            a.nextLine();
            switch(key){
                case 1: 
                    // Day la vi du ve role
                    if (role == 1) {
                        menuClient.renderUI(a);
                    } else if (role == 2) {
                        menuCustomer.renderUI(a);
                    }
                    // --------------------
                    break;
                case 2:
                    break;
                case 3: 
                    break;
            }
    }while(key != 0);
        System.out.println(" kết thúc");
        a.close();
    }
}

