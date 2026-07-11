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
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006("}, d2 = {"Lcom/alightcreative/app/motion/easing/ElasticEasing;", "Lcom/alightcreative/app/motion/easing/Easing;", "stepLength", "", "attack", "decay", "magnitude", "<init>", "(FFFF)V", "getStepLength", "()F", "getAttack", "getDecay", "getMagnitude", "basicElasticEase", "t", "interpolateWithoutAttack", "interpolate", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ElasticEasing implements Easing {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ElasticEasing DEFAULT = new ElasticEasing(0.25f, 1.0f, 0.5f, 1.0f);
    private final float attack;
    private final float decay;
    private final float magnitude;
    private final float stepLength;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/easing/ElasticEasing$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/alightcreative/app/motion/easing/ElasticEasing;", "getDEFAULT", "()Lcom/alightcreative/app/motion/easing/ElasticEasing;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ElasticEasing getDEFAULT() {
            return ElasticEasing.DEFAULT;
        }
    }

    public static /* synthetic */ ElasticEasing copy$default(ElasticEasing elasticEasing, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = elasticEasing.stepLength;
        }
        if ((i2 & 2) != 0) {
            f4 = elasticEasing.attack;
        }
        if ((i2 & 4) != 0) {
            f5 = elasticEasing.decay;
        }
        if ((i2 & 8) != 0) {
            f6 = elasticEasing.magnitude;
        }
        return elasticEasing.copy(f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStepLength() {
        return this.stepLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAttack() {
        return this.attack;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getDecay() {
        return this.decay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getMagnitude() {
        return this.magnitude;
    }

    public final ElasticEasing copy(float stepLength, float attack, float decay, float magnitude) {
        return new ElasticEasing(stepLength, attack, decay, magnitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElasticEasing)) {
            return false;
        }
        ElasticEasing elasticEasing = (ElasticEasing) other;
        return Float.compare(this.stepLength, elasticEasing.stepLength) == 0 && Float.compare(this.attack, elasticEasing.attack) == 0 && Float.compare(this.decay, elasticEasing.decay) == 0 && Float.compare(this.magnitude, elasticEasing.magnitude) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.stepLength) * 31) + Float.hashCode(this.attack)) * 31) + Float.hashCode(this.decay)) * 31) + Float.hashCode(this.magnitude);
    }

    public String toString() {
        return "ElasticEasing(stepLength=" + this.stepLength + ", attack=" + this.attack + ", decay=" + this.decay + ", magnitude=" + this.magnitude + ")";
    }

    private final float interpolateWithoutAttack(float t3) {
        float f3 = this.stepLength;
        if (t3 >= f3) {
            return 1.0f - (basicElasticEase(t3) * this.magnitude);
        }
        return QuaternionKt.mix(((1.0f - ((float) Math.cos((3.14159f * t3) / RangesKt.coerceAtLeast(this.stepLength, 0.01f)))) / 2.0f) * (1.0f - (basicElasticEase(f3) * this.magnitude)), 1.0f - (basicElasticEase(t3) * this.magnitude), (float) Math.pow(t3 / RangesKt.coerceAtLeast(this.stepLength, 0.01f), 3.0f));
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public ElasticEasing copyWithUpdatedHandle(String id, Vector2D position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        return Intrinsics.areEqual(id, "main") ? copy$default(this, RangesKt.coerceIn(position.getX() / (this.attack + 1.0f), 0.01f, 1.0f), 0.0f, RangesKt.coerceIn(position.getY(), 0.0f, 1.0f), 0.0f, 10, null) : Intrinsics.areEqual(id, "magnitude") ? copy$default(this, 0.0f, 0.0f, 0.0f, RangesKt.coerceIn(position.getY() - 1.0f, 0.0f, 1.0f), 7, null) : this;
    }

    public final float getAttack() {
        return this.attack;
    }

    public final float getDecay() {
        return this.decay;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public List<EasingHandle> getHandles() {
        Vector2D vector2D = new Vector2D(this.stepLength * (this.attack + 1.0f), this.decay);
        float f3 = this.stepLength;
        float f4 = this.attack;
        return CollectionsKt.listOf((Object[]) new EasingHandle[]{new EasingHandle("main", vector2D, new Vector2D((f4 + 1.0f) * f3, interpolate(f3 * (f4 + 1.0f))), false, 0.0f, new HandleStyle(2131099684, 2131099684, false), 24, null), new EasingHandle("magnitude", new Vector2D(0.0f, this.magnitude + 1.0f), new Vector2D(1.0f, this.magnitude + 1.0f), true, 0.0f, new HandleStyle(2131099684, 2131099684, false), 16, null)});
    }

    public final float getMagnitude() {
        return this.magnitude;
    }

    public final float getStepLength() {
        return this.stepLength;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public String serializeToString() {
        return "elastic " + this.stepLength + " " + this.attack + " " + this.decay + " " + this.magnitude;
    }

    public ElasticEasing(float f3, float f4, float f5, float f6) {
        this.stepLength = f3;
        this.attack = f4;
        this.decay = f5;
        this.magnitude = f6;
    }

    private final float basicElasticEase(float t3) {
        float fCos = (float) Math.cos((3.14159f * t3) / RangesKt.coerceAtLeast(this.stepLength, 0.01f));
        double dCoerceAtLeast = 1.0f - RangesKt.coerceAtLeast(t3, 0.005f);
        float f3 = this.decay;
        return fCos * Math.abs((float) Math.pow(dCoerceAtLeast, (f3 * f3 * 15.0f) + 1.0f));
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public float interpolate(float t3) {
        return interpolateWithoutAttack(t3);
    }
}
