class MaxFinder {

    int findMax(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }

    float findMax(float a, float b){
        if(a > b)
            return a;
        else
            return b;
    }

    int findMax(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}

public class Assignment4Qn7 {
    public static void main(String[] args){
        MaxFinder m = new MaxFinder();

        int a = 10, b = 20;
        float x = 5.5f, y = 3.2f;
        int arr[] = {4, 9, 2, 15, 7};

        System.out.println("Max of two integers: " + m.findMax(a, b));
        System.out.println("Max of two floats: " + m.findMax(x, y));
        System.out.println("Max element in array: " + m.findMax(arr));
    }
}