package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zztw extends Handler {
    final /* synthetic */ zzty zza;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zztw(zzty zztyVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zztyVar);
        this.zza = zztyVar;
    }
}
