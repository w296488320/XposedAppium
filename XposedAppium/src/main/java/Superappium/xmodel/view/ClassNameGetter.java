package Superappium.xmodel.view;


import Superappium.SuperAppium;
import Superappium.ViewImage;
import Superappium.xmodel.ValueGetter;

public class ClassNameGetter implements ValueGetter<String> {

    @Override
    public String get(ViewImage viewImage) {
        return viewImage.getOriginView().getClass().getName();
    }

    @Override
    public boolean support(Class type) {
        return true;
    }

    @Override
    public String attr() {
        return SuperAppium.className;
    }
}
