package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.JavetDateTimeUtils;
import j$.time.ZonedDateTime;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class V8ValueZonedDateTime extends V8ValuePrimitive<ZonedDateTime> {
    public V8ValueZonedDateTime(V8Runtime v8Runtime) throws JavetException {
        this(v8Runtime, (ZonedDateTime) null);
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueZonedDateTime toClone(boolean z2) throws JavetException {
        return this;
    }

    public V8ValueZonedDateTime(V8Runtime v8Runtime, long j2) throws JavetException {
        this(v8Runtime, JavetDateTimeUtils.toZonedDateTime(j2));
    }

    @Override // com.caoccao.javet.values.IV8Value
    public boolean asBoolean() {
        return this.value != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long toPrimitive() {
        return ((ZonedDateTime) this.value).toInstant().toEpochMilli();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V8ValueZonedDateTime(V8Runtime v8Runtime, ZonedDateTime zonedDateTime) throws JavetException {
        super(v8Runtime, zonedDateTime);
        Objects.requireNonNull(zonedDateTime);
    }

    @Override // com.caoccao.javet.values.IV8Value
    public int asInt() throws JavetException {
        return asBoolean() ? 1 : 0;
    }
}
