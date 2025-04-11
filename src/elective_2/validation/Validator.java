package elective_2.validation;

import elective_2.exceptions.InvalidDataException;
import elective_2.exceptions.InvalidRatingException;

public class Validator {
    public static void validRecipeName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new InvalidDataException();
        }
    }

    public static void validRating(int rating){
        if(rating < 1 || rating > 5){
            throw new InvalidRatingException();
        }
    }
}
