public class leapYear {
    public static void main(String args[]);{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year do you chek :");
        int year = sc.nextInt();

        if(year/4 != 0){
                System.out.println("not a leap year.");
        }
        else if(year/100 != 0){
            System.out.println("leap year");
        }
        else(year/400 !=0){
            System.out.println("not a leap year");
        }
    }
}
