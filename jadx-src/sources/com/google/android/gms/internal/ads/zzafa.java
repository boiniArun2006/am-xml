package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface zzafa {
    zzaeu[] zza();

    default zzaeu[] zzb(Uri uri, Map map) {
        return zza();
    }
}
