package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaek {

    @Nullable
    private String zza;

    @Nullable
    private String zzb;

    private zzaek() {
    }

    public static zzaek zza(String str) {
        zzaek zzaekVar = new zzaek();
        zzaekVar.zza = str;
        return zzaekVar;
    }

    public static zzaek zzb(String str) {
        zzaek zzaekVar = new zzaek();
        zzaekVar.zzb = str;
        return zzaekVar;
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}
