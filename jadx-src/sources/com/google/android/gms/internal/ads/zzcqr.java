package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcqr implements zzcql {
    private final zzebf zza;

    zzcqr(zzebf zzebfVar) {
        this.zza = zzebfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzcql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        byte b2;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            b2 = (iHashCode == 109399814 && str.equals("shake")) ? (byte) 0 : (byte) -1;
        } else if (str.equals("flick")) {
            b2 = 1;
        }
        if (b2 == 0) {
            this.zza.zze(zzebb.SHAKE);
        } else if (b2 != 1) {
            this.zza.zze(zzebb.NONE);
        } else {
            this.zza.zze(zzebb.FLICK);
        }
    }
}
