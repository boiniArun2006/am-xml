package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaoq {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;
    private int zzf;

    public zzaoq(int i2) {
    }

    public final void zza() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    public final boolean zzb(int i2, int i3) {
        int i5 = this.zzf;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i2 == 179 || i2 == 181) {
                            this.zza -= i3;
                            this.zze = false;
                            return true;
                        }
                    } else if ((i2 & 240) != 32) {
                        zzee.zzc("H263Reader", "Unexpected start code value");
                        zza();
                    } else {
                        this.zzb = this.zza;
                        this.zzf = 4;
                    }
                } else if (i2 > 31) {
                    zzee.zzc("H263Reader", "Unexpected start code value");
                    zza();
                } else {
                    this.zzf = 3;
                }
            } else if (i2 != 181) {
                zzee.zzc("H263Reader", "Unexpected start code value");
                zza();
            } else {
                this.zzf = 2;
            }
        } else if (i2 == 176) {
            this.zzf = 1;
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
