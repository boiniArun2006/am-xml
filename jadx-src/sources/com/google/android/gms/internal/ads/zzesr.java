package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzesr implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final zzfjk zzc;

    @Nullable
    private final View zzd;

    public zzesr(zzgzy zzgzyVar, Context context, zzfjk zzfjkVar, @Nullable ViewGroup viewGroup) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = zzfjkVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        zzbhe.zza(this.zzb);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzesq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzess zzc() {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzess(this.zzb, this.zzc.zzf, arrayList);
    }
}
