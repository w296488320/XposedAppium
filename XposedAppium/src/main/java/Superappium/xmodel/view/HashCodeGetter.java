package Superappium.xmodel.view;

import Superappium.SuperAppium;
import Superappium.ViewImage;
import Superappium.xmodel.ValueGetter;

public class HashCodeGetter implements ValueGetter<String> {
    @Override
    public String get(ViewImage viewImage) {
        return String.valueOf(viewImage.getOriginView().hashCode());
    }

    @Override
    public boolean support(Class type) {
        return true;
    }

    @Override
    public String attr() {
        return SuperAppium.hash;
    }
}
