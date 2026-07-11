package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzpf implements zzpo {
    public static final zzgru zza = zzpd.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzpn zzf;
    private zzbf zzg;

    @Nullable
    private String zzh;
    private long zzi;

    public zzpf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zza(zzpn zzpnVar) {
        this.zzf = zzpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized String zzb(zzbf zzbfVar, zzwk zzwkVar) {
        return zzo(zzbfVar.zzo(zzwkVar.zza, this.zzd).zzc, zzwkVar).zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzpo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(zzmy zzmyVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbf zzbfVar = zzmyVar.zzb;
            if (!zzbfVar.zzg()) {
                zzwk zzwkVar = zzmyVar.zzd;
                if (zzwkVar != null) {
                    long j2 = zzwkVar.zzd;
                    if (j2 == -1 || j2 >= zzi()) {
                        zzpe zzpeVar = (zzpe) this.zze.get(this.zzh);
                        if (zzpeVar == null || zzpeVar.zzg() != -1 || zzpeVar.zzf() == zzmyVar.zzc) {
                            int i2 = zzmyVar.zzc;
                            zzpe zzpeVarZzo = zzo(i2, zzwkVar);
                            if (this.zzh == null) {
                                this.zzh = zzpeVarZzo.zze();
                            }
                            if (zzwkVar != null && zzwkVar.zzb()) {
                                Object obj = zzwkVar.zza;
                                long j3 = zzwkVar.zzd;
                                int i3 = zzwkVar.zzb;
                                zzpe zzpeVarZzo2 = zzo(i2, new zzwk(obj, j3, i3));
                                if (!zzpeVarZzo2.zzi()) {
                                    zzpeVarZzo2.zzj(true);
                                    zzbd zzbdVar = this.zzd;
                                    zzbfVar.zzo(obj, zzbdVar);
                                    zzbdVar.zzc(i3);
                                    Math.max(0L, zzfj.zzp(0L) + zzfj.zzp(0L));
                                }
                            }
                            if (!zzpeVarZzo.zzi()) {
                                zzpeVarZzo.zzj(true);
                            }
                            if (zzpeVarZzo.zze().equals(this.zzh) && !zzpeVarZzo.zzk()) {
                                zzpeVarZzo.zzl(true);
                                this.zzf.zzc(zzmyVar, zzpeVarZzo.zze());
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zzd(zzmy zzmyVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbf zzbfVar = this.zzg;
            this.zzg = zzmyVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpe zzpeVar = (zzpe) it.next();
                if (!zzpeVar.zza(zzbfVar, this.zzg) || zzpeVar.zzd(zzmyVar)) {
                    it.remove();
                    if (zzpeVar.zze().equals(this.zzh)) {
                        zzm(zzpeVar);
                    }
                    if (zzpeVar.zzi()) {
                        this.zzf.zzd(zzmyVar, zzpeVar.zze(), false);
                    }
                }
            }
            zzl(zzmyVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zze(zzmy zzmyVar, int i2) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpe zzpeVar = (zzpe) it.next();
                if (zzpeVar.zzd(zzmyVar)) {
                    it.remove();
                    boolean zEquals = zzpeVar.zze().equals(this.zzh);
                    if (zEquals) {
                        zzm(zzpeVar);
                    }
                    if (zzpeVar.zzi()) {
                        boolean z2 = false;
                        if (i2 == 0 && zEquals && zzpeVar.zzk()) {
                            z2 = true;
                        }
                        this.zzf.zzd(zzmyVar, zzpeVar.zze(), z2);
                    }
                }
            }
            zzl(zzmyVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    @Nullable
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zzg(zzmy zzmyVar) {
        zzpn zzpnVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzpe zzpeVar = (zzpe) this.zze.get(str);
                if (zzpeVar == null) {
                    throw null;
                }
                zzm(zzpeVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpe zzpeVar2 = (zzpe) it.next();
                it.remove();
                if (zzpeVar2.zzi() && (zzpnVar = this.zzf) != null) {
                    zzpnVar.zzd(zzmyVar, zzpeVar2.zze(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }

    public zzpf(zzgru zzgruVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }

    private final void zzl(zzmy zzmyVar) {
        if (zzmyVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpe zzpeVar = (zzpe) this.zze.get(str);
                zzpeVar.getClass();
                zzm(zzpeVar);
                return;
            }
            return;
        }
        zzpe zzpeVar2 = (zzpe) this.zze.get(this.zzh);
        int i2 = zzmyVar.zzc;
        zzwk zzwkVar = zzmyVar.zzd;
        this.zzh = zzo(i2, zzwkVar).zze();
        zzc(zzmyVar);
        if (zzwkVar == null || !zzwkVar.zzb()) {
            return;
        }
        if (zzpeVar2 != null) {
            if (zzpeVar2.zzg() == zzwkVar.zzd && zzpeVar2.zzh() != null) {
                zzwk zzwkVarZzh = zzpeVar2.zzh();
                if (zzwkVarZzh.zzb == zzwkVar.zzb) {
                    zzwk zzwkVarZzh2 = zzpeVar2.zzh();
                    if (zzwkVarZzh2.zzc == zzwkVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i2, new zzwk(zzwkVar.zza, zzwkVar.zzd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpe zzpeVar = (zzpe) this.zze.get(this.zzh);
        return (zzpeVar == null || zzpeVar.zzg() == -1) ? this.zzi + 1 : zzpeVar.zzg();
    }

    private final zzpe zzo(int i2, @Nullable zzwk zzwkVar) {
        HashMap map = this.zze;
        long j2 = Long.MAX_VALUE;
        zzpe zzpeVar = null;
        for (zzpe zzpeVar2 : map.values()) {
            zzpeVar2.zzc(i2, zzwkVar);
            if (zzpeVar2.zzb(i2, zzwkVar)) {
                long jZzg = zzpeVar2.zzg();
                if (jZzg == -1 || jZzg < j2) {
                    zzpeVar = zzpeVar2;
                    j2 = jZzg;
                } else if (jZzg == j2) {
                    String str = zzfj.zza;
                    if (zzpeVar.zzh() != null && zzpeVar2.zzh() != null) {
                        zzpeVar = zzpeVar2;
                    }
                }
            }
        }
        if (zzpeVar != null) {
            return zzpeVar;
        }
        String strZzp = zzp();
        zzpe zzpeVar3 = new zzpe(this, strZzp, i2, zzwkVar);
        map.put(strZzp, zzpeVar3);
        return zzpeVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzm(zzpe zzpeVar) {
        if (zzpeVar.zzg() != -1 && zzpeVar.zzi()) {
            this.zzi = zzpeVar.zzg();
        }
        this.zzh = null;
    }
}
