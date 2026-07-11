package com.alightcreative.app.motion.scene.animators;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.SimplexNoiseKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/ColorAnimators;", "", "<init>", "()V", "ColorAnimatorSine", "SolidColorAnimatorRandom", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ColorAnimators {
    public static final int $stable = 0;

    @StabilityInferred
    @Id(id = "color.sine")
    @UILabel(resourceId = 2132017252)
    @AnimatorOfColor
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/ColorAnimators$ColorAnimatorSine;", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOfSolidColor;", "frequencyR", "", "frequencyG", "frequencyB", "magnitudeR", "magnitudeG", "magnitudeB", "<init>", "(FFFFFF)V", "getFrequencyR", "()F", "getFrequencyG", "getFrequencyB", "getMagnitudeR", "getMagnitudeG", "getMagnitudeB", "animate", "Lcom/alightcreative/app/motion/scene/SolidColor;", "value", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ColorAnimatorSine implements AnimatorOfSolidColor {
        public static final int $stable = 0;

        @UILabel(resourceId = 2132019147)
        @UIControlSlider(max = 10.0d, min = 0.05d, steps = 200)
        private final float frequencyB;

        @UILabel(resourceId = 2132019148)
        @UIControlSlider(max = 10.0d, min = 0.05d, steps = 200)
        private final float frequencyG;

        @UILabel(resourceId = 2132019149)
        @UIControlSlider(max = 10.0d, min = 0.05d, steps = 200)
        private final float frequencyR;

        @UILabel(resourceId = 2132019551)
        @UIControlSlider(max = 1.0d, min = 0.0d, steps = 256)
        private final float magnitudeB;

        @UILabel(resourceId = 2132019552)
        @UIControlSlider(max = 1.0d, min = 0.0d, steps = 256)
        private final float magnitudeG;

        @UILabel(resourceId = 2132019553)
        @UIControlSlider(max = 1.0d, min = 0.0d, steps = 256)
        private final float magnitudeR;

        public ColorAnimatorSine() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, null);
        }

        public static /* synthetic */ ColorAnimatorSine copy$default(ColorAnimatorSine colorAnimatorSine, float f3, float f4, float f5, float f6, float f7, float f8, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = colorAnimatorSine.frequencyR;
            }
            if ((i2 & 2) != 0) {
                f4 = colorAnimatorSine.frequencyG;
            }
            if ((i2 & 4) != 0) {
                f5 = colorAnimatorSine.frequencyB;
            }
            if ((i2 & 8) != 0) {
                f6 = colorAnimatorSine.magnitudeR;
            }
            if ((i2 & 16) != 0) {
                f7 = colorAnimatorSine.magnitudeG;
            }
            if ((i2 & 32) != 0) {
                f8 = colorAnimatorSine.magnitudeB;
            }
            float f9 = f7;
            float f10 = f8;
            return colorAnimatorSine.copy(f3, f4, f5, f6, f9, f10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getFrequencyR() {
            return this.frequencyR;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getFrequencyG() {
            return this.frequencyG;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getFrequencyB() {
            return this.frequencyB;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getMagnitudeR() {
            return this.magnitudeR;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getMagnitudeG() {
            return this.magnitudeG;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getMagnitudeB() {
            return this.magnitudeB;
        }

        public final ColorAnimatorSine copy(float frequencyR, float frequencyG, float frequencyB, float magnitudeR, float magnitudeG, float magnitudeB) {
            return new ColorAnimatorSine(frequencyR, frequencyG, frequencyB, magnitudeR, magnitudeG, magnitudeB);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorAnimatorSine)) {
                return false;
            }
            ColorAnimatorSine colorAnimatorSine = (ColorAnimatorSine) other;
            return Float.compare(this.frequencyR, colorAnimatorSine.frequencyR) == 0 && Float.compare(this.frequencyG, colorAnimatorSine.frequencyG) == 0 && Float.compare(this.frequencyB, colorAnimatorSine.frequencyB) == 0 && Float.compare(this.magnitudeR, colorAnimatorSine.magnitudeR) == 0 && Float.compare(this.magnitudeG, colorAnimatorSine.magnitudeG) == 0 && Float.compare(this.magnitudeB, colorAnimatorSine.magnitudeB) == 0;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.frequencyR) * 31) + Float.hashCode(this.frequencyG)) * 31) + Float.hashCode(this.frequencyB)) * 31) + Float.hashCode(this.magnitudeR)) * 31) + Float.hashCode(this.magnitudeG)) * 31) + Float.hashCode(this.magnitudeB);
        }

        public String toString() {
            return "ColorAnimatorSine(frequencyR=" + this.frequencyR + ", frequencyG=" + this.frequencyG + ", frequencyB=" + this.frequencyB + ", magnitudeR=" + this.magnitudeR + ", magnitudeG=" + this.magnitudeG + ", magnitudeB=" + this.magnitudeB + ")";
        }

        public ColorAnimatorSine(float f3, float f4, float f5, float f6, float f7, float f8) {
            this.frequencyR = f3;
            this.frequencyG = f4;
            this.frequencyB = f5;
            this.magnitudeR = f6;
            this.magnitudeG = f7;
            this.magnitudeB = f8;
        }

        @Override // com.alightcreative.app.motion.scene.animators.Animator
        public SolidColor animate(SolidColor value, AnimatorEnvironment env) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(env, "env");
            return new SolidColor(value.getR() + (this.magnitudeR * ((float) Math.sin(((double) (env.getTime() * this.frequencyR * 2.0f)) * env.getDurationInSeconds()))), value.getG() + (this.magnitudeG * ((float) Math.sin(((double) (env.getTime() * this.frequencyG * 2.0f)) * env.getDurationInSeconds()))), value.getB() + (this.magnitudeB * ((float) Math.sin(((double) (env.getTime() * this.frequencyB * 2.0f)) * env.getDurationInSeconds()))), value.getA());
        }

        public final float getFrequencyB() {
            return this.frequencyB;
        }

        public final float getFrequencyG() {
            return this.frequencyG;
        }

        public final float getFrequencyR() {
            return this.frequencyR;
        }

        public final float getMagnitudeB() {
            return this.magnitudeB;
        }

        public final float getMagnitudeG() {
            return this.magnitudeG;
        }

        public final float getMagnitudeR() {
            return this.magnitudeR;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ColorAnimatorSine(float r2, float r3, float r4, float r5, float r6, float r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L7
                r2 = 1045220557(0x3e4ccccd, float:0.2)
            L7:
                r9 = r8 & 2
                if (r9 == 0) goto Le
                r3 = 1058642330(0x3f19999a, float:0.6)
            Le:
                r9 = r8 & 4
                if (r9 == 0) goto L15
                r4 = 1067869798(0x3fa66666, float:1.3)
            L15:
                r9 = r8 & 8
                r0 = 1092616192(0x41200000, float:10.0)
                if (r9 == 0) goto L1c
                r5 = r0
            L1c:
                r9 = r8 & 16
                if (r9 == 0) goto L21
                r6 = r0
            L21:
                r8 = r8 & 32
                if (r8 == 0) goto L2d
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L34
            L2d:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L34:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alightcreative.app.motion.scene.animators.ColorAnimators.ColorAnimatorSine.<init>(float, float, float, float, float, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @StabilityInferred
    @Id(id = "color.rnd")
    @AnimatorOfColor
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/ColorAnimators$SolidColorAnimatorRandom;", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOfSolidColor;", "frequency", "", "magnitudeR", "magnitudeG", "magnitudeB", "<init>", "(FFFF)V", "getFrequency", "()F", "getMagnitudeR", "getMagnitudeG", "getMagnitudeB", "animate", "Lcom/alightcreative/app/motion/scene/SolidColor;", "value", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SolidColorAnimatorRandom implements AnimatorOfSolidColor {
        public static final int $stable = 0;

        @UILabel(resourceId = 2132019146)
        @UIControlSlider(max = 10.0d, min = 0.05d, steps = 200)
        private final float frequency;

        @UILabel(resourceId = 2132019551)
        @UIControlSlider(max = 1.0d, min = 0.0d, steps = 256)
        private final float magnitudeB;

        @UILabel(resourceId = 2132019552)
        @UIControlSlider(max = 1.0d, min = 0.0d, steps = 256)
        private final float magnitudeG;

        @UILabel(resourceId = 2132019553)
        @UIControlSlider(max = 1.0d, min = 0.0d, steps = 256)
        private final float magnitudeR;

        public SolidColorAnimatorRandom() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }

        public static /* synthetic */ SolidColorAnimatorRandom copy$default(SolidColorAnimatorRandom solidColorAnimatorRandom, float f3, float f4, float f5, float f6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = solidColorAnimatorRandom.frequency;
            }
            if ((i2 & 2) != 0) {
                f4 = solidColorAnimatorRandom.magnitudeR;
            }
            if ((i2 & 4) != 0) {
                f5 = solidColorAnimatorRandom.magnitudeG;
            }
            if ((i2 & 8) != 0) {
                f6 = solidColorAnimatorRandom.magnitudeB;
            }
            return solidColorAnimatorRandom.copy(f3, f4, f5, f6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getMagnitudeR() {
            return this.magnitudeR;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getMagnitudeG() {
            return this.magnitudeG;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getMagnitudeB() {
            return this.magnitudeB;
        }

        public final SolidColorAnimatorRandom copy(float frequency, float magnitudeR, float magnitudeG, float magnitudeB) {
            return new SolidColorAnimatorRandom(frequency, magnitudeR, magnitudeG, magnitudeB);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SolidColorAnimatorRandom)) {
                return false;
            }
            SolidColorAnimatorRandom solidColorAnimatorRandom = (SolidColorAnimatorRandom) other;
            return Float.compare(this.frequency, solidColorAnimatorRandom.frequency) == 0 && Float.compare(this.magnitudeR, solidColorAnimatorRandom.magnitudeR) == 0 && Float.compare(this.magnitudeG, solidColorAnimatorRandom.magnitudeG) == 0 && Float.compare(this.magnitudeB, solidColorAnimatorRandom.magnitudeB) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.frequency) * 31) + Float.hashCode(this.magnitudeR)) * 31) + Float.hashCode(this.magnitudeG)) * 31) + Float.hashCode(this.magnitudeB);
        }

        public String toString() {
            return "SolidColorAnimatorRandom(frequency=" + this.frequency + ", magnitudeR=" + this.magnitudeR + ", magnitudeG=" + this.magnitudeG + ", magnitudeB=" + this.magnitudeB + ")";
        }

        public SolidColorAnimatorRandom(float f3, float f4, float f5, float f6) {
            this.frequency = f3;
            this.magnitudeR = f4;
            this.magnitudeG = f5;
            this.magnitudeB = f6;
        }

        @Override // com.alightcreative.app.motion.scene.animators.Animator
        public SolidColor animate(SolidColor value, AnimatorEnvironment env) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(env, "env");
            return new SolidColor(value.getR() + (this.magnitudeR * ((float) SimplexNoiseKt.simplexNoise(value.getR(), value.getG(), ((double) (env.getTime() * this.frequency)) * env.getDurationInSeconds(), 123.0d))), value.getG() + (this.magnitudeG * ((float) SimplexNoiseKt.simplexNoise(value.getG(), value.getB(), ((double) (env.getTime() * this.frequency)) * env.getDurationInSeconds(), 456.0d))), value.getB() + (this.magnitudeB * ((float) SimplexNoiseKt.simplexNoise(value.getB(), value.getR(), ((double) (env.getTime() * this.frequency)) * env.getDurationInSeconds(), 789.0d))), value.getA());
        }

        public final float getFrequency() {
            return this.frequency;
        }

        public final float getMagnitudeB() {
            return this.magnitudeB;
        }

        public final float getMagnitudeG() {
            return this.magnitudeG;
        }

        public final float getMagnitudeR() {
            return this.magnitudeR;
        }

        public /* synthetic */ SolidColorAnimatorRandom(float f3, float f4, float f5, float f6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2.0f : f3, (i2 & 2) != 0 ? 50.0f : f4, (i2 & 4) != 0 ? 50.0f : f5, (i2 & 8) != 0 ? 50.0f : f6);
        }
    }
}
