package com.caoccao.javet.interop.monitoring;

import com.caoccao.javet.enums.RawPointerType;
import com.caoccao.javet.interfaces.IJavetRawPointer;
import com.caoccao.javet.utils.JavetDateTimeUtils;
import j$.time.ZonedDateTime;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class V8StatisticsFuture<T> extends CompletableFuture<T> implements IJavetRawPointer {
    public static final long INVALID_HANDLE = 0;
    private final ZonedDateTime creationDateTime = JavetDateTimeUtils.getUTCNow();
    private long handle = 0;
    private final RawPointerType rawPointerType;

    public ZonedDateTime getCreationDateTime() {
        return this.creationDateTime;
    }

    public long getHandle() {
        return this.handle;
    }

    @Override // com.caoccao.javet.interfaces.IJavetRawPointer
    public RawPointerType getRawPointerType() {
        return this.rawPointerType;
    }

    void setHandle(long j2) {
        this.handle = j2;
    }

    V8StatisticsFuture(int i2) {
        this.rawPointerType = RawPointerType.parse(i2);
    }
}
