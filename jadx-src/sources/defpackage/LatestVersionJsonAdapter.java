package defpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.ToJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"LLatestVersionJsonAdapter;", "", "<init>", "()V", "fromJson", "LLatestVersion;", "json", "LLatestVersionJson;", "toJson", "value", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LatestVersionJsonAdapter {
    public static final int $stable = 0;

    @FromJson
    public final LatestVersion fromJson(LatestVersionJson json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(json.getBuildNative(), "latest")) {
            return new LatestVersion(json.getBuildUrl(), json.getSignature());
        }
        throw new JsonDataException("Expected 'build_native' to be 'latest', but got '" + json.getBuildNative() + "'");
    }

    @ToJson
    public final LatestVersionJson toJson(LatestVersion value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new LatestVersionJson("latest", value.getWebAppUrl(), value.getSignature());
    }
}
