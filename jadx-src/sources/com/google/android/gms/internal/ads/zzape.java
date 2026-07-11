package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzape {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public final void zza() {
        this.zzd = false;
        this.zze = false;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final boolean zze(int i2) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i2;
        this.zzd = false;
        this.zze = true;
        return true;
    }

    public final void zzc(int i2) {
        zzgrc.zzi(!this.zzd);
        boolean z2 = i2 == this.zzc;
        this.zzd = z2;
        if (z2) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final void zzd(byte[] bArr, int i2, int i3) {
        if (this.zzd) {
            int i5 = i3 - i2;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i7 = this.zzb + i5;
            if (length < i7) {
                this.zza = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i2, this.zza, this.zzb, i5);
            this.zzb += i5;
        }
    }

    public zzape(int i2, int i3) {
        this.zzc = i2;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.zza = bArr;
        bArr[2] = 1;
    }
}
