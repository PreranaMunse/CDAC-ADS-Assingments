public class AttendanceReport {
    int arr;

static int countPresent(int[] att)
{
    int count = 0;
    for(int i = 0; i <  att.length; i++)
    {
        if(att[i] == 1)
        {
            count++;
        }
    }   
    return count;    
}    
static double percentage(int present, int total) 
{
   double percentage = ((double)present / total) * 100;       
   return percentage;    
 }    
static void longestStreak(int[] att, int value) 
{
    int current = 0;
    int best = 0;
    int bestEnd = -1;

    for(int i = 0;i < att.length; i++)
    {
        if(att[i] == value)
        {
            current++;
        }
     
    else
    {
        current = 0;
    }
    if(current > best)
    {
        best = current;
        bestEnd = i;
    }
}
    if(best == 0)
    {
        System.out.println("Longest strak : 0 days");
    }
    else{
        int startDay = bestEnd - best + 2;
        int endDay = bestEnd + 1;
    
    if (value == 1) {
            System.out.println("Longest presence : " + best +
                    " days (day " + startDay + " to day " + endDay + ")");
        } 
        else {
            System.out.println("Longest absence   : " + best +
                    " days (day " + startDay + " to day " + endDay + ")");
        }
    }
}

 static int daysNeeded(int present, int total) 
 {
    int days = 0;
    while(((double) present / total) * 100 < 75)
    {
        present++;
        total++;
        days++;
    }       
       
    return days;    
    }    
     public static void main(String[] args) {

    int[] att = {1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0};

    int present = countPresent(att);

    int total = att.length;

    double attendance = percentage(present, total);

    System.out.println("Days present : " + present + " of " + total);
    System.out.println("Attendance : " + String.format("%.2f", attendance) + " %");

    if (attendance >= 75) {
        System.out.println("Eligible : YES");
    } 
    else {
        System.out.println("Eligible : NO");
    }

    longestStreak(att, 1);

    longestStreak(att, 0);

    int needed = daysNeeded(present, total);

    System.out.println("Days needed for 75%: " + needed);
}
}
    

