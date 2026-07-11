package BQ;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Modifier modifier, int i2, int i3, Composer composer, int i5) {
        O(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(TemplateFiltersItem.Content content, boolean z2, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        t(content, z2, function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final TemplateFiltersItem.Content filter, final boolean z2, final Function0 onClick, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Integer iconResId;
        Composer composer2;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerKN = composer.KN(1961770202);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(filter) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onClick) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1961770202, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.composables.FilterButton (FilterButton.kt:36)");
                }
                long jHV = !z2 ? aD.w6.HV() : ColorKt.nr(4293519849L);
                long jGD = !z2 ? aD.w6.GD() : Color.INSTANCE.J2();
                RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(12));
                Arrangement arrangement = Arrangement.f17400n;
                float fKN = Dp.KN(4);
                Alignment.Companion companion = Alignment.INSTANCE;
                Arrangement.Horizontal horizontalHI = arrangement.HI(fKN, companion.Uo());
                Alignment.Vertical verticalXMQ = companion.xMQ();
                Modifier modifier5 = modifier4;
                Modifier modifierMUb = PaddingKt.mUb(BackgroundKt.t(BorderKt.J2(ClickableKt.J2(modifier5, false, null, null, onClick, 7, null), Dp.KN(2), jGD, roundedCornerShapeT), jHV, roundedCornerShapeT), Dp.KN(16), Dp.KN(10));
                float f3 = 20;
                Modifier modifierAYN = SizeKt.aYN(modifierMUb, 0.0f, Dp.KN(f3), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalHI, verticalXMQ, composerKN, 54);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAYN);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N);
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyRl, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                iconResId = filter.getIconResId();
                composerKN.eF(-1888041294);
                if (iconResId != null) {
                    composer2 = composerKN;
                } else {
                    IconKt.t(PainterResources_androidKt.t(iconResId.intValue(), composerKN, 0), null, SizeKt.Z(Modifier.INSTANCE, Dp.KN(f3)), 0L, composerKN, 432, 8);
                    composer2 = composerKN;
                }
                composer2.Xw();
                Composer composer4 = composer2;
                TextKt.t((String) filter.getGetText().invoke(composer2, 0), null, aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer2, 6).T(), composer4, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composer3 = composer4;
                composer3.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                composer3 = composerKN;
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: BQ.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Ml.nr(filter, z2, onClick, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            long jHV2 = !z2 ? aD.w6.HV() : ColorKt.nr(4293519849L);
            if (!z2) {
            }
            RoundedCornerShape roundedCornerShapeT2 = RoundedCornerShapeKt.t(Dp.KN(12));
            Arrangement arrangement2 = Arrangement.f17400n;
            float fKN2 = Dp.KN(4);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Arrangement.Horizontal horizontalHI2 = arrangement2.HI(fKN2, companion3.Uo());
            Alignment.Vertical verticalXMQ2 = companion3.xMQ();
            Modifier modifier52 = modifier4;
            Modifier modifierMUb2 = PaddingKt.mUb(BackgroundKt.t(BorderKt.J2(ClickableKt.J2(modifier52, false, null, null, onClick, 7, null), Dp.KN(2), jGD, roundedCornerShapeT2), jHV2, roundedCornerShapeT2), Dp.KN(16), Dp.KN(10));
            float f32 = 20;
            Modifier modifierAYN2 = SizeKt.aYN(modifierMUb2, 0.0f, Dp.KN(f32), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRl2 = RowKt.rl(horizontalHI2, verticalXMQ2, composerKN, 54);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAYN2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyRl2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk2, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion22.nr());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                iconResId = filter.getIconResId();
                composerKN.eF(-1888041294);
                if (iconResId != null) {
                }
                composer2.Xw();
                Composer composer42 = composer2;
                TextKt.t((String) filter.getGetText().invoke(composer2, 0), null, aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer2, 6).T(), composer42, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composer3 = composer42;
                composer3.XQ();
                if (ComposerKt.v()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final void O(final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Composer composerKN = composer.KN(-37926276);
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
                ComposerKt.p5(-37926276, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.composables.PlaceholderFilterButton (FilterButton.kt:67)");
            }
            PB.w6.rl(modifier, j.f468n.n(), composerKN, (i5 & 14) | 48, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: BQ.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ml.J2(modifier, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
