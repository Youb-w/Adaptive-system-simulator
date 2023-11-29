import java.util.HashMap;
import java.util.Map;
// 更新目标管理类，添加目标条件
abstract class GoalManager {
    private Map<String, String> GoalConditions; // 目标条件，例如配置内存资源最大化

    public GoalManager() {
        this.GoalConditions = new HashMap<>();
    }

    public Map<String, String> getTargetConditions() {
        return GoalConditions;
    }

    // 添加目标条件的方法
    public void addTargetCondition(String conditionName, String conditionValue) {
        GoalConditions.put(conditionName, conditionValue);
    }

    // 抽象方法，由子类实现具体的目标管理行为
    public abstract void manageTarget(Device device);
}