package com.caoccao.javet.interop.binding;

import com.caoccao.javet.annotations.V8Convert;
import com.caoccao.javet.enums.V8ConversionMode;
import com.caoccao.javet.enums.V8ProxyMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class ClassDescriptor {
    protected final IClassProxyPlugin classProxyPlugin;
    protected final Map<String, List<Method>> methodsMap;
    protected V8ProxyMode proxyMode;
    protected final Map<String, List<Method>> settersMap;
    protected Class<?> targetClass;
    protected final Set<String> uniqueKeySet;
    protected final List<Method> applyFunctions = new ArrayList();
    protected final List<Constructor<?>> constructors = new ArrayList();
    protected final Map<String, Field> fieldMap = new LinkedHashMap();
    protected final List<Method> genericGetters = new ArrayList();
    protected final List<Method> genericSetters = new ArrayList();
    protected final Map<String, List<Method>> gettersMap = new LinkedHashMap();

    public List<Method> getApplyFunctions() {
        return this.applyFunctions;
    }

    public IClassProxyPlugin getClassProxyPlugin() {
        return this.classProxyPlugin;
    }

    public List<Constructor<?>> getConstructors() {
        return this.constructors;
    }

    public Map<String, Field> getFieldMap() {
        return this.fieldMap;
    }

    public List<Method> getGenericGetters() {
        return this.genericGetters;
    }

    public List<Method> getGenericSetters() {
        return this.genericSetters;
    }

    public Map<String, List<Method>> getGettersMap() {
        return this.gettersMap;
    }

    public Map<String, List<Method>> getMethodsMap() {
        return this.methodsMap;
    }

    public V8ProxyMode getProxyMode() {
        return this.proxyMode;
    }

    public Map<String, List<Method>> getSettersMap() {
        return this.settersMap;
    }

    public Class<?> getTargetClass() {
        return this.targetClass;
    }

    public Set<String> getUniqueKeySet() {
        return this.uniqueKeySet;
    }

    public ClassDescriptor(V8ProxyMode v8ProxyMode, Class<?> cls, IClassProxyPlugin iClassProxyPlugin) {
        Objects.requireNonNull(iClassProxyPlugin);
        this.classProxyPlugin = iClassProxyPlugin;
        this.methodsMap = new LinkedHashMap();
        this.proxyMode = v8ProxyMode;
        this.settersMap = new LinkedHashMap();
        this.targetClass = cls;
        this.uniqueKeySet = new LinkedHashSet();
    }

    public V8ConversionMode getConversionMode() {
        if (getTargetClass().isAnnotationPresent(V8Convert.class)) {
            return ((V8Convert) getTargetClass().getAnnotation(V8Convert.class)).mode();
        }
        return V8ConversionMode.Transparent;
    }
}
