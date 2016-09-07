import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Scrabble {
  public Integer calculateScore(String scrabbleWord){
    String[] scoreOneArray = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    String[] scoreTwoArray = {"d", "g"};
    String[] scoreThreeArray = {"b", "c", "m", "p"};
    String[] scoreFourArray = {"f","h","v","w","y"};
    String[] scoreFiveArray = {"k"};
    String[] scoreEightArray = {"j", "x"};
    String[] scoreTenArray = {"q","z"};
    String[][] scoreArrays = {scoreOneArray, scoreTwoArray, scoreThreeArray, scoreFourArray, scoreFiveArray, scoreEightArray, scoreTenArray};
    Integer[] letterValueArray = {1, 2, 3, 4, 5, 8, 10};
    Integer score = 0;
    for(String letter: scrabbleWord.split("")){
      for(int i = 0; i < scoreArrays.length; i++){
        if(Arrays.asList(scoreArrays[i]).contains(letter.toLowerCase())){
          score += letterValueArray[i];
        }
      }
    }
    return score;
  }
}
