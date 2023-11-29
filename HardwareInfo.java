import java.util.HashMap;
import java.util.Map;
// 记录硬件信息变化的时空位置类
class HardwareInfo {
    private Map<String, String> infoByTimeSpace;  // 记录硬件信息变化的时空位置

    public HardwareInfo() {
        this.infoByTimeSpace = new HashMap<>();
    }

    public Map<String, String> getInfoByTimeSpace() {
        return infoByTimeSpace;
    }

    // 添加硬件信息的方法
    public void addHardwareInfo(String timeSpacePosition, String hardwareInfo) {
        infoByTimeSpace.put(timeSpacePosition, hardwareInfo);
    }
}