package strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import strategy.inter.StrategyInterface;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <pre>
 * </pre>
 *
 * @author shidijian@ycs168.cn
 * @version 1.00.00
 * @Date 2019-11-25 10:36
 */
@Component
public class HandlerContext {

    @Autowired
    private ApplicationContext applicationContext;


    public static Map<String,Class<StrategyInterface>> strategyMap = new ConcurrentHashMap<String, Class<StrategyInterface>>();


    public  StrategyInterface getInstance(String type) throws Exception{
        Class<StrategyInterface> strategyInterfaceClass = strategyMap.get(type);
        if(strategyInterfaceClass == null) {
            throw new Exception("找不到对应type");
        }
        return applicationContext.getBean(strategyInterfaceClass);
    }



}
