package com.google.android.gms.internal.location;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzbj {
    public static Looper zza(@Nullable Looper looper) {
        return looper != null ? looper : zzb();
    }

    public static Looper zzb() {
        boolean z2;
        if (Looper.myLooper() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
