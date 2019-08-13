package examples.aaronhoskins.com.firstdaydemo;

public class SingletonClass {
    private static SingletonClass singletonClass = null;
    private String producerName;
    private String value;

    //Method to check if the instance of the object exist, if not
    // create, then pass the instance back to caller
    public static SingletonClass getInstance(String passedName) {
        if(singletonClass == null) {
            singletonClass = new SingletonClass(passedName);
        }
        return singletonClass;
    }

    //Private constructors ONLY
    private SingletonClass(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
