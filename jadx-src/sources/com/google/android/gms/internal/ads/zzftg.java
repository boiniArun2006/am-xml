package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzftg extends zzftj {
    private static final zzftg zzb = new zzftg();

    private zzftg() {
    }

    public static zzftg zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final boolean zzb() {
        Iterator it = zzfth.zza().zzf().iterator();
        while (it.hasNext()) {
            View viewZzi = ((zzfsn) it.next()).zzi();
            if (viewZzi != null && viewZzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final void zzc(boolean z2) {
        Iterator it = zzfth.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfsn) it.next()).zzg().zzf(z2);
        }
    }
}
