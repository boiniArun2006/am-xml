package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcct implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzccw zza;
    private final String zzb;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzccw zzccwVar = this.zza;
        synchronized (zzccwVar) {
            try {
                Iterator it = zzccwVar.zzd().iterator();
                while (it.hasNext()) {
                    ((zzccu) it.next()).zza(sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzcct(zzccw zzccwVar, String str) {
        Objects.requireNonNull(zzccwVar);
        this.zza = zzccwVar;
        this.zzb = str;
    }
}
