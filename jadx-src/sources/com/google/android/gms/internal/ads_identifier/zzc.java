package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;

    private zzc() {
    }

    static {
        zzc.class.getClassLoader();
    }

    public static boolean zza(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
