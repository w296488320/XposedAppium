package Superappium.xpath.parser.expression.node;

import Superappium.ViewImage;

public abstract class BooleanRevertUnit extends WrapperUnit {
    @Override
    public Object calc(ViewImage element) {
        return !((Boolean) wrap().calc(element));
    }

}