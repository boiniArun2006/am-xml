package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzwd extends zzvy {
    public static final Object zzc = new Object();

    @Nullable
    private final Object zzd;

    @Nullable
    private final Object zze;

    public static zzwd zzq(zzbf zzbfVar, @Nullable Object obj, @Nullable Object obj2) {
        return new zzwd(zzbfVar, obj, obj2);
    }

    public final zzwd zzr(zzbf zzbfVar) {
        return new zzwd(zzbfVar, this.zzd, this.zze);
    }

    final /* synthetic */ Object zzs() {
        return this.zze;
    }

    public static zzwd zzp(zzak zzakVar) {
        return new zzwd(new zzwe(zzakVar), zzbe.zza, zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i2, zzbe zzbeVar, long j2) {
        this.zzb.zzb(i2, zzbeVar, j2);
        if (Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i2, zzbd zzbdVar, boolean z2) {
        this.zzb.zzd(i2, zzbdVar, z2);
        if (Objects.equals(zzbdVar.zzb, this.zze) && z2) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i2) {
        Object objZzf = this.zzb.zzf(i2);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    private zzwd(zzbf zzbfVar, @Nullable Object obj, @Nullable Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }
}
