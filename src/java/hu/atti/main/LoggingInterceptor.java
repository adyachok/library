/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.atti.main;

import java.util.logging.Logger;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author eandgya
 */
@Interceptor
@Loggable
public class LoggingInterceptor {
    @Inject
    private Logger logger;
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        logger.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
        try{
            return ic.proceed();
        }finally {
            logger.exiting(ic.getClass().getName(), ic.getMethod().getName());
        }
    }
}
