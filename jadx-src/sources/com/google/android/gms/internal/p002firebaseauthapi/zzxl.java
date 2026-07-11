package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzxl extends zzaky<zzxl, zza> implements zzame {
    private static final zzxl zzc;
    private static volatile zzamp<zzxl> zzd;
    private String zze = "";

    public static final class zza extends zzaky.zza<zzxl, zza> implements zzame {
        private zza() {
            super(zzxl.zzc);
        }

        public final zza zza(String str) {
            zzh();
            zzxl.zza((zzxl) this.zza, str);
            return this;
        }
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    static {
        zzxl zzxlVar = new zzxl();
        zzc = zzxlVar;
        zzaky.zza((Class<zzxl>) zzxl.class, zzxlVar);
    }

    public static zzxl zza(zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (zzxl) zzaky.zza(zzc, zzajpVar, zzakkVar);
    }

    public static zzxl zzc() {
        return zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    private zzxl() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzamp zzcVar;
        switch (zzxk.zza[i2 - 1]) {
            case 1:
                return new zzxl();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxl> zzampVar = zzd;
                if (zzampVar != null) {
                    return zzampVar;
                }
                synchronized (zzxl.class) {
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

    static /* synthetic */ void zza(zzxl zzxlVar, String str) {
        str.getClass();
        zzxlVar.zze = str;
    }
}
