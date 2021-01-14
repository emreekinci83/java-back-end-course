import java.util.Scanner;

public class CarPriceCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Engine Type : ");
        int engine = scanner.nextInt();

        System.out.println("Enter Production Cost:");
        double cost = scanner.nextDouble();

        double profit1=0,profit2=0,profit3=0,profit4=0,profit5=0,profit6=0,profit7=0,profit8=0,profit9=0,profit10=0,profit11=0,profit12=0;
        double otv1=0,otv2=0,otv3=0,otv4=0,otv5=0,otv6=0,otv7=0,otv8=0,otv9=0,otv10=0,otv11=0,otv12=0;
        double kdv1=0,kdv2=0,kdv3=0,kdv4=0,kdv5=0,kdv6=0,kdv7=0,kdv8=0,kdv9=0,kdv10=0,kdv11=0,kdv12=0;
        double carPrice1=0,carPrice2=0,carPrice3=0,carPrice4=0,carPrice5=0,carPrice6=0,carPrice7=0,carPrice8=0,carPrice9=0,carPrice10=0,carPrice11=0,carPrice12=0;


        if(engine>0 && engine<1600){
            if(cost>0 && cost<85000){
                 profit1 = cost*0.6;
                 otv1 = (profit1 + cost)*0.45;
                 kdv1  = (profit1 + cost + otv1)*0.1;
                 carPrice1 = cost+profit1+otv1+kdv1;

                 profit2 = cost*0.55;
                 otv2 = (profit2 + cost)*0.45;
                 kdv2  = (profit2 + cost + otv2)*0.1;
                 carPrice2 = cost+profit2+otv2+kdv2;

                 profit3 = cost*0.5;
                 otv3 = (profit3 + cost)*0.45;
                 kdv3  = (profit3 + cost + otv3)*0.1;
                 carPrice3 = cost+profit3+otv3+kdv3;

                 profit4 = cost*0.45;
                 otv4 = (profit4 + cost)*0.45;
                 kdv4  = (profit4 + cost + otv4)*0.1;
                 carPrice4 = cost+profit4+otv4+kdv4;

                 profit5 = cost*0.4;
                 otv5 = (profit5 + cost)*0.45;
                 kdv5  = (profit5 + cost + otv5)*0.1;
                 carPrice5 = cost+profit5+otv5+kdv5;

                 profit6 = cost*0.35;
                 otv6 = (profit6 + cost)*0.45;
                 kdv6  = (profit6 + cost + otv6)*0.1;
                 carPrice6 = cost+profit6+otv6+kdv6;

                 profit7 = cost*0.3;
                 otv7 = (profit7 + cost)*0.45;
                 kdv7  = (profit7 + cost + otv7)*0.1;
                 carPrice7 = cost+profit7+otv7+kdv7;

                 profit8 = cost*0.25;
                 otv8 = (profit8 + cost)*0.45;
                 kdv8  = (profit8 + cost + otv8)*0.1;
                 carPrice8 = cost+profit8+otv8+kdv8;

                 profit9 = cost*0.2;
                 otv9 = (profit9 + cost)*0.45;
                 kdv9  = (profit9 + cost + otv9)*0.1;
                 carPrice9 = cost+profit9+otv9+kdv9;

                 profit10 = cost*0.15;
                 otv10 = (profit10 + cost)*0.45;
                 kdv10  = (profit10 + cost + otv10)*0.1;
                 carPrice10 = cost+profit10+otv10+kdv10;

                 profit11 = cost*0.1;
                 otv11 = (profit11 + cost)*0.45;
                 kdv11  = (profit11 + cost + otv11)*0.1;
                 carPrice11 = cost+profit11+otv11+kdv11;

                 profit12 = cost*0.05;
                 otv12 = (profit12 + cost)*0.45;
                 kdv12  = (profit12+ cost + otv12)*0.1;
                 carPrice12 = cost+profit12+otv12+kdv12;


            }else if(cost>85000 && cost<130000){

                 profit1 = cost*0.6;
                 otv1 = (profit1 + cost)*0.5;
                 kdv1  = (profit1 + cost + otv1)*0.12;
                 carPrice1 = cost+profit1+otv1+kdv1;

                 profit2 = cost*0.55;
                 otv2 = (profit2 + cost)*0.5;
                 kdv2  = (profit2 + cost + otv2)*0.12;
                 carPrice2 = cost+profit2+otv2+kdv2;

                 profit3 = cost*0.5;
                 otv3 = (profit3 + cost)*0.5;
                 kdv3  = (profit3 + cost + otv3)*0.12;
                 carPrice3 = cost+profit3+otv3+kdv3;

                 profit4 = cost*0.45;
                 otv4 = (profit4 + cost)*0.5;
                 kdv4  = (profit4 + cost + otv4)*0.12;
                 carPrice4 = cost+profit4+otv4+kdv4;

                 profit5 = cost*0.4;
                 otv5 = (profit5 + cost)*0.5;
                 kdv5  = (profit5 + cost + otv5)*0.12;
                 carPrice5 = cost+profit5+otv5+kdv5;

                 profit6 = cost*0.35;
                 otv6 = (profit6 + cost)*0.5;
                 kdv6  = (profit6 + cost + otv6)*0.12;
                 carPrice6 = cost+profit6+otv6+kdv6;

                 profit7 = cost*0.3;
                 otv7 = (profit7 + cost)*0.5;
                 kdv7  = (profit7 + cost + otv7)*0.12;
                 carPrice7 = cost+profit7+otv7+kdv7;

                 profit8 = cost*0.25;
                 otv8 = (profit8 + cost)*0.5;
                 kdv8  = (profit8 + cost + otv8)*0.12;
                 carPrice8 = cost+profit8+otv8+kdv8;

                 profit9 = cost*0.2;
                 otv9 = (profit9 + cost)*0.5;
                 kdv9  = (profit9 + cost + otv9)*0.12;
                 carPrice9 = cost+profit9+otv9+kdv9;

                 profit10 = cost*0.15;
                 otv10 = (profit10 + cost)*0.5;
                 kdv10  = (profit10 + cost + otv10)*0.12;
                 carPrice10 = cost+profit10+otv10+kdv10;

                 profit11 = cost*0.1;
                 otv11 = (profit11 + cost)*0.5;
                 kdv11  = (profit11 + cost + otv11)*0.12;
                 carPrice11 = cost+profit11+otv11+kdv11;

                 profit12 = cost*0.05;
                 otv12 = (profit12 + cost)*0.5;
                 kdv12  = (profit12+ cost + otv12)*0.12;
                 carPrice12 = cost+profit12+otv12+kdv12;


            }else if(cost>130000){
                 profit1 = cost*0.6;
                 otv1 = (profit1 + cost)*0.8;
                 kdv1  = (profit1 + cost + otv1)*0.18;
                 carPrice1 = cost+profit1+otv1+kdv1;

                 profit2 = cost*0.55;
                 otv2 = (profit2 + cost)*0.8;
                 kdv2  = (profit2 + cost + otv2)*0.18;
                 carPrice2 = cost+profit2+otv2+kdv2;

                 profit3 = cost*0.5;
                 otv3 = (profit3 + cost)*0.8;
                 kdv3  = (profit3 + cost + otv3)*0.18;
                 carPrice3 = cost+profit3+otv3+kdv3;

                 profit4 = cost*0.45;
                 otv4 = (profit4 + cost)*0.8;
                 kdv4  = (profit4 + cost + otv4)*0.18;
                 carPrice4 = cost+profit4+otv4+kdv4;

                 profit5 = cost*0.4;
                 otv5 = (profit5 + cost)*0.8;
                 kdv5  = (profit5 + cost + otv5)*0.18;
                 carPrice5 = cost+profit5+otv5+kdv5;

                 profit6 = cost*0.35;
                 otv6 = (profit6 + cost)*0.8;
                 kdv6  = (profit6 + cost + otv6)*0.18;
                 carPrice6 = cost+profit6+otv6+kdv6;

                 profit7 = cost*0.3;
                 otv7 = (profit7 + cost)*0.8;
                 kdv7  = (profit7 + cost + otv7)*0.18;
                 carPrice7 = cost+profit7+otv7+kdv7;

                 profit8 = cost*0.25;
                 otv8 = (profit8 + cost)*0.8;
                 kdv8  = (profit8 + cost + otv8)*0.18;
                 carPrice8 = cost+profit8+otv8+kdv8;

                 profit9 = cost*0.2;
                 otv9 = (profit9 + cost)*0.8;
                 kdv9  = (profit9 + cost + otv9)*0.18;
                 carPrice9 = cost+profit9+otv9+kdv9;

                 profit10 = cost*0.15;
                 otv10 = (profit10 + cost)*0.8;
                 kdv10  = (profit10 + cost + otv10)*0.18;
                 carPrice10 = cost+profit10+otv10+kdv10;

                 profit11 = cost*0.1;
                 otv11 = (profit11 + cost)*0.8;
                 kdv11  = (profit11 + cost + otv11)*0.18;
                 carPrice11 = cost+profit11+otv11+kdv11;

                 profit12 = cost*0.05;
                 otv12 = (profit12 + cost)*0.8;
                 kdv12  = (profit12+ cost + otv12)*0.18;
                 carPrice12 = cost+profit12+otv12+kdv12;

            }else{
                System.out.println("*****Entered wrong value for Production cost*****");
            }
        }else if(engine>=1600 && engine<2000){
            if(cost>0 && cost<170000){
                 profit1 = cost*0.6;
                 otv1 = (profit1 + cost)*1.3;
                 kdv1  = (profit1 + cost + otv1)*0.18;
                 carPrice1 = cost+profit1+otv1+kdv1;

                 profit2 = cost*0.55;
                 otv2 = (profit2 + cost)*1.3;
                 kdv2  = (profit2 + cost + otv2)*0.18;
                 carPrice2 = cost+profit2+otv2+kdv2;

                 profit3 = cost*0.5;
                 otv3 = (profit3 + cost)*1.3;
                 kdv3  = (profit3 + cost + otv3)*0.18;
                 carPrice3 = cost+profit3+otv3+kdv3;

                 profit4 = cost*0.45;
                 otv4 = (profit4 + cost)*1.3;
                 kdv4  = (profit4 + cost + otv4)*0.18;
                 carPrice4 = cost+profit4+otv4+kdv4;

                 profit5 = cost*0.4;
                 otv5 = (profit5 + cost)*1.3;
                 kdv5  = (profit5 + cost + otv5)*0.18;
                 carPrice5 = cost+profit5+otv5+kdv5;

                 profit6 = cost*0.35;
                 otv6 = (profit6 + cost)*1.3;
                 kdv6  = (profit6 + cost + otv6)*0.18;
                 carPrice6 = cost+profit6+otv6+kdv6;

                 profit7 = cost*0.3;
                 otv7 = (profit7 + cost)*1.3;
                 kdv7  = (profit7 + cost + otv7)*0.18;
                 carPrice7 = cost+profit7+otv7+kdv7;

                 profit8 = cost*0.25;
                 otv8 = (profit8 + cost)*1.3;
                 kdv8  = (profit8 + cost + otv8)*0.18;
                 carPrice8 = cost+profit8+otv8+kdv8;

                 profit9 = cost*0.2;
                 otv9 = (profit9 + cost)*1.3;
                 kdv9  = (profit9 + cost + otv9)*0.18;
                 carPrice9 = cost+profit9+otv9+kdv9;

                 profit10 = cost*0.15;
                 otv10 = (profit10 + cost)*1.3;
                 kdv10  = (profit10 + cost + otv10)*0.18;
                 carPrice10 = cost+profit10+otv10+kdv10;

                 profit11 = cost*0.1;
                 otv11 = (profit11 + cost)*1.3;
                 kdv11  = (profit11 + cost + otv11)*0.18;
                 carPrice11 = cost+profit11+otv11+kdv11;

                 profit12 = cost*0.05;
                 otv12 = (profit12 + cost)*1.3;
                 kdv12  = (profit12+ cost + otv12)*0.18;
                 carPrice12 = cost+profit12+otv12+kdv12;


            }else if(cost>=170000){
                 profit1 = cost*0.6;
                 otv1 = (profit1 + cost)*1.5;
                 kdv1  = (profit1 + cost + otv1)*0.2;
                 carPrice1 = cost+profit1+otv1+kdv1;

                 profit2 = cost*0.55;
                 otv2 = (profit2 + cost)*1.5;
                 kdv2  = (profit2 + cost + otv2)*0.2;
                 carPrice2 = cost+profit2+otv2+kdv2;

                 profit3 = cost*0.5;
                 otv3 = (profit3 + cost)*1.5;
                 kdv3  = (profit3 + cost + otv3)*0.2;
                 carPrice3 = cost+profit3+otv3+kdv3;

                 profit4 = cost*0.45;
                 otv4 = (profit4 + cost)*1.5;
                 kdv4  = (profit4 + cost + otv4)*0.2;
                 carPrice4 = cost+profit4+otv4+kdv4;

                 profit5 = cost*0.4;
                 otv5 = (profit5 + cost)*1.5;
                 kdv5  = (profit5 + cost + otv5)*0.2;
                 carPrice5 = cost+profit5+otv5+kdv5;

                 profit6 = cost*0.35;
                 otv6 = (profit6 + cost)*1.5;
                 kdv6  = (profit6 + cost + otv6)*0.2;
                 carPrice6 = cost+profit6+otv6+kdv6;

                 profit7 = cost*0.3;
                 otv7 = (profit7 + cost)*1.5;
                 kdv7  = (profit7 + cost + otv7)*0.2;
                 carPrice7 = cost+profit7+otv7+kdv7;

                 profit8 = cost*0.25;
                 otv8 = (profit8 + cost)*1.5;
                 kdv8  = (profit8 + cost + otv8)*0.2;
                 carPrice8 = cost+profit8+otv8+kdv8;

                 profit9 = cost*0.2;
                 otv9 = (profit9 + cost)*1.5;
                 kdv9  = (profit9 + cost + otv9)*0.2;
                 carPrice9 = cost+profit9+otv9+kdv9;

                 profit10 = cost*0.15;
                 otv10 = (profit10 + cost)*1.5;
                 kdv10  = (profit10 + cost + otv10)*0.2;
                 carPrice10 = cost+profit10+otv10+kdv10;

                 profit11 = cost*0.1;
                 otv11 = (profit11 + cost)*1.5;
                 kdv11  = (profit11 + cost + otv11)*0.2;
                 carPrice11 = cost+profit11+otv11+kdv11;

                 profit12 = cost*0.05;
                 otv12 = (profit12 + cost)*1.5;
                 kdv12  = (profit12+ cost + otv12)*0.2;
                 carPrice12 = cost+profit12+otv12+kdv12;

            }else{
                System.out.println("*****Entered wrong value for Production cost*****");
            }
        }else if(engine>=2000){

             profit1 = cost*0.6;
             otv1 = (profit1 + cost)*2.2;
             kdv1  = (profit1 + cost + otv1)*0.24;
             carPrice1 = cost+profit1+otv1+kdv1;

             profit2 = cost*0.55;
             otv2 = (profit2 + cost)*2.2;
             kdv2  = (profit2 + cost + otv2)*0.24;
             carPrice2 = cost+profit2+otv2+kdv2;

             profit3 = cost*0.5;
             otv3 = (profit3 + cost)*2.2;
             kdv3  = (profit3 + cost + otv3)*0.24;
             carPrice3 = cost+profit3+otv3+kdv3;

             profit4 = cost*0.45;
             otv4 = (profit4 + cost)*2.2;
             kdv4  = (profit4 + cost + otv4)*0.24;
             carPrice4 = cost+profit4+otv4+kdv4;

             profit5 = cost*0.4;
             otv5 = (profit5 + cost)*2.2;
             kdv5  = (profit5 + cost + otv5)*0.24;
             carPrice5 = cost+profit5+otv5+kdv5;

             profit6 = cost*0.35;
             otv6 = (profit6 + cost)*2.2;
             kdv6  = (profit6 + cost + otv6)*0.24;
             carPrice6 = cost+profit6+otv6+kdv6;

             profit7 = cost*0.3;
             otv7 = (profit7 + cost)*2.2;
             kdv7  = (profit7 + cost + otv7)*0.24;
             carPrice7 = cost+profit7+otv7+kdv7;

             profit8 = cost*0.25;
             otv8 = (profit8 + cost)*2.2;
             kdv8  = (profit8 + cost + otv8)*0.24;
             carPrice8 = cost+profit8+otv8+kdv8;

             profit9 = cost*0.2;
             otv9 = (profit9 + cost)*2.2;
             kdv9  = (profit9 + cost + otv9)*0.24;
             carPrice9 = cost+profit9+otv9+kdv9;

             profit10 = cost*0.15;
             otv10 = (profit10 + cost)*2.2;
             kdv10  = (profit10 + cost + otv10)*0.24;
             carPrice10 = cost+profit10+otv10+kdv10;

             profit11 = cost*0.1;
             otv11 = (profit11 + cost)*2.2;
             kdv11  = (profit11 + cost + otv11)*0.24;
             carPrice11 = cost+profit11+otv11+kdv11;

             profit12 = cost*0.05;
             otv12 = (profit12 + cost)*2.2;
             kdv12  = (profit12+ cost + otv12)*0.24;
             carPrice12 = cost+profit12+otv12+kdv12;

        }else{
            System.out.println("*****Entered wrong value for Engine type*****");
        }

        System.out.println("*********************************************");
        System.out.println("*   ANNUALLY AMOUNT TABLE FOR THE CAR       *");
        System.out.println("*********************************************");
        System.out.println("*  Month     Production Cost    Profit      OTV      KDV     Price of the Car  ");
        System.out.println("*    1 "+ "        "+ cost+"         "+profit1+ "   "+otv1+"    "+kdv1+"    "+carPrice1);
        System.out.println("*    2 "+ "        "+ cost+"         "+profit2+ "   "+otv2+"    "+kdv2+"    "+carPrice2);
        System.out.println("*    3 "+ "        "+ cost+"         "+profit3+ "   "+otv3+"    "+kdv3+"    "+carPrice3);
        System.out.println("*    4 "+ "        "+ cost+"         "+profit4+ "   "+otv4+"    "+kdv4+"    "+carPrice4);
        System.out.println("*    5 "+ "        "+ cost+"         "+profit5+ "   "+otv5+"    "+kdv5+"    "+carPrice5);
        System.out.println("*    6 "+ "        "+ cost+"         "+profit6+ "   "+otv6+"    "+kdv6+"    "+carPrice6);
        System.out.println("*    7 "+ "        "+ cost+"         "+profit7+ "   "+otv7+"    "+kdv7+"    "+carPrice7);
        System.out.println("*    8 "+ "        "+ cost+"         "+profit8+ "   "+otv8+"    "+kdv8+"    "+carPrice8);
        System.out.println("*    9 "+ "        "+ cost+"         "+profit9+ "   "+otv9+"    "+kdv9+"    "+carPrice9);
        System.out.println("*    10 "+ "       "+ cost+"         "+profit10+ "   "+otv10+"    "+kdv10+"    "+carPrice10);
        System.out.println("*    11 "+ "       "+ cost+"         "+profit11+ "   "+otv11+"    "+kdv11+"    "+carPrice11);
        System.out.println("*    12 "+ "       "+ cost+"         "+profit12+ "   "+otv12+"    "+kdv12+"    "+carPrice12);

    }

}
