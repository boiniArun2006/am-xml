package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdor {
    public static final zzdor zza = new zzdor(new zzdoq());

    @Nullable
    private final zzblt zzb;

    @Nullable
    private final zzblq zzc;

    @Nullable
    private final zzbmg zzd;

    @Nullable
    private final zzbmd zze;

    @Nullable
    private final zzbrb zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    /* synthetic */ zzdor(zzdoq zzdoqVar, byte[] bArr) {
        this(zzdoqVar);
    }

    @Nullable
    public final zzblt zza() {
        return this.zzb;
    }

    @Nullable
    public final zzblq zzb() {
        return this.zzc;
    }

    @Nullable
    public final zzbmg zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzbmd zzd() {
        return this.zze;
    }

    @Nullable
    public final zzbrb zze() {
        return this.zzf;
    }

    private zzdor(zzdoq zzdoqVar) {
        this.zzb = zzdoqVar.zza;
        this.zzc = zzdoqVar.zzb;
        this.zzd = zzdoqVar.zzc;
        this.zzg = new SimpleArrayMap(zzdoqVar.zzf);
        this.zzh = new SimpleArrayMap(zzdoqVar.zzg);
        this.zze = zzdoqVar.zzd;
        this.zzf = zzdoqVar.zze;
    }

    @Nullable
    public final zzblz zzf(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (zzblz) this.zzg.get(str);
    }

    @Nullable
    public final zzblw zzg(String str) {
        return (zzblw) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        SimpleArrayMap simpleArrayMap = this.zzg;
        ArrayList arrayList = new ArrayList(simpleArrayMap.getSize());
        for (int i2 = 0; i2 < simpleArrayMap.getSize(); i2++) {
            arrayList.add((String) simpleArrayMap.xMQ(i2));
        }
        return arrayList;
    }
}
