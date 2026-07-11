package z;

import android.graphics.Matrix;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import z.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f76284n;
    private static final float[] rl = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    public static final void mUb(qz qzVar, Matrix matrix) {
        Intrinsics.checkNotNullParameter(qzVar, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (qzVar.rl() < 2) {
            throw new UnsupportedOperationException();
        }
        int iJ2 = qzVar.J2();
        for (int i2 = 0; i2 < iJ2; i2++) {
            float[] fArr = {qzVar.KN(qzVar.rl() * i2), qzVar.KN((qzVar.rl() * i2) + 1)};
            matrix.mapPoints(fArr);
            qzVar.xMQ(qzVar.rl() * i2, fArr[0]);
            qzVar.xMQ((qzVar.rl() * i2) + 1, fArr[1]);
        }
    }

    public static final float[] J2() {
        return rl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2470N KN(float f3, float f4, float f5, float f6, float f7) {
        float f8 = f5 - f3;
        float f9 = f6 - f4;
        float f10 = f8 / f9;
        Pair pair = f7 > f10 ? TuplesKt.to(Float.valueOf(f8), Float.valueOf((f9 * f10) / f7)) : TuplesKt.to(Float.valueOf((f8 * f7) / f10), Float.valueOf(f9));
        float fFloatValue = ((Number) pair.component1()).floatValue();
        float fFloatValue2 = ((Number) pair.component2()).floatValue();
        float f11 = (f5 + f3) / 2.0f;
        float f12 = (f6 + f4) / 2.0f;
        Zs zs = Zs.f76294t;
        qz.j jVar = qz.xMQ;
        float f13 = fFloatValue / 2.0f;
        float f14 = f11 - f13;
        float f15 = fFloatValue2 / 2.0f;
        float f16 = f12 - f15;
        float f17 = f12 + f15;
        float f18 = f11 + f13;
        return new C2470N(zs, jVar.rl(f14, f16, 0.0f, f14, f17, 0.0f, f18, f17, 0.0f, f18, f16, 0.0f), jVar.n(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f), C2472aC.f76296t.n(0, 1, 2, 0, 2, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2470N Uo(float f3, float f4, float f5, float f6, float f7) {
        float f8 = (f5 - f3) / (f6 - f4);
        Float fValueOf = Float.valueOf(0.5f);
        Pair pair = f7 >= f8 ? TuplesKt.to(Float.valueOf((f8 * 0.5f) / f7), fValueOf) : TuplesKt.to(fValueOf, Float.valueOf((f7 * 0.5f) / f8));
        float fFloatValue = ((Number) pair.component1()).floatValue();
        float fFloatValue2 = ((Number) pair.component2()).floatValue();
        Zs zs = Zs.f76294t;
        qz.j jVar = qz.xMQ;
        float f9 = 0.5f - fFloatValue;
        float f10 = 0.5f - fFloatValue2;
        float f11 = fFloatValue2 + 0.5f;
        float f12 = fFloatValue + 0.5f;
        return new C2470N(zs, jVar.rl(f3, f4, 0.0f, f3, f6, 0.0f, f5, f6, 0.0f, f5, f4, 0.0f), jVar.n(f9, f10, f9, f11, f12, f11, f12, f10), C2472aC.f76296t.n(0, 1, 2, 0, 2, 3));
    }

    public static final void gh(Md md, Matrix matrix) {
        Intrinsics.checkNotNullParameter(md, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        mUb(md.O(), matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2470N xMQ(float f3, float f4, float f5, float f6) {
        Zs zs = Zs.f76294t;
        qz.j jVar = qz.xMQ;
        return new C2470N(zs, jVar.rl(f3, f4, 0.0f, f3, f6, 0.0f, f5, f6, 0.0f, f5, f4, 0.0f), jVar.n(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f), C2472aC.f76296t.n(0, 1, 2, 0, 2, 3));
    }
}
