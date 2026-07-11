package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzik {
    private final Map zza;

    public zzik() {
        this.zza = new HashMap();
    }

    public final zzik zzd(String str, @Nullable String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzik zze(String str, @Nullable ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
            return this;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        this.zza.put(str, byteBufferAllocate);
        return this;
    }

    public final zzik zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zzil zzg() {
        return new zzil(this.zza, null);
    }

    public final zzik zza(String str, int i2) {
        this.zza.put(str, Integer.valueOf(i2));
        return this;
    }

    public final zzik zzb(String str, long j2) {
        this.zza.put(str, Long.valueOf(j2));
        return this;
    }

    public final zzik zzc(String str, float f3) {
        this.zza.put(str, Float.valueOf(f3));
        return this;
    }
}
