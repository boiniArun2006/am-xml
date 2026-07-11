package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import androidx.compose.ui.graphics.BlendMode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "Landroid/graphics/PorterDuff$Mode;", "rl", "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)Landroid/graphics/BlendMode;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidBlendMode_androidKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.graphics.BlendMode.values().length];
            try {
                iArr[android.graphics.BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[android.graphics.BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[android.graphics.BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[android.graphics.BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[android.graphics.BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[android.graphics.BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[android.graphics.BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[android.graphics.BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[android.graphics.BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[android.graphics.BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[android.graphics.BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[android.graphics.BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[android.graphics.BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[android.graphics.BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[android.graphics.BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[android.graphics.BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[android.graphics.BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final android.graphics.BlendMode n(int i2) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.e(i2, companion.n()) ? android.graphics.BlendMode.CLEAR : BlendMode.e(i2, companion.aYN()) ? android.graphics.BlendMode.SRC : BlendMode.e(i2, companion.Uo()) ? android.graphics.BlendMode.DST : BlendMode.e(i2, companion.te()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.e(i2, companion.gh()) ? android.graphics.BlendMode.DST_OVER : BlendMode.e(i2, companion.nY()) ? android.graphics.BlendMode.SRC_IN : BlendMode.e(i2, companion.xMQ()) ? android.graphics.BlendMode.DST_IN : BlendMode.e(i2, companion.g()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.e(i2, companion.mUb()) ? android.graphics.BlendMode.DST_OUT : BlendMode.e(i2, companion.ViF()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.e(i2, companion.KN()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.e(i2, companion.iF()) ? android.graphics.BlendMode.XOR : BlendMode.e(i2, companion.Z()) ? android.graphics.BlendMode.PLUS : BlendMode.e(i2, companion.Ik()) ? android.graphics.BlendMode.MODULATE : BlendMode.e(i2, companion.S()) ? android.graphics.BlendMode.SCREEN : BlendMode.e(i2, companion.o()) ? android.graphics.BlendMode.OVERLAY : BlendMode.e(i2, companion.O()) ? android.graphics.BlendMode.DARKEN : BlendMode.e(i2, companion.HI()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.e(i2, companion.nr()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.e(i2, companion.t()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.e(i2, companion.az()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.e(i2, companion.WPU()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.e(i2, companion.J2()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.e(i2, companion.qie()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.e(i2, companion.r()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.e(i2, companion.ty()) ? android.graphics.BlendMode.HUE : BlendMode.e(i2, companion.XQ()) ? android.graphics.BlendMode.SATURATION : BlendMode.e(i2, companion.rl()) ? android.graphics.BlendMode.COLOR : BlendMode.e(i2, companion.ck()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode rl(int i2) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.e(i2, companion.n()) ? PorterDuff.Mode.CLEAR : BlendMode.e(i2, companion.aYN()) ? PorterDuff.Mode.SRC : BlendMode.e(i2, companion.Uo()) ? PorterDuff.Mode.DST : BlendMode.e(i2, companion.te()) ? PorterDuff.Mode.SRC_OVER : BlendMode.e(i2, companion.gh()) ? PorterDuff.Mode.DST_OVER : BlendMode.e(i2, companion.nY()) ? PorterDuff.Mode.SRC_IN : BlendMode.e(i2, companion.xMQ()) ? PorterDuff.Mode.DST_IN : BlendMode.e(i2, companion.g()) ? PorterDuff.Mode.SRC_OUT : BlendMode.e(i2, companion.mUb()) ? PorterDuff.Mode.DST_OUT : BlendMode.e(i2, companion.ViF()) ? PorterDuff.Mode.SRC_ATOP : BlendMode.e(i2, companion.KN()) ? PorterDuff.Mode.DST_ATOP : BlendMode.e(i2, companion.iF()) ? PorterDuff.Mode.XOR : BlendMode.e(i2, companion.Z()) ? PorterDuff.Mode.ADD : BlendMode.e(i2, companion.S()) ? PorterDuff.Mode.SCREEN : BlendMode.e(i2, companion.o()) ? PorterDuff.Mode.OVERLAY : BlendMode.e(i2, companion.O()) ? PorterDuff.Mode.DARKEN : BlendMode.e(i2, companion.HI()) ? PorterDuff.Mode.LIGHTEN : BlendMode.e(i2, companion.Ik()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
