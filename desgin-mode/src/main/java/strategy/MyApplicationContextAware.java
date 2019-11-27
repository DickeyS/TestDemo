package strategy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import strategy.annotation.StrateGyAnnotation;
import strategy.inter.StrategyInterface;

import java.util.Map;
import java.util.Set;

/**
 * <pre>
 * </pre>
 *
 * @author shidijian@ycs168.cn
 * @version 1.00.00
 * @Date 2019-11-22 11:59
 */
@Component
public class MyApplicationContextAware implements ApplicationContextAware {
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String,Object> concurrentHashMap =  applicationContext.getBeansWithAnnotation(StrateGyAnnotation.class);
        Set<String> keyset =  concurrentHashMap.keySet();
        for(String key:keyset) {
            Class<StrategyInterface> strategyInterfaceClass = (Class<StrategyInterface>) concurrentHashMap.get(key).getClass();
            String annotationValue = strategyInterfaceClass.getAnnotation(StrateGyAnnotation.class).value();
            HandlerContext.strategyMap.put(annotationValue,strategyInterfaceClass);
        }
    }
}
