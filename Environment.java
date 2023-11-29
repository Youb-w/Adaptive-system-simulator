import java.util.HashMap;
import java.util.Map;
// 更新环境类，添加物理环境的干扰因素
abstract class Environment {
    private Map<String, String> environmentalFactors; // 物理环境的干扰因素，例如温度变化

    public Environment() {
        this.environmentalFactors = new HashMap<>();
    }

    public Map<String, String> getEnvironmentalFactors() {
        return environmentalFactors;
    }

    // 添加干扰因素的方法
    public void addEnvironmentalFactor(String factorName, String factorValue) {
        environmentalFactors.put(factorName, factorValue);
    }

    // 抽象方法，由子类实现具体的环境行为
    public abstract void simulate();
}
