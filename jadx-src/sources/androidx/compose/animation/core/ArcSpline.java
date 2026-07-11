package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "", "arcModes", "", "timePoints", "", "y", "<init>", "([I[F[[F)V", "", "time", "v", "", c.f62177j, "(F[F)V", "rl", "Landroidx/compose/animation/core/ArcSpline$Arc;", "[[Landroidx/compose/animation/core/ArcSpline$Arc;", "arcs", "", "Z", "isExtrapolate", "Arc", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n+ 2 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,393:1\n222#2:394\n225#2:395\n273#2:396\n277#2:397\n273#2:398\n277#2:399\n222#2:410\n225#2:411\n65#3,10:400\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n*L\n115#1:394\n116#1:395\n119#1:396\n120#1:397\n145#1:398\n146#1:399\n174#1:410\n175#1:411\n162#1:400,10\n*E\n"})
public final class ArcSpline {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Arc[][] arcs;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean isExtrapolate = true;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u000fJ/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010,\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u0014\u0010.\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0014\u00102\u001a\u00020/8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001cR\u0014\u00106\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001c¨\u00067"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "v", "mUb", "(F)F", "time", "", "gh", "(F)V", "nr", "()F", "O", "J2", "Uo", "t", "(FFFF)V", c.f62177j, "F", "KN", "rl", "xMQ", "arcDistance", "tmpSinAngle", "tmpCosAngle", "", "[F", "lut", "oneOverDeltaTime", "qie", "arcVelocity", "az", "vertical", "ty", "ellipseA", "HI", "ellipseB", "", "ck", "Z", "isLinear", "Ik", "ellipseCenterX", "r", "ellipseCenterY", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 2 ArcSpline.jvm.kt\nandroidx/compose/animation/core/ArcSpline_jvmKt\n*L\n1#1,393:1\n268#1,2:394\n21#2:396\n26#2:397\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n*L\n262#1:394,2\n334#1:396\n353#1:397\n*E\n"})
    public static final class Arc {

        /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
        public final float ellipseB;

        /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
        public final float ellipseCenterX;

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final float y2;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private float tmpSinAngle;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final float x2;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private float arcDistance;

        /* JADX INFO: renamed from: az, reason: from kotlin metadata */
        private final float vertical;

        /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
        public final boolean isLinear;

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
        private final float oneOverDeltaTime;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private final float[] lut;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float time1;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final float y1;

        /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
        private final float arcVelocity;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        public final float ellipseCenterY;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final float time2;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final float x1;

        /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
        public final float ellipseA;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private float tmpCosAngle;

        private final float mUb(float v2) {
            if (v2 <= 0.0f) {
                return 0.0f;
            }
            if (v2 >= 1.0f) {
                return 1.0f;
            }
            float f3 = v2 * 100;
            int i2 = (int) f3;
            float f4 = f3 - i2;
            float[] fArr = this.lut;
            float f5 = fArr[i2];
            return f5 + (f4 * (fArr[i2 + 1] - f5));
        }

        public final float J2(float time) {
            float f3 = (time - this.time1) * this.oneOverDeltaTime;
            float f4 = this.x1;
            return f4 + (f3 * (this.x2 - f4));
        }

        /* JADX INFO: renamed from: KN, reason: from getter */
        public final float getTime1() {
            return this.time1;
        }

        public final float O() {
            float f3 = this.ellipseA * this.tmpCosAngle;
            float f4 = (-this.ellipseB) * this.tmpSinAngle;
            return f4 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f3, f4)));
        }

        public final float Uo(float time) {
            float f3 = (time - this.time1) * this.oneOverDeltaTime;
            float f4 = this.y1;
            return f4 + (f3 * (this.y2 - f4));
        }

        public final void gh(float time) {
            double dMUb = mUb((this.vertical == -1.0f ? this.time2 - time : time - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dMUb);
            this.tmpCosAngle = (float) Math.cos(dMUb);
        }

        public final float nr() {
            float f3 = this.ellipseA * this.tmpCosAngle;
            return f3 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f3, (-this.ellipseB) * this.tmpSinAngle)));
        }

        public final void t(float x1, float y1, float x2, float y2) {
            float f3;
            float f4;
            float fHypot;
            float f5 = x2 - x1;
            float f6 = y1 - y2;
            float[] fArr = ArcSplineKt.f15466n;
            int length = fArr.length - 1;
            float f7 = length;
            float[] fArr2 = this.lut;
            if (1 <= length) {
                float f8 = f6;
                int i2 = 1;
                fHypot = 0.0f;
                float f9 = 0.0f;
                while (true) {
                    f4 = 0.0f;
                    double radians = (float) Math.toRadians((((double) i2) * 90.0d) / ((double) length));
                    float fSin = ((float) Math.sin(radians)) * f5;
                    float fCos = ((float) Math.cos(radians)) * f6;
                    f3 = f7;
                    fHypot += (float) Math.hypot(fSin - f9, fCos - f8);
                    fArr[i2] = fHypot;
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    f8 = fCos;
                    f7 = f3;
                    f9 = fSin;
                }
            } else {
                f3 = f7;
                f4 = 0.0f;
                fHypot = 0.0f;
            }
            this.arcDistance = fHypot;
            if (1 <= length) {
                int i3 = 1;
                while (true) {
                    fArr[i3] = fArr[i3] / fHypot;
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i5 = 0; i5 < length2; i5++) {
                float f10 = i5 / 100.0f;
                int iBinarySearch$default = ArraysKt.binarySearch$default(fArr, f10, 0, 0, 6, (Object) null);
                if (iBinarySearch$default >= 0) {
                    fArr2[i5] = iBinarySearch$default / f3;
                } else if (iBinarySearch$default == -1) {
                    fArr2[i5] = f4;
                } else {
                    int i7 = -iBinarySearch$default;
                    int i8 = i7 - 2;
                    float f11 = i8;
                    float f12 = fArr[i8];
                    fArr2[i5] = (f11 + ((f10 - f12) / (fArr[i7 - 1] - f12))) / f3;
                }
            }
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final float getTime2() {
            return this.time2;
        }

        public Arc(int i2, float f3, float f4, float f5, float f6, float f7, float f8) {
            boolean z2;
            float f9;
            float f10;
            float f11;
            this.time1 = f3;
            this.time2 = f4;
            this.x1 = f5;
            this.y1 = f6;
            this.x2 = f7;
            this.y2 = f8;
            float f12 = f7 - f5;
            float f13 = f8 - f6;
            boolean z3 = true;
            if (i2 != 1 && (i2 == 4 ? f13 <= 0.0f : i2 != 5 || f13 >= 0.0f)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                f9 = -1.0f;
            } else {
                f9 = 1.0f;
            }
            this.vertical = f9;
            float f14 = 1 / (f4 - f3);
            this.oneOverDeltaTime = f14;
            this.lut = new float[101];
            boolean z4 = i2 == 3;
            if (!z4 && Math.abs(f12) >= 0.001f && Math.abs(f13) >= 0.001f) {
                this.ellipseA = f12 * f9;
                this.ellipseB = f13 * (-f9);
                if (z2) {
                    f10 = f7;
                } else {
                    f10 = f5;
                }
                this.ellipseCenterX = f10;
                if (z2) {
                    f11 = f6;
                } else {
                    f11 = f8;
                }
                this.ellipseCenterY = f11;
                t(f5, f6, f7, f8);
                this.arcVelocity = this.arcDistance * f14;
                z3 = z4;
            } else {
                float fHypot = (float) Math.hypot(f13, f12);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f14;
                this.ellipseCenterX = f12 * f14;
                this.ellipseCenterY = f13 * f14;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            }
            this.isLinear = z3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r10
      0x0028: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArcSpline(int[] iArr, float[] fArr, float[][] fArr2) {
        int i2;
        int i3 = 1;
        int length = fArr.length - 1;
        Arc[][] arcArr = new Arc[length][];
        int i5 = 1;
        int i7 = 1;
        int i8 = 0;
        while (i8 < length) {
            int i9 = iArr[i8];
            int i10 = 3;
            if (i9 == 0) {
                i2 = i10;
            } else if (i9 == i3) {
                i5 = i3;
                i2 = i5;
            } else {
                if (i9 != 2) {
                    if (i9 != 3) {
                        i10 = 4;
                        if (i9 != 4) {
                            i10 = 5;
                            if (i9 != 5) {
                                i2 = i7;
                            }
                        }
                    } else {
                        if (i5 == i3) {
                        }
                        i2 = i5;
                    }
                }
                i5 = 2;
                i2 = i5;
            }
            float[] fArr3 = fArr2[i8];
            int i11 = i8 + 1;
            float[] fArr4 = fArr2[i11];
            float f3 = fArr[i8];
            float f4 = fArr[i11];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            Arc[] arcArr2 = new Arc[length2];
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12 * 2;
                int i14 = i12;
                int i15 = i13 + 1;
                arcArr2[i14] = new Arc(i2, f3, f4, fArr3[i13], fArr3[i15], fArr4[i13], fArr4[i15]);
                i12 = i14 + 1;
            }
            arcArr[i8] = arcArr2;
            i8 = i11;
            i7 = i2;
            i3 = 1;
        }
        this.arcs = arcArr;
    }

    public final void n(float time, float[] v2) {
        Arc[][] arcArr = this.arcs;
        int length = arcArr.length - 1;
        int i2 = 0;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[length][0].getTime2();
        int length2 = v2.length;
        if (!this.isExtrapolate) {
            time = Math.min(Math.max(time, time1), time2);
        } else if (time < time1 || time > time2) {
            if (time > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f3 = time - time1;
            int i3 = 0;
            while (i2 < length2 - 1) {
                Arc arc = arcArr[length][i3];
                if (arc.isLinear) {
                    v2[i2] = arc.J2(time1) + (arc.ellipseCenterX * f3);
                    v2[i2 + 1] = arc.Uo(time1) + (arc.ellipseCenterY * f3);
                } else {
                    arc.gh(time1);
                    v2[i2] = arc.ellipseCenterX + (arc.ellipseA * arc.tmpSinAngle) + (arc.nr() * f3);
                    v2[i2 + 1] = arc.ellipseCenterY + (arc.ellipseB * arc.tmpCosAngle) + (arc.O() * f3);
                }
                i2 += 2;
                i3++;
            }
            return;
        }
        boolean z2 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i5 = 0;
            int i7 = 0;
            while (i5 < length2 - 1) {
                Arc arc2 = arcArr2[i7];
                if (time <= arc2.getTime2()) {
                    if (arc2.isLinear) {
                        v2[i5] = arc2.J2(time);
                        v2[i5 + 1] = arc2.Uo(time);
                    } else {
                        arc2.gh(time);
                        v2[i5] = arc2.ellipseCenterX + (arc2.ellipseA * arc2.tmpSinAngle);
                        v2[i5 + 1] = arc2.ellipseCenterY + (arc2.ellipseB * arc2.tmpCosAngle);
                    }
                    z2 = true;
                }
                i5 += 2;
                i7++;
            }
            if (z2) {
                return;
            }
        }
    }

    public final void rl(float time, float[] v2) {
        Arc[][] arcArr = this.arcs;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[arcArr.length - 1][0].getTime2();
        if (time < time1) {
            time = time1;
        }
        if (time <= time2) {
            time2 = time;
        }
        int length = v2.length;
        boolean z2 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < length - 1) {
                Arc arc = arcArr2[i3];
                if (time2 <= arc.getTime2()) {
                    if (arc.isLinear) {
                        v2[i2] = arc.ellipseCenterX;
                        v2[i2 + 1] = arc.ellipseCenterY;
                    } else {
                        arc.gh(time2);
                        v2[i2] = arc.nr();
                        v2[i2 + 1] = arc.O();
                    }
                    z2 = true;
                }
                i2 += 2;
                i3++;
            }
            if (z2) {
                return;
            }
        }
    }
}
