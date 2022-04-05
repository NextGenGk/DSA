package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

    // Activity Selection Method
    static void activitySelection(ArrayList<Activity> activityList) {
        Comparator<Activity> finishComparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getFinishTime() - o2.getFinishTime();
            }
        };
        Collections.sort(activityList, finishComparator);
        Activity previousActivity = activityList.get(0);

        System.out.print("Recommended Schedule :"+activityList.get(0));

        for (int i=0; i<activityList.size(); i++) {
            Activity activity = activityList.get(i);
            if (activity.getStartTime() >= activity.getFinishTime()){
                System.out.println(activity);
                // current activity in this next stage will be previous activity
                previousActivity = activity;
            }
        }
    }

    // Main Class
    public static void main(String[] args) {
        ArrayList<Activity> activityList = new ArrayList<>();
        activityList.add(new Activity("A1",0,6));
        activityList.add(new Activity("A2",3,4));
        activityList.add(new Activity("A3",1,2));
        activityList.add(new Activity("A4",5,8));
        activityList.add(new Activity("A5",5,7));
        activityList.add(new Activity("A6",8,9));

        ActivitySelection.activitySelection(activityList);

    }
}
