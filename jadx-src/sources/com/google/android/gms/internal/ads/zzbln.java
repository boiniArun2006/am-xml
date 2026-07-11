package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbln {
    private final zzblm zza;

    public final zzblm zza() {
        return this.zza;
    }

    @VisibleForTesting
    public zzbln(zzblm zzblmVar) {
        Context context;
        this.zza = zzblmVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzblmVar.zzm());
        } catch (RemoteException | NullPointerException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
            }
        }
    }

    @Nullable
    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            return null;
        }
    }
}
