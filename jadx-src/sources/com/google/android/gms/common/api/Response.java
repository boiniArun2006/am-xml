package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    @NonNull
    protected T getResult() {
        return (T) this.zza;
    }

    public void setResult(@NonNull T t3) {
        this.zza = t3;
    }

    protected Response(@NonNull T t3) {
        this.zza = t3;
    }
}
