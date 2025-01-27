import java.util.ArrayList;
import java.util.List;

public class Property_Owner {

    private User user;
    private List<Property> listOfProperties;

    public Property_Owner(User user) {
        this.user = user;
        this.listOfProperties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        listOfProperties.add(property);
        System.out.println("Property added successfully!");
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
        System.out.println("Property removed successfully!");
    }
}

