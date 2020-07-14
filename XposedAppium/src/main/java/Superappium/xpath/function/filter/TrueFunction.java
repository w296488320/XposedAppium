package Superappium.xpath.function.filter;

import Superappium.ViewImage;
import Superappium.xpath.parser.expression.SyntaxNode;

import java.util.List;

public class TrueFunction implements FilterFunction {
    @Override
    public Object call(ViewImage element, List<SyntaxNode> params) {
        return true;
    }

    @Override
    public String getName() {
        return "true";
    }
}
