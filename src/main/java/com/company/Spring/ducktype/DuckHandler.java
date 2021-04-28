package com.company.Spring.ducktype;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DuckHandler implements InvocationHandler {
    private Object target;
    private Class<?> targetclass;

    public DuckHandler(Object t) {
        this.target = t;
        this.targetclass = target.getClass();
    }

    public Object invoke(Object p, Method m, Object[] args) throws Throwable {
        Method me = targetclass.getMethod(m.getName(),
                m.getParameterTypes());
        return me.invoke(target, args);
    }

    public static boolean CanCast(Class<?> i, Object o) {
        Class<?> c = o.getClass();
        for (Method method : i.getMethods()) {
            try {
                c.getMethod(method.getName(), method.getParameterTypes());
            } catch (NoSuchMethodException e) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public static <I> I Cast(Class<I> c, Object o) {
        if (!CanCast(c, o))
        {
            throw new ClassCastException();}
        Object proxy = Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{c}, new DuckHandler(o));
        return (I) proxy;
    }
    @SuppressWarnings("unchecked")
    public static <C> C UnCast(Class<C> c, Object o) {
        DuckHandler h = (DuckHandler) Proxy.getInvocationHandler(o);
        return (C) h.target;
    }
}