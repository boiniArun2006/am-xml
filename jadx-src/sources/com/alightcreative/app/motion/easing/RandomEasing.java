package com.alightcreative.app.motion.easing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.QuaternionKt;
import com.alightcreative.app.motion.scene.SimplexNoiseKt;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006,"}, d2 = {"Lcom/alightcreative/app/motion/easing/RandomEasing;", "Lcom/alightcreative/app/motion/easing/Easing;", "frequency", "", "magnitude", "seed", "attenuation", "warp", "tilt", "<init>", "(FFFFFF)V", "getFrequency", "()F", "getMagnitude", "getSeed", "getAttenuation", "getWarp", "getTilt", "interpolate", "t", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RandomEasing implements Easing {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RandomEasing DEFAULT = new RandomEasing(0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.0f);
    private final float attenuation;
    private final float frequency;
    private final float magnitude;
    private final float seed;
    private final float tilt;
    private final float warp;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/easing/RandomEasing$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/alightcreative/app/motion/easing/RandomEasing;", "getDEFAULT", "()Lcom/alightcreative/app/motion/easing/RandomEasing;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RandomEasing getDEFAULT() {
            return RandomEasing.DEFAULT;
        }
    }

    public static /* synthetic */ RandomEasing copy$default(RandomEasing randomEasing, float f3, float f4, float f5, float f6, float f7, float f8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = randomEasing.frequency;
        }
        if ((i2 & 2) != 0) {
            f4 = randomEasing.magnitude;
        }
        if ((i2 & 4) != 0) {
            f5 = randomEasing.seed;
        }
        if ((i2 & 8) != 0) {
            f6 = randomEasing.attenuation;
        }
        if ((i2 & 16) != 0) {
            f7 = randomEasing.warp;
        }
        if ((i2 & 32) != 0) {
            f8 = randomEasing.tilt;
        }
        float f9 = f7;
        float f10 = f8;
        return randomEasing.copy(f3, f4, f5, f6, f9, f10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMagnitude() {
        return this.magnitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getSeed() {
        return this.seed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getAttenuation() {
        return this.attenuation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getWarp() {
        return this.warp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getTilt() {
        return this.tilt;
    }

    public final RandomEasing copy(float frequency, float magnitude, float seed, float attenuation, float warp, float tilt) {
        return new RandomEasing(frequency, magnitude, seed, attenuation, warp, tilt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RandomEasing)) {
            return false;
        }
        RandomEasing randomEasing = (RandomEasing) other;
        return Float.compare(this.frequency, randomEasing.frequency) == 0 && Float.compare(this.magnitude, randomEasing.magnitude) == 0 && Float.compare(this.seed, randomEasing.seed) == 0 && Float.compare(this.attenuation, randomEasing.attenuation) == 0 && Float.compare(this.warp, randomEasing.warp) == 0 && Float.compare(this.tilt, randomEasing.tilt) == 0;
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.frequency) * 31) + Float.hashCode(this.magnitude)) * 31) + Float.hashCode(this.seed)) * 31) + Float.hashCode(this.attenuation)) * 31) + Float.hashCode(this.warp)) * 31) + Float.hashCode(this.tilt);
    }

    public String toString() {
        return "RandomEasing(frequency=" + this.frequency + ", magnitude=" + this.magnitude + ", seed=" + this.seed + ", attenuation=" + this.attenuation + ", warp=" + this.warp + ", tilt=" + this.tilt + ")";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.alightcreative.app.motion.easing.Easing
    public Easing copyWithUpdatedHandle(String id, Vector2D position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        switch (id.hashCode()) {
            case -1407247598:
                if (id.equals("attmag")) {
                    return copy$default(this, 0.0f, 1.0f - RangesKt.coerceIn((position.getY() - position.getX()) / 0.4f, -1.0f, 1.0f), 0.0f, 1.0f - ((RangesKt.coerceIn(position.getX(), 0.15f, 0.85f) - 0.15f) / 0.7f), 0.0f, 0.0f, 53, null);
                }
                return this;
            case 3151480:
                return !id.equals("freq") ? this : copy$default(this, 1.0f - (RangesKt.coerceIn(position.getX(), 0.0f, 1.0f) / 0.8f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 62, null);
            case 3526257:
                return !id.equals("seed") ? this : copy$default(this, 0.0f, 0.0f, RangesKt.coerceIn(position.getY(), 0.0f, 1.0f), 0.0f, 0.0f, 0.0f, 59, null);
            case 3560125:
                return !id.equals("tilt") ? this : copy$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f - RangesKt.coerceIn(position.getY(), 0.0f, 1.0f), 31, null);
            case 3641992:
                return !id.equals("warp") ? this : copy$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f - RangesKt.coerceIn(position.getX(), 0.0f, 1.0f), 0.0f, 47, null);
            default:
                return this;
        }
    }

    public final float getAttenuation() {
        return this.attenuation;
    }

    public final float getFrequency() {
        return this.frequency;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public List<EasingHandle> getHandles() {
        EasingHandle easingHandle = new EasingHandle("seed", new Vector2D(0.0f, this.seed), new Vector2D(0.0f, 1.0f), false, 0.0f, new HandleStyle(2131099684, 2131099684, true), 24, null);
        Vector2D vector2D = new Vector2D(((1.0f - this.attenuation) * 0.7f) + 0.15f, 0.0f);
        return CollectionsKt.listOf((Object[]) new EasingHandle[]{easingHandle, new EasingHandle("attmag", new Vector2D(vector2D.getX(), vector2D.getX() + ((1.0f - this.magnitude) * 0.4f)), null, false, 0.0f, new HandleStyle(2131099684, 2131099684, false), 28, null), new EasingHandle("freq", new Vector2D((1.0f - this.frequency) * 0.8f, 1.0f), null, false, 0.0f, new HandleStyle(2131099684, 2131099684, false), 28, null), new EasingHandle("tilt", new Vector2D(1.0f, 1.0f - this.tilt), null, false, 0.0f, new HandleStyle(2131099755, 2131099755, false), 28, null), new EasingHandle("warp", new Vector2D(1.0f - this.warp, 0.0f), null, false, 0.0f, new HandleStyle(2131099684, 2131099684, false), 28, null)});
    }

    public final float getMagnitude() {
        return this.magnitude;
    }

    public final float getSeed() {
        return this.seed;
    }

    public final float getTilt() {
        return this.tilt;
    }

    public final float getWarp() {
        return this.warp;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public float interpolate(float t3) {
        float fAbs = 1.0f - Math.abs(1.0f - this.magnitude);
        float f3 = (t3 * 2.0f) - 1.0f;
        double d2 = 3.0f;
        float fPow = ((1.0f - ((float) Math.pow(Math.abs(f3), d2))) * ((float) SimplexNoiseKt.simplexNoise(this.frequency * 30.0f * t3, ((double) this.seed) * 10.0d)) * fAbs) + ((1.0f - ((float) Math.pow(Math.abs(f3), d2))) * ((float) SimplexNoiseKt.simplexNoise(this.frequency * 60.0f * t3, (((double) this.seed) * 10.0d) + 23453.234534d)) * fAbs * 0.5f);
        float fAbs2 = Math.abs(this.attenuation - 0.5f) * 2.0f;
        float f4 = this.attenuation;
        float fMix = f4 > 0.5f ? QuaternionKt.mix(1.0f, 1.0f - t3, fAbs2) : f4 < 0.5f ? QuaternionKt.mix(1.0f, t3, fAbs2) : 1.0f;
        float fAbs3 = Math.abs(this.warp - 0.5f) * 2.0f;
        float f5 = this.warp;
        if (f5 < 0.5f) {
            t3 = (float) Math.pow(t3, (fAbs3 * 5.0f) + 1.0f);
        } else if (f5 > 0.5f) {
            t3 = 1.0f - ((float) Math.pow(1.0f - t3, (fAbs3 * 5.0f) + 1.0f));
        }
        return QuaternionKt.mix(t3, 1.0f - t3, this.tilt) + (fPow * fMix * fMix);
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public String serializeToString() {
        return "random " + this.frequency + " " + this.magnitude + " " + this.seed + " " + this.attenuation + " " + this.warp + " " + this.tilt;
    }

    public RandomEasing(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.frequency = f3;
        this.magnitude = f4;
        this.seed = f5;
        this.attenuation = f6;
        this.warp = f7;
        this.tilt = f8;
    }
}
