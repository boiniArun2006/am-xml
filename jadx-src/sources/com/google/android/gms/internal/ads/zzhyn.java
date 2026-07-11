package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhyn extends zzhyl {
    private final zzhzc zza = new zzhzc(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzhyn) && ((zzhyn) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(String str, zzhyl zzhylVar) {
        this.zza.put(str, zzhylVar);
    }

    public final Set zzb() {
        return this.zza.entrySet();
    }

    public final boolean zzc(String str) {
        return this.zza.containsKey(str);
    }

    public final zzhyl zzh(String str) {
        return (zzhyl) this.zza.get(str);
    }
}
