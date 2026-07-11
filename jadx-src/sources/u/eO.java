package u;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class eO {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[six.fuX.values().length];
            try {
                iArr[six.fuX.f73288O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[six.fuX.f73290n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[six.fuX.f73293t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[six.fuX.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[six.fuX.f73292r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void rl(final ColumnScope columnScope, final six.fuX projectType, Composer composer, final int i2) {
        int i3;
        int i5;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(projectType, "projectType");
        Composer composerKN = composer.KN(1424456901);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(columnScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(projectType) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1424456901, i3, -1, "com.alightcreative.maineditor.templateimport.ui.components.ProjectListSheetEmptyState (ProjectListSheetEmptyState.kt:22)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            SpacerKt.n(ColumnScope.rl(columnScope, companion, 1.0f, false, 2, null), composerKN, 0);
            int i7 = j.$EnumSwitchMapping$0[projectType.ordinal()];
            if (i7 != 1) {
                i5 = 2132019737;
                if (i7 != 2) {
                    if (i7 == 3) {
                        i5 = 2132019730;
                    } else if (i7 == 4) {
                        i5 = 2132019736;
                    } else if (i7 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                i5 = 2132019738;
            }
            TextKt.t(StringResources_androidKt.t(i5, composerKN, 0), PaddingKt.gh(columnScope.t(companion, Alignment.INSTANCE.Uo()), Dp.KN(35), 0.0f, 2, null), aD.w6.F(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).iF(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
            composerKN = composerKN;
            SpacerKt.n(ColumnScope.rl(columnScope, companion, 1.0f, false, 2, null), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: u.Xo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eO.t(columnScope, projectType, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(ColumnScope columnScope, six.fuX fux, int i2, Composer composer, int i3) {
        rl(columnScope, fux, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
