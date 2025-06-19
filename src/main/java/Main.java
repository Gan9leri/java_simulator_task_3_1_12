import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){
        String result = "";
        int role;
        role = readInput();
        if(role == 1) result = "admin";
        else if(role == 2) result = "moderator";
        else if(role == 3) result = "user";
        else result = "guest";
        System.out.println(result);
    }

    public static int readInput(){
        int role = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            role = parseInt(scanner.nextLine());
        }
        scanner.close();
        return role;
    }
}
