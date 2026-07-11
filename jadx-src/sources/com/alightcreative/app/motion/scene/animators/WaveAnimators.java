package com.alightcreative.app.motion.scene.animators;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.SimplexNoiseKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.internal.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/WaveAnimators;", "", "<init>", "()V", "Vector2DAnimatorSine", "Vector2DAnimatorTrangle", "Vector2DAnimatorRandom", "FloatAnimatorSine", "FloatAnimatorSineMult", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WaveAnimators {
    public static final int $stable = 0;

    @StabilityInferred
    @Id(id = "float.sine")
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/WaveAnimators$FloatAnimatorSine;", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOfFloat;", "frequency", "", "magnitude", "<init>", "(FF)V", "getFrequency", "()F", "getMagnitude", "animate", "value", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "(FLcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;)Ljava/lang/Float;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @AnimatorOfRotate
    public static final /* data */ class FloatAnimatorSine implements AnimatorOfFloat {
        public static final int $stable = 0;
        private final float frequency;
        private final float magnitude;

        /* JADX WARN: Illegal instructions before constructor call */
        public FloatAnimatorSine() {
            float f3 = 0.0f;
            this(f3, f3, 3, null);
        }

        public static /* synthetic */ FloatAnimatorSine copy$default(FloatAnimatorSine floatAnimatorSine, float f3, float f4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = floatAnimatorSine.frequency;
            }
            if ((i2 & 2) != 0) {
                f4 = floatAnimatorSine.magnitude;
            }
            return floatAnimatorSine.copy(f3, f4);
        }

        @Override // com.alightcreative.app.motion.scene.animators.Animator
        public /* bridge */ /* synthetic */ Float animate(Float f3, AnimatorEnvironment animatorEnvironment) {
            return animate(f3.floatValue(), animatorEnvironment);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getMagnitude() {
            return this.magnitude;
        }

        public final FloatAnimatorSine copy(float frequency, float magnitude) {
            return new FloatAnimatorSine(frequency, magnitude);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloatAnimatorSine)) {
                return false;
            }
            FloatAnimatorSine floatAnimatorSine = (FloatAnimatorSine) other;
            return Float.compare(this.frequency, floatAnimatorSine.frequency) == 0 && Float.compare(this.magnitude, floatAnimatorSine.magnitude) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.frequency) * 31) + Float.hashCode(this.magnitude);
        }

        public String toString() {
            return "FloatAnimatorSine(frequency=" + this.frequency + ", magnitude=" + this.magnitude + ")";
        }

        public FloatAnimatorSine(float f3, float f4) {
            this.frequency = f3;
            this.magnitude = f4;
        }

        public Float animate(float value, AnimatorEnvironment env) {
            Intrinsics.checkNotNullParameter(env, "env");
            return Float.valueOf(value + (this.magnitude * ((float) Math.sin(env.getTime() * this.frequency * 2.0f * ((float) env.getDurationInSeconds())))));
        }

        public final float getFrequency() {
            return this.frequency;
        }

        public final float getMagnitude() {
            return this.magnitude;
        }

        public /* synthetic */ FloatAnimatorSine(float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 20.0f : f3, (i2 & 2) != 0 ? 45.0f : f4);
        }
    }

    @StabilityInferred
    @Id(id = "float.sine.mult")
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/WaveAnimators$FloatAnimatorSineMult;", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOfFloat;", "frequency", "", l.aa, "high", "<init>", "(FFF)V", "getFrequency", "()F", "getLow", "getHigh", "animate", "value", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "(FLcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;)Ljava/lang/Float;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @AnimatorOfOpacity
    public static final /* data */ class FloatAnimatorSineMult implements AnimatorOfFloat {
        public static final int $stable = 0;

        @UIControlSlider(max = 5.0d, min = 0.05d, steps = 200)
        private final float frequency;

        @UIControlSlider(max = 1.0d, min = 0.0d, steps = 100)
        private final float high;

        @UIControlSlider(max = 1.0d, min = 0.0d, steps = 100)
        private final float low;

        public FloatAnimatorSineMult() {
            this(0.0f, 0.0f, 0.0f, 7, null);
        }

        public static /* synthetic */ FloatAnimatorSineMult copy$default(FloatAnimatorSineMult floatAnimatorSineMult, float f3, float f4, float f5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = floatAnimatorSineMult.frequency;
            }
            if ((i2 & 2) != 0) {
                f4 = floatAnimatorSineMult.low;
            }
            if ((i2 & 4) != 0) {
                f5 = floatAnimatorSineMult.high;
            }
            return floatAnimatorSineMult.copy(f3, f4, f5);
        }

        @Override // com.alightcreative.app.motion.scene.animators.Animator
        public /* bridge */ /* synthetic */ Float animate(Float f3, AnimatorEnvironment animatorEnvironment) {
            return animate(f3.floatValue(), animatorEnvironment);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getLow() {
            return this.low;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getHigh() {
            return this.high;
        }

        public final FloatAnimatorSineMult copy(float frequency, float low, float high) {
            return new FloatAnimatorSineMult(frequency, low, high);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloatAnimatorSineMult)) {
                return false;
            }
            FloatAnimatorSineMult floatAnimatorSineMult = (FloatAnimatorSineMult) other;
            return Float.compare(this.frequency, floatAnimatorSineMult.frequency) == 0 && Float.compare(this.low, floatAnimatorSineMult.low) == 0 && Float.compare(this.high, floatAnimatorSineMult.high) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.frequency) * 31) + Float.hashCode(this.low)) * 31) + Float.hashCode(this.high);
        }

        public String toString() {
            return "FloatAnimatorSineMult(frequency=" + this.frequency + ", low=" + this.low + ", high=" + this.high + ")";
        }

        public FloatAnimatorSineMult(float f3, float f4, float f5) {
            this.frequency = f3;
            this.low = f4;
            this.high = f5;
        }

        public Float animate(float value, AnimatorEnvironment env) {
            Intrinsics.checkNotNullParameter(env, "env");
            float f3 = this.low;
            return Float.valueOf(value * (f3 + (((this.high - f3) * (((float) Math.sin(((env.getTime() * this.frequency) * 2.0f) * ((float) env.getDurationInSeconds()))) + 1.0f)) / 2.0f)));
        }

        public final float getFrequency() {
            return this.frequency;
        }

        public final float getHigh() {
            return this.high;
        }

        public final float getLow() {
            return this.low;
        }

        public /* synthetic */ FloatAnimatorSineMult(float f3, float f4, float f5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2.0f : f3, (i2 & 2) != 0 ? 0.2f : f4, (i2 & 4) != 0 ? 0.8f : f5);
        }
    }

    @StabilityInferred
    @Id(id = "v2d.rnd")
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/WaveAnimators$Vector2DAnimatorRandom;", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOfVector2D;", "frequency", "", "magnitudeX", "magnitudeY", "<init>", "(FFF)V", "getFrequency", "()F", "getMagnitudeX", "getMagnitudeY", "animate", "Lcom/alightcreative/app/motion/scene/Vector2D;", "value", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @AnimatorOfLocation
    public static final /* data */ class Vector2DAnimatorRandom implements AnimatorOfVector2D {
        public static final int $stable = 0;

        @UILabel(resourceId = 2132019146)
        @UIControlSlider(max = 5.0d, min = 0.05d, steps = 200)
        private final float frequency;

        @UILabel(resourceId = 2132019554)
        @UIControlSlider(max = 300.0d, min = 0.0d, steps = d.f62986a)
        private final float magnitudeX;

        @UILabel(resourceId = 2132019555)
        @UIControlSlider(max = 300.0d, min = 0.0d, steps = d.f62986a)
        private final float magnitudeY;

        public Vector2DAnimatorRandom() {
            this(0.0f, 0.0f, 0.0f, 7, null);
        }

        public static /* synthetic */ Vector2DAnimatorRandom copy$default(Vector2DAnimatorRandom vector2DAnimatorRandom, float f3, float f4, float f5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = vector2DAnimatorRandom.frequency;
            }
            if ((i2 & 2) != 0) {
                f4 = vector2DAnimatorRandom.magnitudeX;
            }
            if ((i2 & 4) != 0) {
                f5 = vector2DAnimatorRandom.magnitudeY;
            }
            return vector2DAnimatorRandom.copy(f3, f4, f5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getMagnitudeX() {
            return this.magnitudeX;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getMagnitudeY() {
            return this.magnitudeY;
        }

        public final Vector2DAnimatorRandom copy(float frequency, float magnitudeX, float magnitudeY) {
            return new Vector2DAnimatorRandom(frequency, magnitudeX, magnitudeY);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Vector2DAnimatorRandom)) {
                return false;
            }
            Vector2DAnimatorRandom vector2DAnimatorRandom = (Vector2DAnimatorRandom) other;
            return Float.compare(this.frequency, vector2DAnimatorRandom.frequency) == 0 && Float.compare(this.magnitudeX, vector2DAnimatorRandom.magnitudeX) == 0 && Float.compare(this.magnitudeY, vector2DAnimatorRandom.magnitudeY) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.frequency) * 31) + Float.hashCode(this.magnitudeX)) * 31) + Float.hashCode(this.magnitudeY);
        }

        public String toString() {
            return "Vector2DAnimatorRandom(frequency=" + this.frequency + ", magnitudeX=" + this.magnitudeX + ", magnitudeY=" + this.magnitudeY + ")";
        }

        public Vector2DAnimatorRandom(float f3, float f4, float f5) {
            this.frequency = f3;
            this.magnitudeX = f4;
            this.magnitudeY = f5;
        }

        @Override // com.alightcreative.app.motion.scene.animators.Animator
        public Vector2D animate(Vector2D value, AnimatorEnvironment env) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(env, "env");
            return GeometryKt.plus(value, new Vector2D(this.magnitudeX * ((float) SimplexNoiseKt.simplexNoise(value.getX(), value.getY(), ((double) (env.getTime() * this.frequency)) * env.getDurationInSeconds(), 123.0d)), this.magnitudeY * ((float) SimplexNoiseKt.simplexNoise(value.getX(), value.getY(), ((double) (env.getTime() * this.frequency)) * env.getDurationInSeconds(), 456.0d))));
        }

        public final float getFrequency() {
            return this.frequency;
        }

        public final float getMagnitudeX() {
            return this.magnitudeX;
        }

        public final float getMagnitudeY() {
            return this.magnitudeY;
        }

        public /* synthetic */ Vector2DAnimatorRandom(float f3, float f4, float f5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 10.0f : f3, (i2 & 2) != 0 ? 50.0f : f4, (i2 & 4) != 0 ? 50.0f : f5);
        }
    }

    @StabilityInferred
    @Id(id = "v2d.sine")
    @UILabel(resourceId = 2132017252)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/WaveAnimators$Vector2DAnimatorSine;", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOfVector2D;", "frequencyX", "", "frequencyY", "magnitudeX", "magnitudeY", "<init>", "(FFFF)V", "getFrequencyX", "()F", "getFrequencyY", "getMagnitudeX", "getMagnitudeY", "animate", "Lcom/alightcreative/app/motion/scene/Vector2D;", "value", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @AnimatorOfLocation
    public static final /* data */ class Vector2DAnimatorSine implements AnimatorOfVector2D {
        public static final int $stable = 0;

        @UILabel(resourceId = 2132019150)
        @UIControlSlider(max = 5.0d, min = 0.05d, steps = 200)
        private final float frequencyX;

        @UILabel(resourceId = 2132019151)
        @UIControlSlider(max = 5.0d, min = 0.05d, steps = 200)
        private final float frequencyY;

        @UILabel(resourceId = 2132019554)
        @UIControlSlider(max = 300.0d, min = 0.0d, steps = d.f62986a)
        private final float magnitudeX;

        @UILabel(resourceId = 2132019555)
        @UIControlSlider(max = 300.0d, min = 0.0d, steps = d.f62986a)
        private final float magnitudeY;

        public Vector2DAnimatorSine() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        public static /* synthetic */ Vector2DAnimatorSine copy$default(Vector2DAnimatorSine vector2DAnimatorSine, float f3, float f4, float f5, float f6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = vector2DAnimatorSine.frequencyX;
            }
            if ((i2 & 2) != 0) {
                f4 = vector2DAnimatorSine.frequencyY;
            }
            if ((i2 & 4) != 0) {
                f5 = vector2DAnimatorSine.magnitudeX;
            }
            if ((i2 & 8) != 0) {
                f6 = vector2DAnimatorSine.magnitudeY;
            }
            return vector2DAnimatorSine.copy(f3, f4, f5, f6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getFrequencyX() {
            return this.frequencyX;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getFrequencyY() {
            return this.frequencyY;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getMagnitudeX() {
            return this.magnitudeX;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getMagnitudeY() {
            return this.magnitudeY;
        }

        public final Vector2DAnimatorSine copy(float frequencyX, float frequencyY, float magnitudeX, float magnitudeY) {
            return new Vector2DAnimatorSine(frequencyX, frequencyY, magnitudeX, magnitudeY);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Vector2DAnimatorSine)) {
                return false;
            }
            Vector2DAnimatorSine vector2DAnimatorSine = (Vector2DAnimatorSine) other;
            return Float.compare(this.frequencyX, vector2DAnimatorSine.frequencyX) == 0 && Float.compare(this.frequencyY, vector2DAnimatorSine.frequencyY) == 0 && Float.compare(this.magnitudeX, vector2DAnimatorSine.magnitudeX) == 0 && Float.compare(this.magnitudeY, vector2DAnimatorSine.magnitudeY) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.frequencyX) * 31) + Float.hashCode(this.frequencyY)) * 31) + Float.hashCode(this.magnitudeX)) * 31) + Float.hashCode(this.magnitudeY);
        }

        public String toString() {
            return "Vector2DAnimatorSine(frequencyX=" + this.frequencyX + ", frequencyY=" + this.frequencyY + ", magnitudeX=" + this.magnitudeX + ", magnitudeY=" + this.magnitudeY + ")";
        }

        public Vector2DAnimatorSine(float f3, float f4, float f5, float f6) {
            this.frequencyX = f3;
            this.frequencyY = f4;
            this.magnitudeX = f5;
            this.magnitudeY = f6;
        }

        @Override // com.alightcreative.app.motion.scene.animators.Animator
        public Vector2D animate(Vector2D value, AnimatorEnvironment env) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(env, "env");
            return GeometryKt.plus(value, new Vector2D(this.magnitudeX * ((float) Math.sin(((double) (env.getTime() * this.frequencyX * 2.0f)) * env.getDurationInSeconds())), this.magnitudeY * ((float) Math.sin(((double) (env.getTime() * this.frequencyY * 2.0f)) * env.getDurationInSeconds()))));
        }

        public final float getFrequencyX() {
            return this.frequencyX;
        }

        public final float getFrequencyY() {
            return this.frequencyY;
        }

        public final float getMagnitudeX() {
            return this.magnitudeX;
        }

        public final float getMagnitudeY() {
            return this.magnitudeY;
        }

        public /* synthetic */ Vector2DAnimatorSine(float f3, float f4, float f5, float f6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 5.0f : f3, (i2 & 2) != 0 ? 5.0f : f4, (i2 & 4) != 0 ? 10.0f : f5, (i2 & 8) != 0 ? 10.0f : f6);
        }
    }

    @StabilityInferred
    @Id(id = "v2d.tri")
    @UILabel(resourceId = 2132017253)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/WaveAnimators$Vector2DAnimatorTrangle;", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOfVector2D;", "frequencyX", "", "frequencyY", "magnitudeX", "magnitudeY", "<init>", "(FFFF)V", "getFrequencyX", "()F", "getFrequencyY", "getMagnitudeX", "getMagnitudeY", "animate", "Lcom/alightcreative/app/motion/scene/Vector2D;", "value", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @AnimatorOfLocation
    public static final /* data */ class Vector2DAnimatorTrangle implements AnimatorOfVector2D {
        public static final int $stable = 0;

        @UILabel(resourceId = 2132019150)
        @UIControlSlider(max = 5.0d, min = 0.05d, steps = 200)
        private final float frequencyX;

        @UILabel(resourceId = 2132019151)
        @UIControlSlider(max = 5.0d, min = 0.05d, steps = 200)
        private final float frequencyY;

        @UILabel(resourceId = 2132019554)
        @UIControlSlider(max = 300.0d, min = 0.0d, steps = d.f62986a)
        private final float magnitudeX;

        @UILabel(resourceId = 2132019555)
        @UIControlSlider(max = 300.0d, min = 0.0d, steps = d.f62986a)
        private final float magnitudeY;

        public Vector2DAnimatorTrangle() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        public static /* synthetic */ Vector2DAnimatorTrangle copy$default(Vector2DAnimatorTrangle vector2DAnimatorTrangle, float f3, float f4, float f5, float f6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = vector2DAnimatorTrangle.frequencyX;
            }
            if ((i2 & 2) != 0) {
                f4 = vector2DAnimatorTrangle.frequencyY;
            }
            if ((i2 & 4) != 0) {
                f5 = vector2DAnimatorTrangle.magnitudeX;
            }
            if ((i2 & 8) != 0) {
                f6 = vector2DAnimatorTrangle.magnitudeY;
            }
            return vector2DAnimatorTrangle.copy(f3, f4, f5, f6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getFrequencyX() {
            return this.frequencyX;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getFrequencyY() {
            return this.frequencyY;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getMagnitudeX() {
            return this.magnitudeX;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getMagnitudeY() {
            return this.magnitudeY;
        }

        public final Vector2DAnimatorTrangle copy(float frequencyX, float frequencyY, float magnitudeX, float magnitudeY) {
            return new Vector2DAnimatorTrangle(frequencyX, frequencyY, magnitudeX, magnitudeY);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Vector2DAnimatorTrangle)) {
                return false;
            }
            Vector2DAnimatorTrangle vector2DAnimatorTrangle = (Vector2DAnimatorTrangle) other;
            return Float.compare(this.frequencyX, vector2DAnimatorTrangle.frequencyX) == 0 && Float.compare(this.frequencyY, vector2DAnimatorTrangle.frequencyY) == 0 && Float.compare(this.magnitudeX, vector2DAnimatorTrangle.magnitudeX) == 0 && Float.compare(this.magnitudeY, vector2DAnimatorTrangle.magnitudeY) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.frequencyX) * 31) + Float.hashCode(this.frequencyY)) * 31) + Float.hashCode(this.magnitudeX)) * 31) + Float.hashCode(this.magnitudeY);
        }

        public String toString() {
            return "Vector2DAnimatorTrangle(frequencyX=" + this.frequencyX + ", frequencyY=" + this.frequencyY + ", magnitudeX=" + this.magnitudeX + ", magnitudeY=" + this.magnitudeY + ")";
        }

        public Vector2DAnimatorTrangle(float f3, float f4, float f5, float f6) {
            this.frequencyX = f3;
            this.frequencyY = f4;
            this.magnitudeX = f5;
            this.magnitudeY = f6;
        }

        @Override // com.alightcreative.app.motion.scene.animators.Animator
        public Vector2D animate(Vector2D value, AnimatorEnvironment env) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(env, "env");
            return GeometryKt.plus(value, new Vector2D(this.magnitudeX * WaveAnimatorsKt.triangle((float) (((double) (env.getTime() * this.frequencyX * 2.0f)) * env.getDurationInSeconds())), this.magnitudeY * WaveAnimatorsKt.triangle((float) (((double) (env.getTime() * this.frequencyY * 2.0f)) * env.getDurationInSeconds()))));
        }

        public final float getFrequencyX() {
            return this.frequencyX;
        }

        public final float getFrequencyY() {
            return this.frequencyY;
        }

        public final float getMagnitudeX() {
            return this.magnitudeX;
        }

        public final float getMagnitudeY() {
            return this.magnitudeY;
        }

        public /* synthetic */ Vector2DAnimatorTrangle(float f3, float f4, float f5, float f6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 5.0f : f3, (i2 & 2) != 0 ? 5.0f : f4, (i2 & 4) != 0 ? 10.0f : f5, (i2 & 8) != 0 ? 10.0f : f6);
        }
    }
}
