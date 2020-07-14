package Superappium.xpath.parser.expression.token.handler;

import Superappium.xpath.exception.XpathSyntaxErrorException;
import Superappium.xpath.parser.TokenQueue;
import Superappium.xpath.parser.expression.ExpressionParser;
import Superappium.xpath.parser.expression.SyntaxNode;
import Superappium.xpath.parser.expression.token.Token;
import Superappium.xpath.parser.expression.token.TokenHandler;

public class ExpressionHandler implements TokenHandler {
    @Override
    public SyntaxNode parseToken(String tokenStr) throws XpathSyntaxErrorException {
        return new ExpressionParser(new TokenQueue(tokenStr)).parse();
    }

    @Override
    public String typeName() {
        return Token.EXPRESSION;
    }
}

