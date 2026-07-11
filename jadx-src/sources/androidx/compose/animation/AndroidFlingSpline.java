package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline;", "", "<init>", "()V", "", "time", "Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "rl", "(F)Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "velocity", "friction", "", c.f62177j, "(FF)D", "", "[F", "SplinePositions", "t", "SplineTimes", "FlingResult", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidFlingSpline {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AndroidFlingSpline f14934n = new AndroidFlingSpline();
    public static final int nr;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float[] SplinePositions;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float[] SplineTimes;

    @StabilityInferred
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "", "distanceCoefficient", "velocityCoefficient", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "F", "()F", "rl", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FlingResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final float distanceCoefficient;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final float velocityCoefficient;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) other;
            return Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.distanceCoefficient) * 31) + Float.hashCode(this.velocityCoefficient);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        public FlingResult(float f3, float f4) {
            this.distanceCoefficient = f3;
            this.velocityCoefficient = f4;
        }
    }

    public final FlingResult rl(float time) {
        float f3 = 0.0f;
        float f4 = 1.0f;
        float fCoerceIn = RangesKt.coerceIn(time, 0.0f, 1.0f);
        float f5 = 100;
        int i2 = (int) (f5 * fCoerceIn);
        if (i2 < 100) {
            float f6 = i2 / f5;
            int i3 = i2 + 1;
            float f7 = i3 / f5;
            float[] fArr = SplinePositions;
            float f8 = fArr[i2];
            float f9 = (fArr[i3] - f8) / (f7 - f6);
            float f10 = ((fCoerceIn - f6) * f9) + f8;
            f3 = f9;
            f4 = f10;
        }
        return new FlingResult(f4, f3);
    }

    static {
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        SplineTimes = fArr2;
        SplineBasedDecayKt.rl(fArr, fArr2, 100);
        nr = 8;
    }

    private AndroidFlingSpline() {
    }

    public final double n(float velocity, float friction) {
        return Math.log(((double) (Math.abs(velocity) * 0.35f)) / ((double) friction));
    }
}
