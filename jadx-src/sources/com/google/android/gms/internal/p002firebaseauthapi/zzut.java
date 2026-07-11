package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzut extends zzaky<zzut, zza> implements zzame {
    private static final zzut zzc;
    private static volatile zzamp<zzut> zzd;

    public static final class zza extends zzaky.zza<zzut, zza> implements zzame {
        private zza() {
            super(zzut.zzc);
        }
    }

    static {
        zzut zzutVar = new zzut();
        zzc = zzutVar;
        zzaky.zza((Class<zzut>) zzut.class, zzutVar);
    }

    public static zzut zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzut) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zzut zzb() {
        return zzc;
    }

    private zzut() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzus.zza[i2 - 1]) {
            case 1:
                return new zzut();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzamp<zzut> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzut.class) {
                    try {
                        zzcVar = zzd;
                        if (zzcVar == null) {
                            zzcVar = new zzaky.zzc(zzc);
                            zzd = zzcVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzcVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
