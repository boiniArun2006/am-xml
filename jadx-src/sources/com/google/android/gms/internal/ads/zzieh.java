package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzieh extends zzief {
    zzieh() {
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* synthetic */ Object zzf() {
        return zzieg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zza(Object obj, int i2, long j2) {
        ((zzieg) obj).zzk(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i2, int i3) {
        ((zzieg) obj).zzk((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i2, long j2) {
        ((zzieg) obj).zzk((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i2, zzian zzianVar) {
        ((zzieg) obj).zzk((i2 << 3) | 2, zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ void zze(Object obj, int i2, Object obj2) {
        ((zzieg) obj).zzk((i2 << 3) | 3, (zzieg) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* synthetic */ Object zzg(Object obj) {
        zzieg zziegVar = (zzieg) obj;
        zziegVar.zzd();
        return zziegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zziegVarZzb = zzieg.zzb();
        zzibrVar.zzt = zziegVarZzb;
        return zziegVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzibr) obj).zzt = (zzieg) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final void zzj(Object obj) {
        ((zzibr) obj).zzt.zzd();
    }
}
