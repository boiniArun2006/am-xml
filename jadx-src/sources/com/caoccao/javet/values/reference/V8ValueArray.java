package com.caoccao.javet.values.reference;

import cS.Zv.SzFNXybiSxdx;
import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetUniConsumer;
import com.caoccao.javet.interfaces.IJavetUniIndexedConsumer;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.V8Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class V8ValueArray extends V8ValueObject implements IV8ValueArray {
    protected static final String FUNCTION_KEYS = "keys";
    protected static final String FUNCTION_NEXT = "next";
    protected static final String PROPERTY_DONE = "done";
    protected static final String PROPERTY_VALUE = "value";

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Value extends V8Value, E extends Throwable> int forEach(IJavetUniConsumer<Value, E> iJavetUniConsumer) throws Throwable {
        return forEach(iJavetUniConsumer, 100);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueArray
    public List<Integer> getKeys() throws JavetException {
        V8ValueObject v8ValueObject = (V8ValueObject) invoke(SzFNXybiSxdx.uZeXHYuGxXCQXe, new V8Value[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                V8ValueObject v8ValueObject2 = (V8ValueObject) v8ValueObject.invoke(FUNCTION_NEXT, new V8Value[0]);
                try {
                    if (v8ValueObject2.getBoolean(PROPERTY_DONE).booleanValue()) {
                        v8ValueObject2.close();
                        v8ValueObject.close();
                        return arrayList;
                    }
                    arrayList.add(v8ValueObject2.getInteger("value"));
                    v8ValueObject2.close();
                } finally {
                }
            }
        } catch (Throwable th) {
            if (v8ValueObject != null) {
                try {
                    v8ValueObject.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Value extends V8Value, E extends Throwable> int forEach(IJavetUniConsumer<Value, E> iJavetUniConsumer, int i2) throws Throwable {
        Objects.requireNonNull(iJavetUniConsumer);
        int iMax = Math.max(1, i2);
        int length = getLength();
        if (length > 0) {
            V8Value[] v8ValueArr = new V8Value[iMax];
            int i3 = ((length + iMax) - 1) / iMax;
            int i5 = 0;
            while (i5 < i3) {
                int i7 = i5 * iMax;
                try {
                    int iBatchGet = batchGet(v8ValueArr, i7, i5 == i3 + (-1) ? length : i7 + iMax);
                    for (int i8 = 0; i8 < iBatchGet; i8++) {
                        iJavetUniConsumer.accept(v8ValueArr[i8]);
                    }
                    JavetResourceUtils.safeClose(v8ValueArr);
                    Arrays.fill(v8ValueArr, (Object) null);
                    i5++;
                } catch (Throwable th) {
                    JavetResourceUtils.safeClose(v8ValueArr);
                    Arrays.fill(v8ValueArr, (Object) null);
                    throw th;
                }
            }
        }
        return length;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Array;
    }

    V8ValueArray(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    @Override // com.caoccao.javet.values.IV8Value
    public int asInt() throws JavetException {
        if (getLength() != 1) {
            return 0;
        }
        V8Value v8Value = get(0);
        try {
            int iAsInt = v8Value.asInt();
            v8Value.close();
            return iAsInt;
        } catch (Throwable th) {
            if (v8Value != null) {
                try {
                    v8Value.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueArray
    public int batchGet(V8Value[] v8ValueArr, int i2, int i3) throws JavetException {
        return checkV8Runtime().getV8Internal().batchArrayGet(this, v8ValueArr, i2, i3);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueArray
    public <T extends V8Value> T get(int i2) throws JavetException {
        return (T) checkV8Runtime().getV8Internal().objectGet(this, this.v8Runtime.createV8ValueInteger(i2));
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueArray
    public int getLength() throws JavetException {
        return checkV8Runtime().getV8Internal().arrayGetLength(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Value extends V8Value, E extends Throwable> int forEach(IJavetUniIndexedConsumer<Value, E> iJavetUniIndexedConsumer) throws Throwable {
        return forEach(iJavetUniIndexedConsumer, 100);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Value extends V8Value, E extends Throwable> int forEach(IJavetUniIndexedConsumer<Value, E> iJavetUniIndexedConsumer, int i2) throws Throwable {
        Objects.requireNonNull(iJavetUniIndexedConsumer);
        int iMax = Math.max(1, i2);
        int length = getLength();
        if (length > 0) {
            V8Value[] v8ValueArr = new V8Value[iMax];
            int i3 = ((length + iMax) - 1) / iMax;
            int i5 = 0;
            while (i5 < i3) {
                int i7 = i5 * iMax;
                try {
                    int iBatchGet = batchGet(v8ValueArr, i7, i5 == i3 + (-1) ? length : i7 + iMax);
                    for (int i8 = 0; i8 < iBatchGet; i8++) {
                        iJavetUniIndexedConsumer.accept(i7 + i8, v8ValueArr[i8]);
                    }
                    JavetResourceUtils.safeClose(v8ValueArr);
                    Arrays.fill(v8ValueArr, (Object) null);
                    i5++;
                } catch (Throwable th) {
                    JavetResourceUtils.safeClose(v8ValueArr);
                    Arrays.fill(v8ValueArr, (Object) null);
                    throw th;
                }
            }
        }
        return length;
    }
}
