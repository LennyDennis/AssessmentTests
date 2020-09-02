public class ReverseCharacters {
    public static void main(String[] args) {
        String name = "Lorem at";
        System.out.println(reverseStringCharacters(name));
    }
    private static String reverseStringCharacters(String name){
        int nameLength = name.length();
        StringBuilder newString = new StringBuilder(name);
        int initialPosition = 0;
        // Loop through the name. If index is divisible by 4, reverse the name from the initial position to the index position.
        // Using the initial position and index replace the characters in the name with the reversedStrings value else the initial value remain.
        for(int i=0; i<=nameLength; i++){
            if(i>0 && i%4 == 0){
                String reversedStrings = new StringBuilder(name.substring(initialPosition,i)).reverse().toString();
                newString.replace(initialPosition,i,reversedStrings);
                initialPosition = i;
            }
        }
        return newString.toString();
    }
}