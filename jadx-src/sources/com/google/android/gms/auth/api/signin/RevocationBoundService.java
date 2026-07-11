package com.google.android.gms.auth.api.signin;

import P0j.rYHL.xkISd;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Deprecated
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        return (IBinder) xkISd.znghBdFtCjy.invoke(null, this, intent);
    }
}
