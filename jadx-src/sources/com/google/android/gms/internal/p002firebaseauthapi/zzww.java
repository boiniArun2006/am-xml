package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzww extends zzaky<zzww, zza> implements zzame {
    private static final zzww zzc;
    private static volatile zzamp<zzww> zzd;
    private String zze = "";
    private zzajp zzf = zzajp.zza;
    private int zzg;

    public static final class zza extends zzaky.zza<zzww, zza> implements zzame {
        public final zza zza(zzxu zzxuVar) {
            zzh();
            zzww.zza((zzww) this.zza, zzxuVar);
            return this;
        }

        private zza() {
            super(zzww.zzc);
        }

        public final zza zza(String str) {
            zzh();
            zzww.zza((zzww) this.zza, str);
            return this;
        }

        public final zza zza(zzajp zzajpVar) {
            zzh();
            zzww.zza((zzww) this.zza, zzajpVar);
            return this;
        }
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    static {
        zzww zzwwVar = new zzww();
        zzc = zzwwVar;
        zzaky.zza((Class<zzww>) zzww.class, zzwwVar);
    }

    public static zza zza(zzww zzwwVar) {
        return (zza) zzc.zzm().zza(zzwwVar);
    }

    public static zzww zzc() {
        return zzc;
    }

    public final zzxu zzd() {
        zzxu zzxuVarZza = zzxu.zza(this.zzg);
        return zzxuVarZza == null ? zzxu.UNRECOGNIZED : zzxuVarZza;
    }

    public final zzajp zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    private zzww() {
    }

    public static zzww zza(byte[] bArr, zzakk zzakkVar) throws zzalf {
        return (zzww) zzaky.zza(zzc, bArr, zzakkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzwv.zza[i2 - 1]) {
            case 1:
                return new zzww();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzww> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzww.class) {
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

    static /* synthetic */ void zza(zzww zzwwVar, zzxu zzxuVar) {
        zzwwVar.zzg = zzxuVar.zza();
    }

    static /* synthetic */ void zza(zzww zzwwVar, String str) {
        str.getClass();
        zzwwVar.zze = str;
    }

    static /* synthetic */ void zza(zzww zzwwVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzwwVar.zzf = zzajpVar;
    }
}
