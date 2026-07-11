package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInReflect;
import java.lang.Exception;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IJavetProxyHandler<T, E extends Exception> {
    public static final String FUNCTION_NAME_TO_JSON = "toJSON";
    public static final String FUNCTION_NAME_TO_V8_VALUE = "toV8Value";
    public static final String PROXY_FUNCTION_NAME_APPLY = "apply";
    public static final String PROXY_FUNCTION_NAME_CONSTRUCT = "construct";
    public static final String PROXY_FUNCTION_NAME_DELETE_PROPERTY = "deleteProperty";
    public static final String PROXY_FUNCTION_NAME_GET = "get";
    public static final String PROXY_FUNCTION_NAME_GET_OWN_PROPERTY_DESCRIPTOR = "getOwnPropertyDescriptor";
    public static final String PROXY_FUNCTION_NAME_GET_PROTOTYPE_OF = "getPrototypeOf";
    public static final String PROXY_FUNCTION_NAME_HAS = "has";
    public static final String PROXY_FUNCTION_NAME_OWN_KEYS = "ownKeys";
    public static final String PROXY_FUNCTION_NAME_SET = "set";

    T getTargetObject();

    V8Runtime getV8Runtime();

    default V8Value apply(V8Value v8Value, V8Value v8Value2, V8ValueArray v8ValueArray) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8Value v8ValueApply = builtInReflect.apply(v8Value, v8Value2, v8ValueArray);
            builtInReflect.close();
            return v8ValueApply;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8Value construct(V8Value v8Value, V8ValueArray v8ValueArray, V8Value v8Value2) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8Value v8ValueConstruct = builtInReflect.construct(v8Value, v8ValueArray, v8Value2);
            builtInReflect.close();
            return v8ValueConstruct;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8ValueBoolean defineProperty(V8Value v8Value, V8Value v8Value2, V8ValueObject v8ValueObject) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8ValueBoolean v8ValueBooleanDefineProperty = builtInReflect.defineProperty(v8Value, v8Value2, v8ValueObject);
            builtInReflect.close();
            return v8ValueBooleanDefineProperty;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8ValueBoolean deleteProperty(V8Value v8Value, V8Value v8Value2) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8ValueBoolean v8ValueBooleanDeleteProperty = builtInReflect.deleteProperty(v8Value, v8Value2);
            builtInReflect.close();
            return v8ValueBooleanDeleteProperty;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8Value get(V8Value v8Value, V8Value v8Value2, V8Value v8Value3) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8Value v8Value_get = builtInReflect._get(v8Value, v8Value2);
            builtInReflect.close();
            return v8Value_get;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8Value getOwnPropertyDescriptor(V8Value v8Value, V8Value v8Value2) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8Value ownPropertyDescriptor = builtInReflect.getOwnPropertyDescriptor(v8Value, v8Value2);
            builtInReflect.close();
            return ownPropertyDescriptor;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8Value getPrototypeOf(V8Value v8Value) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8Value prototypeOf = builtInReflect.getPrototypeOf(v8Value);
            builtInReflect.close();
            return prototypeOf;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8ValueBoolean has(V8Value v8Value, V8Value v8Value2) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8ValueBoolean v8ValueBoolean_has = builtInReflect._has(v8Value, v8Value2);
            builtInReflect.close();
            return v8ValueBoolean_has;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8ValueBoolean isExtensible(V8Value v8Value) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8ValueBoolean v8ValueBooleanIsExtensible = builtInReflect.isExtensible(v8Value);
            builtInReflect.close();
            return v8ValueBooleanIsExtensible;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8ValueArray ownKeys(V8Value v8Value) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8ValueArray v8ValueArrayOwnKeys = builtInReflect.ownKeys(v8Value);
            builtInReflect.close();
            return v8ValueArrayOwnKeys;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8ValueBoolean preventExtensions(V8Value v8Value) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8ValueBoolean v8ValueBooleanPreventExtensions = builtInReflect.preventExtensions(v8Value);
            builtInReflect.close();
            return v8ValueBooleanPreventExtensions;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8ValueBoolean set(V8Value v8Value, V8Value v8Value2, V8Value v8Value3, V8Value v8Value4) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8ValueBoolean v8ValueBoolean_set = builtInReflect._set(v8Value, v8Value2, v8Value3, v8Value4);
            builtInReflect.close();
            return v8ValueBoolean_set;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    default V8ValueBoolean setPrototypeOf(V8Value v8Value, V8Value v8Value2) throws Exception {
        V8ValueBuiltInReflect builtInReflect = getV8Runtime().getGlobalObject().getBuiltInReflect();
        try {
            V8ValueBoolean prototypeOf = builtInReflect.setPrototypeOf(v8Value, v8Value2);
            builtInReflect.close();
            return prototypeOf;
        } catch (Throwable th) {
            if (builtInReflect != null) {
                try {
                    builtInReflect.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
