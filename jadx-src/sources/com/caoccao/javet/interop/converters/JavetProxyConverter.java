package com.caoccao.javet.interop.converters;

import com.caoccao.javet.annotations.V8Convert;
import com.caoccao.javet.enums.V8ProxyMode;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.V8Scope;
import com.caoccao.javet.interop.binding.IClassProxyPlugin;
import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler;
import com.caoccao.javet.interop.proxy.IJavetNonProxy;
import com.caoccao.javet.interop.proxy.JavetDirectProxyFunctionHandler;
import com.caoccao.javet.interop.proxy.JavetDirectProxyObjectHandler;
import com.caoccao.javet.interop.proxy.JavetProxyPrototypeStore;
import com.caoccao.javet.interop.proxy.JavetReflectionProxyClassHandler;
import com.caoccao.javet.interop.proxy.JavetReflectionProxyFunctionHandler;
import com.caoccao.javet.interop.proxy.JavetReflectionProxyObjectHandler;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueLong;
import com.caoccao.javet.values.reference.IV8ValueObject;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValueProxy;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInObject;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetProxyConverter extends JavetObjectConverter {
    protected static final String DUMMY_FUNCTION_STRING = "(() => {\n  const DummyFunction = function () { };\n  return DummyFunction;\n})();";

    /* JADX INFO: renamed from: com.caoccao.javet.interop.converters.JavetProxyConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$enums$V8ProxyMode;

        static {
            int[] iArr = new int[V8ProxyMode.values().length];
            $SwitchMap$com$caoccao$javet$enums$V8ProxyMode = iArr;
            try {
                iArr[V8ProxyMode.Class.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ProxyMode[V8ProxyMode.Function.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected <T extends V8Value> T toProxiedV8Value(final V8Runtime v8Runtime, final Object obj) throws JavetException {
        V8Value v8ValueCreateOrGetPrototype;
        if (obj instanceof IJavetNonProxy) {
            return v8Runtime.createV8ValueUndefined();
        }
        final V8ProxyMode v8ProxyMode = V8ProxyMode.Object;
        final Class<?> cls = obj.getClass();
        if (obj instanceof Class) {
            if (V8ProxyMode.isClassMode((Class) obj)) {
                v8ProxyMode = V8ProxyMode.Class;
            }
        } else if (cls.isAnnotationPresent(V8Convert.class)) {
            V8ProxyMode v8ProxyModeProxyMode = ((V8Convert) cls.getAnnotation(V8Convert.class)).proxyMode();
            V8ProxyMode v8ProxyMode2 = V8ProxyMode.Function;
            if (v8ProxyModeProxyMode == v8ProxyMode2) {
                v8ProxyMode = v8ProxyMode2;
            }
        }
        V8Scope v8Scope = v8Runtime.getV8Scope();
        V8Value v8Value = null;
        try {
            try {
                int[] iArr = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ProxyMode;
                int i2 = iArr[v8ProxyMode.ordinal()];
                if (i2 == 1) {
                    v8ValueCreateOrGetPrototype = JavetProxyPrototypeStore.createOrGetPrototype(v8Runtime, v8ProxyMode, (Class) obj);
                } else if (i2 == 2) {
                    v8ValueCreateOrGetPrototype = JavetProxyPrototypeStore.createOrGetPrototype(v8Runtime, v8ProxyMode, cls);
                } else if (obj instanceof IJavetDirectProxyHandler) {
                    IJavetDirectProxyHandler iJavetDirectProxyHandler = (IJavetDirectProxyHandler) obj;
                    iJavetDirectProxyHandler.setV8Runtime(v8Runtime);
                    v8ValueCreateOrGetPrototype = iJavetDirectProxyHandler.createTargetObject();
                } else {
                    v8ValueCreateOrGetPrototype = (V8Value) getConfig().getProxyPlugins().stream().filter(new Predicate() { // from class: com.caoccao.javet.interop.converters.Xo
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return ((IClassProxyPlugin) obj2).isProxyable(cls);
                        }
                    }).findFirst().map(new Function() { // from class: com.caoccao.javet.interop.converters.eO
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((IClassProxyPlugin) obj2).getTargetObjectConstructor(cls);
                        }
                    }).map(new Function() { // from class: com.caoccao.javet.interop.converters.z
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return JavetProxyConverter.KN(v8Runtime, obj, (IClassProxyPluginFunction) obj2);
                        }
                    }).orElseGet(new Supplier() { // from class: com.caoccao.javet.interop.converters.QJ
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return JavetProxyConverter.Uo(v8Runtime, v8ProxyMode, cls);
                        }
                    });
                }
                v8Value = v8ValueCreateOrGetPrototype;
                V8ValueProxy v8ValueProxyCreateV8ValueProxy = v8Scope.createV8ValueProxy(v8Value);
                JavetResourceUtils.safeClose(v8Value);
                IV8ValueObject handler = v8ValueProxyCreateV8ValueProxy.getHandler();
                try {
                    int i3 = iArr[v8ProxyMode.ordinal()];
                    V8ValueLong v8ValueLongCreateV8ValueLong = v8Runtime.createV8ValueLong(handler.bind(i3 != 1 ? i3 != 2 ? obj instanceof IJavetDirectProxyHandler ? new JavetDirectProxyObjectHandler(v8Runtime, (IJavetDirectProxyHandler) obj) : new JavetReflectionProxyObjectHandler(v8Runtime, obj) : obj instanceof IJavetDirectProxyHandler ? new JavetDirectProxyFunctionHandler(v8Runtime, (IJavetDirectProxyHandler) obj) : new JavetReflectionProxyFunctionHandler(v8Runtime, obj) : new JavetReflectionProxyClassHandler(v8Runtime, (Class) obj)).get(0).getHandle());
                    try {
                        handler.setPrivateProperty("Javet#proxyTarget", v8ValueLongCreateV8ValueLong);
                        if (v8ValueLongCreateV8ValueLong != null) {
                            v8ValueLongCreateV8ValueLong.close();
                        }
                        handler.close();
                        v8Scope.setEscapable();
                        v8Scope.close();
                        return v8ValueProxyCreateV8ValueProxy;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                JavetResourceUtils.safeClose(v8Value);
                throw th;
            }
        } catch (Throwable th2) {
            if (v8Scope != null) {
                try {
                    v8Scope.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // com.caoccao.javet.interop.converters.JavetObjectConverter, com.caoccao.javet.interop.converters.JavetPrimitiveConverter, com.caoccao.javet.interop.converters.BaseJavetConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected <T extends V8Value> T toV8Value(V8Runtime v8Runtime, Object obj, int i2) throws JavetException {
        boolean zAnyMatch;
        T t3;
        if (obj instanceof V8Value) {
            return (T) obj;
        }
        if (obj == null) {
            zAnyMatch = false;
        } else if (obj instanceof IJavetDirectProxyHandler) {
            zAnyMatch = true;
        } else if (!(obj instanceof IJavetNonProxy)) {
            final Class<?> cls = obj.getClass();
            zAnyMatch = getConfig().getProxyPlugins().stream().anyMatch(new Predicate() { // from class: com.caoccao.javet.interop.converters.Pl
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((IClassProxyPlugin) obj2).isProxyable(cls);
                }
            });
        }
        return (zAnyMatch || (t3 = (T) super.toV8Value(v8Runtime, obj, i2)) == null || t3.isUndefined()) ? (T) toProxiedV8Value(v8Runtime, obj) : t3;
    }

    public static /* synthetic */ V8Value KN(V8Runtime v8Runtime, Object obj, IClassProxyPluginFunction iClassProxyPluginFunction) {
        try {
            return iClassProxyPluginFunction.invoke(v8Runtime, obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ V8Value Uo(V8Runtime v8Runtime, V8ProxyMode v8ProxyMode, Class cls) {
        try {
            V8ValueObject v8ValueObjectCreateOrGetPrototype = JavetProxyPrototypeStore.createOrGetPrototype(v8Runtime, v8ProxyMode, cls);
            try {
                V8ValueBuiltInObject builtInObject = v8Runtime.getGlobalObject().getBuiltInObject();
                try {
                    V8ValueObject v8ValueObjectCreateV8ValueObject = v8Runtime.createV8ValueObject();
                    try {
                        V8Value prototypeOf = builtInObject.setPrototypeOf(v8ValueObjectCreateV8ValueObject, v8ValueObjectCreateOrGetPrototype);
                        if (v8ValueObjectCreateV8ValueObject != null) {
                            v8ValueObjectCreateV8ValueObject.close();
                        }
                        builtInObject.close();
                        if (v8ValueObjectCreateOrGetPrototype != null) {
                            v8ValueObjectCreateOrGetPrototype.close();
                        }
                        return prototypeOf;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
