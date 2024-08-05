public class Time {
    int hh;
    int mm;
    int ss;
    public Time(int hh, int mm, int ss){
        this.hh=hh;
        this.mm=mm;
        this.ss=ss;
    }
    public Time(){

    }
    public void display(){
        int displayHour = hh%12;
        if(displayHour == 0){
            displayHour = 12;
        }
        String period = (hh<12)?"AM":"PM";
        System.out.println(displayHour+":"+mm+":"+ss+" "+period);
    }
}
