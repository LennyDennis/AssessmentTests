public class MissingInteger {
    public static void main(String[] args) {
        int[] arrayK= {5,4,3,2};
        System.out.println(getMissingInteger(arrayK));
    }
    private static int getMissingInteger(int[] arrayOfIntegers){
        // Get the total sum of the array with the all numbers.
        // Get the sum of the array with the missing number.
        // Subtract the result of both to get the missing integer.
        int arrayLength = arrayOfIntegers.length;
        int totalSum = (arrayLength+1)*((arrayLength+2)/2);
        int arraySum = 0;
        for(int arrayInteger:arrayOfIntegers){
            arraySum += arrayInteger;
        }

        return totalSum - arraySum;
    }
}
