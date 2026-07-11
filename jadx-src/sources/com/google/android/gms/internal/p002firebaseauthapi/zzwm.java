package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzwm extends zzaky<zzwm, zza> implements zzame {
    private static final zzwm zzc;
    private static volatile zzamp<zzwm> zzd;
    private int zze;
    private int zzf;
    private zzwp zzg;
    private zzajp zzh = zzajp.zza;

    public static final class zza extends zzaky.zza<zzwm, zza> implements zzame {
        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzwm.zza((zzwm) this.zza, zzajpVar);
            return this;
        }

        private zza() {
            super(zzwm.zzc);
        }

        public final zza zza(zzwp zzwpVar) {
            zzh();
            zzwm.zza((zzwm) this.zza, zzwpVar);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzwm) this.zza).zzf = 0;
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzwm zzwmVar = new zzwm();
        zzc = zzwmVar;
        zzaky.zza((Class<zzwm>) zzwm.class, zzwmVar);
    }

    public static zzwm zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzwm) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzwm> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzwp zzd() {
        zzwp zzwpVar = this.zzg;
        return zzwpVar == null ? zzwp.zze() : zzwpVar;
    }

    public final zzajp zze() {
        return this.zzh;
    }

    private zzwm() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzwl.zza[i2 - 1]) {
            case 1:
                return new zzwm();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwm> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzwm.class) {
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

    static /* synthetic */ void zza(zzwm zzwmVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzwmVar.zzh = zzajpVar;
    }

    static /* synthetic */ void zza(zzwm zzwmVar, zzwp zzwpVar) {
        zzwpVar.getClass();
        zzwmVar.zzg = zzwpVar;
        zzwmVar.zze |= 1;
    }
}
