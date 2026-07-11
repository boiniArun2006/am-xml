package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgw extends zzgt {
    private final zzgv zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    public zzgw(final byte[] bArr) {
        zzgv zzgvVar = new zzgv() { // from class: com.google.android.gms.internal.ads.zzgu
            @Override // com.google.android.gms.internal.ads.zzgv
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        super(false);
        this.zza = zzgvVar;
        zzgrc.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i5 = this.zze;
        if (i5 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i5);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i2, iMin);
        this.zzd += iMin;
        this.zze -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        zzf(zzhfVar);
        Uri uri = zzhfVar.zza;
        this.zzb = uri;
        byte[] bArrZza = this.zza.zza(uri);
        this.zzc = bArrZza;
        long j2 = zzhfVar.zze;
        int length = bArrZza.length;
        if (j2 <= length) {
            int i2 = (int) j2;
            this.zzd = i2;
            int i3 = length - i2;
            this.zze = i3;
            long j3 = zzhfVar.zzf;
            if (j3 != -1) {
                this.zze = (int) Math.min(i3, j3);
            }
            this.zzf = true;
            zzg(zzhfVar);
            if (j3 != -1) {
                return j3;
            }
            return this.zze;
        }
        throw new zzhc(2008);
    }
}
