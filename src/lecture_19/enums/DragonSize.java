package lecture_19.enums;

import java.util.HashMap;
import java.util.Map;

public enum DragonSize {
    SMALL("Small dragon"),
    MEDIUM("Medium dragon"),
    LARGE("Large dragon");


    private String description;

    DragonSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Map<DragonSize, String> mapEnumValues() {
        Map<DragonSize, String> map = new HashMap<>();
        for (DragonSize value : DragonSize.values()) {
            map.put(value, value.description);
        }
        return map;
    }

}
