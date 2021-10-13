package design.structure.adapter.classadapter;

import design.structure.adapter.targetadapter.TargetAdapter;

public class Client {

    public static void main(String[] args) {
        //目标是 目标接口的对象能执行适配者的方法
        ThreeHole threeHole = new ClassAdapter();
        threeHole.inserted();

        TargetAdapter targetAdapter = new TargetAdapter(new TwoPlug());
        targetAdapter.inserted();
    }
}
