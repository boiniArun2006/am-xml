package UM7;

import bA.C1653C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f10652n = new j();

    public static final float n(dX.fuX rotationOptions, dX.CN3 cn3, C1653C encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!C1653C.n1(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        if (cn3 == null || cn3.rl <= 0 || cn3.f63505n <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int iNr = f10652n.nr(rotationOptions, encodedImage);
        boolean z2 = iNr == 90 || iNr == 270;
        int height = z2 ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z2 ? encodedImage.getWidth() : encodedImage.getHeight();
        float f3 = cn3.f63505n / height;
        float f4 = cn3.rl / width;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(f3, f4);
        Dzy.j.Z("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(cn3.f63505n), Integer.valueOf(cn3.rl), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(fCoerceAtLeast));
        return fCoerceAtLeast;
    }

    public static final int rl(dX.fuX rotationOptions, dX.CN3 cn3, C1653C encodedImage, int i2) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!C1653C.n1(encodedImage)) {
            return 1;
        }
        float fN = n(rotationOptions, cn3, encodedImage);
        int iJ2 = encodedImage.p5() == com.facebook.imageformat.n.rl ? J2(fN) : O(fN);
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f3 = cn3 != null ? cn3.f63506t : i2;
        while (iMax / iJ2 > f3) {
            iJ2 = encodedImage.p5() == com.facebook.imageformat.n.rl ? iJ2 * 2 : iJ2 + 1;
        }
        return iJ2;
    }

    public static final int t(C1653C encodedImage, int i2, int i3) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int iFX = encodedImage.FX();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * i2) / iFX) / iFX > i3) {
            iFX *= 2;
        }
        return iFX;
    }

    private j() {
    }

    public static final int J2(float f3) {
        if (f3 > 0.6666667f) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            int i3 = i2 * 2;
            double d2 = 1.0d / ((double) i3);
            if (d2 + (((double) 0.33333334f) * d2) <= f3) {
                return i2;
            }
            i2 = i3;
        }
    }

    public static final int O(float f3) {
        if (f3 > 0.6666667f) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            double d2 = i2;
            if ((1.0d / d2) + ((1.0d / (Math.pow(d2, 2.0d) - d2)) * ((double) 0.33333334f)) <= f3) {
                return i2 - 1;
            }
            i2++;
        }
    }

    private final int nr(dX.fuX fux, C1653C c1653c) {
        if (!fux.KN()) {
            return 0;
        }
        int iM = c1653c.m();
        if (iM != 0 && iM != 90 && iM != 180 && iM != 270) {
            throw new IllegalStateException("Check failed.");
        }
        return iM;
    }
}
