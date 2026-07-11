package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzccw {

    @GuardedBy
    private final Map zza = new HashMap();

    @GuardedBy
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzccj zzd;

    final synchronized void zza(zzccu zzccuVar) {
        this.zzb.add(zzccuVar);
    }

    final synchronized void zzb(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzcct zzcctVar = new zzcct(this, str);
            map.put(str, zzcctVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcctVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ List zzd() {
        return this.zzb;
    }

    zzccw(Context context, zzccj zzccjVar) {
        this.zzc = context;
        this.zzd = zzccjVar;
    }

    final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }
}
