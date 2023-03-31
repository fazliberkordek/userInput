import java.util.Scanner;

/**
 * @author fazliberkordek
 */
/*
todo: Koşullu ifade ile  kullanıcı adı ve şifresini kontrol eden program:
 Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
  şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newPassword;
        int selection;

        System.out.print("User name: ");
        userName = input.nextLine();

        System.out.print("Your password:");
        password = input.nextLine();

        // Stringler için == yok onun yerine equals kullanıyoruz.

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Succesfully logged in !! ");
        } else {
            System.out.println("Wrong user name or password!");
            System.out.println("Please slect the option for your password:\n1- Reset password\n2-quit");
            selection = input.nextInt();
            switch (selection) {
                case 1:
                    System.out.print("Please type new password :");
                    newPassword = input.next();
                    if (password.equals(newPassword)) {
                        System.out.println("Password Error!!");
                        System.out.println("New password cannot be the same as previous password!");
                    } else {
                        System.out.println(" new password succesfully created!");
                    }
                    break;
                case 2:
                    System.out.println("Quiting from the program!!");
                    break;
                default:
                    System.out.println("Invalid input");


            }


        }


    }
}