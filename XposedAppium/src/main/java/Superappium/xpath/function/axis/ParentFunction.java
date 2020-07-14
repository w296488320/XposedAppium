package Superappium.xpath.function.axis;

import Superappium.ViewImage;
import Superappium.ViewImages;

import java.util.List;


public class ParentFunction implements AxisFunction {
    @Override
    public ViewImages call(ViewImage e, List<String> args) {
        return new ViewImages(e.parentNode());
    }

    @Override
    public String getName() {
        return "parent";
    }
}
