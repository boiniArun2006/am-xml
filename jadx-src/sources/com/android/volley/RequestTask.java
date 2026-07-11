package com.android.volley;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class RequestTask<T> implements Runnable {
    final Request<T> mRequest;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public int compareTo(RequestTask<?> requestTask) {
        return this.mRequest.compareTo((Request) requestTask.mRequest);
    }

    public RequestTask(Request<T> request) {
        this.mRequest = request;
    }
}
