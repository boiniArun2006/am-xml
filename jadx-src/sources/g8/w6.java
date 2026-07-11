package g8;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function4 f67126n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f67127t;

        j(Function4 function4, boolean z2) {
            this.f67126n = function4;
            this.f67127t = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(ColumnScope OutlinedCard, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(OutlinedCard, "$this$OutlinedCard");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-957826291, i2, -1, "com.alightcreative.monetization.stackedintro.components.CheckableCard.<anonymous> (CheckableCard.kt:48)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierKN = SizeKt.KN(PaddingKt.xMQ(SizeKt.J2(companion, 0.0f, 1, null), Dp.KN(16)), 0.0f, 1, null);
            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
            Function4 function4 = this.f67126n;
            boolean z2 = this.f67127t;
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), verticalXMQ, composer, 48);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierKN);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            function4.invoke(rowScopeInstance, Boolean.valueOf(z2), composer, 6);
            SpacerKt.n(RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            AnimatedContentKt.rl(Boolean.valueOf(z2), null, null, null, null, null, Ml.f67066n.rl(), composer, 1572864, 62);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Modifier modifier, boolean z2, Function1 function1, Function4 function4, int i2, int i3, Composer composer, int i5) {
        t(modifier, z2, function1, function4, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function1 function1, boolean z2) {
        function1.invoke(Boolean.valueOf(!z2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Modifier modifier, final boolean z2, final Function1 onSelectionChanged, Function4 function4, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Function4 function4N;
        long jAz;
        boolean z3;
        Object objIF;
        final Function4 function42;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onSelectionChanged, "onSelectionChanged");
        Composer composerKN = composer.KN(1069988438);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
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
            i5 |= composerKN.E2(onSelectionChanged) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                function4N = function4;
                i5 |= composerKN.E2(function4N) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (i8 != 0) {
                    function4N = Ml.f67066n.n();
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1069988438, i5, -1, "com.alightcreative.monetization.stackedintro.components.CheckableCard (CheckableCard.kt:32)");
                }
                long jRl = !z2 ? ColorKt.rl(1291898029) : ColorKt.rl(0);
                if (z2) {
                    composerKN.eF(-1067667965);
                    jAz = Color.az(MaterialTheme.f26164n.n(composerKN, MaterialTheme.rl).getPrimary(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerKN.Xw();
                } else {
                    composerKN.eF(-1067723114);
                    jAz = MaterialTheme.f26164n.n(composerKN, MaterialTheme.rl).getPrimary();
                    composerKN.Xw();
                }
                Modifier modifier5 = modifier4;
                long j2 = jAz;
                int i9 = i5;
                Function4 function43 = function4N;
                CardColors cardColorsRl = CardDefaults.f24661n.rl(jRl, 0L, 0L, 0L, composerKN, CardDefaults.rl << 12, 14);
                BorderStroke borderStrokeN = BorderStrokeKt.n(Dp.KN(2), j2);
                CornerBasedShape large = MaterialTheme.f26164n.rl(composerKN, MaterialTheme.rl).getLarge();
                composerKN.eF(1212524861);
                z3 = ((i9 & 896) != 256) | ((i9 & 112) != 32);
                objIF = composerKN.iF();
                if (!z3 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: g8.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return w6.nr(onSelectionChanged, z2);
                        }
                    };
                    composerKN.o(objIF);
                }
                Function0 function0 = (Function0) objIF;
                composerKN.Xw();
                function42 = function43;
                CardKt.J2(function0, modifier5, false, large, cardColorsRl, null, borderStrokeN, null, ComposableLambdaKt.nr(-957826291, true, new j(function42, z2), composerKN, 54), composerKN, ((i9 << 3) & 112) | 100663296, 164);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                function42 = function4N;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: g8.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return w6.O(modifier3, z2, onSelectionChanged, function42, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        function4N = function4;
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (ComposerKt.v()) {
            }
            if (!z2) {
            }
            if (z2) {
            }
            Modifier modifier52 = modifier4;
            long j22 = jAz;
            int i92 = i5;
            Function4 function432 = function4N;
            CardColors cardColorsRl2 = CardDefaults.f24661n.rl(jRl, 0L, 0L, 0L, composerKN, CardDefaults.rl << 12, 14);
            BorderStroke borderStrokeN2 = BorderStrokeKt.n(Dp.KN(2), j22);
            CornerBasedShape large2 = MaterialTheme.f26164n.rl(composerKN, MaterialTheme.rl).getLarge();
            composerKN.eF(1212524861);
            z3 = ((i92 & 896) != 256) | ((i92 & 112) != 32);
            objIF = composerKN.iF();
            if (!z3) {
                objIF = new Function0() { // from class: g8.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w6.nr(onSelectionChanged, z2);
                    }
                };
                composerKN.o(objIF);
                Function0 function02 = (Function0) objIF;
                composerKN.Xw();
                function42 = function432;
                CardKt.J2(function02, modifier52, false, large2, cardColorsRl2, null, borderStrokeN2, null, ComposableLambdaKt.nr(-957826291, true, new j(function42, z2), composerKN, 54), composerKN, ((i92 << 3) & 112) | 100663296, 164);
                if (ComposerKt.v()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
