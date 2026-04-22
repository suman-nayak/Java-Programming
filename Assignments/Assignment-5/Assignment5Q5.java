abstract class Bank {
    abstract int getROI();
}

class SBI extends Bank {
    int getROI() {
        return 7;
    }
}

class PNB extends Bank {
    int getROI() {
        return 5;
    }
}

class BOI extends Bank {
    int getROI() {
        return 6;
    }
}

class Assignment5Q5 {
    public static void main(String[] args) {
        Bank b;
        
        b = new SBI();
        System.out.println("SBI ROI: " + b.getROI() + "%");

        b = new PNB();
        System.out.println("PNB ROI: " + b.getROI() + "%");

        b = new BOI();
        System.out.println("BOI ROI: " + b.getROI() + "%");
    }
}