package ka;

import FX.Ml;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class K {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[psW.values().length];
            try {
                iArr[psW.f70026n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[psW.f70027t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(FX.Ml ml, Function1 function1, psW psw, int i2, int i3, Composer composer, int i5) {
        t(ml, function1, psw, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final FX.Ml socialMedia, final Function1 onClick, psW psw, Composer composer, final int i2, final int i3) {
        int i5;
        psW psw2;
        int i7;
        int i8;
        Triple triple;
        boolean z2;
        Object objIF;
        final psW psw3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(socialMedia, "socialMedia");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerKN = composer.KN(-2117647774);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(socialMedia) : composerKN.E2(socialMedia) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onClick) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                psw2 = psw;
                i5 |= composerKN.p5(psw2) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                psW psw4 = i9 == 0 ? psW.f70026n : psw2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-2117647774, i5, -1, "com.alightcreative.app.motion.ranking.ui.SocialMediaButton (SocialMediaButton.kt:26)");
                }
                if (!(socialMedia instanceof Ml.w6)) {
                    i7 = 2131231810;
                } else if (socialMedia instanceof Ml.j) {
                    i7 = 2131231808;
                } else {
                    if (!(socialMedia instanceof Ml.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i7 = 2131231809;
                }
                i8 = j.$EnumSwitchMapping$0[psw4.ordinal()];
                if (i8 != 1) {
                    triple = new Triple(Dp.nr(Dp.KN(40)), Dp.nr(Dp.KN(8)), Dp.nr(Dp.KN(10)));
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float f3 = 4;
                    triple = new Triple(Dp.nr(Dp.KN(24)), Dp.nr(Dp.KN(f3)), Dp.nr(Dp.KN(f3)));
                }
                float value = ((Dp) triple.component1()).getValue();
                float value2 = ((Dp) triple.component2()).getValue();
                float value3 = ((Dp) triple.component3()).getValue();
                Painter painterT = PainterResources_androidKt.t(i7, composerKN, 0);
                Modifier modifierT = BackgroundKt.t(SizeKt.Z(Modifier.INSTANCE, value), aD.w6.Zmq(), RoundedCornerShapeKt.t(value2));
                composerKN.eF(-1240916115);
                z2 = ((i5 & 112) != 32) | ((i5 & 14) != 4 || ((i5 & 8) != 0 && composerKN.E2(socialMedia)));
                objIF = composerKN.iF();
                if (!z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: ka.Lu
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.nr(onClick, socialMedia);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                ImageKt.n(painterT, null, PaddingKt.xMQ(ClickableKt.J2(modifierT, false, null, null, (Function0) objIF, 7, null), value3), null, null, 0.0f, null, composerKN, 48, b.f61769v);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                psw3 = psw4;
            } else {
                composerKN.wTp();
                psw3 = psw2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: ka.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return K.O(socialMedia, onClick, psw3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        psw2 = psw;
        if ((i5 & 147) == 146) {
            if (i9 == 0) {
            }
            if (ComposerKt.v()) {
            }
            if (!(socialMedia instanceof Ml.w6)) {
            }
            i8 = j.$EnumSwitchMapping$0[psw4.ordinal()];
            if (i8 != 1) {
            }
            float value4 = ((Dp) triple.component1()).getValue();
            float value22 = ((Dp) triple.component2()).getValue();
            float value32 = ((Dp) triple.component3()).getValue();
            Painter painterT2 = PainterResources_androidKt.t(i7, composerKN, 0);
            Modifier modifierT2 = BackgroundKt.t(SizeKt.Z(Modifier.INSTANCE, value4), aD.w6.Zmq(), RoundedCornerShapeKt.t(value22));
            composerKN.eF(-1240916115);
            if ((i5 & 14) != 4) {
                z2 = ((i5 & 112) != 32) | ((i5 & 14) != 4 || ((i5 & 8) != 0 && composerKN.E2(socialMedia)));
                objIF = composerKN.iF();
                if (!z2) {
                    objIF = new Function0() { // from class: ka.Lu
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.nr(onClick, socialMedia);
                        }
                    };
                    composerKN.o(objIF);
                    composerKN.Xw();
                    ImageKt.n(painterT2, null, PaddingKt.xMQ(ClickableKt.J2(modifierT2, false, null, null, (Function0) objIF, 7, null), value32), null, null, 0.0f, null, composerKN, 48, b.f61769v);
                    if (ComposerKt.v()) {
                    }
                    psw3 = psw4;
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function1 function1, FX.Ml ml) {
        function1.invoke(ml);
        return Unit.INSTANCE;
    }
}
