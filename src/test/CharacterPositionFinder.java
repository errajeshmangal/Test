package test;

import java.util.ArrayList;
import java.util.List;

public class CharacterPositionFinder {
    public static List<Integer> findCharacterPositions(String text, char targetChar) {
        List<Integer> positions = new ArrayList<>();
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == targetChar) {
                positions.add(i);
            }
        }
        
        return positions;
    }
    
    public static void main(String[] args) {
        String inputString = "Hello, this is a sample string.";
        char targetCharacter = 't';
        
        List<Integer> charPositions = findCharacterPositions(inputString, targetCharacter);
        
        if (charPositions.isEmpty()) {
            System.out.println("The character '" + targetCharacter + "' was not found in the string.");
        } else {
            System.out.println("The character '" + targetCharacter + "' was found at positions: " + charPositions);
        }
    }
}