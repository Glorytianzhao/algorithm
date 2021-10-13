package design.structure.adapter.classadapter;

public class ClassAdapter extends TwoPlug implements ThreeHole{

    @Override
    public void inserted() {
        super.insert();
    }
}
