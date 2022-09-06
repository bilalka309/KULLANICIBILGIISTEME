import java.net.SocketTimeoutException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password;
        System.out.print("Kullanıcı adını giriniz:");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş yapıldı.");
        } else if(!password.equals("java123")){
            System.out.print("Şifrenizi sıfırlamak isterseniz 1'e basınız:");
            int x = input.nextInt();
            if(x==1){
                System.out.print("Yeni Şifre giriniz:");
                Scanner inp = new Scanner(System.in);
                String password1 = inp.nextLine();
                if(!password1.equals("java123")){
                    System.out.print("Şifre oluşturuldu.");}
	                    else if (password1.equals("java123")) {
                        System.out.print("Şifre oluşturulamadı.");

                    }

                }
            else {
                    System.out.println("Sayfayı yenileyip tekrar deneyiniz.");
            }

            }

        }

    }
