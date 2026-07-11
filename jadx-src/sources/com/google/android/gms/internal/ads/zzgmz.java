package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgmz {
    private final Set zza;
    private final zzgnq zzb;

    zzgmz(zzgnq zzgnqVar, Set set) {
        this.zza = set;
        this.zzb = zzgnqVar;
    }

    public final void zza(List list) {
        this.zzb.zza(list);
    }

    public final Map zzb() {
        HashMap map = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgnb) it.next()).zzb(map);
        }
        return map;
    }

    public final Map zzc(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgnb) it.next()).zzc(map, context, view);
        }
        return map;
    }

    public final Map zzd() {
        HashMap map = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgnb) it.next()).zzd(map);
        }
        return map;
    }
}
