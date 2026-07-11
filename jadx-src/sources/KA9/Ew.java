package KA9;

import Dj7.CM;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Ew {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f4857n = Dp.KN(80);
    private static final float rl = Dp.KN(8);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f4858t = Dp.KN(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Bitmap bitmap, String str, boolean z2, int i2, Composer composer, int i3) {
        O(bitmap, str, z2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void O(final Bitmap bitmap, String str, final boolean z2, Composer composer, final int i2) {
        int i3;
        int i5;
        BoxScopeInstance boxScopeInstance;
        int i7;
        int i8;
        final String durationString = str;
        Intrinsics.checkNotNullParameter(durationString, "durationString");
        Composer composerKN = composer.KN(-1253591010);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(bitmap) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(durationString) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1253591010, i3, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectItemThumbnail (ProjectItemThumbnail.kt:40)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierRl = AspectRatioKt.rl(SizeKt.nr(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
            Modifier modifierNr = BackgroundKt.nr(ClipKt.n(companion, RoundedCornerShapeKt.t(rl)), aD.w6.lLA(), null, 2, null);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierNr);
            Function0 function0N2 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyUo2, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            if (bitmap == null) {
                composerKN.eF(1200060580);
                t(boxScopeInstance2.n(companion, companion2.O()), composerKN, 0, 0);
                composerKN.Xw();
                i5 = i3;
                boxScopeInstance = boxScopeInstance2;
                i7 = 4;
                i8 = 2;
            } else {
                composerKN.eF(1200157548);
                i5 = i3;
                boxScopeInstance = boxScopeInstance2;
                i7 = 4;
                i8 = 2;
                ImageKt.t(AndroidImageBitmap_androidKt.t(bitmap), null, SizeKt.J2(companion, 0.0f, 1, null), companion2.O(), null, 0.0f, null, 0, composerKN, 3504, 240);
                composerKN.Xw();
            }
            composerKN.XQ();
            float f3 = i7;
            Modifier modifierAz = PaddingKt.az(companion, Dp.KN(f3), 0.0f, 0.0f, Dp.KN(f3), 6, null);
            float f4 = f4858t;
            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
            float f5 = (float) (-0.5d);
            Modifier modifierT = OffsetKt.t(boxScopeInstance3.n(PaddingKt.gh(BackgroundKt.nr(ClipKt.n(modifierAz, RoundedCornerShapeKt.t(f4)), aD.w6.F(), null, 2, null), Dp.KN(f3), 0.0f, i8, null), companion2.nr()), 0.0f, Dp.KN(f5), 1, null);
            MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion2.HI(), false);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierT);
            Function0 function0N3 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N3);
            } else {
                composerKN.r();
            }
            Composer composerN3 = Updater.n(composerKN);
            Updater.O(composerN3, measurePolicyUo3, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            Color.Companion companion4 = Color.INSTANCE;
            long jKN = companion4.KN();
            H9N.j jVar = H9N.j.f3810n;
            durationString = str;
            CM.S(durationString, jVar.rl(composerKN, 6).X(), null, jKN, null, null, null, 0, false, 0, null, composerKN, ((i5 >> 3) & 14) | 3072, 0, 2036);
            composerKN.XQ();
            composerKN.eF(-597519441);
            if (z2) {
                Modifier modifierT2 = OffsetKt.t(boxScopeInstance3.n(PaddingKt.gh(BackgroundKt.nr(ClipKt.n(PaddingKt.az(companion, Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 12, null), RoundedCornerShapeKt.t(f4)), aD.w6.kSg(), null, 2, null), Dp.KN(3), 0.0f, 2, null), companion2.HI()), 0.0f, Dp.KN(f5), 1, null);
                MeasurePolicy measurePolicyUo4 = BoxKt.Uo(companion2.HI(), false);
                int iN4 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierT2);
                Function0 function0N4 = companion3.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N4);
                } else {
                    composerKN.r();
                }
                Composer composerN4 = Updater.n(composerKN);
                Updater.O(composerN4, measurePolicyUo4, companion3.t());
                Updater.O(composerN4, compositionLocalMapIk4, companion3.O());
                Function2 function2Rl4 = companion3.rl();
                if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                    composerN4.o(Integer.valueOf(iN4));
                    composerN4.az(Integer.valueOf(iN4), function2Rl4);
                }
                Updater.O(composerN4, modifierO4, companion3.nr());
                CM.S(StringResources_androidKt.t(2132020452, composerKN, 6), jVar.rl(composerKN, 6).e(), null, companion4.KN(), null, null, null, 0, false, 0, null, composerKN, 3072, 0, 2036);
                composerKN = composerKN;
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.afx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ew.J2(bitmap, durationString, z2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Modifier modifier, int i2, int i3, Composer composer, int i5) {
        t(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final void t(final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Composer composerKN = composer.KN(1799580471);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i8 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1799580471, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ItemLoadingOrMissing (ProjectItemThumbnail.kt:98)");
            }
            Bitmap bitmap = Y3a.j.O((Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo()), 0, 1, null).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            ImageBitmap imageBitmapT = AndroidImageBitmap_androidKt.t(bitmap);
            composerKN.eF(1682307773);
            boolean zP5 = composerKN.p5(imageBitmapT);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                TileMode.Companion companion = TileMode.INSTANCE;
                objIF = BrushKt.n(ShaderKt.n(imageBitmapT, companion.nr(), companion.nr()));
                composerKN.o(objIF);
            }
            composerKN.Xw();
            BoxKt.n(BackgroundKt.rl(ClipKt.n(SizeKt.Z(modifier, f4857n), RoundedCornerShapeKt.t(rl)), (ShaderBrush) objIF, null, 0.0f, 6, null), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.Z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ew.nr(modifier, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
