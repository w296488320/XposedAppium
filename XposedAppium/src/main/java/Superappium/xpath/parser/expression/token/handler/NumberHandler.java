package Superappium.xpath.parser.expression.token.handler;

import Superappium.ViewImage;
import Superappium.utils.NumberUtils;
import Superappium.xpath.parser.expression.SyntaxNode;
import Superappium.xpath.parser.expression.token.Token;
import Superappium.xpath.parser.expression.token.TokenHandler;



public class NumberHandler implements TokenHandler {
    @Override
    public SyntaxNode parseToken(final String tokenStr) {
        return new SyntaxNode() {
            @Override
            public Object calc(ViewImage element) {
                if (tokenStr.contains(".")) {
                    return NumberUtils.toDouble(tokenStr);
                } else {
                    return NumberUtils.toInt(tokenStr);
                }
            }
        };
    }

    @Override
    public String typeName() {
        return Token.NUMBER;
    }
}
