package Superappium.xpath.parser.expression.operator;

import Superappium.ViewImage;
import Superappium.xpath.XpathUtil;
import Superappium.xpath.parser.expression.node.AlgorithmUnit;


/**
 * Created by virjar on 17/6/10.
 */
@OpKey(value = "$=", priority = 10)
public class EndWithUnit extends AlgorithmUnit {
    @Override
    public Object calc(ViewImage element) {
        Object leftValue = left.calc(element);
        Object rightValue = right.calc(element);
        if (leftValue == null || rightValue == null) {
            return Boolean.FALSE;
        }
        return XpathUtil.toPlainString(leftValue).endsWith(XpathUtil.toPlainString(rightValue));
    }
}
