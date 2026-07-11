package com.google.android.gms.internal.measurement;

import android.net.Uri;
import t1.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzkf {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    private zzkf(String str, Uri uri, String str2, String str3, boolean z2, boolean z3, boolean z4, boolean z5, CN3 cn3) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z2;
        this.zze = z4;
    }

    public final zzkf zzb() {
        return new zzkf(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    public zzkf(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzkf zza() {
        String str = this.zzb;
        if (str.isEmpty()) {
            return new zzkf(null, this.zza, str, this.zzc, true, false, this.zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzkl zze(String str, double d2) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i2 = zzkl.zzc;
        return new zzkd(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final zzkl zzf(String str, String str2) {
        int i2 = zzkl.zzc;
        return new zzke(this, str, str2, true);
    }

    public final zzkl zzc(String str, long j2) {
        Long lValueOf = Long.valueOf(j2);
        int i2 = zzkl.zzc;
        return new zzkb(this, str, lValueOf, true);
    }

    public final zzkl zzd(String str, boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        int i2 = zzkl.zzc;
        return new zzkc(this, str, boolValueOf, true);
    }
}
