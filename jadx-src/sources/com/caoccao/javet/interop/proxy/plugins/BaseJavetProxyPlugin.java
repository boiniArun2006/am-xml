package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.enums.V8ValueErrorType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.exceptions.V8ErrorTemplate;
import com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.IClassProxyPlugin;
import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.converters.JavetObjectConverter;
import com.caoccao.javet.interop.converters.JavetProxyConverter;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class BaseJavetProxyPlugin implements IClassProxyPlugin {
    protected static final String HINT_BOOLEAN = "boolean";
    protected static final String HINT_DEFAULT = "default";
    protected static final String HINT_NUMBER = "number";
    protected static final String HINT_STRING = "string";
    protected static final JavetObjectConverter OBJECT_CONVERTER = new JavetObjectConverter();
    protected static final JavetProxyConverter PROXY_CONVERTER = new JavetProxyConverter();
    protected static final String TO_JSON = "toJSON";
    protected static final String TO_STRING = "toString";
    protected static final String VALUE_OF = "valueOf";

    public static /* synthetic */ V8Value n(V8Runtime v8Runtime, Object obj) {
        return null;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean deleteByObject(Object obj, Object obj2) {
        return false;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public Object getByIndex(Object obj, int i2) {
        return null;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public Object[] getProxyOwnKeys(Object obj) {
        return new Object[0];
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <T> IJavetEntityPropertyDescriptor<T> getProxyOwnPropertyDescriptor(Object obj, Object obj2) {
        return null;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean hasByObject(Object obj, Object obj2) {
        return false;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isDeleteSupported(Class<?> cls) {
        return false;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isHasSupported(Class<?> cls) {
        return false;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isIndexSupported(Class<?> cls) {
        return false;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isOwnKeysSupported(Class<?> cls) {
        return false;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isUniqueKeySupported(Class<?> cls) {
        return false;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public void populateUniqueKeys(Set<String> set, Object obj) {
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean setByIndex(Object obj, int i2, Object obj2) {
        return false;
    }

    public static /* synthetic */ V8Value rl(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        if (obj != null) {
            String strAsString = V8ValueUtils.asString(v8ValueArr, 0, null);
            if (HINT_NUMBER.equals(strAsString)) {
                return obj instanceof Integer ? v8Runtime.createV8ValueInteger(((Integer) obj).intValue()) : obj instanceof Double ? v8Runtime.createV8ValueDouble(((Double) obj).doubleValue()) : obj instanceof Long ? v8Runtime.createV8ValueInteger(((Long) obj).intValue()) : obj instanceof Float ? v8Runtime.createV8ValueDouble(((Float) obj).doubleValue()) : obj instanceof Short ? v8Runtime.createV8ValueInteger(((Short) obj).intValue()) : obj instanceof Boolean ? v8Runtime.createV8ValueInteger(((Boolean) obj).booleanValue() ? 1 : 0) : obj instanceof BigInteger ? v8Runtime.createV8ValueBigInteger((BigInteger) obj) : v8Runtime.createV8ValueInteger(0);
            }
            if (HINT_STRING.equals(strAsString)) {
                return v8Runtime.createV8ValueString(obj.toString());
            }
            if (HINT_BOOLEAN.equals(strAsString)) {
                if (obj instanceof Boolean) {
                    return v8Runtime.createV8ValueBoolean(((Boolean) obj).booleanValue());
                }
                if (obj instanceof Integer) {
                    return v8Runtime.createV8ValueBoolean(((Integer) obj).intValue() != 0);
                }
                if (obj instanceof Double) {
                    double dDoubleValue = ((Double) obj).doubleValue();
                    if (dDoubleValue != 0.0d && !Double.isNaN(dDoubleValue) && Double.isFinite(dDoubleValue)) {
                        z = true;
                    }
                    return v8Runtime.createV8ValueBoolean(z);
                }
                if (obj instanceof Long) {
                    return v8Runtime.createV8ValueBoolean(((Long) obj).longValue() != 0);
                }
                if (!(obj instanceof Float)) {
                    if (obj instanceof Short) {
                        return v8Runtime.createV8ValueBoolean(((Short) obj).shortValue() != 0);
                    }
                    return obj instanceof String ? v8Runtime.createV8ValueBoolean(StringUtils.isNotEmpty((String) obj)) : obj instanceof Character ? v8Runtime.createV8ValueBoolean(true) : obj instanceof BigInteger ? v8Runtime.createV8ValueBoolean(!BigInteger.ZERO.equals(obj)) : v8Runtime.createV8ValueBoolean(false);
                }
                float fFloatValue = ((Float) obj).floatValue();
                if (fFloatValue != 0.0f && !Float.isNaN(fFloatValue) && Float.isFinite(fFloatValue)) {
                    z = true;
                }
                return v8Runtime.createV8ValueBoolean(z);
            }
            if ("default".equals(strAsString)) {
                return obj instanceof Integer ? v8Runtime.createV8ValueInteger(((Integer) obj).intValue()) : obj instanceof Double ? v8Runtime.createV8ValueDouble(((Double) obj).doubleValue()) : obj instanceof Long ? v8Runtime.createV8ValueLong(((Long) obj).longValue()) : obj instanceof Float ? v8Runtime.createV8ValueDouble(((Float) obj).doubleValue()) : obj instanceof Short ? v8Runtime.createV8ValueInteger(((Short) obj).intValue()) : obj instanceof Boolean ? v8Runtime.createV8ValueBoolean(((Boolean) obj).booleanValue()) : obj instanceof BigInteger ? v8Runtime.createV8ValueBigInteger((BigInteger) obj) : v8Runtime.createV8ValueString(obj.toString());
            }
        }
        return OBJECT_CONVERTER.toV8Value(v8Runtime, obj);
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getProxyGetBySymbol(Class<?> cls, String str) {
        if (V8ValueBuiltInSymbol.SYMBOL_PROPERTY_TO_PRIMITIVE.equals(str)) {
            return new w6(this);
        }
        return null;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getProxySymbolToPrimitive() {
        return new w6(this);
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getTargetObjectConstructor(Class<?> cls) {
        return new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Ml
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return BaseJavetProxyPlugin.n(v8Runtime, obj);
            }
        };
    }

    public static /* synthetic */ V8Value t(V8Runtime v8Runtime, String str, Object obj, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunction = (V8ValueFunction) v8Runtime.getExecutor(str).execute();
        try {
            V8Value v8ValueCall = v8ValueFunction.call(OBJECT_CONVERTER.toV8Value(v8Runtime, obj), v8ValueArr);
            v8ValueFunction.close();
            return v8ValueCall;
        } catch (Throwable th) {
            if (v8ValueFunction != null) {
                try {
                    v8ValueFunction.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected V8Value callWithObjectConverter(String str, V8Runtime v8Runtime, Object obj) throws JavetException {
        Objects.requireNonNull(str);
        Objects.requireNonNull(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(str, obj, JavetCallbackType.DirectCallNoThisAndResult, new C1847n(v8Runtime, str, obj)));
    }

    public V8Value symbolToPrimitive(V8Runtime v8Runtime, Object obj) throws JavetException {
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(V8ValueBuiltInSymbol.SYMBOL_PROPERTY_TO_PRIMITIVE, obj, JavetCallbackType.DirectCallNoThisAndResult, new C1844j(obj, v8Runtime)));
    }

    protected V8Value typeErrorFunctionIsNotSupported(String str, V8Runtime v8Runtime) {
        String strTypeErrorFunctionIsNotSupported = V8ErrorTemplate.typeErrorFunctionIsNotSupported(str);
        Objects.requireNonNull(v8Runtime);
        v8Runtime.throwError(V8ValueErrorType.TypeError, strTypeErrorFunctionIsNotSupported);
        return v8Runtime.createV8ValueUndefined();
    }
}
