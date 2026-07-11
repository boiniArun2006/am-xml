package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzakw implements zzamd {
    private static final zzakw zza = new zzakw();

    private zzakw() {
    }

    public static zzakw zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final zzama zza(Class<?> cls) {
        if (!zzaky.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzama) zzaky.zza(cls.asSubclass(zzaky.class)).zza(zzaky.zzf.zzc, (Object) null, (Object) null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final boolean zzb(Class<?> cls) {
        return zzaky.class.isAssignableFrom(cls);
    }
}
