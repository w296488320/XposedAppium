package Superappium.xpath.parser.expression.token.handler;

import Superappium.ViewImage;
import Superappium.xpath.XpathParser;
import Superappium.xpath.exception.XpathSyntaxErrorException;
import Superappium.xpath.model.XNode;
import Superappium.xpath.model.XNodes;
import Superappium.xpath.model.XpathEvaluator;
import Superappium.xpath.parser.expression.SyntaxNode;
import Superappium.xpath.parser.expression.token.Token;
import Superappium.xpath.parser.expression.token.TokenHandler;

public class XpathHandler implements TokenHandler {
    @Override
    public SyntaxNode parseToken(String tokenStr) throws XpathSyntaxErrorException {
        final XpathEvaluator xpathEvaluator = new XpathParser(tokenStr).parse();
        return new SyntaxNode() {
            @Override
            public Object calc(ViewImage element) {
                return xpathEvaluator.evaluate(new XNodes(XNode.e(element)));
            }
        };
    }

    @Override
    public String typeName() {
        return Token.XPATH;
    }
}
