package Superappium.xpath.function.axis;

import Superappium.ViewImage;
import Superappium.ViewImages;

import java.util.List;

public class SiblingFunction implements AxisFunction {
    @Override
    public ViewImages call(ViewImage e, List<String> args) {
        return new ViewImages(e.nextSibling());
    }

    @Override
    public String getName() {
        return "sibling";
    }
}

