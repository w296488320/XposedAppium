package Superappium.xpath.function.filter;

import Superappium.ViewImage;
import Superappium.xpath.parser.expression.SyntaxNode;

import java.util.List;

public class FalseFunction implements FilterFunction {
    public Object call(ViewImage element, List<SyntaxNode> params) {
        return Boolean.valueOf(false);
    }

    public String getName() {
        return "false";
    }
}

