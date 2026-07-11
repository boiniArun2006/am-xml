package com.bendingspoons.pico.domain.uploader.internal.network.retrofit;

import com.bendingspoons.pico.domain.entities.network.PicoNetworkUser;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/bendingspoons/pico/domain/uploader/internal/network/retrofit/PicoNetworkUserAdapter;", "", "<init>", "()V", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkUser;", "picoNetworkUser", "", "", "toJson", "(Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkUser;)Ljava/util/Map;", c.f62177j, "j", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PicoNetworkUserAdapter {
    private static final Moshi rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final JsonAdapter f51507t;

    static {
        Moshi moshiBuild = new Moshi.Builder().build();
        rl = moshiBuild;
        f51507t = moshiBuild.adapter(PicoNetworkUser.class);
    }

    @ToJson
    public final Map<String, Object> toJson(PicoNetworkUser picoNetworkUser) {
        Intrinsics.checkNotNullParameter(picoNetworkUser, "picoNetworkUser");
        Object jsonValue = f51507t.toJsonValue(picoNetworkUser);
        Intrinsics.checkNotNull(jsonValue, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map<String, Object> mutableMap = MapsKt.toMutableMap((Map) jsonValue);
        Object obj = mutableMap.get("info");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map mutableMap2 = MapsKt.toMutableMap((Map) obj);
        Object obj2 = mutableMap.get("additional_info");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        mutableMap2.putAll((Map) obj2);
        mutableMap.put("info", mutableMap2);
        mutableMap.remove("additional_info");
        return mutableMap;
    }
}
