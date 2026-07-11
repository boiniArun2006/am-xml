package com.vungle.ads.internal.util;

import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C;
import kotlinx.serialization.json.Dsr;
import kotlinx.serialization.json.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/util/JsonUtil;", "", "<init>", "()V", "Lkotlinx/serialization/json/nKK;", "json", "", "key", "getContentStringValue", "(Lkotlinx/serialization/json/nKK;Ljava/lang/String;)Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JsonUtil {
    public static final JsonUtil INSTANCE = new JsonUtil();

    public final String getContentStringValue(nKK json, String key) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return C.mUb((Dsr) MapsKt.getValue(json, key)).t();
        } catch (Exception unused) {
            return null;
        }
    }

    private JsonUtil() {
    }
}
