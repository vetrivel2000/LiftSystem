import com.Lift;
import logical.LogicalLayer;

import java.util.ArrayList;
import java.util.Scanner;

public class LiftRunner {
    public static void main(String[] args)
    {
        LogicalLayer logical = new LogicalLayer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of.lifts");
        int n= scan.nextInt();
        int num=1;
        ArrayList<Lift> lifts= new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            Lift lift=new Lift();
            lift.setLiftNumber("L"+num);
            lift.setCurrentFloor(0);
            lift.setCapacity(5);
            lifts.add(lift);
            num++;
        }
        int option;
        do {
            System.out.println("1.Display position of lifts\n2.AssignLift");
            option=scan.nextInt();
            switch (option)
            {
                case 1:
                {
                    for (Lift lift : lifts) {
                        System.out.println(lift);
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Enter your current floor");
                    int start=scan.nextInt();
                    System.out.println("Enter your destination floor");
                    int end=scan.nextInt();
                    String liftNumber=logical.assignLift(lifts,start,end);
                    System.out.println(liftNumber+" is assigned");
                }
            }
        }while (option<3);
    }
}
