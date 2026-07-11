package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzaxy {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public final void zza(byte[] bArr) {
        int i2 = this.zzb;
        int i3 = this.zzc;
        for (int i5 = 0; i5 < 256; i5++) {
            byte[] bArr2 = this.zza;
            i2 = (i2 + 1) & 255;
            byte b2 = bArr2[i2];
            i3 = (i3 + b2) & 255;
            bArr2[i2] = bArr2[i3];
            bArr2[i3] = b2;
            bArr[i5] = (byte) (bArr2[(bArr2[i2] + b2) & 255] ^ bArr[i5]);
        }
        this.zzb = i2;
        this.zzc = i3;
    }

    public zzaxy(byte[] bArr) {
        for (int i2 = 0; i2 < 256; i2++) {
            this.zza[i2] = (byte) i2;
        }
        int i3 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            byte[] bArr2 = this.zza;
            byte b2 = bArr2[i5];
            i3 = (i3 + b2 + bArr[i5 % bArr.length]) & 255;
            bArr2[i5] = bArr2[i3];
            bArr2[i3] = b2;
        }
        this.zzb = 0;
        this.zzc = 0;
    }
}
