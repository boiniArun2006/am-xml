package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetUniConsumer;
import com.caoccao.javet.interfaces.IJavetUniIndexedConsumer;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.converters.JavetObjectConverter;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.virtual.V8VirtualValue;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class V8ValueSet extends V8ValueObject implements IV8ValueSet {
    protected static final String FUNCTION_ENTRIES = "entries";
    protected static final String FUNCTION_KEYS = "keys";

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Key extends V8Value, E extends Throwable> int forEach(IJavetUniConsumer<Key, E> iJavetUniConsumer) throws Throwable {
        V8Value next;
        Objects.requireNonNull(iJavetUniConsumer);
        IV8ValueIterator<V8Value> keys = getKeys();
        int i2 = 0;
        while (true) {
            try {
                next = keys.getNext();
                if (next == null) {
                    break;
                }
                try {
                    iJavetUniConsumer.accept(next);
                    i2++;
                    next.close();
                } finally {
                }
            } catch (Throwable th) {
                if (keys != null) {
                    try {
                        keys.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (next != null) {
            next.close();
        }
        keys.close();
        return i2;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueSet
    public IV8ValueIterator<V8ValueArray> getEntries() throws JavetException {
        return (IV8ValueIterator) invoke("entries", new V8Value[0]);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueKeyContainer
    public IV8ValueIterator<V8Value> getKeys() throws JavetException {
        return (IV8ValueIterator) invoke("keys", new V8Value[0]);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueSet
    public void add(Object obj) throws JavetException {
        V8VirtualValue v8VirtualValue = new V8VirtualValue(checkV8Runtime(), null, obj);
        try {
            this.v8Runtime.getV8Internal().setAdd(this, v8VirtualValue.get());
            v8VirtualValue.close();
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueSet
    public V8ValueArray asArray() throws JavetException {
        return checkV8Runtime().getV8Internal().setAsArray(this);
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean delete(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean delete = this.v8Runtime.getV8Internal().setDelete(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return delete;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Set;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean has(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean has = this.v8Runtime.getV8Internal().setHas(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return has;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    V8ValueSet(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueSet
    public void clear() throws JavetException {
        checkV8Runtime().getV8Internal().setClear(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueKeyContainer
    public int getSize() throws JavetException {
        return checkV8Runtime().getV8Internal().setGetSize(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Key extends V8Value, E extends Throwable> int forEach(IJavetUniIndexedConsumer<Key, E> iJavetUniIndexedConsumer) throws Throwable {
        V8Value next;
        Objects.requireNonNull(iJavetUniIndexedConsumer);
        IV8ValueIterator<V8Value> keys = getKeys();
        int i2 = 0;
        while (true) {
            try {
                next = keys.getNext();
                if (next == null) {
                    break;
                }
                try {
                    iJavetUniIndexedConsumer.accept(i2, next);
                    i2++;
                    next.close();
                } finally {
                }
            } catch (Throwable th) {
                if (keys != null) {
                    try {
                        keys.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (next != null) {
            next.close();
        }
        keys.close();
        return i2;
    }
}
