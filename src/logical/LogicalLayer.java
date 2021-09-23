package logical;
import com.Lift;
import java.util.ArrayList;
import java.util.Comparator;

public class LogicalLayer {
    public String assignLift(ArrayList<Lift> lifts,int start,int end)
    {
        int min=999;
        int nextFloor=0;
        int capacity=0;
        Lift assignedLift=null;
            if(start>end)
            {
                Comparator<Lift> compare=new Comparator<Lift>() {
                    @Override
                    public int compare(Lift o1, Lift o2) {
                        return Integer.compare(o2.getCurrentFloor(), o1.getCurrentFloor());
                    }
                };
                lifts.sort(compare);
                for (Lift lift:lifts)
                {
                    int distanceBetweenCustomerAndLift=Math.abs(lift.getCurrentFloor()-start);
                    if (distanceBetweenCustomerAndLift<min) {
                        assignedLift = lift;
                        capacity = lift.getCapacity();
                        nextFloor=end;
                        min=distanceBetweenCustomerAndLift;
                    }
                }
            }
            else
            {
                Comparator<Lift> compare=new Comparator<Lift>() {
                    @Override
                    public int compare(Lift o1, Lift o2) {
                        return Integer.compare(o1.getCurrentFloor(), o2.getCurrentFloor());
                    }
                };
                lifts.sort(compare);
                for (Lift lift:lifts)
                {
                    int distanceBetweenCustomerAndLift=Math.abs(lift.getCurrentFloor()-start);
                    if (distanceBetweenCustomerAndLift<min) {
                        assignedLift = lift;
                        int currentCapacity = lift.getCapacity();
                        currentCapacity--;
                        capacity=currentCapacity;
                        min=distanceBetweenCustomerAndLift;
                        nextFloor=end;
                    }
                }
            }
        assignedLift.setCurrentFloor(nextFloor);
        assignedLift.setCapacity(capacity);
        return assignedLift.getLiftNumber();
    }
}
