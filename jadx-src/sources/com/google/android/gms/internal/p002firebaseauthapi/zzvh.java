package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzvh extends zzaky<zzvh, zza> implements zzame {
    private static final zzvh zzc;
    private static volatile zzamp<zzvh> zzd;
    private int zze;
    private int zzf;
    private zzvb zzg;
    private zzajp zzh;
    private zzajp zzi;

    public static final class zza extends zzaky.zza<zzvh, zza> implements zzame {
        public final zza zza(zzvb zzvbVar) {
            zzh();
            zzvh.zza((zzvh) this.zza, zzvbVar);
            return this;
        }

        private zza() {
            super(zzvh.zzc);
        }

        public final zza zza(int i2) {
            zzh();
            ((zzvh) this.zza).zzf = 0;
            return this;
        }

        public final zza zzb(zzajp zzajpVar) {
            zzh();
            zzvh.zzb((zzvh) this.zza, zzajpVar);
            return this;
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzvh.zza((zzvh) this.zza, zzajpVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvb zzb() {
        zzvb zzvbVar = this.zzg;
        return zzvbVar == null ? zzvb.zze() : zzvbVar;
    }

    static {
        zzvh zzvhVar = new zzvh();
        zzc = zzvhVar;
        zzaky.zza((Class<zzvh>) zzvh.class, zzvhVar);
    }

    public static zzvh zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzvh) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    static /* synthetic */ void zzb(zzvh zzvhVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzvhVar.zzi = zzajpVar;
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvh zze() {
        return zzc;
    }

    public static zzamp<zzvh> zzh() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzajp b_() {
        return this.zzi;
    }

    public final zzajp zzf() {
        return this.zzh;
    }

    private zzvh() {
        zzajp zzajpVar = zzajp.zza;
        this.zzh = zzajpVar;
        this.zzi = zzajpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzvj.zza[i2 - 1]) {
            case 1:
                return new zzvh();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvh> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzvh.class) {
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

    static /* synthetic */ void zza(zzvh zzvhVar, zzvb zzvbVar) {
        zzvbVar.getClass();
        zzvhVar.zzg = zzvbVar;
        zzvhVar.zze |= 1;
    }

    static /* synthetic */ void zza(zzvh zzvhVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzvhVar.zzh = zzajpVar;
    }
}
