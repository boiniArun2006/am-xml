package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzalv implements zzamd {
    private zzamd[] zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final zzama zza(Class<?> cls) {
        for (zzamd zzamdVar : this.zza) {
            if (zzamdVar.zzb(cls)) {
                return zzamdVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final boolean zzb(Class<?> cls) {
        for (zzamd zzamdVar : this.zza) {
            if (zzamdVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    zzalv(zzamd... zzamdVarArr) {
        this.zza = zzamdVarArr;
    }
}
