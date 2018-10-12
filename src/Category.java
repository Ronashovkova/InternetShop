import java.util.Arrays;
import java.util.stream.Stream;

public enum Category {
    BEAUTY (1, "be"),
    HEALTH_FOOD (2, "he"),
    CLOUTH (3, "cl"),
    FRUIT (4, "fr"),
    VEGETABLES (5, "ve"),
    SPICES (6, "sp");

    private final int id;
    private final String name;

    Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category getCategory(int id){
        final Category[] values = values();
        for (Category category: values) {
            if (category.id == id){
                return category;
            }
        }
        throw new CategoryNotFoundExeption("Category with id " + name + "not found");


    }
    public static Category get(String name){
        final Stream<Category> categoryStream = Arrays.stream(values( )).filter(category ->);
    }
}
