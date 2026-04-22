class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    Time add(Time t){
        int s = second + t.second;
        int m = minute + t.minute + s / 60;
        int h = hour + t.hour + m / 60;

        s = s % 60;
        m = m % 60;
        h = h % 24;

        return new Time(h, m, s);
    }

    void display(){
        System.out.println(hour + ":" + minute + ":" + second);
    }
}

public class Assignment4Qn10 {
    public static void main(String[] args){
        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(5, 30, 20);

        Time result = t1.add(t2);
        result.display();
    }
}