package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzhrs extends zzibr implements zzidd {
    private static final zzhrs zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhrw zzc;
    private zzian zzd = zzian.zza;

    public final int zza() {
        return this.zzb;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzh(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    static {
        zzhrs zzhrsVar = new zzhrs();
        zze = zzhrsVar;
        zzibr.zzbu(zzhrs.class, zzhrsVar);
    }

    public static zzhrs zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhrs) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhrr zze() {
        return (zzhrr) zze.zzbn();
    }

    public final zzhrw zzb() {
        zzhrw zzhrwVar = this.zzc;
        return zzhrwVar == null ? zzhrw.zzc() : zzhrwVar;
    }

    private zzhrs() {
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
                                zzidk zzidkVar = zzf;
                                if (zzidkVar == null) {
                                    synchronized (zzhrs.class) {
                                        try {
                                            zzibmVar = zzf;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zze);
                                                zzf = zzibmVar;
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
                        return zze;
                    }
                    return new zzhrr(bArr);
                }
                return new zzhrs();
            }
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", HrvQKfmFZJudBc.inXgpCx});
        }
        return (byte) 1;
    }

    final /* synthetic */ void zzg(zzhrw zzhrwVar) {
        zzhrwVar.getClass();
        this.zzc = zzhrwVar;
        this.zza |= 1;
    }
}
