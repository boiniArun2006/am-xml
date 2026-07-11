package Dj7;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class fuX {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CN3.values().length];
            try {
                iArr[CN3.f1597n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CN3.f1600t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CN3.f1593O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CN3.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CN3.f1599r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CN3.f1598o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CN3.f1595Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final R7M.j J2(CN3 toPrivacyButtonStyle, Color color, Color color2, BorderStroke borderStroke, Shape shape, PaddingValues paddingValues, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(toPrivacyButtonStyle, "$this$toPrivacyButtonStyle");
        composer.eF(888077893);
        Color color3 = (i3 & 1) != 0 ? null : color;
        Color color4 = (i3 & 2) != 0 ? null : color2;
        BorderStroke borderStroke2 = (i3 & 4) != 0 ? null : borderStroke;
        Shape shapeT = (i3 & 8) == 0 ? shape : null;
        PaddingValues paddingValuesN = (i3 & 16) != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues;
        if (ComposerKt.v()) {
            ComposerKt.p5(888077893, i2, -1, "com.alightcreative.common.compose.components.toPrivacyButtonStyle (ButtonCategory.kt:149)");
        }
        composer.eF(409541090);
        long jO = color3 == null ? n(toPrivacyButtonStyle, composer, i2 & 14).O() : color3.getValue();
        composer.Xw();
        composer.eF(409543613);
        long jJ2 = color4 == null ? n(toPrivacyButtonStyle, composer, i2 & 14).J2() : color4.getValue();
        composer.Xw();
        if (shapeT == null) {
            shapeT = t(toPrivacyButtonStyle, composer, i2 & 14);
        }
        R7M.j jVar = new R7M.j(jO, jJ2, borderStroke2, shapeT, paddingValuesN, (PaddingValues) null, 32, (DefaultConstructorMarker) null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return jVar;
    }

    public static final TextStyle O(CN3 cn3, Composer composer, int i2) {
        TextStyle textStyleNY;
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        composer.eF(2037223958);
        if (ComposerKt.v()) {
            ComposerKt.p5(2037223958, i2, -1, "com.alightcreative.common.compose.components.defaultTitleStyle (ButtonCategory.kt:46)");
        }
        switch (j.$EnumSwitchMapping$0[cn3.ordinal()]) {
            case 1:
            case 2:
            case 3:
                composer.eF(1159835050);
                textStyleNY = H9N.j.f3810n.rl(composer, 6).nY();
                composer.Xw();
                break;
            case 4:
                composer.eF(1159836586);
                textStyleNY = H9N.j.f3810n.rl(composer, 6).aYN();
                composer.Xw();
                break;
            case 5:
                composer.eF(1159838030);
                textStyleNY = H9N.j.f3810n.rl(composer, 6).S();
                composer.Xw();
                break;
            case 6:
            case 7:
                composer.eF(1159840586);
                textStyleNY = H9N.j.f3810n.rl(composer, 6).N();
                composer.Xw();
                break;
            default:
                composer.eF(1159832962);
                composer.Xw();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return textStyleNY;
    }

    public static final Dsr n(CN3 cn3, Composer composer, int i2) {
        Dsr dsr;
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        composer.eF(1166059995);
        if (ComposerKt.v()) {
            ComposerKt.p5(1166059995, i2, -1, "com.alightcreative.common.compose.components.defaultColorSchema (ButtonCategory.kt:79)");
        }
        switch (j.$EnumSwitchMapping$0[cn3.ordinal()]) {
            case 1:
                dsr = new Dsr(aD.w6.gh(), aD.w6.t(), aD.w6.gh(), aD.w6.nr(), aD.w6.qie(), aD.w6.rl(), null);
                break;
            case 2:
                dsr = new Dsr(aD.w6.gh(), aD.w6.O(), aD.w6.gh(), aD.w6.J2(), aD.w6.qie(), aD.w6.rl(), null);
                break;
            case 3:
                long jGh = aD.w6.gh();
                Color.Companion companion = Color.INSTANCE;
                dsr = new Dsr(jGh, companion.J2(), aD.w6.mUb(), companion.J2(), aD.w6.qie(), companion.J2(), null);
                break;
            case 4:
                long jGh2 = aD.w6.gh();
                Color.Companion companion2 = Color.INSTANCE;
                dsr = new Dsr(jGh2, companion2.J2(), aD.w6.mUb(), companion2.J2(), aD.w6.qie(), companion2.J2(), null);
                break;
            case 5:
                dsr = new Dsr(aD.w6.gh(), aD.w6.Y(), aD.w6.gh(), aD.w6.Y(), Color.az(aD.w6.M7(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), aD.w6.Y(), null);
                break;
            case 6:
                Color.Companion companion3 = Color.INSTANCE;
                dsr = new Dsr(companion3.KN(), aD.w6.gh(), companion3.KN(), aD.w6.gh(), aD.w6.qie(), aD.w6.rl(), null);
                break;
            case 7:
                dsr = new Dsr(aD.w6.qie(), Color.INSTANCE.KN(), aD.w6.gh(), aD.w6.Uo(), aD.w6.qie(), aD.w6.rl(), null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return dsr;
    }

    public static final TextStyle nr(CN3 cn3, Composer composer, int i2) {
        TextStyle textStyleS7N;
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        composer.eF(-1875142632);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1875142632, i2, -1, "com.alightcreative.common.compose.components.defaultSubtitleStyle (ButtonCategory.kt:54)");
        }
        switch (j.$EnumSwitchMapping$0[cn3.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                composer.eF(430375316);
                textStyleS7N = H9N.j.f3810n.rl(composer, 6).s7N();
                composer.Xw();
                break;
            case 5:
                composer.eF(430376760);
                textStyleS7N = H9N.j.f3810n.rl(composer, 6).Z();
                composer.Xw();
                break;
            case 6:
            case 7:
                composer.eF(430379316);
                textStyleS7N = H9N.j.f3810n.rl(composer, 6).s7N();
                composer.Xw();
                break;
            default:
                composer.eF(430372808);
                composer.Xw();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return textStyleS7N;
    }

    public static final float rl(CN3 cn3, boolean z2, Composer composer, int i2, int i3) {
        float fKN;
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        composer.eF(121908266);
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(121908266, i2, -1, "com.alightcreative.common.compose.components.defaultMinHeight (ButtonCategory.kt:62)");
        }
        switch (j.$EnumSwitchMapping$0[cn3.ordinal()]) {
            case 1:
            case 2:
            case 3:
                fKN = Dp.KN(z2 ? 56 : 52);
                break;
            case 4:
                fKN = Dp.KN(24);
                break;
            case 5:
                fKN = Dp.KN(56);
                break;
            case 6:
            case 7:
                fKN = Dp.KN(40);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return fKN;
    }

    public static final Shape t(CN3 cn3, Composer composer, int i2) {
        RoundedCornerShape roundedCornerShapeRl;
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        composer.eF(-1769970035);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1769970035, i2, -1, "com.alightcreative.common.compose.components.defaultShape (ButtonCategory.kt:71)");
        }
        switch (j.$EnumSwitchMapping$0[cn3.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                roundedCornerShapeRl = RoundedCornerShapeKt.rl(CornerSizeKt.rl(Dp.KN(12)));
                break;
            case 5:
                roundedCornerShapeRl = RoundedCornerShapeKt.rl(CornerSizeKt.rl(Dp.KN(28)));
                break;
            case 6:
            case 7:
                roundedCornerShapeRl = RoundedCornerShapeKt.rl(CornerSizeKt.rl(Dp.KN(12)));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return roundedCornerShapeRl;
    }
}
