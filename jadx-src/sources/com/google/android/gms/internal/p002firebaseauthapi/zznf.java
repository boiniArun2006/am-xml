package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zznf implements zzbx {
    private final SharedPreferences.Editor zza;
    private final String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbx
    public final void zza(zzvq zzvqVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzzr.zza(zzvqVar.zzk())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public zznf(Context context, String str, String str2) {
        if (str != null) {
            this.zzb = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbx
    public final void zza(zzxc zzxcVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzzr.zza(zzxcVar.zzk())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
