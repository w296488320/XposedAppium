package Superappium.xpath.parser.expression.token.consumer;

import Superappium.xpath.parser.TokenQueue;
import Superappium.xpath.parser.expression.token.TokenConsumer;

public class FunctionConsumer implements TokenConsumer {
    public String consume(TokenQueue tokenQueue) {
        if (tokenQueue.matchesFunction()) {
            return tokenQueue.consumeFunction();
        }
        return null;
    }

    public int order() {
        return 60;
    }

    public String tokenType() {
        return "FUNCTION";
    }
}
