package com.alightcreative.app.motion.easing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.QuaternionKt;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006-"}, d2 = {"Lcom/alightcreative/app/motion/easing/CyclicEasing;", "Lcom/alightcreative/app/motion/easing/Easing;", "stepLength", "", "sharpness", "skew", "decay", "reserved", "<init>", "(FFFFF)V", "getStepLength", "()F", "getSharpness", "getSkew", "getDecay", "getReserved", "pctInStep", "t", "cosInterp", "sawInterp", "skewInterp", "interpolate", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCyclicEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CyclicEasing.kt\ncom/alightcreative/app/motion/easing/CyclicEasing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final /* data */ class CyclicEasing implements Easing {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CyclicEasing DEFAULT = new CyclicEasing(0.2857143f, 0.0f, 0.5f, 0.0f, 0.0f);
    private final float decay;
    private final float reserved;
    private final float sharpness;
    private final float skew;
    private final float stepLength;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/easing/CyclicEasing$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/alightcreative/app/motion/easing/CyclicEasing;", "getDEFAULT", "()Lcom/alightcreative/app/motion/easing/CyclicEasing;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CyclicEasing getDEFAULT() {
            return CyclicEasing.DEFAULT;
        }
    }

    public static /* synthetic */ CyclicEasing copy$default(CyclicEasing cyclicEasing, float f3, float f4, float f5, float f6, float f7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = cyclicEasing.stepLength;
        }
        if ((i2 & 2) != 0) {
            f4 = cyclicEasing.sharpness;
        }
        if ((i2 & 4) != 0) {
            f5 = cyclicEasing.skew;
        }
        if ((i2 & 8) != 0) {
            f6 = cyclicEasing.decay;
        }
        if ((i2 & 16) != 0) {
            f7 = cyclicEasing.reserved;
        }
        float f8 = f7;
        float f9 = f5;
        return cyclicEasing.copy(f3, f4, f9, f6, f8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStepLength() {
        return this.stepLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSharpness() {
        return this.sharpness;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getSkew() {
        return this.skew;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getDecay() {
        return this.decay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getReserved() {
        return this.reserved;
    }

    public final CyclicEasing copy(float stepLength, float sharpness, float skew, float decay, float reserved) {
        return new CyclicEasing(stepLength, sharpness, skew, decay, reserved);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CyclicEasing)) {
            return false;
        }
        CyclicEasing cyclicEasing = (CyclicEasing) other;
        return Float.compare(this.stepLength, cyclicEasing.stepLength) == 0 && Float.compare(this.sharpness, cyclicEasing.sharpness) == 0 && Float.compare(this.skew, cyclicEasing.skew) == 0 && Float.compare(this.decay, cyclicEasing.decay) == 0 && Float.compare(this.reserved, cyclicEasing.reserved) == 0;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.stepLength) * 31) + Float.hashCode(this.sharpness)) * 31) + Float.hashCode(this.skew)) * 31) + Float.hashCode(this.decay)) * 31) + Float.hashCode(this.reserved);
    }

    public String toString() {
        return "CyclicEasing(stepLength=" + this.stepLength + ", sharpness=" + this.sharpness + ", skew=" + this.skew + ", decay=" + this.decay + ", reserved=" + this.reserved + ")";
    }

    private final float cosInterp(float t3) {
        return 1.0f - ((((float) Math.cos(((t3 / RangesKt.coerceAtLeast(this.stepLength, 0.001f)) * 3.14159f) * 2.0f)) + 1.0f) / 2.0f);
    }

    private final float pctInStep(float t3) {
        return (t3 % RangesKt.coerceAtLeast(this.stepLength, 0.001f)) / RangesKt.coerceAtLeast(this.stepLength, 0.001f);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.alightcreative.app.motion.easing.Easing
    public CyclicEasing copyWithUpdatedHandle(String id, Vector2D position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        switch (id.hashCode()) {
            case -1571105471:
                return !id.equals("sharpness") ? this : copy$default(this, 0.0f, RangesKt.coerceIn(position.getX() / RangesKt.coerceAtLeast(this.stepLength, 0.001f), 0.0f, 1.0f), 0.0f, 0.0f, 0.0f, 29, null);
            case 3532042:
                return !id.equals("skew") ? this : copy$default(this, 0.0f, 0.0f, RangesKt.coerceIn(position.getX(), 0.0f, this.stepLength) / RangesKt.coerceAtLeast(this.stepLength, 0.001f), 0.0f, 0.0f, 27, null);
            case 3540684:
                return !id.equals("step") ? this : copy$default(this, RangesKt.coerceIn(position.getX(), 0.0f, 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
            case 95459258:
                return !id.equals("decay") ? this : copy$default(this, 0.0f, 0.0f, 0.0f, RangesKt.coerceIn(position.getY(), 0.0f, 1.0f), 0.0f, 23, null);
            default:
                return this;
        }
    }

    public final float getDecay() {
        return this.decay;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public List<EasingHandle> getHandles() {
        return CollectionsKt.listOf((Object[]) new EasingHandle[]{new EasingHandle("step", new Vector2D(this.stepLength, 0.0f), new Vector2D(this.stepLength, 0.0f), false, 0.0f, new HandleStyle(2131099684, 2131099755, false), 24, null), new EasingHandle("sharpness", new Vector2D(this.sharpness * this.stepLength, 1.5f), new Vector2D(this.skew * this.stepLength, 1.0f), false, 0.0f, null, 56, null), new EasingHandle("skew", new Vector2D(this.skew * this.stepLength, 1.0f), null, false, 0.0f, new HandleStyle(2131099684, 2131099755, false), 28, null), new EasingHandle("decay", new Vector2D(1.0f, this.decay), new Vector2D(0.0f, 0.0f), false, 0.0f, null, 56, null)});
    }

    public final float getReserved() {
        return this.reserved;
    }

    public final float getSharpness() {
        return this.sharpness;
    }

    public final float getSkew() {
        return this.skew;
    }

    public final float getStepLength() {
        return this.stepLength;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public String serializeToString() {
        return "cyclic " + this.stepLength + " " + this.sharpness + " " + this.skew + " " + this.decay + " " + this.reserved;
    }

    public CyclicEasing(float f3, float f4, float f5, float f6, float f7) {
        this.stepLength = f3;
        this.sharpness = f4;
        this.skew = f5;
        this.decay = f6;
        this.reserved = f7;
    }

    private final float sawInterp(float t3) {
        return 1.0f - (Math.abs(pctInStep(t3) - 0.5f) * 2.0f);
    }

    private final float skewInterp(float t3) {
        float fPctInStep = pctInStep(t3);
        float f3 = this.skew;
        float f4 = 0.5f;
        if (fPctInStep < f3) {
            f4 = (0.5f * fPctInStep) / f3;
        } else if (fPctInStep > f3) {
            f4 = 0.5f + (((fPctInStep - f3) / (1.0f - f3)) / 2.0f);
        }
        float f5 = this.stepLength;
        return (t3 - (fPctInStep * f5)) + (f5 * f4);
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public float interpolate(float t3) {
        float fSkewInterp = skewInterp(t3);
        float fMix = QuaternionKt.mix(cosInterp(fSkewInterp), sawInterp(fSkewInterp), this.sharpness);
        float fCoerceAtLeast = t3 - (t3 % RangesKt.coerceAtLeast(this.stepLength, 0.001f));
        float f3 = this.stepLength;
        if ((f3 / 4.0f) + fCoerceAtLeast > 1.0f) {
            fMix = 0.0f;
        } else if ((f3 / 2.0f) + fCoerceAtLeast < 1.0f && fCoerceAtLeast + ((f3 * 3.0f) / 4.0f) > 1.0f && pctInStep(t3) > this.skew) {
            fMix = 1.0f;
        }
        float f4 = this.decay;
        return (fMix * (1.0f - (t3 * f4))) + (t3 * f4);
    }
}
