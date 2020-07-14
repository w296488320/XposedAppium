package Superappium.xmodel.view;


import Superappium.SuperAppium;
import Superappium.ViewImage;
import Superappium.xmodel.ValueGetter;

public class SelectedValueGetter implements ValueGetter<Boolean> {

    @Override
    public Boolean get(ViewImage viewImage) {
        return viewImage.getOriginView().isSelected();
    }

    @Override
    public boolean support(Class type) {
        return true;
    }

    @Override
    public String attr() {
        return SuperAppium.selected;
    }
}
