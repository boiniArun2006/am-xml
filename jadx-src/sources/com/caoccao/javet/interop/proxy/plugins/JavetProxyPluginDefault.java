package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.proxy.IJavetProxyHandler;
import com.caoccao.javet.utils.SimpleSet;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import j$.time.ZonedDateTime;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class JavetProxyPluginDefault extends BaseJavetProxyPluginMultiple {
    protected static final String BIG_INT_PROTOTYPE_TO_LOCALE_STRING = "BigInt.prototype.toLocaleString";
    protected static final String CHAR_AT = "charAt";
    protected static final String CODE_POINT_AT = "codePointAt";
    protected static final String DATE_PROTOTYPE_GET_DATE = "Date.prototype.getDate";
    protected static final String DATE_PROTOTYPE_GET_DAY = "Date.prototype.getDay";
    protected static final String DATE_PROTOTYPE_GET_FULL_YEAR = "Date.prototype.getFullYear";
    protected static final String DATE_PROTOTYPE_GET_HOURS = "Date.prototype.getHours";
    protected static final String DATE_PROTOTYPE_GET_MILLISECONDS = "Date.prototype.getMilliseconds";
    protected static final String DATE_PROTOTYPE_GET_MINUTES = "Date.prototype.getMinutes";
    protected static final String DATE_PROTOTYPE_GET_MONTH = "Date.prototype.getMonth";
    protected static final String DATE_PROTOTYPE_GET_SECONDS = "Date.prototype.getSeconds";
    protected static final String DATE_PROTOTYPE_GET_TIME = "Date.prototype.getTime";
    protected static final String DATE_PROTOTYPE_GET_TIMEZONE_OFFSET = "Date.prototype.getTimezoneOffset";
    protected static final String DATE_PROTOTYPE_GET_UTC_DATE = "Date.prototype.getUTCDate";
    protected static final String DATE_PROTOTYPE_GET_UTC_DAY = "Date.prototype.getUTCDay";
    protected static final String DATE_PROTOTYPE_GET_UTC_FULL_YEAR = "Date.prototype.getUTCFullYear";
    protected static final String DATE_PROTOTYPE_GET_UTC_HOURS = "Date.prototype.getUTCHours";
    protected static final String DATE_PROTOTYPE_GET_UTC_MILLISECONDS = "Date.prototype.getUTCMilliseconds";
    protected static final String DATE_PROTOTYPE_GET_UTC_MINUTES = "Date.prototype.getUTCMinutes";
    protected static final String DATE_PROTOTYPE_GET_UTC_MONTH = "Date.prototype.getUTCMonth";
    protected static final String DATE_PROTOTYPE_GET_UTC_SECONDS = "Date.prototype.getUTCSeconds";
    protected static final String DATE_PROTOTYPE_GET_YEAR = "Date.prototype.getYear";
    protected static final String DATE_PROTOTYPE_SET_DATE = "Date.prototype.setDate";
    protected static final String DATE_PROTOTYPE_SET_FULL_YEAR = "Date.prototype.setFullYear";
    protected static final String DATE_PROTOTYPE_SET_HOURS = "Date.prototype.setHours";
    protected static final String DATE_PROTOTYPE_SET_MILLISECONDS = "Date.prototype.setMilliseconds";
    protected static final String DATE_PROTOTYPE_SET_MINUTES = "Date.prototype.setMinutes";
    protected static final String DATE_PROTOTYPE_SET_MONTH = "Date.prototype.setMonth";
    protected static final String DATE_PROTOTYPE_SET_SECONDS = "Date.prototype.setSeconds";
    protected static final String DATE_PROTOTYPE_SET_TIME = "Date.prototype.setTime";
    protected static final String DATE_PROTOTYPE_SET_UTC_DATE = "Date.prototype.setUTCDate";
    protected static final String DATE_PROTOTYPE_SET_UTC_FULL_YEAR = "Date.prototype.setUTCFullYear";
    protected static final String DATE_PROTOTYPE_SET_UTC_HOURS = "Date.prototype.setUTCHours";
    protected static final String DATE_PROTOTYPE_SET_UTC_MILLISECONDS = "Date.prototype.setUTCMilliseconds";
    protected static final String DATE_PROTOTYPE_SET_UTC_MINUTES = "Date.prototype.setUTCMinutes";
    protected static final String DATE_PROTOTYPE_SET_UTC_MONTH = "Date.prototype.setUTCMonth";
    protected static final String DATE_PROTOTYPE_SET_UTC_SECONDS = "Date.prototype.setUTCSeconds";
    protected static final String DATE_PROTOTYPE_SET_YEAR = "Date.prototype.setYear";
    protected static final String DATE_PROTOTYPE_SYMBOL_TO_PRIMITIVE = "Date.prototype[Symbol.toPrimitive]";
    protected static final String DATE_PROTOTYPE_TO_DATE_STRING = "Date.prototype.toDateString";
    protected static final String DATE_PROTOTYPE_TO_ISOSTRING = "Date.prototype.toISOString";
    protected static final String DATE_PROTOTYPE_TO_JSON = "Date.prototype.toJSON";
    protected static final String DATE_PROTOTYPE_TO_LOCALE_DATE_STRING = "Date.prototype.toLocaleDateString";
    protected static final String DATE_PROTOTYPE_TO_LOCALE_STRING = "Date.prototype.toLocaleString";
    protected static final String DATE_PROTOTYPE_TO_LOCALE_TIME_STRING = "Date.prototype.toLocaleTimeString";
    protected static final String DATE_PROTOTYPE_TO_STRING = "Date.prototype.toString";
    protected static final String DATE_PROTOTYPE_TO_TIME_STRING = "Date.prototype.toTimeString";
    protected static final String DATE_PROTOTYPE_TO_UTC_STRING = "Date.prototype.toUTCString";
    protected static final String DATE_PROTOTYPE_VALUE_OF = "Date.prototype.valueOf";
    protected static final String ENDS_WITH = "endsWith";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_BIG_INTEGER = "Target object must be an instance of BigInteger.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_BOOLEAN = "Target object must be an instance of Boolean.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_BYTE = "Target object must be an instance of Byte.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_CHARACTER = "Target object must be an instance of Character.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_DOUBLE = "Target object must be an instance of Double.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_FLOAT = "Target object must be an instance of Float.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_INTEGER = "Target object must be an instance of Integer.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_LONG = "Target object must be an instance of Long.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_SHORT = "Target object must be an instance of Short.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_STRING = "Target object must be an instance of String.";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_ZONED_DATE_TIME = "Target object must be an instance of ZonedDateTime.";
    protected static final String GET_DATE = "getDate";
    protected static final String GET_DAY = "getDay";
    protected static final String GET_FULL_YEAR = "getFullYear";
    protected static final String GET_HOURS = "getHours";
    protected static final String GET_MILLISECONDS = "getMilliseconds";
    protected static final String GET_MINUTES = "getMinutes";
    protected static final String GET_MONTH = "getMonth";
    protected static final String GET_SECONDS = "getSeconds";
    protected static final String GET_TIME = "getTime";
    protected static final String GET_TIMEZONE_OFFSET = "getTimezoneOffset";
    protected static final String GET_UTC_DATE = "getUTCDate";
    protected static final String GET_UTC_DAY = "getUTCDay";
    protected static final String GET_UTC_FULL_YEAR = "getUTCFullYear";
    protected static final String GET_UTC_HOURS = "getUTCHours";
    protected static final String GET_UTC_MILLISECONDS = "getUTCMilliseconds";
    protected static final String GET_UTC_MINUTES = "getUTCMinutes";
    protected static final String GET_UTC_MONTH = "getUTCMonth";
    protected static final String GET_UTC_SECONDS = "getUTCSeconds";
    protected static final String GET_YEAR = "getYear";
    protected static final String INDEX_OF = "indexOf";
    protected static final String LAST_INDEX_OF = "lastIndexOf";
    protected static final String LENGTH = "length";
    protected static final String NUMBER_PROTOTYPE_TO_EXPONENTIAL = "Number.prototype.toExponential";
    protected static final String NUMBER_PROTOTYPE_TO_FIXED = "Number.prototype.toFixed";
    protected static final String NUMBER_PROTOTYPE_TO_LOCALE_STRING = "Number.prototype.toLocaleString";
    protected static final String NUMBER_PROTOTYPE_TO_PRECISION = "Number.prototype.toPrecision";
    protected static final String REPEAT = "repeat";
    protected static final String REPLACE = "replace";
    protected static final String REPLACE_ALL = "replaceAll";
    protected static final String SET_DATE = "setDate";
    protected static final String SET_FULL_YEAR = "setFullYear";
    protected static final String SET_HOURS = "setHours";
    protected static final String SET_MILLISECONDS = "setMilliseconds";
    protected static final String SET_MINUTES = "setMinutes";
    protected static final String SET_MONTH = "setMonth";
    protected static final String SET_SECONDS = "setSeconds";
    protected static final String SET_TIME = "setTime";
    protected static final String SET_UTC_DATE = "setUTCDate";
    protected static final String SET_UTC_FULL_YEAR = "setUTCFullYear";
    protected static final String SET_UTC_HOURS = "setUTCHours";
    protected static final String SET_UTC_MILLISECONDS = "setUTCMilliseconds";
    protected static final String SET_UTC_MINUTES = "setUTCMinutes";
    protected static final String SET_UTC_MONTH = "setUTCMonth";
    protected static final String SET_UTC_SECONDS = "setUTCSeconds";
    protected static final String SET_YEAR = "setYear";
    protected static final String SPLIT = "split";
    protected static final String STARTS_WITH = "startsWith";
    protected static final String SUBSTRING = "substring";
    protected static final String TO_DATE_STRING = "toDateString";
    protected static final String TO_EXPONENTIAL = "toExponential";
    protected static final String TO_FIXED = "toFixed";
    protected static final String TO_ISO_STRING = "toISOString";
    protected static final String TO_LOCALE_DATE_STRING = "toLocaleDateString";
    protected static final String TO_LOCALE_STRING = "toLocaleString";
    protected static final String TO_LOCALE_TIME_STRING = "toLocaleTimeString";
    protected static final String TO_PRECISION = "toPrecision";
    protected static final String TO_TIME_STRING = "toTimeString";
    protected static final String TO_UTC_STRING = "toUTCString";
    protected static final String TRIM = "trim";
    public static final String NAME = Object.class.getName();
    protected static final Set<Class<?>> SUPPORTED_CLASSES = SimpleSet.of(BigInteger.class, Boolean.class, Byte.class, Character.class, Double.class, Float.class, Integer.class, Long.class, Short.class, String.class, ZonedDateTime.class);
    private static final JavetProxyPluginDefault instance = new JavetProxyPluginDefault();

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isProxyable(Class<?> cls) {
        return cls != null;
    }

    public JavetProxyPluginDefault() {
        HashMap map = new HashMap();
        map.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map.put(TO_LOCALE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Fo
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51712n.callWithObjectConverter(JavetProxyPluginDefault.BIG_INT_PROTOTYPE_TO_LOCALE_STRING, v8Runtime, obj);
            }
        });
        map.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(BigInteger.class, SimpleSet.of("valueOf"));
        this.proxyGetByStringMap.put(BigInteger.class, map);
        HashMap map2 = new HashMap();
        map2.put(V8ValueBuiltInSymbol.SYMBOL_PROPERTY_TO_PRIMITIVE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.z3w
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52046n.symbolToPrimitive(v8Runtime, obj);
            }
        });
        this.proxyGetBySymbolMap.put(BigInteger.class, map2);
        HashMap map3 = new HashMap();
        map3.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map3.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(Boolean.class, SimpleSet.of("valueOf"));
        this.proxyGetByStringMap.put(Boolean.class, map3);
        this.targetObjectConstructorMap.put(Boolean.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.m8h
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueBooleanObject(((Boolean) obj).booleanValue());
            }
        });
        HashMap map4 = new HashMap();
        map4.put(TO_EXPONENTIAL, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.giR
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51903n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_EXPONENTIAL, v8Runtime, obj);
            }
        });
        map4.put(TO_FIXED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.J
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51729n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_FIXED, v8Runtime, obj);
            }
        });
        map4.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map4.put(TO_LOCALE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.eZk
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51886n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_LOCALE_STRING, v8Runtime, obj);
            }
        });
        map4.put(TO_PRECISION, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.rfW
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51988n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_PRECISION, v8Runtime, obj);
            }
        });
        map4.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(Byte.class, SimpleSet.of("valueOf"));
        this.proxyGetByStringMap.put(Byte.class, map4);
        this.targetObjectConstructorMap.put(Byte.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.a
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueIntegerObject(((Byte) obj).byteValue());
            }
        });
        HashMap map5 = new HashMap();
        map5.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map5.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(Character.class, SimpleSet.of("valueOf"));
        this.proxyGetByStringMap.put(Character.class, map5);
        this.targetObjectConstructorMap.put(Character.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.FP
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueStringObject(String.valueOf(obj));
            }
        });
        HashMap map6 = new HashMap();
        map6.put(TO_EXPONENTIAL, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.iy
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51919n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_EXPONENTIAL, v8Runtime, obj);
            }
        });
        map6.put(TO_FIXED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.fhj
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51892n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_FIXED, v8Runtime, obj);
            }
        });
        map6.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map6.put(TO_LOCALE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ZX7
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51844n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_LOCALE_STRING, v8Runtime, obj);
            }
        });
        map6.put(TO_PRECISION, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.mrQ
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51941n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_PRECISION, v8Runtime, obj);
            }
        });
        map6.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(Double.class, SimpleSet.of("valueOf"));
        this.proxyGetByStringMap.put(Double.class, map6);
        this.targetObjectConstructorMap.put(Double.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.i
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueDoubleObject(((Double) obj).doubleValue());
            }
        });
        HashMap map7 = new HashMap();
        map7.put(TO_EXPONENTIAL, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pp
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51777n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_EXPONENTIAL, v8Runtime, obj);
            }
        });
        map7.put(TO_FIXED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.N
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51759n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_FIXED, v8Runtime, obj);
            }
        });
        map7.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map7.put(TO_LOCALE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.IG
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51726n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_LOCALE_STRING, v8Runtime, obj);
            }
        });
        map7.put(TO_PRECISION, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.FPL
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51707n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_PRECISION, v8Runtime, obj);
            }
        });
        map7.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(Float.class, SimpleSet.of("valueOf"));
        this.proxyGetByStringMap.put(Float.class, map7);
        this.targetObjectConstructorMap.put(Float.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Y5
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueDoubleObject(((Float) obj).floatValue());
            }
        });
        HashMap map8 = new HashMap();
        map8.put(TO_EXPONENTIAL, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.nSC
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51950n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_EXPONENTIAL, v8Runtime, obj);
            }
        });
        map8.put(TO_FIXED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ozJ
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51962n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_FIXED, v8Runtime, obj);
            }
        });
        map8.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map8.put(TO_LOCALE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.dT
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51873n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_LOCALE_STRING, v8Runtime, obj);
            }
        });
        map8.put(TO_PRECISION, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.S
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51799n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_PRECISION, v8Runtime, obj);
            }
        });
        map8.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(Integer.class, SimpleSet.of("valueOf"));
        this.proxyGetByStringMap.put(Integer.class, map8);
        this.targetObjectConstructorMap.put(Integer.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.V
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueIntegerObject(((Integer) obj).intValue());
            }
        });
        HashMap map9 = new HashMap();
        map9.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map9.put(TO_LOCALE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Qik
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51788n.callWithObjectConverter(JavetProxyPluginDefault.BIG_INT_PROTOTYPE_TO_LOCALE_STRING, v8Runtime, obj);
            }
        });
        map9.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(Long.class, SimpleSet.of("valueOf"));
        this.proxyGetByStringMap.put(Long.class, map9);
        this.targetObjectConstructorMap.put(Long.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.OA
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueLongObject(((Long) obj).longValue());
            }
        });
        HashMap map10 = new HashMap();
        map10.put(TO_EXPONENTIAL, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Mo
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51758n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_EXPONENTIAL, v8Runtime, obj);
            }
        });
        map10.put(TO_FIXED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.HcS
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51720n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_FIXED, v8Runtime, obj);
            }
        });
        map10.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map10.put(TO_LOCALE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.VoU
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51820n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_LOCALE_STRING, v8Runtime, obj);
            }
        });
        map10.put(TO_PRECISION, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.s6u
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51992n.callWithObjectConverter(JavetProxyPluginDefault.NUMBER_PROTOTYPE_TO_PRECISION, v8Runtime, obj);
            }
        });
        map10.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(Short.class, SimpleSet.of("valueOf"));
        this.proxyGetByStringMap.put(Short.class, map10);
        this.targetObjectConstructorMap.put(Short.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.yr
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueIntegerObject(((Short) obj).shortValue());
            }
        });
        HashMap map11 = new HashMap();
        map11.put(LENGTH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.D
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueInteger(((String) obj).length());
            }
        });
        map11.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map11.put("toString", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        map11.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pmq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51776n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(String.class, SimpleSet.of(CHAR_AT, CODE_POINT_AT, ENDS_WITH, INDEX_OF, LAST_INDEX_OF, LENGTH, REPEAT, "replace", REPLACE_ALL, "split", STARTS_WITH, SUBSTRING, TRIM, "valueOf", "toString"));
        this.proxyGetByStringMap.put(String.class, map11);
        this.targetObjectConstructorMap.put(String.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.W
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueStringObject((String) obj);
            }
        });
        HashMap map12 = new HashMap();
        map12.put(GET_DATE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.t6
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51995n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_DATE, v8Runtime, obj);
            }
        });
        map12.put(GET_DAY, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.U
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51811n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_DAY, v8Runtime, obj);
            }
        });
        map12.put(GET_FULL_YEAR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.IE
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51725n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_FULL_YEAR, v8Runtime, obj);
            }
        });
        map12.put(GET_HOURS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.zpl
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52049n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_HOURS, v8Runtime, obj);
            }
        });
        map12.put(GET_MILLISECONDS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ibE
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51917n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_MILLISECONDS, v8Runtime, obj);
            }
        });
        map12.put(GET_MINUTES, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.DT
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51687n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_MINUTES, v8Runtime, obj);
            }
        });
        map12.put(GET_MONTH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Sw
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51808n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_MONTH, v8Runtime, obj);
            }
        });
        map12.put(GET_SECONDS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.xq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52031n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_SECONDS, v8Runtime, obj);
            }
        });
        map12.put(GET_TIME, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.tmw
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52006n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_TIME, v8Runtime, obj);
            }
        });
        map12.put(GET_TIMEZONE_OFFSET, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.tpM
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52007n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_TIMEZONE_OFFSET, v8Runtime, obj);
            }
        });
        map12.put(GET_UTC_DATE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.oJ
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51957n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_UTC_DATE, v8Runtime, obj);
            }
        });
        map12.put(GET_UTC_DAY, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ys8
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52042n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_UTC_DAY, v8Runtime, obj);
            }
        });
        map12.put(GET_UTC_FULL_YEAR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.jL
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51922n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_UTC_FULL_YEAR, v8Runtime, obj);
            }
        });
        map12.put(GET_UTC_HOURS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.l
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51930n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_UTC_HOURS, v8Runtime, obj);
            }
        });
        map12.put(GET_UTC_MILLISECONDS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.xTb
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52025n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_UTC_MILLISECONDS, v8Runtime, obj);
            }
        });
        map12.put(GET_UTC_MINUTES, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.rrk
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51989n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_UTC_MINUTES, v8Runtime, obj);
            }
        });
        map12.put(GET_UTC_MONTH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Um
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51815n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_UTC_MONTH, v8Runtime, obj);
            }
        });
        map12.put(GET_UTC_SECONDS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Dt
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51692n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_UTC_SECONDS, v8Runtime, obj);
            }
        });
        map12.put(GET_YEAR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Buf
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51676n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_GET_YEAR, v8Runtime, obj);
            }
        });
        map12.put(SET_DATE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.MKd
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51753n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_DATE, v8Runtime);
            }
        });
        map12.put(SET_FULL_YEAR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ya
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52038n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_FULL_YEAR, v8Runtime);
            }
        });
        map12.put(SET_HOURS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.nH
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51947n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_HOURS, v8Runtime);
            }
        });
        map12.put(SET_MILLISECONDS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Lc
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51747n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_MILLISECONDS, v8Runtime);
            }
        });
        map12.put(SET_MINUTES, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Kk1
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51742n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_MINUTES, v8Runtime);
            }
        });
        map12.put(SET_MONTH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.nr
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51952n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_MONTH, v8Runtime);
            }
        });
        map12.put(SET_SECONDS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.I7
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51724n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_SECONDS, v8Runtime);
            }
        });
        map12.put(SET_TIME, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.QhI
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51787n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_TIME, v8Runtime);
            }
        });
        map12.put(SET_UTC_DATE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.g
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51896n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_UTC_DATE, v8Runtime);
            }
        });
        map12.put(SET_UTC_FULL_YEAR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.H
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51716n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_UTC_FULL_YEAR, v8Runtime);
            }
        });
        map12.put(SET_UTC_HOURS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.op
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51960n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_UTC_HOURS, v8Runtime);
            }
        });
        map12.put(SET_UTC_MILLISECONDS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.g62
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51897n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_UTC_MILLISECONDS, v8Runtime);
            }
        });
        map12.put(SET_UTC_MINUTES, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.b
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51856n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_UTC_MINUTES, v8Runtime);
            }
        });
        map12.put(SET_UTC_MONTH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.rd
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51987n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_UTC_MONTH, v8Runtime);
            }
        });
        map12.put(SET_UTC_SECONDS, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Il5
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51727n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_UTC_SECONDS, v8Runtime);
            }
        });
        map12.put(SET_YEAR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.eh
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51887n.typeErrorFunctionIsNotSupported(JavetProxyPluginDefault.DATE_PROTOTYPE_SET_YEAR, v8Runtime);
            }
        });
        map12.put(TO_DATE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Ji
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51734n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_TO_DATE_STRING, v8Runtime, obj);
            }
        });
        map12.put(TO_ISO_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Z5b
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51841n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_TO_ISOSTRING, v8Runtime, obj);
            }
        });
        map12.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.qfL
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51976n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_TO_JSON, v8Runtime, obj);
            }
        });
        map12.put(TO_LOCALE_DATE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Su
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51807n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_TO_LOCALE_DATE_STRING, v8Runtime, obj);
            }
        });
        map12.put(TO_LOCALE_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.I
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51721n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_TO_LOCALE_STRING, v8Runtime, obj);
            }
        });
        map12.put(TO_LOCALE_TIME_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.dd
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51876n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_TO_LOCALE_TIME_STRING, v8Runtime, obj);
            }
        });
        map12.put("toString", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.din
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51877n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_TO_STRING, v8Runtime, obj);
            }
        });
        map12.put(TO_TIME_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.afV
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51852n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_TO_TIME_STRING, v8Runtime, obj);
            }
        });
        map12.put(TO_UTC_STRING, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Mje
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51757n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_TO_UTC_STRING, v8Runtime, obj);
            }
        });
        map12.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.bwY
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51859n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_VALUE_OF, v8Runtime, obj);
            }
        });
        this.proxyableMethodsMap.put(ZonedDateTime.class, SimpleSet.of("valueOf", "toString"));
        this.proxyGetByStringMap.put(ZonedDateTime.class, map12);
        HashMap map13 = new HashMap();
        map13.put(V8ValueBuiltInSymbol.SYMBOL_PROPERTY_TO_PRIMITIVE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ZhI
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51845n.callWithObjectConverter(JavetProxyPluginDefault.DATE_PROTOTYPE_SYMBOL_TO_PRIMITIVE, v8Runtime, obj);
            }
        });
        this.proxyGetBySymbolMap.put(ZonedDateTime.class, map13);
        this.targetObjectConstructorMap.put(ZonedDateTime.class, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.AZy
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return v8Runtime.createV8ValueZonedDateTime((ZonedDateTime) obj);
            }
        });
    }

    public static JavetProxyPluginDefault getInstance() {
        return instance;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public String getName() {
        return NAME;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isOwnKeysSupported(Class<?> cls) {
        return !SUPPORTED_CLASSES.contains(cls);
    }

    public V8Value valueOf(V8Runtime v8Runtime, Object obj) throws JavetException {
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("valueOf", obj, JavetCallbackType.DirectCallNoThisAndResult, new yht(v8Runtime, obj)));
    }
}
