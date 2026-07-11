package MuZ;

import SFf.Ew;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: MuZ.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC1419c {

    /* JADX INFO: renamed from: MuZ.c$j */
    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f6845n;

        j(long j2) {
            this.f6845n = j2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(972922233, i2, -1, "com.bendingspoons.legal.privacy.ui.settings.internal.TrackersList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TrackersList.kt:65)");
            }
            Alignment alignmentO = Alignment.INSTANCE.O();
            long j2 = this.f6845n;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, companion);
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            IconKt.nr(InfoKt.n(Icons.Outlined.f23863n), "", SizeKt.Z(companion, Dp.KN(20)), j2, composer, 432, 0);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void nr(final List trackers, final Map preferences, final TextStyle textStyle, final SwitchColors switchColors, long j2, Modifier modifier, final Function2 onTrackerToggled, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        long j3;
        Function1 function12;
        Composer composer2;
        final Modifier modifier3;
        Function1 onInfoButtonClicked = function1;
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(switchColors, "switchColors");
        Intrinsics.checkNotNullParameter(onTrackerToggled, "onTrackerToggled");
        Intrinsics.checkNotNullParameter(onInfoButtonClicked, "onInfoButtonClicked");
        Composer composerKN = composer.KN(-1096303070);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerKN.E2(trackers) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((2 & i3) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(preferences) ? 32 : 16;
        }
        int i7 = i5;
        if ((4 & i3) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.p5(textStyle) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= composerKN.p5(switchColors) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i7 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i7 |= composerKN.nr(j2) ? 16384 : 8192;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i7 |= 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i2 & 196608) == 0) {
                i7 |= composerKN.p5(modifier2) ? 131072 : 65536;
            }
        }
        int i9 = 1572864;
        if ((i3 & 64) != 0) {
            i7 |= i9;
        } else if ((1572864 & i2) == 0) {
            i9 = composerKN.E2(onTrackerToggled) ? 1048576 : 524288;
            i7 |= i9;
        }
        if ((i3 & 128) != 0) {
            i7 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i7 |= composerKN.E2(onInfoButtonClicked) ? 8388608 : 4194304;
        }
        int i10 = i7;
        if ((4793491 & i10) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
            j3 = j2;
            function12 = onInfoButtonClicked;
            composer2 = composerKN;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-1096303070, i10, -1, "com.bendingspoons.legal.privacy.ui.settings.internal.TrackersList (TrackersList.kt:47)");
            }
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composerKN.eF(549354923);
            Iterator it = trackers.iterator();
            while (it.hasNext()) {
                final Ew ew = (Ew) it.next();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierKN = SizeKt.KN(companion2, 0.0f, 1, null);
                Modifier modifier5 = modifier4;
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.nr(), Alignment.INSTANCE.xMQ(), composerKN, 54);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierKN);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                Iterator it2 = it;
                Updater.O(composerN2, measurePolicyRl, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                int i11 = i10;
                Composer composer3 = composerKN;
                TextKt.t(ew.t(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer3, 0, (i10 << 12) & 3670016, 65534);
                composer3.eF(1917195691);
                boolean zE2 = composer3.E2(ew) | ((i11 & 29360128) == 8388608);
                Object objIF = composer3.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: MuZ.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC1419c.O(function1, ew);
                        }
                    };
                    composer3.o(objIF);
                }
                composer3.Xw();
                IconButtonKt.O((Function0) objIF, null, false, null, null, ComposableLambdaKt.nr(972922233, true, new j(j2), composer3, 54), composer3, 196608, 30);
                SpacerKt.n(RowScope.rl(rowScopeInstance, companion2, 1.0f, false, 2, null), composer3, 0);
                State state = (State) preferences.get(ew.t());
                boolean zBooleanValue = state != null ? ((Boolean) state.getValue()).booleanValue() : false;
                composer3.eF(1917216876);
                boolean zE22 = composer3.E2(ew) | ((i11 & 3670016) == 1048576);
                Object objIF2 = composer3.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function1() { // from class: MuZ.QJ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC1419c.J2(onTrackerToggled, ew, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer3.o(objIF2);
                }
                composer3.Xw();
                SwitchKt.n(zBooleanValue, (Function1) objIF2, null, null, false, switchColors, null, composer3, (i11 << 6) & 458752, 92);
                composer3.XQ();
                onInfoButtonClicked = function1;
                composerKN = composer3;
                it = it2;
                modifier4 = modifier5;
                i10 = i11;
            }
            j3 = j2;
            Modifier modifier6 = modifier4;
            function12 = onInfoButtonClicked;
            composer2 = composerKN;
            composer2.Xw();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier6;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final Function1 function13 = function12;
            final long j4 = j3;
            scopeUpdateScopeGh.n(new Function2() { // from class: MuZ.l3D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1419c.Uo(trackers, preferences, textStyle, switchColors, j4, modifier3, onTrackerToggled, function13, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(List list, Map map, TextStyle textStyle, SwitchColors switchColors, long j2, Modifier modifier, Function2 function2, Function1 function1, int i2, int i3, Composer composer, int i5) {
        nr(list, map, textStyle, switchColors, j2, modifier, function2, function1, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Function2 function2, Ew ew, boolean z2) {
        function2.invoke(ew, Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function1 function1, Ew ew) {
        function1.invoke(ew);
        return Unit.INSTANCE;
    }
}
