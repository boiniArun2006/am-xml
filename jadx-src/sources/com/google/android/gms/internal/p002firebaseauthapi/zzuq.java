package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzuq extends zzaky<zzuq, zza> implements zzame {
    private static final zzuq zzc;
    private static volatile zzamp<zzuq> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;

    public static final class zza extends zzaky.zza<zzuq, zza> implements zzame {
        private zza() {
            super(zzuq.zzc);
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzuq.zza((zzuq) this.zza, zzajpVar);
            return this;
        }
    }

    public final int zza() {
        return this.zze;
    }

    static {
        zzuq zzuqVar = new zzuq();
        zzc = zzuqVar;
        zzaky.zza((Class<zzuq>) zzuq.class, zzuqVar);
    }

    public static zzuq zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzuq) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzuq> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzajp zzd() {
        return this.zzf;
    }

    private zzuq() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzup.zza[i2 - 1]) {
            case 1:
                return new zzuq();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuq> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzuq.class) {
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

    static /* synthetic */ void zza(zzuq zzuqVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzuqVar.zzf = zzajpVar;
    }
}
