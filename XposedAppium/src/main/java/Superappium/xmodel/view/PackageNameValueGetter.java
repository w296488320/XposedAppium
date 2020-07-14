package Superappium.xmodel.view;


import android.content.Context;
import android.view.View;

import Superappium.SuperAppium;
import Superappium.ViewImage;
import Superappium.xmodel.ValueGetter;
import de.robv.android.xposed.XposedHelpers;

public class PackageNameValueGetter implements ValueGetter<String> {

    @Override
    public String get(ViewImage viewImage) {
        View originView = viewImage.getOriginView();
        Context context = (Context) XposedHelpers.getObjectField(originView, "mContext");
        return context.getPackageName();
    }

    @Override
    public boolean support(Class type) {
        return true;
    }

    @Override
    public String attr() {
        return SuperAppium.packageName;
    }
}
