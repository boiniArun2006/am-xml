package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class UserRecoverableException extends Exception {
    private final Intent zza;

    @NonNull
    public Intent getIntent() {
        return new Intent(this.zza);
    }

    public UserRecoverableException(@NonNull String str, @NonNull Intent intent) {
        super(str);
        this.zza = intent;
    }
}
