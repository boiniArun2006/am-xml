package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzwp extends zzaky<zzwp, zza> implements zzame {
    private static final zzwp zzc;
    private static volatile zzamp<zzwp> zzd;
    private int zze;
    private int zzf;
    private zzwj zzg;
    private zzajp zzh = zzajp.zza;

    public static final class zza extends zzaky.zza<zzwp, zza> implements zzame {
        public final zza zza(zzwj zzwjVar) {
            zzh();
            zzwp.zza((zzwp) this.zza, zzwjVar);
            return this;
        }

        private zza() {
            super(zzwp.zzc);
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzwp.zza((zzwp) this.zza, zzajpVar);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzwp) this.zza).zzf = 0;
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzwp zzwpVar = new zzwp();
        zzc = zzwpVar;
        zzaky.zza((Class<zzwp>) zzwp.class, zzwpVar);
    }

    public static zzamp<zzwp> d_() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public static zzwp zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzwp) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzwp zze() {
        return zzc;
    }

    public final zzwj zzb() {
        zzwj zzwjVar = this.zzg;
        return zzwjVar == null ? zzwj.zzf() : zzwjVar;
    }

    public final zzajp zzf() {
        return this.zzh;
    }

    private zzwp() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzwo.zza[i2 - 1]) {
            case 1:
                return new zzwp();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwp> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzwp.class) {
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

    static /* synthetic */ void zza(zzwp zzwpVar, zzwj zzwjVar) {
        zzwjVar.getClass();
        zzwpVar.zzg = zzwjVar;
        zzwpVar.zze |= 1;
    }

    static /* synthetic */ void zza(zzwp zzwpVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzwpVar.zzh = zzajpVar;
    }
}
