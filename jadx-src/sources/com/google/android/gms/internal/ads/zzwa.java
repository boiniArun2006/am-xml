package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzwa implements zzhb {
    private final zzhb zza;
    private final int zzb;
    private final zzvz zzc;
    private final byte[] zzd;
    private int zze;

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        int i5 = this.zze;
        if (i5 == 0) {
            zzhb zzhbVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i7 = 0;
            if (zzhbVar.zza(bArr2, 0, 1) != -1) {
                int i8 = (bArr2[0] & 255) << 4;
                if (i8 != 0) {
                    byte[] bArr3 = new byte[i8];
                    int i9 = i8;
                    while (i9 > 0) {
                        int iZza = zzhbVar.zza(bArr3, i7, i9);
                        if (iZza != -1) {
                            i7 += iZza;
                            i9 -= iZza;
                        }
                    }
                    while (i8 > 0) {
                        int i10 = i8 - 1;
                        if (bArr3[i10] != 0) {
                            break;
                        }
                        i8 = i10;
                    }
                    if (i8 > 0) {
                        this.zzc.zza(new zzer(bArr3, i8));
                    }
                }
                i5 = this.zzb;
                this.zze = i5;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i2, Math.min(i5, i3));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return this.zza.zzj();
    }

    public zzwa(zzhb zzhbVar, int i2, zzvz zzvzVar) {
        boolean z2;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        this.zza = zzhbVar;
        this.zzb = i2;
        this.zzc = zzvzVar;
        this.zzd = new byte[1];
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zza.zze(zzhzVar);
    }
}
