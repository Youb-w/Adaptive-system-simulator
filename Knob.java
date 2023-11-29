import java.util.HashMap;
import java.util.Map;
// 配置信息类
class Knob {
    private Map<String, String> configurations;  // 存储各种配置信息，如内存资源、CPU占用率等

    public Knob() {
        this.configurations = new HashMap<>();
    }

    public Map<String, String> getConfigurations() {
        return configurations;
    }

    // 添加配置信息的方法
    public void addConfiguration(String configName, String configValue) {
        configurations.put(configName, configValue);
    }
}