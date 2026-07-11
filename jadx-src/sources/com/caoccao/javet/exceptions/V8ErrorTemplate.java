package com.caoccao.javet.exceptions;

import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class V8ErrorTemplate {
    public static String typeErrorValueIsNotAFunction(String str) {
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(str);
        sb.append(str);
        sb.append(" is not a function");
        return sb.toString();
    }

    public static String rangeErrorInvalidIndex(int i2) {
        return "Invalid index : " + i2;
    }

    public static String rangeErrorStartIsOutOfRange(int i2) {
        return "Start " + i2 + " is out of range";
    }

    public static String typeErrorFunctionIsNotSupported(String str) {
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(str);
        sb.append(str);
        sb.append("() is not supported");
        return sb.toString();
    }

    public static String typeErrorReduceOfEmptyArrayWithNoInitialValue() {
        return "Reduce of empty array with no initial value";
    }

    public static String typeErrorValueIsNotAFunction(V8Value v8Value) {
        return typeErrorValueIsNotAFunction(V8ValueUtils.asString(v8Value));
    }

    private V8ErrorTemplate() {
    }
}
