package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzwu {
    public final int zza;

    @Nullable
    public final zzwk zzb;
    private final CopyOnWriteArrayList zzc;

    private zzwu(CopyOnWriteArrayList copyOnWriteArrayList, int i2, @Nullable zzwk zzwkVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzwkVar;
    }

    @CheckResult
    public final zzwu zza(int i2, @Nullable zzwk zzwkVar) {
        return new zzwu(this.zzc, 0, zzwkVar);
    }

    public zzwu() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void zzb(Handler handler, zzwv zzwvVar) {
        this.zzc.add(new zzwn(handler, zzwvVar));
    }

    public final void zzc(zzwv zzwvVar) {
        CopyOnWriteArrayList<zzwn> copyOnWriteArrayList = this.zzc;
        for (zzwn zzwnVar : copyOnWriteArrayList) {
            if (zzwnVar.zzb == zzwvVar) {
                copyOnWriteArrayList.remove(zzwnVar);
            }
        }
    }

    public final void zzd(final zzwb zzwbVar, final zzwg zzwgVar, final int i2) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwt
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwv) obj).zzai(0, this.zza.zzb, zzwbVar, zzwgVar, i2);
            }
        });
    }

    public final void zze(final zzwb zzwbVar, final zzwg zzwgVar) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwo
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwv) obj).zzaj(0, this.zza.zzb, zzwbVar, zzwgVar);
            }
        });
    }

    public final void zzf(final zzwb zzwbVar, final zzwg zzwgVar) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwp
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwv) obj).zzak(0, this.zza.zzb, zzwbVar, zzwgVar);
            }
        });
    }

    public final void zzg(final zzwb zzwbVar, final zzwg zzwgVar, final IOException iOException, final boolean z2) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwq
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwv) obj).zzal(0, this.zza.zzb, zzwbVar, zzwgVar, iOException, z2);
            }
        });
    }

    public final void zzh(final zzwg zzwgVar) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwr
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwv) obj).zzam(0, this.zza.zzb, zzwgVar);
            }
        });
    }

    public final void zzi(final zzdr zzdrVar) {
        for (zzwn zzwnVar : this.zzc) {
            final zzwv zzwvVar = zzwnVar.zzb;
            zzfj.zzd(zzwnVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzws
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdrVar.zza(zzwvVar);
                }
            });
        }
    }
}
