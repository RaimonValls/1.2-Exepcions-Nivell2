package ExerciciExcepcions2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Entrada {
    public static Scanner sc = new Scanner(System.in);
    public static byte llegirByte(String message) {
        byte value = 0;
        while (true) {
            try {
                System.out.print(message+ ": ");
                value= sc.nextByte();
                sc.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Error de format. Torna-ho a provar");
                sc.nextLine();
            }
        }
    }
    public static int llegirInt(String message) {
        int value = 0;
        while (true) {
            try {
                System.out.print(message + ": ");
                value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Torna-ho a provar");
                sc.nextLine();
            }
        }
    }
    public static float llegirFloat(String message) {
        float value = 0;
        while (true) {
            try {
                System.out.print(message + ": ");
                value = sc.nextFloat();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Torna-ho a provar");
                sc.nextLine();
            }
        }

    }

    public static double llegirDouble(String message) {
        double value = 0;
        while (true) {
            try {
                System.out.print(message + ": ");
                value = sc.nextDouble();
                sc.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Error de format. Torna-ho a provar");
                sc.nextLine();
            }

        }
    }
    public static char llegirChar(String message) {

        while (true) {
            try {
                System.out.print(message + ": ");
                String input = sc.nextLine();
                if(input.isEmpty()){
                    throw new CharEmptyException();
                }
                char text = input.charAt(0);
                return text;
            } catch (CharEmptyException e) {
                System.out.println("Error de format. Torna-ho a provar");

            }
        }
    }
    public static String llegirString(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                String text = sc.nextLine();
                if (text.isEmpty()) {
                    throw new StringEmptyException();
                }
                return text;
            } catch (StringEmptyException e) {
                System.out.println("Error de format. Torna-ho a provar");

            }
        }

    }
        public static boolean llegirSiNo (String message){
            while (true) {

                try {
                    System.out.print(message + ": ");
                    String text = sc.nextLine().toLowerCase();
                    if (text.isEmpty()) {
                        throw new BooleanEmptyException();
                    }
                    if (text.equals("s")) {
                        return true;
                    }
                    if (text.equals("n")) {
                        return false;

                    }
                        System.out.println("Error de format. Torna-ho a provar");

                } catch (BooleanEmptyException e) {
                    System.out.println("Error de format. Torna-ho a provar");
                }
            }
        }
    }


