public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger baseLogger) {
        this.logger = baseLogger;
    }
    public void add() {
        System.out.println("Add Customer");
        this.logger.log("Loglandı");
    }
}
