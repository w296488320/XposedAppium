package Superappium.xpath.function.axis;


import Superappium.ViewImage;
import Superappium.xpath.function.NameAware;

import java.util.List;

public abstract interface AxisFunction extends NameAware {
    public abstract List<ViewImage> call(ViewImage paramViewImage, List<String> paramList);
}
