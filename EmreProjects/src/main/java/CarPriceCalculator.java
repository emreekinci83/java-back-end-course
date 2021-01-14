import java.util.Scanner;

public class CarPriceCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Engine Type : ");
        int engine = scanner.nextInt();

        System.out.println("Enter Production Cost:");
        double cost = scanner.nextDouble();

        if(engine>0 && engine<1600){
            if(cost>0 && cost<85000){
                double profit1 = cost*0.6;
                double otv1 = (profit1 + cost)*0.45;
                double kdv1  = (profit1 + cost + otv1)*0.1;
                double carPrice1 = cost+profit1+otv1+kdv1;

                double profit2 = cost*0.55;
                double otv2 = (profit2 + cost)*0.45;
                double kdv2  = (profit2 + cost + otv2)*0.1;
                double carPrice2 = cost+profit2+otv2+kdv2;

                double profit3 = cost*0.5;
                double otv3 = (profit3 + cost)*0.45;
                double kdv3  = (profit3 + cost + otv3)*0.1;
                double carPrice3 = cost+profit3+otv3+kdv3;

                double profit4 = cost*0.45;
                double otv4 = (profit4 + cost)*0.45;
                double kdv4  = (profit4 + cost + otv4)*0.1;
                double carPrice4 = cost+profit4+otv4+kdv4;

                double profit5 = cost*0.4;
                double otv5 = (profit5 + cost)*0.45;
                double kdv5  = (profit5 + cost + otv5)*0.1;
                double carPrice5 = cost+profit5+otv5+kdv5;

                double profit6 = cost*0.35;
                double otv6 = (profit6 + cost)*0.45;
                double kdv6  = (profit6 + cost + otv6)*0.1;
                double carPrice6 = cost+profit6+otv6+kdv6;

                double profit7 = cost*0.3;
                double otv7 = (profit7 + cost)*0.45;
                double kdv7  = (profit7 + cost + otv7)*0.1;
                double carPrice7 = cost+profit7+otv7+kdv7;

                double profit8 = cost*0.25;
                double otv8 = (profit8 + cost)*0.45;
                double kdv8  = (profit8 + cost + otv8)*0.1;
                double carPrice8 = cost+profit8+otv8+kdv8;

                double profit9 = cost*0.2;
                double otv9 = (profit9 + cost)*0.45;
                double kdv9  = (profit9 + cost + otv9)*0.1;
                double carPrice9 = cost+profit9+otv9+kdv9;

                double profit10 = cost*0.15;
                double otv10 = (profit10 + cost)*0.45;
                double kdv10  = (profit10 + cost + otv10)*0.1;
                double carPrice10 = cost+profit10+otv10+kdv10;

                double profit11 = cost*0.1;
                double otv11 = (profit11 + cost)*0.45;
                double kdv11  = (profit11 + cost + otv11)*0.1;
                double carPrice11 = cost+profit11+otv11+kdv11;

                double profit12 = cost*0.05;
                double otv12 = (profit12 + cost)*0.45;
                double kdv12  = (profit12+ cost + otv12)*0.1;
                double carPrice12 = cost+profit12+otv12+kdv12;

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


            }else if(cost>85000 && cost<130000){

                double profit1 = cost*0.6;
                double otv1 = (profit1 + cost)*0.5;
                double kdv1  = (profit1 + cost + otv1)*0.12;
                double carPrice1 = cost+profit1+otv1+kdv1;

                double profit2 = cost*0.55;
                double otv2 = (profit2 + cost)*0.5;
                double kdv2  = (profit2 + cost + otv2)*0.12;
                double carPrice2 = cost+profit2+otv2+kdv2;

                double profit3 = cost*0.5;
                double otv3 = (profit3 + cost)*0.5;
                double kdv3  = (profit3 + cost + otv3)*0.12;
                double carPrice3 = cost+profit3+otv3+kdv3;

                double profit4 = cost*0.45;
                double otv4 = (profit4 + cost)*0.5;
                double kdv4  = (profit4 + cost + otv4)*0.12;
                double carPrice4 = cost+profit4+otv4+kdv4;

                double profit5 = cost*0.4;
                double otv5 = (profit5 + cost)*0.5;
                double kdv5  = (profit5 + cost + otv5)*0.12;
                double carPrice5 = cost+profit5+otv5+kdv5;

                double profit6 = cost*0.35;
                double otv6 = (profit6 + cost)*0.5;
                double kdv6  = (profit6 + cost + otv6)*0.12;
                double carPrice6 = cost+profit6+otv6+kdv6;

                double profit7 = cost*0.3;
                double otv7 = (profit7 + cost)*0.5;
                double kdv7  = (profit7 + cost + otv7)*0.12;
                double carPrice7 = cost+profit7+otv7+kdv7;

                double profit8 = cost*0.25;
                double otv8 = (profit8 + cost)*0.5;
                double kdv8  = (profit8 + cost + otv8)*0.12;
                double carPrice8 = cost+profit8+otv8+kdv8;

                double profit9 = cost*0.2;
                double otv9 = (profit9 + cost)*0.5;
                double kdv9  = (profit9 + cost + otv9)*0.12;
                double carPrice9 = cost+profit9+otv9+kdv9;

                double profit10 = cost*0.15;
                double otv10 = (profit10 + cost)*0.5;
                double kdv10  = (profit10 + cost + otv10)*0.12;
                double carPrice10 = cost+profit10+otv10+kdv10;

                double profit11 = cost*0.1;
                double otv11 = (profit11 + cost)*0.5;
                double kdv11  = (profit11 + cost + otv11)*0.12;
                double carPrice11 = cost+profit11+otv11+kdv11;

                double profit12 = cost*0.05;
                double otv12 = (profit12 + cost)*0.5;
                double kdv12  = (profit12+ cost + otv12)*0.12;
                double carPrice12 = cost+profit12+otv12+kdv12;

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

            }else if(cost>130000){
                double profit1 = cost*0.6;
                double otv1 = (profit1 + cost)*0.8;
                double kdv1  = (profit1 + cost + otv1)*0.18;
                double carPrice1 = cost+profit1+otv1+kdv1;

                double profit2 = cost*0.55;
                double otv2 = (profit2 + cost)*0.8;
                double kdv2  = (profit2 + cost + otv2)*0.18;
                double carPrice2 = cost+profit2+otv2+kdv2;

                double profit3 = cost*0.5;
                double otv3 = (profit3 + cost)*0.8;
                double kdv3  = (profit3 + cost + otv3)*0.18;
                double carPrice3 = cost+profit3+otv3+kdv3;

                double profit4 = cost*0.45;
                double otv4 = (profit4 + cost)*0.8;
                double kdv4  = (profit4 + cost + otv4)*0.18;
                double carPrice4 = cost+profit4+otv4+kdv4;

                double profit5 = cost*0.4;
                double otv5 = (profit5 + cost)*0.8;
                double kdv5  = (profit5 + cost + otv5)*0.18;
                double carPrice5 = cost+profit5+otv5+kdv5;

                double profit6 = cost*0.35;
                double otv6 = (profit6 + cost)*0.8;
                double kdv6  = (profit6 + cost + otv6)*0.18;
                double carPrice6 = cost+profit6+otv6+kdv6;

                double profit7 = cost*0.3;
                double otv7 = (profit7 + cost)*0.8;
                double kdv7  = (profit7 + cost + otv7)*0.18;
                double carPrice7 = cost+profit7+otv7+kdv7;

                double profit8 = cost*0.25;
                double otv8 = (profit8 + cost)*0.8;
                double kdv8  = (profit8 + cost + otv8)*0.18;
                double carPrice8 = cost+profit8+otv8+kdv8;

                double profit9 = cost*0.2;
                double otv9 = (profit9 + cost)*0.8;
                double kdv9  = (profit9 + cost + otv9)*0.18;
                double carPrice9 = cost+profit9+otv9+kdv9;

                double profit10 = cost*0.15;
                double otv10 = (profit10 + cost)*0.8;
                double kdv10  = (profit10 + cost + otv10)*0.18;
                double carPrice10 = cost+profit10+otv10+kdv10;

                double profit11 = cost*0.1;
                double otv11 = (profit11 + cost)*0.8;
                double kdv11  = (profit11 + cost + otv11)*0.18;
                double carPrice11 = cost+profit11+otv11+kdv11;

                double profit12 = cost*0.05;
                double otv12 = (profit12 + cost)*0.8;
                double kdv12  = (profit12+ cost + otv12)*0.18;
                double carPrice12 = cost+profit12+otv12+kdv12;

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
            }else{
                System.out.println("*****Entered wrong value for Production cost*****");
            }
        }else if(engine>=1600 && engine<2000){
            if(cost>0 && cost<170000){
                double profit1 = cost*0.6;
                double otv1 = (profit1 + cost)*1.3;
                double kdv1  = (profit1 + cost + otv1)*0.18;
                double carPrice1 = cost+profit1+otv1+kdv1;

                double profit2 = cost*0.55;
                double otv2 = (profit2 + cost)*1.3;
                double kdv2  = (profit2 + cost + otv2)*0.18;
                double carPrice2 = cost+profit2+otv2+kdv2;

                double profit3 = cost*0.5;
                double otv3 = (profit3 + cost)*1.3;
                double kdv3  = (profit3 + cost + otv3)*0.18;
                double carPrice3 = cost+profit3+otv3+kdv3;

                double profit4 = cost*0.45;
                double otv4 = (profit4 + cost)*1.3;
                double kdv4  = (profit4 + cost + otv4)*0.18;
                double carPrice4 = cost+profit4+otv4+kdv4;

                double profit5 = cost*0.4;
                double otv5 = (profit5 + cost)*1.3;
                double kdv5  = (profit5 + cost + otv5)*0.18;
                double carPrice5 = cost+profit5+otv5+kdv5;

                double profit6 = cost*0.35;
                double otv6 = (profit6 + cost)*1.3;
                double kdv6  = (profit6 + cost + otv6)*0.18;
                double carPrice6 = cost+profit6+otv6+kdv6;

                double profit7 = cost*0.3;
                double otv7 = (profit7 + cost)*1.3;
                double kdv7  = (profit7 + cost + otv7)*0.18;
                double carPrice7 = cost+profit7+otv7+kdv7;

                double profit8 = cost*0.25;
                double otv8 = (profit8 + cost)*1.3;
                double kdv8  = (profit8 + cost + otv8)*0.18;
                double carPrice8 = cost+profit8+otv8+kdv8;

                double profit9 = cost*0.2;
                double otv9 = (profit9 + cost)*1.3;
                double kdv9  = (profit9 + cost + otv9)*0.18;
                double carPrice9 = cost+profit9+otv9+kdv9;

                double profit10 = cost*0.15;
                double otv10 = (profit10 + cost)*1.3;
                double kdv10  = (profit10 + cost + otv10)*0.18;
                double carPrice10 = cost+profit10+otv10+kdv10;

                double profit11 = cost*0.1;
                double otv11 = (profit11 + cost)*1.3;
                double kdv11  = (profit11 + cost + otv11)*0.18;
                double carPrice11 = cost+profit11+otv11+kdv11;

                double profit12 = cost*0.05;
                double otv12 = (profit12 + cost)*1.3;
                double kdv12  = (profit12+ cost + otv12)*0.18;
                double carPrice12 = cost+profit12+otv12+kdv12;

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

            }else if(cost>=170000){
                double profit1 = cost*0.6;
                double otv1 = (profit1 + cost)*1.5;
                double kdv1  = (profit1 + cost + otv1)*0.2;
                double carPrice1 = cost+profit1+otv1+kdv1;

                double profit2 = cost*0.55;
                double otv2 = (profit2 + cost)*1.5;
                double kdv2  = (profit2 + cost + otv2)*0.2;
                double carPrice2 = cost+profit2+otv2+kdv2;

                double profit3 = cost*0.5;
                double otv3 = (profit3 + cost)*1.5;
                double kdv3  = (profit3 + cost + otv3)*0.2;
                double carPrice3 = cost+profit3+otv3+kdv3;

                double profit4 = cost*0.45;
                double otv4 = (profit4 + cost)*1.5;
                double kdv4  = (profit4 + cost + otv4)*0.2;
                double carPrice4 = cost+profit4+otv4+kdv4;

                double profit5 = cost*0.4;
                double otv5 = (profit5 + cost)*1.5;
                double kdv5  = (profit5 + cost + otv5)*0.2;
                double carPrice5 = cost+profit5+otv5+kdv5;

                double profit6 = cost*0.35;
                double otv6 = (profit6 + cost)*1.5;
                double kdv6  = (profit6 + cost + otv6)*0.2;
                double carPrice6 = cost+profit6+otv6+kdv6;

                double profit7 = cost*0.3;
                double otv7 = (profit7 + cost)*1.5;
                double kdv7  = (profit7 + cost + otv7)*0.2;
                double carPrice7 = cost+profit7+otv7+kdv7;

                double profit8 = cost*0.25;
                double otv8 = (profit8 + cost)*1.5;
                double kdv8  = (profit8 + cost + otv8)*0.2;
                double carPrice8 = cost+profit8+otv8+kdv8;

                double profit9 = cost*0.2;
                double otv9 = (profit9 + cost)*1.5;
                double kdv9  = (profit9 + cost + otv9)*0.2;
                double carPrice9 = cost+profit9+otv9+kdv9;

                double profit10 = cost*0.15;
                double otv10 = (profit10 + cost)*1.5;
                double kdv10  = (profit10 + cost + otv10)*0.2;
                double carPrice10 = cost+profit10+otv10+kdv10;

                double profit11 = cost*0.1;
                double otv11 = (profit11 + cost)*1.5;
                double kdv11  = (profit11 + cost + otv11)*0.2;
                double carPrice11 = cost+profit11+otv11+kdv11;

                double profit12 = cost*0.05;
                double otv12 = (profit12 + cost)*1.5;
                double kdv12  = (profit12+ cost + otv12)*0.2;
                double carPrice12 = cost+profit12+otv12+kdv12;

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

            }else{
                System.out.println("*****Entered wrong value for Production cost*****");
            }
        }else if(engine>=2000){

            double profit1 = cost*0.6;
            double otv1 = (profit1 + cost)*2.2;
            double kdv1  = (profit1 + cost + otv1)*0.24;
            double carPrice1 = cost+profit1+otv1+kdv1;

            double profit2 = cost*0.55;
            double otv2 = (profit2 + cost)*2.2;
            double kdv2  = (profit2 + cost + otv2)*0.24;
            double carPrice2 = cost+profit2+otv2+kdv2;

            double profit3 = cost*0.5;
            double otv3 = (profit3 + cost)*2.2;
            double kdv3  = (profit3 + cost + otv3)*0.24;
            double carPrice3 = cost+profit3+otv3+kdv3;

            double profit4 = cost*0.45;
            double otv4 = (profit4 + cost)*2.2;
            double kdv4  = (profit4 + cost + otv4)*0.24;
            double carPrice4 = cost+profit4+otv4+kdv4;

            double profit5 = cost*0.4;
            double otv5 = (profit5 + cost)*2.2;
            double kdv5  = (profit5 + cost + otv5)*0.24;
            double carPrice5 = cost+profit5+otv5+kdv5;

            double profit6 = cost*0.35;
            double otv6 = (profit6 + cost)*2.2;
            double kdv6  = (profit6 + cost + otv6)*0.24;
            double carPrice6 = cost+profit6+otv6+kdv6;

            double profit7 = cost*0.3;
            double otv7 = (profit7 + cost)*2.2;
            double kdv7  = (profit7 + cost + otv7)*0.24;
            double carPrice7 = cost+profit7+otv7+kdv7;

            double profit8 = cost*0.25;
            double otv8 = (profit8 + cost)*2.2;
            double kdv8  = (profit8 + cost + otv8)*0.24;
            double carPrice8 = cost+profit8+otv8+kdv8;

            double profit9 = cost*0.2;
            double otv9 = (profit9 + cost)*2.2;
            double kdv9  = (profit9 + cost + otv9)*0.24;
            double carPrice9 = cost+profit9+otv9+kdv9;

            double profit10 = cost*0.15;
            double otv10 = (profit10 + cost)*2.2;
            double kdv10  = (profit10 + cost + otv10)*0.24;
            double carPrice10 = cost+profit10+otv10+kdv10;

            double profit11 = cost*0.1;
            double otv11 = (profit11 + cost)*2.2;
            double kdv11  = (profit11 + cost + otv11)*0.24;
            double carPrice11 = cost+profit11+otv11+kdv11;

            double profit12 = cost*0.05;
            double otv12 = (profit12 + cost)*2.2;
            double kdv12  = (profit12+ cost + otv12)*0.24;
            double carPrice12 = cost+profit12+otv12+kdv12;

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

        }else{
            System.out.println("*****Entered wrong value for Engine type*****");
        }

    }
}

