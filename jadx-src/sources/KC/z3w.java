package KC;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class z3w {
    public static final void rl(final M.CN3[] tabs, final List selectedProjects, M.CN3 selectedTab, final int i2, final boolean z2, final Function1 onTabClicked, final Function0 onCreateProjectClicked, final Function0 onCancelClicked, final Function0 onExportClicked, final Function0 onDuplicateClicked, final Function0 onDeleteClicked, Composer composer, final int i3, final int i5) {
        int i7;
        boolean z3;
        int i8;
        M.CN3 cn3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedProjects, "selectedProjects");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(onTabClicked, "onTabClicked");
        Intrinsics.checkNotNullParameter(onCreateProjectClicked, "onCreateProjectClicked");
        Intrinsics.checkNotNullParameter(onCancelClicked, "onCancelClicked");
        Intrinsics.checkNotNullParameter(onExportClicked, "onExportClicked");
        Intrinsics.checkNotNullParameter(onDuplicateClicked, "onDuplicateClicked");
        Intrinsics.checkNotNullParameter(onDeleteClicked, "onDeleteClicked");
        Composer composerKN = composer.KN(1748132210);
        if ((i3 & 6) == 0) {
            i7 = (composerKN.E2(tabs) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(selectedProjects) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.p5(selectedTab) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.t(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            z3 = z2;
            i7 |= composerKN.n(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if ((i3 & 196608) == 0) {
            i7 |= composerKN.E2(onTabClicked) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i7 |= composerKN.E2(onCreateProjectClicked) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= composerKN.E2(onCancelClicked) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= composerKN.E2(onExportClicked) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i7 |= composerKN.E2(onDuplicateClicked) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i8 = i5 | (composerKN.E2(onDeleteClicked) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i7 & 306783379) == 306783378 && (i8 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            cn3 = selectedTab;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1748132210, i7, i8, "com.alightcreative.app.motion.activities.main.MainContent (MainActivityContent.kt:32)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int i9 = i8;
            int i10 = i7;
            Modifier modifierNr = BackgroundKt.nr(SizeKt.J2(companion, 0.0f, 1, null), Color.INSTANCE.J2(), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            if (selectedProjects.isEmpty()) {
                composerKN.eF(-2146979946);
                int i11 = i10 >> 12;
                int i12 = (i10 & 14) | (i11 & 112) | (i11 & 896);
                int i13 = i10 << 3;
                DT.nr(tabs, onTabClicked, onCreateProjectClicked, selectedTab, i2, z3, boxScopeInstance.n(companion, companion2.rl()), composerKN, i12 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                cn3 = selectedTab;
                composer2 = composerKN;
                composer2.Xw();
            } else {
                cn3 = selectedTab;
                composerKN.eF(-2146573567);
                jOL.o.t(selectedProjects.size(), onCancelClicked, boxScopeInstance.n(companion, companion2.az()), composerKN, (i10 >> 18) & 112, 0);
                AbstractC1383Dt.Uo(onExportClicked, cn3 != M.CN3.f6256g ? onDuplicateClicked : null, onDeleteClicked, boxScopeInstance.n(companion, companion2.rl()), composerKN, ((i10 >> 24) & 14) | ((i9 << 6) & 896), 0);
                composer2 = composerKN;
                composer2.Xw();
            }
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final M.CN3 cn32 = cn3;
            scopeUpdateScopeGh.n(new Function2() { // from class: KC.Qik
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z3w.t(tabs, selectedProjects, cn32, i2, z2, onTabClicked, onCreateProjectClicked, onCancelClicked, onExportClicked, onDuplicateClicked, onDeleteClicked, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(M.CN3[] cn3Arr, List list, M.CN3 cn3, int i2, boolean z2, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i3, int i5, Composer composer, int i7) {
        rl(cn3Arr, list, cn3, i2, z2, function1, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5));
        return Unit.INSTANCE;
    }
}
