package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zaf<R extends Result> extends BasePendingResult<R> {
    private final Result zae;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R createFailedResult(Status status) {
        if (status.getStatusCode() == this.zae.getStatus().getStatusCode()) {
            return (R) this.zae;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }

    public zaf(Result result) {
        super(Looper.getMainLooper());
        this.zae = result;
    }
}
