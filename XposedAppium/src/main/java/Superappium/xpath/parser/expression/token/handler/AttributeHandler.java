package Superappium.xpath.parser.expression.token.handler;

import Superappium.ViewImage;
import Superappium.xpath.parser.expression.SyntaxNode;
import Superappium.xpath.parser.expression.token.Token;
import Superappium.xpath.parser.expression.token.TokenHandler;

public class AttributeHandler implements TokenHandler {
    @Override
    public SyntaxNode parseToken(final String tokenStr) {
        //return element -> element.attribute(tokenStr);
        return new SyntaxNode() {
            @Override
            public Object calc(ViewImage viewImage) {
                return viewImage.attribute(tokenStr);
            }
        };
    }

    @Override
    public String typeName() {
        return Token.ATTRIBUTE_ACTION;
    }
}
