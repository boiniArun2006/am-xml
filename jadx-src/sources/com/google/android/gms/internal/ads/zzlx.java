package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzlx implements zzwv, zztk {
    final /* synthetic */ zzmc zza;
    private final zzlz zzb;

    @Nullable
    private final Pair zzf(int i2, @Nullable zzwk zzwkVar) {
        zzwk zzwkVarZza;
        zzwk zzwkVar2 = null;
        if (zzwkVar != null) {
            zzlz zzlzVar = this.zzb;
            int i3 = 0;
            while (true) {
                List list = zzlzVar.zzc;
                if (i3 >= list.size()) {
                    zzwkVarZza = null;
                    break;
                }
                if (((zzwk) list.get(i3)).zzd == zzwkVar.zzd) {
                    Object obj = zzwkVar.zza;
                    Object obj2 = zzlzVar.zzb;
                    int i5 = zzmj.zzb;
                    zzwkVarZza = zzwkVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i3++;
            }
            if (zzwkVarZza == null) {
                return null;
            }
            zzwkVar2 = zzwkVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzwkVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzai(int i2, @Nullable zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final int i3) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar, i3);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzaj(int i2, @Nullable zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzls
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzaj(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzak(int i2, @Nullable zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzal(int i2, @Nullable zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final IOException iOException, final boolean z2) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar, iOException, z2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzam(int i2, @Nullable zzwk zzwkVar, final zzwg zzwgVar) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwgVar);
                }
            });
        }
    }

    public zzlx(zzmc zzmcVar, zzlz zzlzVar) {
        Objects.requireNonNull(zzmcVar);
        this.zza = zzmcVar;
        this.zzb = zzlzVar;
    }
}
