package Superappium.xpath.function.select;

import Superappium.ViewImage;
import Superappium.ViewImages;
import Superappium.xpath.model.XNode;
import Superappium.xpath.model.XNodes;
import Superappium.xpath.model.XpathNode;

import java.util.List;


public class SelfFunction implements SelectFunction {
    @Override
    public XNodes call(XpathNode.ScopeEm scopeEm, ViewImages elements, List<String> args) {
        XNodes xNodes = new XNodes();
        for (ViewImage viewImage : elements) {
            xNodes.add(XNode.e(viewImage));
        }
        return xNodes;
    }

    @Override
    public String getName() {
        return "self";
    }
}
