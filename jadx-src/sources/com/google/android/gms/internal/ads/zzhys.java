package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzhys {
    public abstract void zza(zzhzs zzhzsVar, Object obj) throws IOException;

    public final zzhys zzc() {
        return !(this instanceof zzhyr) ? new zzhyr(this, null) : this;
    }
}
