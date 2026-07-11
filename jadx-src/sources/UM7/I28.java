package UM7;

import android.graphics.Matrix;
import bA.C1653C;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f10647n = new I28();
    public static final Hh.Wre rl;

    static {
        Hh.Wre wreRl = Hh.Wre.rl(2, 7, 4, 5);
        Intrinsics.checkNotNullExpressionValue(wreRl, "of(...)");
        rl = wreRl;
    }

    public static final int J2(dX.fuX rotationOptions, dX.CN3 cn3, C1653C encodedImage, boolean z2) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!z2 || cn3 == null) {
            return 8;
        }
        int iO = O(rotationOptions, encodedImage);
        int iNr = rl.contains(Integer.valueOf(encodedImage.Nxk())) ? nr(rotationOptions, encodedImage) : 0;
        boolean z3 = iO == 90 || iO == 270 || iNr == 5 || iNr == 7;
        int iGh = gh(rl(cn3, z3 ? encodedImage.getHeight() : encodedImage.getWidth(), z3 ? encodedImage.getWidth() : encodedImage.getHeight()), cn3.nr);
        if (iGh > 8) {
            return 8;
        }
        if (iGh < 1) {
            return 1;
        }
        return iGh;
    }

    private final Matrix KN(int i2) {
        Matrix matrix = new Matrix();
        if (i2 == 2) {
            matrix.setScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i2 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i2 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i2 != 5) {
            return null;
        }
        matrix.setRotate(90.0f);
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }

    public static final int O(dX.fuX rotationOptions, C1653C encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!rotationOptions.Uo()) {
            return 0;
        }
        int iT = f10647n.t(encodedImage);
        return rotationOptions.KN() ? iT : (iT + rotationOptions.J2()) % 360;
    }

    public static final Matrix Uo(C1653C encodedImage, dX.fuX rotationOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        if (rl.contains(Integer.valueOf(encodedImage.Nxk()))) {
            return f10647n.KN(nr(rotationOptions, encodedImage));
        }
        int iO = O(rotationOptions, encodedImage);
        if (iO == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iO);
        return matrix;
    }

    public static final int gh(float f3, float f4) {
        return (int) (f4 + (f3 * 8));
    }

    public static final boolean mUb(int i2) {
        return i2 >= 0 && i2 <= 270 && i2 % 90 == 0;
    }

    public static final int n(int i2) {
        return Math.max(1, 8 / i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int nr(dX.fuX rotationOptions, C1653C encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int iNxk = encodedImage.Nxk();
        Hh.Wre wre = rl;
        int iIndexOf = wre.indexOf(Integer.valueOf(iNxk));
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        E e2 = wre.get((iIndexOf + ((!rotationOptions.KN() ? rotationOptions.J2() : 0) / 90)) % wre.size());
        Intrinsics.checkNotNullExpressionValue(e2, "get(...)");
        return ((Number) e2).intValue();
    }

    public static final float rl(dX.CN3 cn3, int i2, int i3) {
        if (cn3 == null) {
            return 1.0f;
        }
        float f3 = i2;
        float f4 = i3;
        float fMax = Math.max(cn3.f63505n / f3, cn3.rl / f4);
        float f5 = f3 * fMax;
        float f6 = cn3.f63506t;
        if (f5 > f6) {
            fMax = f6 / f3;
        }
        return f4 * fMax > f6 ? f6 / f4 : fMax;
    }

    private I28() {
    }

    private final int t(C1653C c1653c) {
        int iM = c1653c.m();
        if (iM != 90 && iM != 180 && iM != 270) {
            return 0;
        }
        return c1653c.m();
    }

    public static final boolean xMQ(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }
}
