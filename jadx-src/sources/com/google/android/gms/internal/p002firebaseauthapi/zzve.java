package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzve extends zzaky<zzve, zza> implements zzame {
    private static final zzve zzc;
    private static volatile zzamp<zzve> zzd;
    private int zze;
    private int zzf;
    private zzvh zzg;
    private zzajp zzh = zzajp.zza;

    public static final class zza extends zzaky.zza<zzve, zza> implements zzame {
        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzve.zza((zzve) this.zza, zzajpVar);
            return this;
        }

        private zza() {
            super(zzve.zzc);
        }

        public final zza zza(zzvh zzvhVar) {
            zzh();
            zzve.zza((zzve) this.zza, zzvhVar);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzve) this.zza).zzf = 0;
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzve zzveVar = new zzve();
        zzc = zzveVar;
        zzaky.zza((Class<zzve>) zzve.class, zzveVar);
    }

    public static zzve zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzve) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzve> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzvh zzd() {
        zzvh zzvhVar = this.zzg;
        return zzvhVar == null ? zzvh.zze() : zzvhVar;
    }

    public final zzajp zze() {
        return this.zzh;
    }

    private zzve() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzvg.zza[i2 - 1]) {
            case 1:
                return new zzve();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzve> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzve.class) {
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

    static /* synthetic */ void zza(zzve zzveVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzveVar.zzh = zzajpVar;
    }

    static /* synthetic */ void zza(zzve zzveVar, zzvh zzvhVar) {
        zzvhVar.getClass();
        zzveVar.zzg = zzvhVar;
        zzveVar.zze |= 1;
    }
}
