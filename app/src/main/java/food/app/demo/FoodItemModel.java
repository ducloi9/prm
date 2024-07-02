package food.app.demo;

public class FoodItemModel {

    public static final int TYPE_FOOD = 1;
    public static final int TYPE_DRINK = 2;
    public static final int TYPE_SNACK = 3;

    private int type; // Loại món: Food, Drink, Snack
    private int imageResource; // Hình ảnh món
    private String name; // Tên món
    private String price; // Giá món

    public FoodItemModel(int type, int imageResource, String name, String price) {
        this.type = type;
        this.imageResource = imageResource;
        this.name = name;
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
