package Template;
import java.util.Scanner;

public class menuCustomer {
    public void renderUI (Scanner a) {
        int key;
        do {
            System.out.println("=========================MENU============================");
            System.out.println(">>1. mua hàng                                            ");
            System.out.println(">>2. xem lịch sử mua hàng                                ");
            System.out.println(">>3. theo dõi tiến trình hàng hóa                        ");
            System.out.println(">>4. Tra cứu hàng hóa                                    ");
            System.out.println(">>5. Đăng xuất                                           ");
            System.out.println("=========================================================");
            System.out.print("Chọn chức năng: ");
            key = a.nextInt();
            a.nextLine();
            switch(key){
                case 1: 
                    break;
                case 2:
                    break;
                case 3: 
                    break;
                case 4: 
                    break;
                case 5: 
                    break;
            }
        } while (key != 5);
        System.out.println(" kết thúc");
    }
}
