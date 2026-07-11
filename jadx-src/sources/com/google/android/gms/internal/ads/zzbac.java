package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbac {
    private List zza = Collections.EMPTY_LIST;

    public final void zza(List list) {
        this.zza = new ArrayList(list);
    }

    public final List zzb() {
        List list = this.zza;
        this.zza = Collections.EMPTY_LIST;
        return list;
    }
}
