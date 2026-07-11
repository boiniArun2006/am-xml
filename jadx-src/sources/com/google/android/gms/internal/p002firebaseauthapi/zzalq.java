package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzalq implements zzamu {
    private static final zzamd zza = new zzalt();
    private final zzamd zzb;

    public zzalq() {
        this(new zzalv(zzakw.zza(), zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamu
    public final <T> zzamv<T> zza(Class<T> cls) {
        zzakm<?> zzakmVarZza;
        zzamx.zza((Class<?>) cls);
        zzama zzamaVarZza = this.zzb.zza(cls);
        if (zzamaVarZza.zzc()) {
            return zzami.zza(zzamx.zza(), zzako.zza(), zzamaVarZza.zza());
        }
        zzamk zzamkVarZza = zzamm.zza();
        zzalm zzalmVarZza = zzalo.zza();
        zzano<?, ?> zzanoVarZza = zzamx.zza();
        if (zzals.zza[zzamaVarZza.zzb().ordinal()] != 1) {
            zzakmVarZza = zzako.zza();
        } else {
            zzakmVarZza = null;
        }
        return zzamg.zza(cls, zzamaVarZza, zzamkVarZza, zzalmVarZza, zzanoVarZza, zzakmVarZza, zzamb.zza());
    }

    private zzalq(zzamd zzamdVar) {
        this.zzb = (zzamd) zzalb.zza(zzamdVar, "messageInfoFactory");
    }
}
