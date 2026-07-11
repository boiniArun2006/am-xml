package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzub extends zzih {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzub() {
        super(2, 0);
        this.zzi = 32;
    }

    public final void zzm(@IntRange int i2) {
        this.zzi = i2;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final int zzo() {
        return this.zzh;
    }

    public final boolean zzp() {
        return this.zzh > 0;
    }

    public final boolean zzq(zzih zzihVar) {
        ByteBuffer byteBuffer;
        zzgrc.zza(!zzihVar.zzi(1073741824));
        zzgrc.zza(!zzihVar.zzi(268435456));
        zzgrc.zza(!zzihVar.zzi(4));
        if (zzp()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzihVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i2 = this.zzh;
        this.zzh = i2 + 1;
        if (i2 == 0) {
            this.zze = zzihVar.zze;
            if (zzihVar.zzi(1)) {
                zzg(1);
            }
        }
        ByteBuffer byteBuffer3 = zzihVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzihVar.zze;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzih, com.google.android.gms.internal.ads.zzic
    public final void zza() {
        super.zza();
        this.zzh = 0;
    }
}
