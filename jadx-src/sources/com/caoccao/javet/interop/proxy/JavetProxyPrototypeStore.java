package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.enums.V8ProxyMode;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.V8Scope;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueGlobalObject;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class JavetProxyPrototypeStore {
    public static final String DUMMY_FUNCTION_STRING = "(() => {\n  const DummyFunction = function () { };\n  return DummyFunction;\n})();";
    private static final String PREFIX = ".proxy.prototype.";

    /* JADX INFO: renamed from: com.caoccao.javet.interop.proxy.JavetProxyPrototypeStore$1, reason: invalid class name */
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

    public static V8ValueObject createOrGetPrototype(V8Runtime v8Runtime, V8ProxyMode v8ProxyMode, Class<?> cls) throws JavetException {
        V8ValueObject v8ValueObjectCreateV8ValueObject;
        StringBuilder sb = new StringBuilder();
        sb.append(v8ProxyMode.name());
        sb.append(PREFIX);
        Objects.requireNonNull(cls);
        sb.append(cls.getName());
        String string = sb.toString();
        Objects.requireNonNull(v8Runtime);
        V8ValueGlobalObject globalObject = v8Runtime.getGlobalObject();
        if (globalObject.hasPrivateProperty(string)) {
            return (V8ValueObject) globalObject.getPrivateProperty(string);
        }
        V8Scope v8Scope = v8Runtime.getV8Scope();
        try {
            int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ProxyMode[v8ProxyMode.ordinal()];
            if (i2 == 1 || i2 == 2) {
                V8ValueFunction v8ValueFunctionCreateV8ValueFunction = v8Scope.createV8ValueFunction(DUMMY_FUNCTION_STRING);
                V8ValueObject v8ValueObjectCreateOrGetPrototype = createOrGetPrototype(v8Runtime, V8ProxyMode.Object, cls);
                try {
                    v8ValueFunctionCreateV8ValueFunction.setPrototype(v8ValueObjectCreateOrGetPrototype);
                    if (v8ValueObjectCreateOrGetPrototype != null) {
                        v8ValueObjectCreateOrGetPrototype.close();
                    }
                    v8ValueObjectCreateV8ValueObject = v8ValueFunctionCreateV8ValueFunction;
                } finally {
                }
            } else {
                v8ValueObjectCreateV8ValueObject = v8Scope.createV8ValueObject();
            }
            globalObject.setPrivateProperty(string, v8ValueObjectCreateV8ValueObject);
            v8Scope.setEscapable();
            v8Scope.close();
            return v8ValueObjectCreateV8ValueObject;
        } catch (Throwable th) {
            if (v8Scope != null) {
                try {
                    v8Scope.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static V8Value getPrototype(V8Runtime v8Runtime, V8ProxyMode v8ProxyMode, Class<?> cls) throws JavetException {
        StringBuilder sb = new StringBuilder();
        sb.append(v8ProxyMode.name());
        sb.append(PREFIX);
        Objects.requireNonNull(cls);
        sb.append(cls.getName());
        String string = sb.toString();
        Objects.requireNonNull(v8Runtime);
        V8ValueGlobalObject globalObject = v8Runtime.getGlobalObject();
        if (globalObject.hasPrivateProperty(string)) {
            return globalObject.getPrivateProperty(string);
        }
        return null;
    }

    private JavetProxyPrototypeStore() {
    }
}
