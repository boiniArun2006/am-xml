package com.alightcreative.app.motion.easing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006 "}, d2 = {"Lcom/alightcreative/app/motion/easing/BounceEasing;", "Lcom/alightcreative/app/motion/easing/Easing;", "firstStepLength", "", "bounciness", "<init>", "(FF)V", "getFirstStepLength", "()F", "getBounciness", "interpolate", "t", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBounceEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BounceEasing.kt\ncom/alightcreative/app/motion/easing/BounceEasing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final /* data */ class BounceEasing implements Easing {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final BounceEasing DEFAULT = new BounceEasing(0.3f, 0.8f);
    private final float bounciness;
    private final float firstStepLength;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/easing/BounceEasing$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/alightcreative/app/motion/easing/BounceEasing;", "getDEFAULT", "()Lcom/alightcreative/app/motion/easing/BounceEasing;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BounceEasing getDEFAULT() {
            return BounceEasing.DEFAULT;
        }
    }

    public static /* synthetic */ BounceEasing copy$default(BounceEasing bounceEasing, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = bounceEasing.firstStepLength;
        }
        if ((i2 & 2) != 0) {
            f4 = bounceEasing.bounciness;
        }
        return bounceEasing.copy(f3, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getFirstStepLength() {
        return this.firstStepLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getBounciness() {
        return this.bounciness;
    }

    public final BounceEasing copy(float firstStepLength, float bounciness) {
        return new BounceEasing(firstStepLength, bounciness);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BounceEasing)) {
            return false;
        }
        BounceEasing bounceEasing = (BounceEasing) other;
        return Float.compare(this.firstStepLength, bounceEasing.firstStepLength) == 0 && Float.compare(this.bounciness, bounceEasing.bounciness) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.firstStepLength) * 31) + Float.hashCode(this.bounciness);
    }

    public String toString() {
        return "BounceEasing(firstStepLength=" + this.firstStepLength + ", bounciness=" + this.bounciness + ")";
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public BounceEasing copyWithUpdatedHandle(String id, Vector2D position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        return Intrinsics.areEqual(id, "main") ? copy((RangesKt.coerceIn(position.getX(), 0.0f, 1.0f) * 2.0f) / (this.bounciness + 1.0f), 1.0f - RangesKt.coerceIn(position.getY(), 0.0f, 1.0f)) : this;
    }

    public final float getBounciness() {
        return this.bounciness;
    }

    public final float getFirstStepLength() {
        return this.firstStepLength;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public List<EasingHandle> getHandles() {
        float f3 = this.firstStepLength;
        float f4 = this.bounciness;
        return CollectionsKt.listOf(new EasingHandle("main", new Vector2D((f3 + (f3 * f4)) / 2.0f, 1.0f - f4), null, false, 0.85f, new HandleStyle(2131099684, 2131099684, false), 12, null));
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public float interpolate(float t3) {
        float f3 = this.firstStepLength;
        float f4 = t3 + (f3 / 2.0f);
        float f5 = 0.0f;
        if (f3 == 0.0f) {
            return 1.0f;
        }
        float f6 = 1.0f;
        while (true) {
            float f7 = f5 + f3;
            if (f4 <= f7) {
                float f8 = (f3 / 3.0f) + f5;
                float f9 = this.firstStepLength;
                if (f8 > (f9 / 2.0f) + 1.0f || (f3 < 0.1d && f7 > (f9 / 2.0f) + 1.0f)) {
                    return 1.0f;
                }
                return (((float) Math.pow(Math.abs((((f4 - f5) / f3) - 0.5f) * 2.0f), 2.0f)) * f6) + (1.0f - f6);
            }
            float f10 = this.bounciness;
            f3 *= f10;
            f6 *= f10;
            if (f6 < 0.005f) {
                return 1.0f;
            }
            f5 = f7;
        }
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public String serializeToString() {
        return "bounce " + this.firstStepLength + " " + this.bounciness;
    }

    public BounceEasing(float f3, float f4) {
        this.firstStepLength = f3;
        this.bounciness = f4;
    }
}
