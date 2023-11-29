import java.util.HashMap;
import java.util.Map;
// 观测值类
class Measure {
    private Map<String, String> measurements;  // 存储各种观测值，如湿度、温度等

    public Measure() {
        this.measurements = new HashMap<>();
    }

    public Map<String, String> getMeasurements() {
        return measurements;
    }

    // 添加观测值的方法
    public void addMeasurement(String measurementName, String measurementValue) {
        measurements.put(measurementName, measurementValue);
    }
}