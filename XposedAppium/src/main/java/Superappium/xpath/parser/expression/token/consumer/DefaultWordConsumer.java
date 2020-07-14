package Superappium.xpath.parser.expression.token.consumer;

import Superappium.xpath.parser.TokenQueue;
import Superappium.xpath.parser.expression.token.TokenConsumer;

public class DefaultWordConsumer implements TokenConsumer {
    public String consume(TokenQueue tokenQueue) {
        if (tokenQueue.matchesWord()) {
            return tokenQueue.consumeWord();
        }
        return null;
    }

    public int order() {
        return 90;
    }

    public String tokenType() {
        return "CONSTANT";
    }
}
