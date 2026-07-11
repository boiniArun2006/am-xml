package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaft {
    private static final Map<String, zzafv> zza = new ArrayMap();

    public static PhoneAuthProvider.j zza(String str, PhoneAuthProvider.j jVar, @Nullable zzaex zzaexVar) {
        zza(str, zzaexVar);
        return new zzafs(jVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, @Nullable zzaex zzaexVar) {
        zza.put(str, new zzafv(zzaexVar, DefaultClock.getInstance().currentTimeMillis()));
    }

    public static boolean zza(String str, PhoneAuthProvider.j jVar, @Nullable Activity activity, Executor executor) {
        Map<String, zzafv> map = zza;
        if (map.containsKey(str)) {
            zzafv zzafvVar = map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzafvVar.zzb < 120000) {
                zzaex zzaexVar = zzafvVar.zza;
                if (zzaexVar == null) {
                    return true;
                }
                zzaexVar.zza(jVar, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
