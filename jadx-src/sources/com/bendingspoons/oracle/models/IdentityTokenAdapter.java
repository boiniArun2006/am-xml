package com.bendingspoons.oracle.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.ToJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/bendingspoons/oracle/models/IdentityTokenAdapter;", "", "<init>", "()V", "fromJson", "Lcom/bendingspoons/oracle/models/IdentityToken;", "token", "", "toJson", "value", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IdentityTokenAdapter {
    @FromJson
    public final IdentityToken fromJson(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        try {
            return IdentityToken.INSTANCE.rl(token);
        } catch (Exception e2) {
            throw new JsonDataException("Failed to decode IdentityToken: " + e2.getMessage());
        }
    }

    @ToJson
    public final String toJson(IdentityToken value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.getToken();
    }
}
