package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzahp {
    public static long zza(String str) {
        zzaho zzahoVarZzb = zzb(str);
        return zzahoVarZzb.zza().longValue() - zzahoVarZzb.zzb().longValue();
    }

    @NonNull
    private static zzaho zzb(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = zzv.zza('.').zza((CharSequence) str);
        if (listZza.size() >= 2) {
            try {
                return zzaho.zza(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), C.UTF8_NAME));
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("Unable to decode token", e2);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}
