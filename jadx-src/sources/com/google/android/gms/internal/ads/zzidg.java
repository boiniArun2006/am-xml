package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzidg implements zzidu {
    private final zzidc zza;
    private final zzief zzb;
    private final boolean zzc;
    private final zzibc zzd;

    private zzidg(zzief zziefVar, zzibc zzibcVar, zzidc zzidcVar) {
        this.zzb = zziefVar;
        this.zzc = zzidcVar instanceof zzibn;
        this.zzd = zzibcVar;
        this.zza = zzidcVar;
    }

    static zzidg zzh(zzief zziefVar, zzibc zzibcVar, zzidc zzidcVar) {
        return new zzidg(zziefVar, zzibcVar, zzidcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zzibr) obj).zzt.equals(((zzibr) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzibn) obj).zza.equals(((zzibn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zzc(Object obj) {
        int iHashCode = ((zzibr) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzibn) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zze(Object obj) {
        int iZzh = ((zzibr) obj).zzt.zzh();
        return this.zzc ? iZzh + ((zzibn) obj).zza.zzg() : iZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzf(Object obj, zzieu zzieuVar) throws IOException {
        Iterator itZzc = ((zzibn) obj).zza.zzc();
        while (itZzc.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzc.next();
            zzibf zzibfVar = (zzibf) entry.getKey();
            if (zzibfVar.zzc() != zziet.MESSAGE || zzibfVar.zzd() || zzibfVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzicj) {
                zzieuVar.zzv(zzibfVar.zza(), ((zzicj) entry).zza().zzc());
            } else {
                zzieuVar.zzv(zzibfVar.zza(), entry.getValue());
            }
        }
        ((zzibr) obj).zzt.zzf(zzieuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzj(Object obj, byte[] bArr, int i2, int i3, zziab zziabVar) throws IOException {
        zzibr zzibrVar = (zzibr) obj;
        if (zzibrVar.zzt == zzieg.zza()) {
            zzibrVar.zzt = zzieg.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final Object zza() {
        zzidc zzidcVar = this.zza;
        return zzidcVar instanceof zzibr ? ((zzibr) zzidcVar).zzbg() : zzidcVar.zzcY().zzbt();
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzd(Object obj, Object obj2) {
        zzidw.zzI(this.zzb, obj, obj2);
        if (this.zzc) {
            zzidw.zzH(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzg(Object obj, zzidp zzidpVar, zzibb zzibbVar) throws IOException {
        this.zzb.zzh(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzk(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final boolean zzl(Object obj) {
        return ((zzibn) obj).zza.zze();
    }
}
