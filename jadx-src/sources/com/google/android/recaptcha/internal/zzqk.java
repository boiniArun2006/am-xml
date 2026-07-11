package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzqk extends zznd implements zzoj {
    private static final zzqk zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzni zzk = zznd.zzy();

    static {
        zzqk zzqkVar = new zzqk();
        zzb = zzqkVar;
        zznd.zzI(zzqk.class, zzqkVar);
    }

    public static zzqh zzf() {
        return (zzqh) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzqk zzqkVar, Iterable iterable) {
        zzni zzniVar = zzqkVar.zzk;
        if (!zzniVar.zzc()) {
            zzqkVar.zzk = zznd.zzz(zzniVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzqkVar.zzk.zzh(((zzqi) it.next()).zza());
        }
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i2, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzqk();
        }
        zzqj zzqjVar = null;
        if (i3 == 4) {
            return new zzqh(zzqjVar);
        }
        if (i3 == 5) {
            return zzb;
        }
        if (i3 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar != null) {
            return zzoqVar;
        }
        synchronized (zzqk.class) {
            try {
                zzmyVar = zzd;
                if (zzmyVar == null) {
                    zzmyVar = new zzmy(zzb);
                    zzd = zzmyVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzmyVar;
    }

    private zzqk() {
    }

    static /* synthetic */ void zzM(zzqk zzqkVar, String str) {
        str.getClass();
        zzqkVar.zzf = str;
    }

    static /* synthetic */ void zzN(zzqk zzqkVar, String str) {
        str.getClass();
        zzqkVar.zzi = str;
    }

    static /* synthetic */ void zzk(zzqk zzqkVar, String str) {
        str.getClass();
        zzqkVar.zzj = str;
    }

    static /* synthetic */ void zzl(zzqk zzqkVar, String str) {
        str.getClass();
        zzqkVar.zzh = str;
    }
}
