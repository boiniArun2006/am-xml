package androidx.compose.foundation.layout;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "<init>", "()V", "", "time", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "rl", "(F)J", "velocity", "friction", "", c.f62177j, "(FF)D", "", "[F", "SplinePositions", "t", "SplineTimes", "FlingResult", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n53#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n686#1:709,3\n*E\n"})
final class AndroidFlingSpline {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AndroidFlingSpline f17394n = new AndroidFlingSpline();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float[] SplinePositions = new float[101];

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float[] SplineTimes = new float[101];

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "", "packedValue", c.f62177j, "(J)J", "", "J2", "(J)Ljava/lang/String;", "", "O", "(J)I", InneractiveMediationNameConsts.OTHER, "", "rl", "(JLjava/lang/Object;)Z", "J", "", "t", "(J)F", "distanceCoefficient", "nr", "velocityCoefficient", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,708:1\n60#2:709\n70#2:711\n22#3:710\n22#3:712\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n698#1:709\n705#1:711\n698#1:710\n705#1:712\n*E\n"})
    public static final class FlingResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final long packedValue;

        public static String J2(long j2) {
            return "FlingResult(packedValue=" + j2 + ')';
        }

        public static int O(long j2) {
            return Long.hashCode(j2);
        }

        public static long n(long j2) {
            return j2;
        }

        public static boolean rl(long j2, Object obj) {
            return (obj instanceof FlingResult) && j2 == ((FlingResult) obj).getPackedValue();
        }

        /* JADX INFO: renamed from: Uo, reason: from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }

        public boolean equals(Object obj) {
            return rl(this.packedValue, obj);
        }

        public int hashCode() {
            return O(this.packedValue);
        }

        public String toString() {
            return J2(this.packedValue);
        }

        public static final float t(long j2) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }

        public static final float nr(long j2) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
    }

    static {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13 = 0.0f;
        int i2 = 0;
        float f14 = 0.0f;
        while (true) {
            float f15 = 1.0f;
            if (i2 >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f16 = i2 / 100;
            float f17 = 1.0f;
            while (true) {
                f3 = ((f17 - f13) / 2.0f) + f13;
                f4 = f15 - f3;
                f5 = f3 * 3.0f * f4;
                f6 = f3 * f3 * f3;
                float f18 = (((f4 * 0.175f) + (f3 * 0.35000002f)) * f5) + f6;
                f7 = f15;
                f8 = f16;
                if (Math.abs(f18 - f16) < 1.0E-5d) {
                    break;
                }
                if (f18 > f8) {
                    f17 = f3;
                } else {
                    f13 = f3;
                }
                f15 = f7;
                f16 = f8;
            }
            SplinePositions[i2] = (f5 * ((f4 * 0.5f) + f3)) + f6;
            float f19 = f7;
            while (true) {
                f9 = ((f19 - f14) / 2.0f) + f14;
                f10 = f7 - f9;
                f11 = f9 * 3.0f * f10;
                f12 = f9 * f9 * f9;
                float f20 = (((f10 * 0.5f) + f9) * f11) + f12;
                if (Math.abs(f20 - f8) >= 1.0E-5d) {
                    if (f20 > f8) {
                        f19 = f9;
                    } else {
                        f14 = f9;
                    }
                }
            }
            SplineTimes[i2] = (f11 * ((f10 * 0.175f) + (f9 * 0.35000002f))) + f12;
            i2++;
        }
    }

    public final long rl(float time) {
        float f3;
        float f4;
        float f5 = 100;
        int i2 = (int) (f5 * time);
        if (i2 < 100) {
            float f6 = i2 / f5;
            int i3 = i2 + 1;
            float f7 = i3 / f5;
            float[] fArr = SplinePositions;
            float f8 = fArr[i2];
            f4 = (fArr[i3] - f8) / (f7 - f6);
            f3 = f8 + ((time - f6) * f4);
        } else {
            f3 = 1.0f;
            f4 = 0.0f;
        }
        return FlingResult.n((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
    }

    private AndroidFlingSpline() {
    }

    public final double n(float velocity, float friction) {
        return Math.log(((double) (Math.abs(velocity) * 0.35f)) / ((double) friction));
    }
}
