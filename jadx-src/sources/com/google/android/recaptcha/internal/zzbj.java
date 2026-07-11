package com.google.android.recaptcha.internal;

import kotlin.comparisons.ComparisonsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j2) {
        this.zzc = j2;
    }

    public final void zzf(long j2) {
        this.zzb = j2;
    }

    public final void zzg(int i2) {
        this.zza = i2;
    }

    public final String toString() {
        return "avgExecutionTime: " + StringsKt.padEnd$default(String.valueOf(this.zzb / ((long) this.zza)), 10, (char) 0, 2, (Object) null) + " us| maxExecutionTime: " + StringsKt.padEnd$default(String.valueOf(this.zzc), 10, (char) 0, 2, (Object) null) + " us| totalTime: " + StringsKt.padEnd$default(String.valueOf(this.zzb), 10, (char) 0, 2, (Object) null) + " us| #Usages: " + StringsKt.padEnd$default(String.valueOf(this.zza), 5, (char) 0, 2, (Object) null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return ComparisonsKt.compareValues(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }
}
