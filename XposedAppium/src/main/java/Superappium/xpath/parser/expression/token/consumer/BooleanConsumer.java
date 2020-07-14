package Superappium.xpath.parser.expression.token.consumer;

import Superappium.xpath.parser.TokenQueue;
import Superappium.xpath.parser.expression.token.TokenConsumer;

public class BooleanConsumer implements TokenConsumer {
    public String consume(TokenQueue tokenQueue) {
        if (tokenQueue.matchesBoolean()) {
            return tokenQueue.consumeWord();
        }
        return null;
    }

    public int order() {
        return 70;
    }

    public String tokenType() {
        return "BOOLEAN";
    }
}
