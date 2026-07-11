package com.alightcreative.app.motion.easing;

import HI0.vd;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006 "}, d2 = {"Lcom/alightcreative/app/motion/easing/StepEasing;", "Lcom/alightcreative/app/motion/easing/Easing;", "stepLength", "", "smoothing", "<init>", "(FF)V", "getStepLength", "()F", "getSmoothing", "interpolate", "t", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepEasing implements Easing {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final StepEasing DEFAULT = new StepEasing(0.25f, 0.0f);
    private final float smoothing;
    private final float stepLength;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/easing/StepEasing$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/alightcreative/app/motion/easing/StepEasing;", "getDEFAULT", "()Lcom/alightcreative/app/motion/easing/StepEasing;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StepEasing getDEFAULT() {
            return StepEasing.DEFAULT;
        }
    }

    public static /* synthetic */ StepEasing copy$default(StepEasing stepEasing, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = stepEasing.stepLength;
        }
        if ((i2 & 2) != 0) {
            f4 = stepEasing.smoothing;
        }
        return stepEasing.copy(f3, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStepLength() {
        return this.stepLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSmoothing() {
        return this.smoothing;
    }

    public final StepEasing copy(float stepLength, float smoothing) {
        return new StepEasing(stepLength, smoothing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepEasing)) {
            return false;
        }
        StepEasing stepEasing = (StepEasing) other;
        return Float.compare(this.stepLength, stepEasing.stepLength) == 0 && Float.compare(this.smoothing, stepEasing.smoothing) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.stepLength) * 31) + Float.hashCode(this.smoothing);
    }

    public String toString() {
        return "StepEasing(stepLength=" + this.stepLength + ", smoothing=" + this.smoothing + ")";
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public StepEasing copyWithUpdatedHandle(String id, Vector2D position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        if (Intrinsics.areEqual(id, "main")) {
            return copy$default(this, RangesKt.coerceIn(position.getX(), 0.0f, 1.0f), 0.0f, 2, null);
        }
        if (!Intrinsics.areEqual(id, "smooth")) {
            return this;
        }
        float x2 = position.getX();
        float f3 = this.stepLength;
        return copy$default(this, 0.0f, RangesKt.coerceIn((x2 - f3) / f3, 0.0f, 1.0f), 1, null);
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public List<EasingHandle> getHandles() {
        Vector2D vector2D = new Vector2D(this.stepLength, 0.0f);
        float f3 = this.stepLength;
        EasingHandle easingHandle = new EasingHandle("main", vector2D, new Vector2D(f3, f3), false, 0.0f, new HandleStyle(2131099684, 2131099769, false), 24, null);
        float f4 = this.stepLength;
        Vector2D vector2D2 = new Vector2D(f4 + (this.smoothing * f4), 1.0f);
        float f5 = this.stepLength;
        return CollectionsKt.listOf((Object[]) new EasingHandle[]{easingHandle, new EasingHandle("smooth", vector2D2, new Vector2D(f5, f5), false, 0.0f, null, 56, null)});
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    public final float getStepLength() {
        return this.stepLength;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public float interpolate(float t3) {
        float f3 = this.stepLength;
        return (t3 - (t3 % f3)) + (vd.t(f3 - (this.smoothing * f3), f3, t3 % f3) * this.stepLength);
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public String serializeToString() {
        return "step " + this.stepLength + " " + this.smoothing;
    }

    public StepEasing(float f3, float f4) {
        this.stepLength = f3;
        this.smoothing = f4;
    }
}
