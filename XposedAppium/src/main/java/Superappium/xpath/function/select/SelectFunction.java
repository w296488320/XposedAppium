package Superappium.xpath.function.select;

import Superappium.ViewImages;
import Superappium.xpath.function.NameAware;
import Superappium.xpath.model.XNodes;
import Superappium.xpath.model.XpathNode;

import java.util.List;

public interface SelectFunction extends NameAware {
    XNodes call(XpathNode.ScopeEm scopeEm, ViewImages elements, List<String> args);
}
