import java.util.HashMap;
import java.util.Map;
// 控制器类扩展了控制指令和优化控制算法
abstract class Controller {
    private String name;
    private String controlInstruction;
    private String optimizationAlgorithm;  // 优化控制算法，具体实现留待扩展

    public Controller(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getControlInstruction() {
        return controlInstruction;
    }

    public String getOptimizationAlgorithm() {
        return optimizationAlgorithm;
    }

    // 设置控制指令的方法
    public void setControlInstruction(String controlInstruction) {
        this.controlInstruction = controlInstruction;
    }

    // 抽象方法，由子类实现具体的控制器行为
    public abstract void control(Device device);

    // 抽象方法，由子类实现具体的优化控制算法
    public abstract void optimizeControl(Device device, GoalManager targetManager);
}