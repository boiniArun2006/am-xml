package com.alightcreative.ext;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.Timestamp;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/ext/TimestampAdapter;", "", "<init>", "()V", "fromJson", "Lcom/google/firebase/Timestamp;", "json", "", "", "toJson", StatsEvent.f62824A, "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimestampAdapter {
    @FromJson
    public final Timestamp fromJson(Map<String, ? extends Object> json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object obj = json.get("seconds");
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            return null;
        }
        long jLongValue = number.longValue();
        Object obj2 = json.get("nanoseconds");
        Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
        if (number2 != null) {
            return new Timestamp(jLongValue, number2.intValue());
        }
        return null;
    }

    @ToJson
    public final Map<String, Object> toJson(Timestamp timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return MapsKt.mapOf(TuplesKt.to("seconds", Long.valueOf(timestamp.getSeconds())), TuplesKt.to("nanoseconds", Integer.valueOf(timestamp.getNanoseconds())));
    }
}
