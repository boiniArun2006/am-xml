package com.google.android.gms.auth.api.proxy;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@ShowFirstParty
@KeepForSdk
public interface ProxyClient extends HasApiKey<AuthProxyOptions> {
    @NonNull
    @KeepForSdk
    Task<String> getSpatulaHeader();

    @NonNull
    @KeepForSdk
    Task<ProxyResponse> performProxyRequest(@NonNull ProxyRequest proxyRequest);
}
