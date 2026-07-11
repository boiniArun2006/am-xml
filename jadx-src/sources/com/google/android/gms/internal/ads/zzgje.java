package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgje {
    private final File zza;
    private final zzfvc zzb;
    private final zzgoe zzc;

    public zzgje(File file, zzfvc zzfvcVar, zzgoe zzgoeVar) {
        this.zza = file;
        this.zzb = zzfvcVar;
        this.zzc = zzgoeVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean zZza;
        try {
            File file = this.zza;
            zzgxm.zzb(file);
            zzgxm.zza(bArr, file);
            zZza = this.zzb.zza(file);
        } catch (IOException | GeneralSecurityException e2) {
            this.zzc.zzd(2027, e2);
            zZza = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return zZza;
    }
}
