package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetBiConsumer;
import com.caoccao.javet.interfaces.IJavetBiIndexedConsumer;
import com.caoccao.javet.interfaces.IJavetUniConsumer;
import com.caoccao.javet.interfaces.IJavetUniIndexedConsumer;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.converters.JavetObjectConverter;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.virtual.V8VirtualValue;
import com.caoccao.javet.values.virtual.V8VirtualValueList;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8ValueMap extends V8ValueObject implements IV8ValueMap {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Key extends V8Value, E extends Throwable> int forEach(IJavetUniConsumer<Key, E> iJavetUniConsumer) throws Throwable {
        V8Value next;
        Objects.requireNonNull(iJavetUniConsumer);
        IV8ValueIterator<? extends V8Value> keys = getKeys();
        int i2 = 0;
        while (true) {
            try {
                next = keys.getNext();
                if (next == null) {
                    break;
                }
                try {
                    iJavetUniConsumer.accept(next);
                    next.close();
                    i2++;
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

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean set(Object obj, Object obj2) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            V8VirtualValue v8VirtualValue2 = new V8VirtualValue(this.v8Runtime, null, obj2);
            try {
                boolean zMapSet = this.v8Runtime.getV8Internal().mapSet(this, v8VirtualValue.get(), v8VirtualValue2.get());
                v8VirtualValue2.close();
                v8VirtualValue.close();
                return zMapSet;
            } finally {
            }
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueMap
    public V8ValueArray asArray() throws JavetException {
        return checkV8Runtime().getV8Internal().mapAsArray(this);
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean delete(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zMapDelete = this.v8Runtime.getV8Internal().mapDelete(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return zMapDelete;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public <T extends V8Value> T get(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            T t3 = (T) this.v8Runtime.getV8Internal().mapGet(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return t3;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public Boolean getBoolean(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            Boolean boolMapGetBoolean = this.v8Runtime.getV8Internal().mapGetBoolean(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return boolMapGetBoolean;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public Double getDouble(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            Double dMapGetDouble = this.v8Runtime.getV8Internal().mapGetDouble(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return dMapGetDouble;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public Integer getInteger(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            Integer numMapGetInteger = this.v8Runtime.getV8Internal().mapGetInteger(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return numMapGetInteger;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public Long getLong(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            Long lMapGetLong = this.v8Runtime.getV8Internal().mapGetLong(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return lMapGetLong;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public String getString(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            String strMapGetString = this.v8Runtime.getV8Internal().mapGetString(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return strMapGetString;
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
        return V8ValueReferenceType.Map;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean has(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zMapHas = this.v8Runtime.getV8Internal().mapHas(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return zMapHas;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setBoolean(Object obj, Boolean bool) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            if (bool == null) {
                boolean zMapSetNull = this.v8Runtime.getV8Internal().mapSetNull(this, v8VirtualValue.get());
                v8VirtualValue.close();
                return zMapSetNull;
            }
            boolean zMapSetBoolean = this.v8Runtime.getV8Internal().mapSetBoolean(this, v8VirtualValue.get(), bool.booleanValue());
            v8VirtualValue.close();
            return zMapSetBoolean;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setDouble(Object obj, Double d2) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            if (d2 == null) {
                boolean zMapSetNull = this.v8Runtime.getV8Internal().mapSetNull(this, v8VirtualValue.get());
                v8VirtualValue.close();
                return zMapSetNull;
            }
            boolean zMapSetDouble = this.v8Runtime.getV8Internal().mapSetDouble(this, v8VirtualValue.get(), d2.doubleValue());
            v8VirtualValue.close();
            return zMapSetDouble;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setInteger(Object obj, Integer num) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            if (num == null) {
                boolean zMapSetNull = this.v8Runtime.getV8Internal().mapSetNull(this, v8VirtualValue.get());
                v8VirtualValue.close();
                return zMapSetNull;
            }
            boolean zMapSetInteger = this.v8Runtime.getV8Internal().mapSetInteger(this, v8VirtualValue.get(), num.intValue());
            v8VirtualValue.close();
            return zMapSetInteger;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setLong(Object obj, Long l2) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            if (l2 == null) {
                boolean zMapSetNull = this.v8Runtime.getV8Internal().mapSetNull(this, v8VirtualValue.get());
                v8VirtualValue.close();
                return zMapSetNull;
            }
            boolean zMapSetLong = this.v8Runtime.getV8Internal().mapSetLong(this, v8VirtualValue.get(), l2.longValue());
            v8VirtualValue.close();
            return zMapSetLong;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setNull(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zMapSetNull = this.v8Runtime.getV8Internal().mapSetNull(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return zMapSetNull;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setString(Object obj, String str) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zMapSetString = this.v8Runtime.getV8Internal().mapSetString(this, v8VirtualValue.get(), str);
            v8VirtualValue.close();
            return zMapSetString;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setUndefined(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zMapSetUndefined = this.v8Runtime.getV8Internal().mapSetUndefined(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return zMapSetUndefined;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    V8ValueMap(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueMap
    public void clear() throws JavetException {
        checkV8Runtime().getV8Internal().mapClear(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueKeyContainer
    public int getSize() throws JavetException {
        return checkV8Runtime().getV8Internal().mapGetSize(this);
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean set(Object... objArr) throws JavetException {
        int length = objArr.length;
        int length2 = objArr.length >> 1;
        Object[] objArr2 = new Object[length2];
        Object[] objArr3 = new Object[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = i2 * 2;
            objArr2[i2] = objArr[i3];
            objArr3[i2] = objArr[i3 + 1];
        }
        V8VirtualValueList v8VirtualValueList = new V8VirtualValueList(checkV8Runtime(), V8Value.OBJECT_CONVERTER, objArr2);
        try {
            V8VirtualValueList v8VirtualValueList2 = new V8VirtualValueList(this.v8Runtime, null, objArr3);
            try {
                V8Value[] v8ValueArr = v8VirtualValueList.get();
                V8Value[] v8ValueArr2 = v8VirtualValueList2.get();
                V8Value[] v8ValueArr3 = new V8Value[length];
                for (int i5 = 0; i5 < length2; i5++) {
                    int i7 = i5 * 2;
                    v8ValueArr3[i7] = v8ValueArr[i5];
                    v8ValueArr3[i7 + 1] = v8ValueArr2[i5];
                }
                boolean zMapSet = this.v8Runtime.getV8Internal().mapSet(this, v8ValueArr3);
                v8VirtualValueList2.close();
                v8VirtualValueList.close();
                return zMapSet;
            } finally {
            }
        } catch (Throwable th) {
            try {
                v8VirtualValueList.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Key extends V8Value, E extends Throwable> int forEach(IJavetUniIndexedConsumer<Key, E> iJavetUniIndexedConsumer) throws Throwable {
        V8Value next;
        Objects.requireNonNull(iJavetUniIndexedConsumer);
        IV8ValueIterator<? extends V8Value> keys = getKeys();
        int i2 = 0;
        while (true) {
            try {
                next = keys.getNext();
                if (next == null) {
                    break;
                }
                try {
                    iJavetUniIndexedConsumer.accept(i2, next);
                    next.close();
                    i2++;
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

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Key extends V8Value, Value extends V8Value, E extends Throwable> int forEach(IJavetBiConsumer<Key, Value, E> iJavetBiConsumer) throws Throwable {
        V8ValueArray v8ValueArray;
        Objects.requireNonNull(iJavetBiConsumer);
        IV8ValueIterator<V8ValueArray> entries = getEntries();
        int i2 = 0;
        while (true) {
            try {
                v8ValueArray = (V8ValueArray) entries.getNext();
                if (v8ValueArray == null) {
                    break;
                }
                try {
                    V8Value v8Value = v8ValueArray.get(0);
                    try {
                        V8Value v8Value2 = v8ValueArray.get(1);
                        try {
                            iJavetBiConsumer.accept(v8Value, v8Value2);
                            if (v8Value2 != null) {
                                v8Value2.close();
                            }
                            if (v8Value != null) {
                                v8Value.close();
                            }
                            i2++;
                            v8ValueArray.close();
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (entries != null) {
                    try {
                        entries.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (v8ValueArray != null) {
            v8ValueArray.close();
        }
        entries.close();
        return i2;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Key extends V8Value, Value extends V8Value, E extends Throwable> int forEach(IJavetBiIndexedConsumer<Key, Value, E> iJavetBiIndexedConsumer) throws Throwable {
        V8ValueArray v8ValueArray;
        Objects.requireNonNull(iJavetBiIndexedConsumer);
        IV8ValueIterator<V8ValueArray> entries = getEntries();
        int i2 = 0;
        while (true) {
            try {
                v8ValueArray = (V8ValueArray) entries.getNext();
                if (v8ValueArray == null) {
                    break;
                }
                try {
                    V8Value v8Value = v8ValueArray.get(0);
                    try {
                        V8Value v8Value2 = v8ValueArray.get(1);
                        try {
                            iJavetBiIndexedConsumer.accept(i2, v8Value, v8Value2);
                            if (v8Value2 != null) {
                                v8Value2.close();
                            }
                            if (v8Value != null) {
                                v8Value.close();
                            }
                            i2++;
                            v8ValueArray.close();
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (entries != null) {
                    try {
                        entries.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (v8ValueArray != null) {
            v8ValueArray.close();
        }
        entries.close();
        return i2;
    }
}
