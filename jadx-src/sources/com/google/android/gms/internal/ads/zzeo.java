package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class zzeo extends BroadcastReceiver {
    final /* synthetic */ zzep zza;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("ilyqJfhIV7CDnDL2", new Object[]{this, context, intent});
    }

    /* synthetic */ zzeo(zzep zzepVar, byte[] bArr) {
        Objects.requireNonNull(zzepVar);
        this.zza = zzepVar;
    }
}
