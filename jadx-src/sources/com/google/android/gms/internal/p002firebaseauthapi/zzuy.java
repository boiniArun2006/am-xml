package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzuy extends zzaky<zzuy, zza> implements zzame {
    private static final zzuy zzc;
    private static volatile zzamp<zzuy> zzd;
    private int zze;
    private zzvb zzf;

    public static final class zza extends zzaky.zza<zzuy, zza> implements zzame {
        private zza() {
            super(zzuy.zzc);
        }

        public final zza zza(zzvb zzvbVar) {
            zzh();
            zzuy.zza((zzuy) this.zza, zzvbVar);
            return this;
        }
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    static {
        zzuy zzuyVar = new zzuy();
        zzc = zzuyVar;
        zzaky.zza((Class<zzuy>) zzuy.class, zzuyVar);
    }

    public static zzuy zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzuy) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public final zzvb zzc() {
        zzvb zzvbVar = this.zzf;
        return zzvbVar == null ? zzvb.zze() : zzvbVar;
    }

    private zzuy() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzva.zza[i2 - 1]) {
            case 1:
                return new zzuy();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuy> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzuy.class) {
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

    static /* synthetic */ void zza(zzuy zzuyVar, zzvb zzvbVar) {
        zzvbVar.getClass();
        zzuyVar.zzf = zzvbVar;
        zzuyVar.zze |= 1;
    }
}
