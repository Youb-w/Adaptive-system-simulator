import java.util.Map;

// 更新装置类，引入观测值、配置信息和硬件信息类
abstract class Device {
    private String name;
    private Measure measure;         // 观测值
    private Knob knob;               // 配置信息
    private HardwareInfo hardwareInfo; // 记录硬件信息变化的时空位置

    public Device(String name) {
        this.name = name;
        this.measure = new Measure();
        this.knob = new Knob();
        this.hardwareInfo = new HardwareInfo();
    }

    public String getName() {
        return name;
    }

    public Measure getMeasure() {
        return measure;
    }

    public Knob getKnob() {
        return knob;
    }

    public HardwareInfo getHardwareInfo() {
        return hardwareInfo;
    }

    // 记录硬件信息变化的方法
    public void recordHardwareInfo(String timeSpacePosition, String hardwareInfo) {
        this.hardwareInfo.addHardwareInfo(timeSpacePosition, hardwareInfo);
    }

    // 模拟根据控制器的指令和观测值改变配置信息的方法
    public abstract void simulateControl(Controller controller);

    // 抽象方法，由子类实现具体的装置行为
    public abstract void operate();
}
