import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Scrabble {
  public Integer calculateScore(String scrabbleLetter){
    String[] scoreOneArray = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    String[] scoreTwoArray = {"d", "g"};
    String[] scoreThreeArray = {"b", "c", "m", "p"};
    String[] scoreFourArray = {"f","h","v","w","y"};
    String[][] scoreArrays = {scoreOneArray, scoreTwoArray, scoreThreeArray, scoreFourArray};
    Integer[] letterValueArray = {1, 2, 3, 4};
    Integer score = 0;
    for(int i = 0; i < scoreArrays.length; i++){
      if(Arrays.asList(scoreArrays[i]).contains(scrabbleLetter.toLowerCase())){
        score = letterValueArray[i];
      }
    }
    return score;
  }
}
