package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaoo {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;

    public zzaoo(int i2) {
    }

    public final void zza() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzb(int i2, int i3) {
        if (this.zze) {
            int i5 = this.zza - i3;
            this.zza = i5;
            if (this.zzb != 0 || i2 != 181) {
                this.zze = false;
                return true;
            }
            this.zzb = i5;
        } else if (i2 == 179) {
            this.zze = true;
        }
        zzc(zzd, 0, 3);
        return false;
    }

    public final void zzc(byte[] bArr, int i2, int i3) {
        if (this.zze) {
            int i5 = i3 - i2;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i7 = this.zza + i5;
            if (length < i7) {
                this.zzc = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i2, this.zzc, this.zza, i5);
            this.zza += i5;
        }
    }
}
