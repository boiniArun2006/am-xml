package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhru extends zzibr implements zzidd {
    private static final zzhru zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhrw zzc;

    public final int zza() {
        return this.zzb;
    }

    static {
        zzhru zzhruVar = new zzhru();
        zzd = zzhruVar;
        zzibr.zzbu(zzhru.class, zzhruVar);
    }

    public static zzhru zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhru) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhrt zzd() {
        return (zzhrt) zzd.zzbn();
    }

    public final zzhrw zzb() {
        zzhrw zzhrwVar = this.zzc;
        return zzhrwVar == null ? zzhrw.zzc() : zzhrwVar;
    }

    private zzhru() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    byte[] bArr = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzidk zzidkVar = zze;
                                if (zzidkVar == null) {
                                    synchronized (zzhru.class) {
                                        try {
                                            zzibmVar = zze;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzd);
                                                zze = zzibmVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return zzibmVar;
                                }
                                return zzidkVar;
                            }
                            throw null;
                        }
                        return zzd;
                    }
                    return new zzhrt(bArr);
                }
                return new zzhru();
            }
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zze(zzhrw zzhrwVar) {
        zzhrwVar.getClass();
        this.zzc = zzhrwVar;
        this.zza |= 1;
    }
}
