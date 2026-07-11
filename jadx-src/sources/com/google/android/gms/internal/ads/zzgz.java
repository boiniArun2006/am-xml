package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgz extends zzgt {

    @Nullable
    private zzhf zza;

    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgz() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        zzhf zzhfVar = this.zza;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i5 = this.zzd;
        if (i5 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i5);
        byte[] bArr2 = this.zzb;
        String str = zzfj.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i2, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        zzf(zzhfVar);
        this.zza = zzhfVar;
        Uri uriNormalizeScheme = zzhfVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzgrc.zzf("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzfj.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length == 2) {
            String str2 = strArrSplit[1];
            if (strArrSplit[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e2) {
                    throw zzat.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e2);
                }
            } else {
                this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j2 = zzhfVar.zze;
            int length = this.zzb.length;
            if (j2 <= length) {
                int i2 = (int) j2;
                this.zzc = i2;
                int i3 = length - i2;
                this.zzd = i3;
                long j3 = zzhfVar.zzf;
                if (j3 != -1) {
                    this.zzd = (int) Math.min(i3, j3);
                }
                zzg(zzhfVar);
                if (j3 != -1) {
                    return j3;
                }
                return this.zzd;
            }
            this.zzb = null;
            throw new zzhc(2008);
        }
        throw zzat.zza("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
    }
}
