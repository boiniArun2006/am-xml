package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzue extends zzaky<zzue, zza> implements zzame {
    private static final zzue zzc;
    private static volatile zzamp<zzue> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;

    public static final class zza extends zzaky.zza<zzue, zza> implements zzame {
        private zza() {
            super(zzue.zzc);
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzue.zza((zzue) this.zza, zzajpVar);
            return this;
        }
    }

    public final int zza() {
        return this.zze;
    }

    static {
        zzue zzueVar = new zzue();
        zzc = zzueVar;
        zzaky.zza((Class<zzue>) zzue.class, zzueVar);
    }

    public static zzue zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzue) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzue> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzajp zzd() {
        return this.zzf;
    }

    private zzue() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzud.zza[i2 - 1]) {
            case 1:
                return new zzue();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzue> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzue.class) {
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

    static /* synthetic */ void zza(zzue zzueVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzueVar.zzf = zzajpVar;
    }
}
