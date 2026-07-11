package com.bendingspoons.spidersense.domain.network.entities.sampling;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SpiderSenseServerSettings;", "", "sendNextBatchInterval", "", "rules", "", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity;", "<init>", "(FLjava/util/List;)V", "getSendNextBatchInterval", "()F", "getRules", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SpiderSenseServerSettings {
    public static final int $stable = 8;
    private final List<SamplingRuleEntity> rules;
    private final float sendNextBatchInterval;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpiderSenseServerSettings copy$default(SpiderSenseServerSettings spiderSenseServerSettings, float f3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = spiderSenseServerSettings.sendNextBatchInterval;
        }
        if ((i2 & 2) != 0) {
            list = spiderSenseServerSettings.rules;
        }
        return spiderSenseServerSettings.copy(f3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getSendNextBatchInterval() {
        return this.sendNextBatchInterval;
    }

    public final List<SamplingRuleEntity> component2() {
        return this.rules;
    }

    public final SpiderSenseServerSettings copy(@Json(name = "send_next_batch_interval") float sendNextBatchInterval, @Json(name = "rules") List<? extends SamplingRuleEntity> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        return new SpiderSenseServerSettings(sendNextBatchInterval, rules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpiderSenseServerSettings)) {
            return false;
        }
        SpiderSenseServerSettings spiderSenseServerSettings = (SpiderSenseServerSettings) other;
        return Float.compare(this.sendNextBatchInterval, spiderSenseServerSettings.sendNextBatchInterval) == 0 && Intrinsics.areEqual(this.rules, spiderSenseServerSettings.rules);
    }

    public int hashCode() {
        return (Float.hashCode(this.sendNextBatchInterval) * 31) + this.rules.hashCode();
    }

    public String toString() {
        return "SpiderSenseServerSettings(sendNextBatchInterval=" + this.sendNextBatchInterval + ", rules=" + this.rules + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpiderSenseServerSettings(@Json(name = "send_next_batch_interval") float f3, @Json(name = "rules") List<? extends SamplingRuleEntity> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.sendNextBatchInterval = f3;
        this.rules = rules;
    }

    public final List<SamplingRuleEntity> getRules() {
        return this.rules;
    }

    public final float getSendNextBatchInterval() {
        return this.sendNextBatchInterval;
    }
}
