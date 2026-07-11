package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.enums.V8ConversionMode;
import com.caoccao.javet.enums.V8ProxyMode;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.ClassDescriptor;
import com.caoccao.javet.interop.binding.ClassDescriptorStore;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginClass;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.lang.Class;
import java.lang.Exception;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class JavetReflectionProxyClassHandler<T extends Class<?>, E extends Exception> extends BaseJavetReflectionProxyHandler<T, E> {
    protected static final String METHOD_NAME_CONSTRUCTOR = "constructor";

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Value construct(V8Value v8Value, V8ValueArray v8ValueArray, V8Value v8Value2) throws JavetException {
        if (this.classDescriptor.getConstructors().isEmpty()) {
            return this.v8Runtime.createV8ValueUndefined();
        }
        try {
            try {
                V8Value[] array = v8ValueArray.toArray();
                try {
                    V8Runtime v8Runtime = this.v8Runtime;
                    V8Value v8Value3 = v8Runtime.toV8Value(BaseJavetReflectionProxyHandler.execute(v8Runtime.getConverter().getConfig().getReflectionObjectFactory(), null, (V8ValueObject) v8Value, this.classDescriptor.getConstructors(), V8ValueUtils.convertToVirtualObjects(array)));
                    if (array != null) {
                        JavetResourceUtils.safeClose(array);
                    }
                    return v8Value3;
                } catch (JavetException e2) {
                    throw e2;
                } catch (Throwable th) {
                    th = th;
                    throw new JavetException(JavetError.CallbackMethodFailure, SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, METHOD_NAME_CONSTRUCTOR, "message", th.getMessage()), th);
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    JavetResourceUtils.safeClose((V8Value[]) null);
                }
                throw th2;
            }
        } catch (JavetException e3) {
            throw e3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable
    public JavetCallbackContext[] getCallbackContexts() {
        if (this.callbackContexts == null) {
            JavetCallbackType javetCallbackType = JavetCallbackType.DirectCallNoThisAndResult;
            this.callbackContexts = new JavetCallbackContext[]{new JavetCallbackContext("construct", this, javetCallbackType, new qf(this)), new JavetCallbackContext("get", this, javetCallbackType, new Ln(this)), new JavetCallbackContext("getOwnPropertyDescriptor", this, javetCallbackType, new lej(this)), new JavetCallbackContext("getPrototypeOf", this, javetCallbackType, new iwV(this)), new JavetCallbackContext("has", this, javetCallbackType, new M(this)), new JavetCallbackContext("ownKeys", this, javetCallbackType, new rv6(this)), new JavetCallbackContext("set", this, javetCallbackType, new vd(this))};
        }
        return this.callbackContexts;
    }

    @Override // com.caoccao.javet.interop.proxy.BaseJavetReflectionProxyHandler
    public V8ProxyMode getProxyMode() {
        return V8ProxyMode.Class;
    }

    protected void initializeFieldsAndMethods(Class<?> cls, boolean z2) {
        V8ConversionMode conversionMode = this.classDescriptor.getConversionMode();
        if (z2) {
            initializeConstructors(cls, conversionMode);
        }
        do {
            initializePublicFields(cls, conversionMode, z2);
            initializePublicMethods(cls, conversionMode, z2);
            if (cls == Object.class) {
                return;
            } else {
                cls = cls.getSuperclass();
            }
        } while (cls != null);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueArray ownKeys(V8Value v8Value) throws JavetException {
        return V8ValueUtils.createV8ValueArray(this.v8Runtime, this.classDescriptor.getUniqueKeySet().toArray());
    }

    public JavetReflectionProxyClassHandler(V8Runtime v8Runtime, T t3) {
        super(v8Runtime, t3);
    }

    public static /* synthetic */ V8Value KN(JavetReflectionProxyClassHandler javetReflectionProxyClassHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyClassHandler.getClass();
        return javetReflectionProxyClassHandler.getOwnPropertyDescriptor(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value Uo(JavetReflectionProxyClassHandler javetReflectionProxyClassHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyClassHandler.getClass();
        return javetReflectionProxyClassHandler.getPrototypeOf(v8ValueArr[0]);
    }

    public static /* synthetic */ V8Value az(JavetReflectionProxyClassHandler javetReflectionProxyClassHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyClassHandler.getClass();
        return javetReflectionProxyClassHandler.get(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2]);
    }

    public static /* synthetic */ V8Value gh(JavetReflectionProxyClassHandler javetReflectionProxyClassHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyClassHandler.getClass();
        return javetReflectionProxyClassHandler.ownKeys(v8ValueArr[0]);
    }

    public static /* synthetic */ V8Value mUb(JavetReflectionProxyClassHandler javetReflectionProxyClassHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyClassHandler.getClass();
        return javetReflectionProxyClassHandler.set(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2], v8ValueArr[3]);
    }

    public static /* synthetic */ V8Value qie(JavetReflectionProxyClassHandler javetReflectionProxyClassHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyClassHandler.getClass();
        return javetReflectionProxyClassHandler.construct(v8ValueArr[0], (V8ValueArray) v8ValueArr[1], v8ValueArr[2]);
    }

    public static /* synthetic */ V8Value xMQ(JavetReflectionProxyClassHandler javetReflectionProxyClassHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyClassHandler.getClass();
        return javetReflectionProxyClassHandler.has(v8ValueArr[0], v8ValueArr[1]);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueBoolean has(V8Value v8Value, V8Value v8Value2) throws JavetException {
        boolean z2;
        if (!hasFromRegular(v8Value2) && !hasFromGeneric(v8Value2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return this.v8Runtime.createV8ValueBoolean(z2);
    }

    @Override // com.caoccao.javet.interop.proxy.BaseJavetReflectionProxyHandler
    protected void initialize() {
        ClassDescriptor classDescriptor = ClassDescriptorStore.getClassMap().get(this.targetObject);
        this.classDescriptor = classDescriptor;
        if (classDescriptor == null) {
            this.classDescriptor = new ClassDescriptor(V8ProxyMode.Class, this.targetObject, JavetProxyPluginClass.getInstance());
            Class<?> cls = this.targetObject.getClass();
            initializeFieldsAndMethods(this.targetObject, true);
            initializeFieldsAndMethods(cls, false);
            ClassDescriptorStore.getClassMap().put(this.targetObject, this.classDescriptor);
        }
    }

    @Override // com.caoccao.javet.interop.proxy.BaseJavetReflectionProxyHandler
    protected V8Value internalGet(V8Value v8Value, V8Value v8Value2) throws Exception {
        V8Value byField = getByField(v8Value2);
        if (byField == null) {
            byField = getByMethod(v8Value, v8Value2);
        }
        if (byField == null) {
            return getByGetter(v8Value2);
        }
        return byField;
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueBoolean set(V8Value v8Value, V8Value v8Value2, V8Value v8Value3, V8Value v8Value4) throws JavetException {
        boolean z2;
        if (!setToField(v8Value2, v8Value3) && !setToSetter(v8Value, v8Value2, v8Value3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return this.v8Runtime.createV8ValueBoolean(z2);
    }
}
