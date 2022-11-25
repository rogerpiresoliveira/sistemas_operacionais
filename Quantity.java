public class Quantity {
    String unitName;
    float floatValue;

    public Quantity(float floatValue, String unitName) {
        this.unitName = unitName;
        this.floatValue = floatValue;
    }

    public float getValue() {
        return floatValue;
    }

    public void setValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}