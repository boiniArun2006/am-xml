package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzty extends zzaky<zzty, zza> implements zzame {
    private static final zzty zzc;
    private static volatile zzamp<zzty> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;

    public static final class zza extends zzaky.zza<zzty, zza> implements zzame {
        private zza() {
            super(zzty.zzc);
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzty.zza((zzty) this.zza, zzajpVar);
            return this;
        }
    }

    public final int zza() {
        return this.zze;
    }

    static {
        zzty zztyVar = new zzty();
        zzc = zztyVar;
        zzaky.zza((Class<zzty>) zzty.class, zztyVar);
    }

    public static zzty zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzty) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzty> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzajp zzd() {
        return this.zzf;
    }

    private zzty() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zztx.zza[i2 - 1]) {
            case 1:
                return new zzty();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzty> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzty.class) {
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

    static /* synthetic */ void zza(zzty zztyVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zztyVar.zzf = zzajpVar;
    }
}
