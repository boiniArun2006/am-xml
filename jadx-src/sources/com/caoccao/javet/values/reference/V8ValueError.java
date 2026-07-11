package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueErrorType;
import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class V8ValueError extends V8ValueObject {
    public static final String MESSAGE = "message";
    protected static final String METHOD_NAME_CONSTRUCTOR = "constructor";
    public static final String STACK = "stack";
    protected V8ValueErrorType optionalType;

    public V8ValueErrorType getErrorType() {
        if (this.optionalType == null) {
            this.optionalType = V8ValueErrorType.UnknownError;
            try {
                V8Value v8Value = get(METHOD_NAME_CONSTRUCTOR);
                try {
                    String string = v8Value.toString();
                    if (StringUtils.isNotEmpty(string)) {
                        int iIndexOf = string.indexOf(" ") + 1;
                        int iIndexOf2 = string.indexOf("(");
                        if (iIndexOf > 0 && iIndexOf2 > iIndexOf) {
                            this.optionalType = V8ValueErrorType.parse(string.substring(iIndexOf, iIndexOf2));
                        }
                    }
                    v8Value.close();
                } finally {
                }
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }
        return this.optionalType;
    }

    public String getMessage() throws JavetException {
        return getPropertyString("message");
    }

    public String getStack() throws JavetException {
        return getPropertyString(STACK);
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Error;
    }

    public boolean setStack(String str) throws JavetException {
        return setProperty(STACK, str);
    }

    V8ValueError(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
        this.optionalType = null;
    }
}
