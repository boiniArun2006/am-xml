package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzta extends zzaky<zzta, zza> implements zzame {
    private static final zzta zzc;
    private static volatile zzamp<zzta> zzd;
    private int zze;
    private int zzf;
    private zztg zzg;
    private zzvs zzh;

    public static final class zza extends zzaky.zza<zzta, zza> implements zzame {
        public final zza zza(zztg zztgVar) {
            zzh();
            zzta.zza((zzta) this.zza, zztgVar);
            return this;
        }

        private zza() {
            super(zzta.zzc);
        }

        public final zza zza(zzvs zzvsVar) {
            zzh();
            zzta.zza((zzta) this.zza, zzvsVar);
            return this;
        }
    }

    public final int zza() {
        return this.zzf;
    }

    static {
        zzta zztaVar = new zzta();
        zzc = zztaVar;
        zzaky.zza((Class<zzta>) zzta.class, zztaVar);
    }

    public static zzta zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzta) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzta> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zztg zzd() {
        zztg zztgVar = this.zzg;
        return zztgVar == null ? zztg.zzd() : zztgVar;
    }

    public final zzvs zze() {
        zzvs zzvsVar = this.zzh;
        return zzvsVar == null ? zzvs.zzd() : zzvsVar;
    }

    private zzta() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzsz.zza[i2 - 1]) {
            case 1:
                return new zzta();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzta> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzta.class) {
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

    static /* synthetic */ void zza(zzta zztaVar, zztg zztgVar) {
        zztgVar.getClass();
        zztaVar.zzg = zztgVar;
        zztaVar.zze |= 1;
    }

    static /* synthetic */ void zza(zzta zztaVar, zzvs zzvsVar) {
        zzvsVar.getClass();
        zztaVar.zzh = zzvsVar;
        zztaVar.zze |= 2;
    }
}
