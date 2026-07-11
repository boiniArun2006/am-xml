package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcjl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@VisibleForTesting
public final class zzj {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzj(zzcjl zzcjlVar) throws zzh {
        this.zzb = zzcjlVar.getLayoutParams();
        ViewParent parent = zzcjlVar.getParent();
        this.zzd = zzcjlVar.zzK();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzcjlVar.zzE());
            viewGroup.removeView(zzcjlVar.zzE());
            zzcjlVar.zzag(true);
            return;
        }
        throw new zzh("Could not get the parent of the WebView for an overlay.");
    }
}
