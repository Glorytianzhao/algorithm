package design.structure.adapter.targetadapter;

import design.structure.adapter.classadapter.ThreeHole;
import design.structure.adapter.classadapter.TwoPlug;

/**
 *
 */
public class TargetAdapter implements ThreeHole {

    private TwoPlug twoPlug;

    public TargetAdapter(TwoPlug twoPlug) {
        this.twoPlug = twoPlug;
    }

    @Override
    public void inserted() {
        twoPlug.insert();
    }


}
