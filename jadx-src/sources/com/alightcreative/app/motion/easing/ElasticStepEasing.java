package com.alightcreative.app.motion.easing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006!"}, d2 = {"Lcom/alightcreative/app/motion/easing/ElasticStepEasing;", "Lcom/alightcreative/app/motion/easing/Easing;", "stepLength", "", "magnitude", "<init>", "(FF)V", "getStepLength", "()F", "getMagnitude", "unscaledInterpolate", "t", "interpolate", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ElasticStepEasing implements Easing {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ElasticStepEasing DEFAULT = new ElasticStepEasing(0.2f, 0.5f);
    private final float magnitude;
    private final float stepLength;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/easing/ElasticStepEasing$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/alightcreative/app/motion/easing/ElasticStepEasing;", "getDEFAULT", "()Lcom/alightcreative/app/motion/easing/ElasticStepEasing;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ElasticStepEasing getDEFAULT() {
            return ElasticStepEasing.DEFAULT;
        }
    }

    public static /* synthetic */ ElasticStepEasing copy$default(ElasticStepEasing elasticStepEasing, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = elasticStepEasing.stepLength;
        }
        if ((i2 & 2) != 0) {
            f4 = elasticStepEasing.magnitude;
        }
        return elasticStepEasing.copy(f3, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStepLength() {
        return this.stepLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMagnitude() {
        return this.magnitude;
    }

    public final ElasticStepEasing copy(float stepLength, float magnitude) {
        return new ElasticStepEasing(stepLength, magnitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElasticStepEasing)) {
            return false;
        }
        ElasticStepEasing elasticStepEasing = (ElasticStepEasing) other;
        return Float.compare(this.stepLength, elasticStepEasing.stepLength) == 0 && Float.compare(this.magnitude, elasticStepEasing.magnitude) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.stepLength) * 31) + Float.hashCode(this.magnitude);
    }

    public String toString() {
        return "ElasticStepEasing(stepLength=" + this.stepLength + ", magnitude=" + this.magnitude + ")";
    }

    private final float unscaledInterpolate(float t3) {
        if (t3 < this.stepLength) {
            return 0.0f;
        }
        float f3 = this.magnitude;
        ElasticEasing elasticEasing = new ElasticEasing(0.5f - (0.45f * f3), 1.0f, 1.0f - (f3 * 0.5f), ((1.0f - f3) * 0.5f) + 0.5f);
        float f4 = this.stepLength;
        return (t3 - (t3 % f4)) + (f4 * (elasticEasing.interpolate((t3 % f4) / f4) - 1.0f));
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public ElasticStepEasing copyWithUpdatedHandle(String id, Vector2D position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        return Intrinsics.areEqual(id, "main") ? copy$default(this, RangesKt.coerceIn(position.getX(), 0.0f, 1.0f), 0.0f, 2, null) : Intrinsics.areEqual(id, "magnitude") ? copy$default(this, 0.0f, RangesKt.coerceIn(position.getY(), 0.0f, 1.0f), 1, null) : this;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public List<EasingHandle> getHandles() {
        EasingHandle easingHandle = new EasingHandle("main", new Vector2D(this.stepLength, 0.0f), null, false, 0.0f, new HandleStyle(2131099684, 2131099755, false), 28, null);
        Vector2D vector2D = new Vector2D(1.0f, this.magnitude);
        float f3 = this.stepLength;
        return CollectionsKt.listOf((Object[]) new EasingHandle[]{easingHandle, new EasingHandle("magnitude", vector2D, new Vector2D(2.0f * f3, f3), false, 0.0f, null, 56, null)});
    }

    public final float getMagnitude() {
        return this.magnitude;
    }

    public final float getStepLength() {
        return this.stepLength;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public String serializeToString() {
        return "elasticStep " + this.stepLength + " " + this.magnitude;
    }

    public ElasticStepEasing(float f3, float f4) {
        this.stepLength = f3;
        this.magnitude = f4;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public float interpolate(float t3) {
        return unscaledInterpolate(t3);
    }
}
