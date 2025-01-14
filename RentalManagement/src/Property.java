public class Property {
    private String propertyName;
    private String propertyAddress;
    private double propertyValue;

    public Property(String propertyName, String propertyAddress, double propertyValue) {
        this.propertyName = propertyName;
        this.propertyAddress = propertyAddress;
        this.propertyValue = propertyValue;
    }
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }

}
