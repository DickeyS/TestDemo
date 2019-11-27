package strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import strategy.inter.StrategyInterface;

/**
 * <pre>
 * </pre>
 *
 * @author shidijian@ycs168.cn
 * @version 1.00.00
 * @Date 2019-11-25 11:29
 */
@RestController
public class TestController {

    @Autowired
    HandlerContext handlerContext;

    @RequestMapping(value = "getStrateGy")
    double getStrateGy(String type) {
        try {
            StrategyInterface strategyInterface = handlerContext.getInstance(type);
            return strategyInterface.calcul(1,2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0d;
    }



}
