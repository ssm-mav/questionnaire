package com.ssm.questionnaire;

import java.util.HashMap;

public class AppContext {

    private static final ThreadLocal<AppContext> appContext = new ThreadLocal<AppContext>();
    private final HashMap<String, Object> values = new HashMap<String, Object>();

    public static AppContext getContext() {
        AppContext context = appContext.get();
        if (context == null) {
            context = new AppContext();
            appContext.set(context);
        }
        return context;
    }

    public void clear() {
        AppContext context = appContext.get();
        if (context != null) {
            context.values.clear();
        }
        context = null;
    }

    public void addObject(String key, Object value) {
        values.put(key, value);
    }

    public Object getObject(String key) {
        return values.get(key);
    }

}