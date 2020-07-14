package Superappium.xmodel.basic;

import android.widget.ImageView;

import Superappium.SuperAppium;
import Superappium.ViewImage;
import Superappium.xmodel.ValueGetter;
import de.robv.android.xposed.XposedHelpers;


public class ImageUriGetter implements ValueGetter {
    @Override
    public Object get(ViewImage viewImage) {
        return XposedHelpers.getObjectField(viewImage.getOriginView(), "mUri");
    }

    @Override
    public String attr() {
        return SuperAppium.mUri;
    }

    @Override
    public boolean support(Class type) {
        return ImageView.class.isAssignableFrom(type);
    }
}
