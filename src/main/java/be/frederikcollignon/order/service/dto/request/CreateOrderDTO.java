package be.frederikcollignon.order.service.dto.request;

public class CreateOrderDTO {

    private String testName;

    public String getTestName() {
        return testName;
    }

    @Override
    public String toString() {
        return "CreateOrderDTO{" +
                "testName='" + testName + '\'' +
                '}';
    }
}
