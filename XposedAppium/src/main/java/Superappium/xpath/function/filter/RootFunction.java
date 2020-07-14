package Superappium.xpath.function.filter;

import Superappium.ViewImage;
import Superappium.xpath.XpathUtil;
import Superappium.xpath.parser.expression.SyntaxNode;

import java.util.List;

public class RootFunction implements FilterFunction {
    @Override
    public Object call(ViewImage element, List<SyntaxNode> params) {
        if (params.size() > 0) {
            Object calc = params.get(0).calc(element);
            if (calc instanceof ViewImage) {
                return XpathUtil.root((ViewImage) calc);
            } else {
                throw new IllegalStateException("result of function :<" + getName() + "> not a view element");
            }
        }
        return XpathUtil.root(element);
    }

    @Override
    public String getName() {
        return "root";
    }
}

