public class uzd0618 {
    public static void main(String[] args) {
        int[] arrT = Metodai.randomArr(-5, 5, 40);
        Metodai.printArr(arrT);
        Integer[] arrPos = Metodai.positive(arrT);
        Integer[] arrNeg = Metodai.negative(arrT);
        int zeros = Metodai.zeros(arrT);
        int[] arr = new int[arrT.length];
        int j = 0;
        for(int i = 0; i < arrNeg.length; i++) {
            arr[j] = arrNeg[i];
            j++;
        }
        for(int i = 0; i < arrPos.length; i++) {
            arr[j] = arrPos[i];
            j++;
        }
        for(int i = 0; i < zeros; i++) {
            arr[j] = 0;
            j++;
        }
        Metodai.printArr(arr);
    }
}
