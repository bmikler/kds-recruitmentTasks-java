package task1;

class Main {
    public static void main(String[] args) {
        System.out.println(createPicture(4));
    }

    static String createPicture(int n) {
        int[][] array = createArray(n);
        int layerNumber = 0;

        while (n > 0) {
            for (int i = layerNumber; i < array.length - layerNumber; i++){
                array[layerNumber][i] = n;
                array[array.length - 1 - layerNumber][i] = n;
                array[i][layerNumber] = n;
                array[i][array.length - 1 - layerNumber] = n;
            }
            n--;
            layerNumber++;
        }
        return convertArrayToString(array);
    }

    private static int[][] createArray(int n) {
        int size = 2 * n - 1;
        return new int[size][size];
    }

    private static String convertArrayToString(int[][] array) {
        StringBuilder answer = new StringBuilder();
        for (int[] rows : array) {
            for (int number : rows) {
                answer.append(number).append(" ");
            }
            answer.append("\n");
        }
        return answer.toString();
    }

}
