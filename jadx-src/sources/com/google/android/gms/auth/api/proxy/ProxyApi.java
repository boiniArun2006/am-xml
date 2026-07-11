package com.google.android.gms.auth.api.proxy;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@ShowFirstParty
@KeepForSdk
public interface ProxyApi {

    @ShowFirstParty
    @KeepForSdk
    public interface ProxyResult extends Result {
        @NonNull
        @KeepForSdk
        ProxyResponse getResponse();
    }

    @ShowFirstParty
    @KeepForSdk
    public interface SpatulaHeaderResult extends Result {
        @NonNull
        @ShowFirstParty
        @KeepForSdk
        String getSpatulaHeader();
    }

    @NonNull
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    PendingResult<SpatulaHeaderResult> getSpatulaHeader(@NonNull GoogleApiClient googleApiClient);

    @NonNull
    @KeepForSdk
    @Deprecated
    PendingResult<ProxyResult> performProxyRequest(@NonNull GoogleApiClient googleApiClient, @NonNull ProxyRequest proxyRequest);
}
