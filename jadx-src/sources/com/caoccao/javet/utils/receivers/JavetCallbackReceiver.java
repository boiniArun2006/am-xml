package com.caoccao.javet.utils.receivers;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueArray;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class JavetCallbackReceiver implements IJavetCallbackReceiver {
    protected static final String COMMA = ",";
    protected V8Runtime v8Runtime;

    public V8Value echo(V8Value v8Value) throws JavetException {
        return v8Value.toClone();
    }

    public String echoString(String str) {
        return str;
    }

    public V8ValueArray echo(V8Value... v8ValueArr) throws JavetException {
        V8ValueArray v8ValueArrayCreateV8ValueArray = this.v8Runtime.createV8ValueArray();
        for (V8Value v8Value : v8ValueArr) {
            V8Value clone = v8Value.toClone();
            try {
                v8ValueArrayCreateV8ValueArray.push(clone);
                if (clone != null) {
                    clone.close();
                }
            } catch (Throwable th) {
                if (clone != null) {
                    try {
                        clone.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return v8ValueArrayCreateV8ValueArray;
    }

    public String echoString(V8Value v8Value) {
        if (v8Value == null) {
            return null;
        }
        return v8Value.toString();
    }

    @Override // com.caoccao.javet.utils.receivers.IJavetCallbackReceiver
    public V8Runtime getV8Runtime() {
        return this.v8Runtime;
    }

    public JavetCallbackReceiver(V8Runtime v8Runtime) {
        Objects.requireNonNull(v8Runtime);
        this.v8Runtime = v8Runtime;
    }

    public String echoString(V8Value... v8ValueArr) {
        ArrayList arrayList = new ArrayList(v8ValueArr.length);
        int length = v8ValueArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            V8Value v8Value = v8ValueArr[i2];
            arrayList.add(v8Value == null ? null : v8Value.toString());
        }
        return StringUtils.join(COMMA, arrayList);
    }
}
