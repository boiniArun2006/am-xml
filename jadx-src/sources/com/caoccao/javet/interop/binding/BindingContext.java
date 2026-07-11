package com.caoccao.javet.interop.binding;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class BindingContext {
    protected Map<String, MethodDescriptor> functionMap = new HashMap();
    protected Map<String, MethodDescriptor> propertyGetterMap = new HashMap();
    protected Map<String, MethodDescriptor> propertySetterMap = new HashMap();
    protected Method v8BindingEnabler = null;
    protected Method v8RuntimeSetter = null;

    public Map<String, MethodDescriptor> getFunctionMap() {
        return this.functionMap;
    }

    public Map<String, MethodDescriptor> getPropertyGetterMap() {
        return this.propertyGetterMap;
    }

    public Map<String, MethodDescriptor> getPropertySetterMap() {
        return this.propertySetterMap;
    }

    public Method getV8BindingEnabler() {
        return this.v8BindingEnabler;
    }

    public Method getV8RuntimeSetter() {
        return this.v8RuntimeSetter;
    }

    public void setV8BindingEnabler(Method method) {
        this.v8BindingEnabler = method;
    }

    public void setV8RuntimeSetter(Method method) {
        this.v8RuntimeSetter = method;
    }
}
