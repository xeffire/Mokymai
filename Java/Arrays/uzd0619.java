public class uzd0619 {
    public static void main(String[] args) {
        int[] arrZ = Metodai.randomArr(0, 999, 70);
        int min = arrZ[0];
        int max = arrZ[0];
        int minI = 0;
        int maxI = 0;
        for(int i = 0; i < arrZ.length; i++) {
            if(min > arrZ[i]) {
                min = arrZ[i];
                minI = i;
            }
            if(max < arrZ[i]) {
                max = arrZ[i];
                maxI = i;
            }
        }

        System.out.printf("Min %d index %d%nMax %d index %d", min, minI, max, maxI);
    }
}
