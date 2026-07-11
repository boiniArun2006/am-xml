package mA;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f70630n = ColorKt.nr(4282599531L);
    private static final long rl = ColorKt.nr(4285494430L);

    static final class j implements Function3 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f70631O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Painter f70632n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f70633t;

        public final void n(ColumnScope Card, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(329651245, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.composables.GetStartedCard.<anonymous> (GetStartedCard.kt:97)");
            }
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalN = arrangement.n();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 200;
            float f4 = 16;
            Modifier modifierRl = IntrinsicKt.rl(PaddingKt.az(PaddingKt.xMQ(SizeKt.aYN(companion, Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 12, null), Dp.KN(f4)), 0.0f, Dp.KN(24), 0.0f, 0.0f, 13, null), IntrinsicSize.f17696n);
            Painter painter = this.f70632n;
            String str = this.f70633t;
            String str2 = this.f70631O;
            String str3 = this.J2;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalN, companion2.gh(), composer, 6);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierRl);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N);
            } else {
                composer.r();
            }
            Composer composerN = Updater.n(composer);
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            float f5 = 36;
            IconKt.t(painter, str, SizeKt.Z(companion, Dp.KN(f5)), Wre.KN(), composer, 3456, 0);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(10)), composer, 6);
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(str, IntrinsicKt.rl(companion, IntrinsicSize.f17697t), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).g(), composer, 48, 0, 65532);
            TextKt.t(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).wTp(), composer, 0, 0, 65534);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(6));
            Alignment.Vertical verticalXMQ = companion2.xMQ();
            Modifier modifierT = columnScopeInstance.t(companion, companion2.mUb());
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalTy, verticalXMQ, composer, 54);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierT);
            Function0 function0N2 = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N2);
            } else {
                composer.r();
            }
            Composer composerN2 = Updater.n(composer);
            Updater.O(composerN2, measurePolicyRl, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            TextKt.t(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).Z(), composer, 0, 0, 65534);
            Modifier modifierT2 = BackgroundKt.t(SizeKt.Z(companion, Dp.KN(f5)), Wre.Uo(), RoundedCornerShapeKt.J2());
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN3 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk3 = composer.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composer, modifierT2);
            Function0 function0N3 = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N3);
            } else {
                composer.r();
            }
            Composer composerN3 = Updater.n(composer);
            Updater.O(composerN3, measurePolicyUo, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            IconKt.t(PainterResources_androidKt.t(2131231533, composer, 6), null, BoxScopeInstance.f17448n.n(SizeKt.Z(companion, Dp.KN(f4)), companion2.O()), Color.INSTANCE.KN(), composer, 3120, 0);
            composer.XQ();
            composer.XQ();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j(Painter painter, String str, String str2, String str3) {
            this.f70632n = painter;
            this.f70633t = str;
            this.f70631O = str2;
            this.J2 = str3;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(String str, String str2, String str3, Painter painter, long j2, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        O(str, str2, str3, painter, j2, function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final long KN() {
        return f70630n;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final String title, final String description, final String timeLabel, final Painter iconPainter, final long j2, final Function0 onClick, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(timeLabel, "timeLabel");
        Intrinsics.checkNotNullParameter(iconPainter, "iconPainter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerKN = composer.KN(-1751972414);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(title) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(description) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(timeLabel) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(iconPainter) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.nr(j2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= composerKN.E2(onClick) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        if (i7 == 0) {
            if ((1572864 & i2) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i5) == 599186 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1751972414, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.composables.GetStartedCard (GetStartedCard.kt:88)");
                }
                RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(16));
                int i8 = i5;
                CardColors cardColorsRl = CardDefaults.f24661n.rl(j2, 0L, 0L, 0L, composerKN, ((i8 >> 12) & 14) | (CardDefaults.rl << 12), 14);
                composerKN = composerKN;
                int i9 = i8 >> 15;
                Modifier modifier5 = modifier4;
                CardKt.rl(onClick, modifier5, false, roundedCornerShapeT, cardColorsRl, null, null, null, ComposableLambdaKt.nr(329651245, true, new j(iconPainter, title, description, timeLabel), composerKN, 54), composerKN, (i9 & 14) | 100663296 | (i9 & 112), 228);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: mA.I28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wre.J2(title, description, timeLabel, iconPainter, j2, onClick, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i5) == 599186) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            RoundedCornerShape roundedCornerShapeT2 = RoundedCornerShapeKt.t(Dp.KN(16));
            int i82 = i5;
            CardColors cardColorsRl2 = CardDefaults.f24661n.rl(j2, 0L, 0L, 0L, composerKN, ((i82 >> 12) & 14) | (CardDefaults.rl << 12), 14);
            composerKN = composerKN;
            int i92 = i82 >> 15;
            Modifier modifier52 = modifier4;
            CardKt.rl(onClick, modifier52, false, roundedCornerShapeT2, cardColorsRl2, null, null, null, ComposableLambdaKt.nr(329651245, true, new j(iconPainter, title, description, timeLabel), composerKN, 54), composerKN, (i92 & 14) | 100663296 | (i92 & 112), 228);
            if (ComposerKt.v()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final long Uo() {
        return rl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(CN3 cn3, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        t(cn3, function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void t(final CN3 type, final Function0 onClick, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerKN = composer.KN(-552232908);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(type) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onClick) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.v()) {
                ComposerKt.p5(-552232908, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.composables.GetStartedCard (GetStartedCard.kt:39)");
            }
            O(StringResources_androidKt.t(type.KN(), composerKN, 0), StringResources_androidKt.t(type.t(), composerKN, 0), StringResources_androidKt.t(type.Uo(), composerKN, 0), PainterResources_androidKt.t(type.J2(), composerKN, 0), type.rl(), onClick, modifier3, composerKN, 4128768 & (i5 << 12), 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: mA.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.nr(type, onClick, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
