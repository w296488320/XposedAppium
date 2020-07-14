package Superappium.xpath.parser.expression.operator;

import Superappium.ViewImage;
import Superappium.xpath.parser.expression.node.WrapperUnit;

/**
 * Created by virjar on 17/6/10.
 */
@OpKey(value = "and", priority = 0)
public class And2Unit extends WrapperUnit {
    @Override
    protected String targetName() {
        return "&&";
    }

    @Override
    public Object calc(ViewImage element) {
        return wrap().calc(element);
    }

}

