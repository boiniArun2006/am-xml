package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u0017*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\"\u0010\u001d\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\r\u001a\u0017\u0010\u001e\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a\u001f\u0010\u001f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a\u0017\u0010!\u001a\u00020 *\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b!\u0010\"\u001a\"\u0010#\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020 H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010\r\u001a\u0017\u0010%\u001a\u00020$*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b%\u0010\"\u001a\"\u0010&\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020$H\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010\r\u001a\u0017\u0010'\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b'\u0010\u0014\u001a\u001f\u0010(\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b(\u0010\u0016\u001a\u0017\u0010*\u001a\u00020)*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b*\u0010\"\u001a\"\u0010+\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020)H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010\r\u001a'\u0010.\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u000e\u0010\u000f\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-H\u0000¢\u0006\u0004\b.\u0010/\u001a!\u00101\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b1\u00102*\n\u00103\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "rl", "(Landroid/graphics/Paint;)Landroidx/compose/ui/graphics/Paint;", "mUb", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/BlendMode;", "mode", "", "qie", "(Landroid/graphics/Paint;I)V", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "ty", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/ColorFilter;)V", "", "t", "(Landroid/graphics/Paint;)F", "gh", "(Landroid/graphics/Paint;F)V", "Landroidx/compose/ui/graphics/Color;", "nr", "(Landroid/graphics/Paint;)J", "az", "(Landroid/graphics/Paint;J)V", "Landroidx/compose/ui/graphics/PaintingStyle;", "S", "xMQ", "XQ", "Landroidx/compose/ui/graphics/StrokeCap;", "J2", "(Landroid/graphics/Paint;)I", "r", "Landroidx/compose/ui/graphics/StrokeJoin;", "Uo", "o", "KN", "Z", "Landroidx/compose/ui/graphics/FilterQuality;", "O", "HI", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "Ik", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Landroidx/compose/ui/graphics/PathEffect;", "ck", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/PathEffect;)V", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidPaint_androidKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void HI(android.graphics.Paint paint, int i2) {
        paint.setFilterBitmap(!FilterQuality.O(i2, FilterQuality.INSTANCE.rl()));
    }

    public static final void S(android.graphics.Paint paint, int i2) {
        paint.setStyle(PaintingStyle.O(i2, PaintingStyle.INSTANCE.rl()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final void ck(android.graphics.Paint paint, PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void gh(android.graphics.Paint paint, float f3) {
        paint.setAlpha((int) Math.rint(f3 * 255.0f));
    }

    public static final android.graphics.Paint mUb() {
        return new android.graphics.Paint(7);
    }

    public static final Paint n() {
        return new AndroidPaint();
    }

    public static final void o(android.graphics.Paint paint, int i2) {
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        paint.setStrokeJoin(StrokeJoin.Uo(i2, companion.rl()) ? Paint.Join.MITER : StrokeJoin.Uo(i2, companion.n()) ? Paint.Join.BEVEL : StrokeJoin.Uo(i2, companion.t()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void qie(android.graphics.Paint paint, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.f31589n.n(paint, i2);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.rl(i2)));
        }
    }

    public static final void r(android.graphics.Paint paint, int i2) {
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        paint.setStrokeCap(StrokeCap.Uo(i2, companion.t()) ? Paint.Cap.SQUARE : StrokeCap.Uo(i2, companion.rl()) ? Paint.Cap.ROUND : StrokeCap.Uo(i2, companion.n()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public static final Paint rl(android.graphics.Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final void ty(android.graphics.Paint paint, ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.t(colorFilter) : null);
    }

    public static final void Ik(android.graphics.Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final int J2(android.graphics.Paint paint) {
        int i2;
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i2 = -1;
        } else {
            i2 = WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return StrokeCap.INSTANCE.n();
                }
                return StrokeCap.INSTANCE.t();
            }
            return StrokeCap.INSTANCE.rl();
        }
        return StrokeCap.INSTANCE.n();
    }

    public static final float KN(android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final int O(android.graphics.Paint paint) {
        if (!paint.isFilterBitmap()) {
            return FilterQuality.INSTANCE.rl();
        }
        return FilterQuality.INSTANCE.n();
    }

    public static final int Uo(android.graphics.Paint paint) {
        int i2;
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i2 = -1;
        } else {
            i2 = WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return StrokeJoin.INSTANCE.rl();
                }
                return StrokeJoin.INSTANCE.t();
            }
            return StrokeJoin.INSTANCE.n();
        }
        return StrokeJoin.INSTANCE.rl();
    }

    public static final void XQ(android.graphics.Paint paint, float f3) {
        paint.setStrokeWidth(f3);
    }

    public static final void Z(android.graphics.Paint paint, float f3) {
        paint.setStrokeMiter(f3);
    }

    public static final void az(android.graphics.Paint paint, long j2) {
        paint.setColor(ColorKt.mUb(j2));
    }

    public static final long nr(android.graphics.Paint paint) {
        return ColorKt.rl(paint.getColor());
    }

    public static final float t(android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final float xMQ(android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }
}
