package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class zzbdc extends BroadcastReceiver {
    final /* synthetic */ zzbdg zza;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("ypAzx4HX6z3ykvva", new Object[]{this, context, intent});
    }

    zzbdc(zzbdg zzbdgVar) {
        Objects.requireNonNull(zzbdgVar);
        this.zza = zzbdgVar;
    }
}
