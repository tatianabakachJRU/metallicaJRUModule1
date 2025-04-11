package elective_2.services;

import elective_2.exceptions.InvalidRatingException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingService {
    private Map<String, List<Integer>> ratings = new HashMap<>();

    public Map<String, List<Integer>> getRatings() {
        return new HashMap<>(ratings);
    }

    public void addRating(String recipeName, int rating) throws InvalidRatingException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException();
        }
        String key = recipeName.toLowerCase();
        if (!ratings.containsKey(key)) {
            ratings.put(key, new ArrayList<>());
        }
        List<Integer> numbers = ratings.get(key);
        numbers.add(rating);
    }

    public void loadRatings(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)) return;

        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            String[] parts = line.split(":");
            if(parts.length !=2) continue;

            String recipeName = parts[0].toLowerCase();
            String[] ratingArray = parts[1].split(",");
            List<Integer> ratingList = new ArrayList<>();
            for (String rating : ratingArray) {
                ratingList.add(Integer.parseInt(rating.trim()));
            }
            ratings.put(recipeName, ratingList);
        }
    }
    public void saveRating(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        try(BufferedWriter writer = Files.newBufferedWriter(path)){
            for (Map.Entry<String, List<Integer>> entry : ratings.entrySet()){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(entry.getKey()).append(":");
                List<Integer> ratingList = entry.getValue();
                for (int i = 0; i < ratingList.size(); i++) {
                    stringBuilder.append(ratingList.get(i));
                    if(i < ratingList.size() - 1){
                        stringBuilder.append(",");
                    }
                }
                writer.write(stringBuilder.toString());
                writer.newLine();
            }
        }
    }
}
