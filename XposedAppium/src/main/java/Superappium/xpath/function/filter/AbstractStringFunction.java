package Superappium.xpath.function.filter;

import Superappium.ViewImage;
import Superappium.xpath.exception.EvaluateException;
import Superappium.xpath.parser.expression.SyntaxNode;

import java.util.List;

public abstract class AbstractStringFunction implements FilterFunction {
    protected String firstParamToString(ViewImage element, List<SyntaxNode> params) {
        Object string = ((SyntaxNode) params.get(0)).calc(element);
        if (!(string instanceof String)) {
            throw new EvaluateException(getName() + " first parameter is not a string :" + string);
        }
        return string.toString();
    }
}
