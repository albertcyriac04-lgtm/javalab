class Base {
    private int value;

    public Base(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    protected void show() {
        System.out.println(this.value);
    }

    public void print() {
        System.out.println(this.value);
    }
}

class Derived extends Base {
    private String subclassFeature;

    public Derived(int value, String subclassFeature) {
        super(value);
        this.subclassFeature = subclassFeature;
    }

    public String getSubclassFeature() {
        return this.subclassFeature;
    }

    public void setSubclassFeature(String subclassFeature) {
        if (subclassFeature == null || subclassFeature.trim().isEmpty()) {
            this.subclassFeature = "Default";
        } else {
            this.subclassFeature = subclassFeature;
        }
    }

    public void displayExtendedFeatures() {
        show();
        print();
        System.out.println(this.subclassFeature);
        System.out.println(getValue());
    }
}

public class Main {
    public static void main(String[] args) {
        Derived obj = new Derived(101, "Advanced MCA Analytics Engines");
        obj.displayExtendedFeatures();

        obj.setValue(505);
        obj.setSubclassFeature("Cloud Infrastructure Engine");
        obj.displayExtendedFeatures();
    }
}