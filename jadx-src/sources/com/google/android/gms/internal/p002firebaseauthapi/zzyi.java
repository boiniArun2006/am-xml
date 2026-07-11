package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzyi extends zzaky<zzyi, zza> implements zzame {
    private static final zzyi zzc;
    private static volatile zzamp<zzyi> zzd;
    private int zze;

    public static final class zza extends zzaky.zza<zzyi, zza> implements zzame {
        private zza() {
            super(zzyi.zzc);
        }
    }

    public final int zza() {
        return this.zze;
    }

    static {
        zzyi zzyiVar = new zzyi();
        zzc = zzyiVar;
        zzaky.zza((Class<zzyi>) zzyi.class, zzyiVar);
    }

    public static zzyi zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzyi) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zzyi zzc() {
        return zzc;
    }

    private zzyi() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzyk.zza[i2 - 1]) {
            case 1:
                return new zzyi();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzyi> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzyi.class) {
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
