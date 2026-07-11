package com.google.android.gms.internal.ads;

import com.alightcreative.gl.egl.il.inFlMLxL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzgbz extends zzibr implements zzidd {
    private static final zzgbz zzl;
    private static volatile zzidk zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    public static zzgbz zzj() {
        return zzl;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final long zzg() {
        return this.zzj;
    }

    public final long zzh() {
        return this.zzk;
    }

    final /* synthetic */ void zzk(boolean z2) {
        this.zza |= 4;
        this.zzd = z2;
    }

    final /* synthetic */ void zzl(long j2) {
        this.zza |= 64;
        this.zzh = j2;
    }

    static {
        zzgbz zzgbzVar = new zzgbz();
        zzl = zzgbzVar;
        zzibr.zzbu(zzgbz.class, zzgbzVar);
    }

    public static zzgby zzi() {
        return (zzgby) zzl.zzbn();
    }

    private zzgbz() {
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
                                zzidk zzidkVar = zzm;
                                if (zzidkVar == null) {
                                    synchronized (zzgbz.class) {
                                        try {
                                            zzibmVar = zzm;
                                            if (zzibmVar == null) {
                                                zzibmVar = new zzibm(zzl);
                                                zzm = zzibmVar;
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
                        return zzl;
                    }
                    return new zzgby(bArr);
                }
                return new zzgbz();
            }
            return zzibr.zzbv(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", inFlMLxL.sCrQzp});
        }
        return (byte) 1;
    }
}
