package Superappium.xmodel.view;

import Superappium.SuperAppium;
import Superappium.ViewImage;
import Superappium.xmodel.ValueGetter;

public class ContentDescValueGetter implements ValueGetter<String> {

    @Override
    public String get(ViewImage viewImage) {
        CharSequence contentDescription = viewImage.getOriginView().getContentDescription();
        if (contentDescription == null) {
            return null;
        }
        return contentDescription.toString();
    }

    @Override
    public boolean support(Class type) {
        return true;
    }

    @Override
    public String attr() {
        return SuperAppium.contentDescription;
    }
}
