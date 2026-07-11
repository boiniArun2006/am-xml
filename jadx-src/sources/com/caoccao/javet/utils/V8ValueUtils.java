package com.caoccao.javet.utils;

import com.caoccao.javet.enums.V8ValueErrorType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.exceptions.V8ErrorTemplate;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.V8Scope;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueMap;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValueSet;
import java.util.Map;
import java.util.StringJoiner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class V8ValueUtils {
    public static int asInt(V8Value[] v8ValueArr, int i2) throws JavetException {
        return asInt(v8ValueArr, i2, 0);
    }

    public static String asString(V8Value[] v8ValueArr, int i2) {
        return asString(v8ValueArr, i2, "undefined");
    }

    public static JavetVirtualObject[] convertToVirtualObjects(V8Value... v8ValueArr) {
        int length = v8ValueArr == null ? 0 : v8ValueArr.length;
        JavetVirtualObject[] javetVirtualObjectArr = new JavetVirtualObject[length];
        for (int i2 = 0; i2 < length; i2++) {
            javetVirtualObjectArr[i2] = new JavetVirtualObject(v8ValueArr[i2]);
        }
        return javetVirtualObjectArr;
    }

    public static Object[] toArray(V8Runtime v8Runtime, V8Value... v8ValueArr) throws JavetException {
        int length = v8ValueArr == null ? 0 : v8ValueArr.length;
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            objArr[i2] = v8Runtime.toObject(v8ValueArr[i2]);
        }
        return objArr;
    }

    public static int asInt(V8Value[] v8ValueArr, int i2, int i3) throws JavetException {
        V8Value v8Value;
        return (v8ValueArr == null || i2 < 0 || i2 >= v8ValueArr.length || (v8Value = v8ValueArr[i2]) == null) ? i3 : v8Value.asInt();
    }

    public static String asString(V8Value[] v8ValueArr, int i2, String str) {
        V8Value v8Value;
        return (v8ValueArr == null || i2 < 0 || i2 >= v8ValueArr.length || (v8Value = v8ValueArr[i2]) == null) ? str : v8Value.toString();
    }

    public static V8Value asV8Value(V8Value[] v8ValueArr, int i2) {
        if (v8ValueArr == null || i2 < 0 || i2 >= v8ValueArr.length) {
            return null;
        }
        return v8ValueArr[i2];
    }

    public static V8ValueObject asV8ValueObject(V8Value[] v8ValueArr, int i2) {
        if (v8ValueArr == null || i2 < 0 || i2 >= v8ValueArr.length) {
            return null;
        }
        V8Value v8Value = v8ValueArr[i2];
        if (v8Value instanceof V8ValueObject) {
            return (V8ValueObject) v8Value;
        }
        return null;
    }

    public static String trimAnonymousFunction(String str) {
        int length;
        if (str == null || (length = str.length()) <= 0) {
            return null;
        }
        int i2 = length;
        boolean z2 = false;
        while (!z2 && i2 > 0) {
            char cCharAt = str.charAt(i2 - 1);
            if (cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == ';') {
                i2--;
            } else {
                z2 = true;
            }
        }
        return i2 == length ? str : str.substring(0, i2);
    }

    private V8ValueUtils() {
    }

    public static V8ValueFunction asV8ValueFunction(V8Value[] v8ValueArr, int i2) {
        if (ArrayUtils.isNotEmpty(v8ValueArr) && i2 >= 0 && i2 < v8ValueArr.length) {
            V8Value v8Value = v8ValueArr[i2];
            if (v8Value instanceof V8ValueFunction) {
                return (V8ValueFunction) v8Value;
            }
            return null;
        }
        return null;
    }

    public static V8ValueFunction asV8ValueFunctionWithError(V8Runtime v8Runtime, V8Value[] v8ValueArr, int i2) {
        V8Value v8Value;
        if (ArrayUtils.isNotEmpty(v8ValueArr) && i2 >= 0 && i2 < v8ValueArr.length) {
            v8Value = v8ValueArr[i2];
            if (v8Value instanceof V8ValueFunction) {
                return (V8ValueFunction) v8Value;
            }
        } else {
            v8Value = null;
        }
        v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorValueIsNotAFunction(v8Value));
        return null;
    }

    public static String concat(String str, V8Value... v8ValueArr) {
        if (ArrayUtils.isEmpty(v8ValueArr)) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        StringJoiner stringJoiner = new StringJoiner(str);
        for (V8Value v8Value : v8ValueArr) {
            stringJoiner.add(asString(v8Value));
        }
        return stringJoiner.toString();
    }

    public static V8ValueArray createV8ValueArray(V8Runtime v8Runtime, Object... objArr) throws JavetException {
        V8Scope v8Scope = v8Runtime.getV8Scope();
        try {
            V8ValueArray v8ValueArrayCreateV8ValueArray = v8Scope.createV8ValueArray();
            if (ArrayUtils.isNotEmpty(objArr)) {
                v8ValueArrayCreateV8ValueArray.push(objArr);
            }
            v8Scope.setEscapable();
            v8Scope.close();
            return v8ValueArrayCreateV8ValueArray;
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

    public static V8ValueMap createV8ValueMap(V8Runtime v8Runtime, Map<?, ?> map) throws JavetException {
        V8Scope v8Scope = v8Runtime.getV8Scope();
        try {
            V8ValueMap v8ValueMapCreateV8ValueMap = v8Scope.createV8ValueMap();
            if (map != null && !map.isEmpty()) {
                Object[] objArr = new Object[map.size() << 1];
                int i2 = 0;
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    int i3 = i2 + 1;
                    objArr[i2] = entry.getKey();
                    i2 += 2;
                    objArr[i3] = entry.getValue();
                }
                v8ValueMapCreateV8ValueMap.set(objArr);
            }
            v8Scope.setEscapable();
            v8Scope.close();
            return v8ValueMapCreateV8ValueMap;
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

    public static V8ValueObject createV8ValueObject(V8Runtime v8Runtime, Object... objArr) throws JavetException {
        V8Scope v8Scope = v8Runtime.getV8Scope();
        try {
            V8ValueObject v8ValueObjectCreateV8ValueObject = v8Scope.createV8ValueObject();
            if (ArrayUtils.isNotEmpty(objArr)) {
                v8ValueObjectCreateV8ValueObject.set(objArr);
            }
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

    public static V8ValueSet createV8ValueSet(V8Runtime v8Runtime, Object... objArr) throws JavetException {
        V8Scope v8Scope = v8Runtime.getV8Scope();
        try {
            V8ValueSet v8ValueSetCreateV8ValueSet = v8Scope.createV8ValueSet();
            if (ArrayUtils.isNotEmpty(objArr)) {
                for (Object obj : objArr) {
                    v8ValueSetCreateV8ValueSet.add(obj);
                }
            }
            v8Scope.setEscapable();
            v8Scope.close();
            return v8ValueSetCreateV8ValueSet;
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

    public static String asString(V8Value v8Value) {
        return asString(v8Value, "undefined");
    }

    public static String asString(V8Value v8Value, String str) {
        return v8Value == null ? str : v8Value.toString();
    }
}
