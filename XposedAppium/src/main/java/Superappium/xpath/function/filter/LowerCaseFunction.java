package Superappium.xpath.function.filter;

import Superappium.ViewImage;
import Superappium.xpath.parser.expression.SyntaxNode;

import java.util.List;

public class LowerCaseFunction extends AbstractStringFunction {
    public Object call(ViewImage element, List<SyntaxNode> params) {
        return firstParamToString(element, params).toLowerCase();
    }

    public String getName() {
        return "lower-case";
    }
}
