package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationStatusCodes;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzax extends zzaj {
    private BaseImplementation.ResultHolder<Status> zza;

    private final void zze(int i2) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.zza.setResult(LocationStatusCodes.zzb(LocationStatusCodes.zza(i2)));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i2, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    public zzax(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i2, String[] strArr) {
        zze(i2);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i2, PendingIntent pendingIntent) {
        zze(i2);
    }
}
