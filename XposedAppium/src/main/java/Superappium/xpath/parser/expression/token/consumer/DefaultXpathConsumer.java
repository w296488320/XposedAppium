package Superappium.xpath.parser.expression.token.consumer;

import Superappium.utils.StringUtils;
import Superappium.xpath.XpathParser;
import Superappium.xpath.exception.XpathSyntaxErrorException;
import Superappium.xpath.parser.TokenQueue;
import Superappium.xpath.parser.expression.token.Token;
import Superappium.xpath.parser.expression.token.TokenConsumer;


public class DefaultXpathConsumer implements TokenConsumer {
    @Override
    public String consume(TokenQueue tokenQueue) {
        String s = tokenQueue.tryConsumeTo(" ");
        if (StringUtils.isEmpty(s)) {
            return null;
        }
        try {
            XpathParser.compile(s);
            return tokenQueue.consumeTo(" ");
        } catch (XpathSyntaxErrorException e) {
            // log.debug("exception when compile xpath:{}", s, e);
            // TODO
            // ignore,根据约定,如果发生异常,则忽略本次调用
            return null;
        }
    }

    @Override
    public int order() {
        return 80;
    }

    @Override
    public String tokenType() {
        return Token.XPATH;
    }
}
