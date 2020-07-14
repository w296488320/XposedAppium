package Superappium.xpath.function.filter;

import Superappium.ViewImage;
import Superappium.xpath.function.NameAware;
import Superappium.xpath.parser.expression.SyntaxNode;

import java.util.List;

public abstract interface FilterFunction extends NameAware {
    public abstract Object call(ViewImage paramViewImage, List<SyntaxNode> paramList);
}