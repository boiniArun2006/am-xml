package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzaat implements zzaan {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzaal[] zzd = new zzaal[100];

    public zzaat(boolean z2, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized zzaal zza() {
        zzaal zzaalVar;
        try {
            this.zzb++;
            int i2 = this.zzc;
            if (i2 > 0) {
                zzaal[] zzaalVarArr = this.zzd;
                int i3 = i2 - 1;
                this.zzc = i3;
                zzaalVar = zzaalVarArr[i3];
                if (zzaalVar == null) {
                    throw null;
                }
                zzaalVarArr[i3] = null;
            } else {
                zzaalVar = new zzaal(new byte[65536], 0);
                int i5 = this.zzb;
                zzaal[] zzaalVarArr2 = this.zzd;
                int length = zzaalVarArr2.length;
                if (i5 > length) {
                    this.zzd = (zzaal[]) Arrays.copyOf(zzaalVarArr2, length + length);
                    return zzaalVar;
                }
            }
            return zzaalVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzb(zzaal zzaalVar) {
        zzaal[] zzaalVarArr = this.zzd;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        zzaalVarArr[i2] = zzaalVar;
        this.zzb--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzc(@Nullable zzaam zzaamVar) {
        while (zzaamVar != null) {
            try {
                zzaal[] zzaalVarArr = this.zzd;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                zzaalVarArr[i2] = zzaamVar.zzd();
                this.zzb--;
                zzaamVar = zzaamVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzd() {
        int i2 = this.zza;
        String str = zzfj.zza;
        int iMax = Math.max(0, ((i2 + 65535) / 65536) - this.zzb);
        int i3 = this.zzc;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i3, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i2) {
        int i3 = this.zza;
        this.zza = i2;
        if (i2 < i3) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }
}
