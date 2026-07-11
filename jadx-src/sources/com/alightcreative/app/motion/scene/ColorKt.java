package com.alightcreative.app.motion.scene;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0006\u0010\u0005\u001a\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0002*\u00020\t\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\t\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\t\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u0014\u0010\u0010\u001a\u00020\f*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u0014\u0010\u0010\u001a\u00020\f*\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\u0002\u001a\u0015\u0010\u0013\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\u0002\u001a\u0015\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0015H\u0086\u0002\u001a\n\u0010\u0016\u001a\u00020\u0002*\u00020\u0002\u001a\u0015\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\u0004\u001aB\u0010\u0018\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006 "}, d2 = {"y", "", "Lcom/alightcreative/app/motion/scene/SolidColor;", "getY", "(Lcom/alightcreative/app/motion/scene/SolidColor;)F", "SolidColor", "toInt", "", "toHSV", "Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "toRGB", "toHexColorRef", "", "alpha", "", "newline", "toHexAlphaColorRef", "plus", InneractiveMediationNameConsts.OTHER, "minus", "times", "", "premultiply", "atop", "makeSwatch", "Landroid/graphics/Bitmap;", "width", "height", "checkerCount", "cornerRadius", "borderWidth", "borderColor", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ColorKt {
    public static final SolidColor times(SolidColor solidColor, float f3) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        return new SolidColor(solidColor.getR() * f3, solidColor.getG() * f3, solidColor.getB() * f3, solidColor.getA() * f3);
    }

    public static final String toHexAlphaColorRef(SolidColor solidColor, boolean z2) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & toInt(solidColor))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str + (z2 ? "\n" : " ") + "(" + MathKt.roundToInt(solidColor.getA() * 100.0f) + "%)";
    }

    public static /* synthetic */ String toHexAlphaColorRef$default(SolidColor solidColor, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return toHexAlphaColorRef(solidColor, z2);
    }

    public static final String toHexColorRef(SolidColor solidColor) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(toInt(solidColor) & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static /* synthetic */ String toHexColorRef$default(SolidColor solidColor, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        return toHexColorRef(solidColor, z2, z3);
    }

    public static final int toInt(SolidColor solidColor) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        return Color.argb((int) (solidColor.getA() * 255.0f), (int) (solidColor.getR() * 255.0f), (int) (solidColor.getG() * 255.0f), (int) (solidColor.getB() * 255.0f));
    }

    public static final SolidColor SolidColor() {
        return SolidColor.INSTANCE.getBLACK();
    }

    public static final SolidColor atop(SolidColor solidColor, SolidColor other) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return plus(premultiply(solidColor), times(other, 1.0f - solidColor.getA()));
    }

    public static final float getY(SolidColor solidColor) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        return (solidColor.getR() * 0.2126f) + (solidColor.getG() * 0.7152f) + (solidColor.getB() * 0.0722f);
    }

    public static final Bitmap makeSwatch(SolidColor solidColor, int i2, int i3, float f3, float f4, int i5, int i7) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        int i8 = i5 * 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2 + i8, i8 + i3, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        float f5 = i5;
        canvas.translate(f5, f5);
        if (i5 > 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(i7);
            paint.setStrokeWidth(f5 * 2);
            canvas.drawRoundRect(0.0f, 0.0f, i2, i3, f4, f4, paint);
            paint.setStyle(Paint.Style.FILL);
        }
        if (solidColor.getA() >= 1.0f) {
            paint.setColor(toInt(solidColor));
            canvas.drawRoundRect(0.0f, 0.0f, i2, i3, f4, f4, paint);
            return bitmapCreateBitmap;
        }
        paint.setColor(toInt(SolidColor.INSTANCE.getWHITE()));
        float f6 = i2;
        float f7 = i3;
        canvas.drawRoundRect(0.0f, 0.0f, f6, f7, f4, f4, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        paint.setColor(-5592406);
        float fMin = Math.min(i2, i3) / f3;
        int iCeil = (int) Math.ceil(f7 / fMin);
        int iCeil2 = (int) Math.ceil(f6 / fMin);
        if (iCeil >= 0) {
            int i9 = 0;
            while (true) {
                if (iCeil2 >= 0) {
                    int i10 = 0;
                    while (true) {
                        if ((i9 + i10) % 2 == 0) {
                            float f8 = i9 * fMin;
                            float f9 = i10 * fMin;
                            canvas.drawRect(f8, f9, f8 + fMin, f9 + fMin, paint);
                        }
                        if (i10 == iCeil2) {
                            break;
                        }
                        i10++;
                    }
                }
                if (i9 == iCeil) {
                    break;
                }
                i9++;
            }
        }
        paint.setColor(toInt(solidColor));
        canvas.drawRect(0.0f, 0.0f, f6, f7, paint);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap makeSwatch$default(SolidColor solidColor, int i2, int i3, float f3, float f4, int i5, int i7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            f3 = 8.0f;
        }
        float f5 = f3;
        if ((i8 & 8) != 0) {
            f4 = 0.0f;
        }
        float f6 = f4;
        if ((i8 & 16) != 0) {
            i5 = 0;
        }
        int i9 = i5;
        if ((i8 & 32) != 0) {
            i7 = -1442840576;
        }
        return makeSwatch(solidColor, i2, i3, f5, f6, i9, i7);
    }

    public static final SolidColor minus(SolidColor solidColor, SolidColor other) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new SolidColor(solidColor.getR() - other.getR(), solidColor.getG() - other.getG(), solidColor.getB() - other.getB(), solidColor.getA() - other.getA());
    }

    public static final SolidColor plus(SolidColor solidColor, SolidColor other) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new SolidColor(solidColor.getR() + other.getR(), solidColor.getG() + other.getG(), solidColor.getB() + other.getB(), solidColor.getA() + other.getA());
    }

    public static final SolidColor premultiply(SolidColor solidColor) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        return new SolidColor(solidColor.getR() * solidColor.getA(), solidColor.getG() * solidColor.getA(), solidColor.getB() * solidColor.getA(), solidColor.getA());
    }

    public static final SolidColor times(SolidColor solidColor, double d2) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        return new SolidColor((float) (((double) solidColor.getR()) * d2), (float) (((double) solidColor.getG()) * d2), (float) (((double) solidColor.getB()) * d2), (float) (((double) solidColor.getA()) * d2));
    }

    public static final SolidColorHSV toHSV(SolidColor solidColor) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        float[] fArr = new float[3];
        Color.colorToHSV(toInt(solidColor), fArr);
        return new SolidColorHSV(fArr[0], fArr[1], fArr[2], solidColor.getA());
    }

    public static final String toHexAlphaColorRef(SolidColorHSV solidColorHSV, boolean z2) {
        Intrinsics.checkNotNullParameter(solidColorHSV, "<this>");
        return toHexAlphaColorRef(toRGB(solidColorHSV), z2);
    }

    public static /* synthetic */ String toHexAlphaColorRef$default(SolidColorHSV solidColorHSV, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return toHexAlphaColorRef(solidColorHSV, z2);
    }

    public static final String toHexColorRef(SolidColorHSV solidColorHSV) {
        Intrinsics.checkNotNullParameter(solidColorHSV, "<this>");
        return toHexColorRef(toRGB(solidColorHSV));
    }

    public static /* synthetic */ String toHexColorRef$default(SolidColorHSV solidColorHSV, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        return toHexColorRef(solidColorHSV, z2, z3);
    }

    public static final int toInt(SolidColorHSV solidColorHSV) {
        Intrinsics.checkNotNullParameter(solidColorHSV, "<this>");
        return toInt(toRGB(solidColorHSV));
    }

    public static final SolidColor toRGB(SolidColorHSV solidColorHSV) {
        Intrinsics.checkNotNullParameter(solidColorHSV, "<this>");
        return HI0.qf.t(Color.HSVToColor((int) (solidColorHSV.getA() * 255), new float[]{solidColorHSV.getH(), solidColorHSV.getS(), solidColorHSV.getV()}));
    }

    public static final String toHexColorRef(SolidColor solidColor, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(solidColor, "<this>");
        return z2 ? toHexAlphaColorRef(solidColor, z3) : toHexColorRef(solidColor);
    }

    public static final String toHexColorRef(SolidColorHSV solidColorHSV, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(solidColorHSV, "<this>");
        return z2 ? toHexAlphaColorRef(solidColorHSV, z3) : toHexColorRef(solidColorHSV);
    }
}
