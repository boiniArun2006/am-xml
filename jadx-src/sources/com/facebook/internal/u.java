package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f52819n = new u();
    private static final ConcurrentHashMap rl = new ConcurrentHashMap();

    public static final JSONObject n(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return (JSONObject) rl.get(accessToken);
    }

    public static final void rl(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        rl.put(key, value);
    }

    private u() {
    }
}
