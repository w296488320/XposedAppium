package Superappium.xpath.parser.expression.token.handler;

import Superappium.utils.Lists;
import Superappium.xpath.exception.XpathSyntaxErrorException;
import Superappium.xpath.function.FunctionEnv;
import Superappium.xpath.parser.expression.SyntaxNode;
import Superappium.xpath.parser.expression.node.FunctionNode;
import Superappium.xpath.parser.expression.token.Token;
import Superappium.xpath.parser.expression.token.TokenHandler;



public class BooleanHandler implements TokenHandler {
    @Override
    public SyntaxNode parseToken(final String tokenStr) throws XpathSyntaxErrorException {
        return new FunctionNode(FunctionEnv.getFilterFunction(Boolean.parseBoolean(tokenStr) ? "true" : "false"),
                Lists.<SyntaxNode>newLinkedList());
    }

    @Override
    public String typeName() {
        return Token.BOOLEAN;
    }
}
