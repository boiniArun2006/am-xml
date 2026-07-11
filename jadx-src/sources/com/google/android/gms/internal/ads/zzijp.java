package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzijp extends zzijn implements zzatj {
    private int zzg;

    protected zzijp(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    protected final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzati.zzc(byteBuffer.get());
        zzati.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
