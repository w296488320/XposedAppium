package Superappium.xpath.function.filter;

import Superappium.ViewImage;
import Superappium.xpath.parser.expression.SyntaxNode;

import java.util.List;

public class NotFunction extends BooleanFunction {
    @Override
    public Object call(ViewImage element, List<SyntaxNode> params) {
        return !((Boolean) super.call(element, params));
    }

    @Override
    public String getName() {
        return "not";
    }
}
