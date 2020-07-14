package Superappium.xpath.parser.expression.node;

import Superappium.ViewImage;
import Superappium.xpath.function.filter.FilterFunction;
import Superappium.xpath.parser.expression.SyntaxNode;

import java.util.List;

public class FunctionNode implements SyntaxNode {
    private FilterFunction filterFunction;
    private List<SyntaxNode> filterFunctionParams;


    public FunctionNode(FilterFunction filterFunction, List<SyntaxNode> filterFunctionParams) {
        this.filterFunction = filterFunction;
        this.filterFunctionParams = filterFunctionParams;
    }


    @Override
    public Object calc(ViewImage viewImage) {
        return filterFunction.call(viewImage, filterFunctionParams);
    }
}
