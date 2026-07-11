package com.bendingspoons.injet.webbridge;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001a*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001bB\u001d\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/bendingspoons/injet/webbridge/InjetNativeFunctionOutput;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "type", "data", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/bendingspoons/injet/webbridge/InjetNativeFunctionOutput;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Ljava/lang/Object;", "getData", "Companion", "j", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InjetNativeFunctionOutput<T> {
    public static final int $stable = 0;
    private final T data;
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InjetNativeFunctionOutput copy$default(InjetNativeFunctionOutput injetNativeFunctionOutput, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = injetNativeFunctionOutput.type;
        }
        if ((i2 & 2) != 0) {
            obj = injetNativeFunctionOutput.data;
        }
        return injetNativeFunctionOutput.copy(str, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final T component2() {
        return this.data;
    }

    public final InjetNativeFunctionOutput<T> copy(@Json(name = "type") String type, @Json(name = "data") T data) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new InjetNativeFunctionOutput<>(type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InjetNativeFunctionOutput)) {
            return false;
        }
        InjetNativeFunctionOutput injetNativeFunctionOutput = (InjetNativeFunctionOutput) other;
        return Intrinsics.areEqual(this.type, injetNativeFunctionOutput.type) && Intrinsics.areEqual(this.data, injetNativeFunctionOutput.data);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        T t3 = this.data;
        return iHashCode + (t3 == null ? 0 : t3.hashCode());
    }

    public String toString() {
        return "InjetNativeFunctionOutput(type=" + this.type + ", data=" + this.data + ")";
    }

    public InjetNativeFunctionOutput(@Json(name = "type") String type, @Json(name = "data") T t3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.data = t3;
    }

    public final T getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }
}
