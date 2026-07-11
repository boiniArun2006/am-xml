package KA9;

import Dj7.FKk;
import Dj7.pq;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.scene.SceneType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Md {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(six.CN3 cn3, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1, int i2, Composer composer, int i3) {
        O(cn3, z2, z3, z4, z5, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(SceneType sceneType, boolean z2, Function1 function1, int i2, Composer composer, int i3) {
        nr(sceneType, z2, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void O(final six.CN3 selectedFilterType, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Function1 onSelectedFilterType, Composer composer, final int i2) {
        int i3;
        boolean z6;
        Intrinsics.checkNotNullParameter(selectedFilterType, "selectedFilterType");
        Intrinsics.checkNotNullParameter(onSelectedFilterType, "onSelectedFilterType");
        Composer composerKN = composer.KN(-230757232);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(selectedFilterType) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z6 = z2;
            i3 |= composerKN.n(z6) ? 32 : 16;
        } else {
            z6 = z2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.n(z5) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onSelectedFilterType) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-230757232, i3, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.SceneTypeButtonsRow (SceneTypeButtonsRow.kt:30)");
            }
            FKk fKk = new FKk(StringResources_androidKt.t(2132020288, composerKN, 6), six.CN3.f73284t, false);
            FKk fKk2 = new FKk(StringResources_androidKt.t(2132020289, composerKN, 6), six.CN3.f73279O, false);
            if (!z4) {
                fKk2 = null;
            }
            FKk fKk3 = new FKk(StringResources_androidKt.t(2132020286, composerKN, 6), six.CN3.J2, false);
            FKk fKk4 = new FKk(StringResources_androidKt.t(2132017442, composerKN, 6), six.CN3.f73283r, z5);
            if (!z3) {
                fKk4 = null;
            }
            pq.J2(CollectionsKt.listOfNotNull((Object[]) new FKk[]{fKk, fKk2, fKk3, fKk4}), selectedFilterType, onSelectedFilterType, null, z6, 0.0f, 0.0f, 0.0f, composerKN, ((i3 << 3) & 112) | ((i3 >> 9) & 896) | ((i3 << 9) & 57344), 232);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Md.J2(selectedFilterType, z2, z3, z4, z5, onSelectedFilterType, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function1 function1, six.CN3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it.nr());
        return Unit.INSTANCE;
    }

    public static final void nr(final SceneType selectedSceneType, boolean z2, final Function1 onSelectedSceneType, Composer composer, final int i2) {
        int i3;
        final boolean z3;
        Intrinsics.checkNotNullParameter(selectedSceneType, "selectedSceneType");
        Intrinsics.checkNotNullParameter(onSelectedSceneType, "onSelectedSceneType");
        Composer composerKN = composer.KN(415473753);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(selectedSceneType) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onSelectedSceneType) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            z3 = z2;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(415473753, i3, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.SceneTypeButtonsRow (SceneTypeButtonsRow.kt:66)");
            }
            six.CN3 cn3Rl = six.CN3.f73281n.rl(selectedSceneType);
            composerKN.eF(1176210794);
            boolean z4 = (i3 & 896) == 256;
            Object objIF = composerKN.iF();
            if (z4 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: KA9.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Md.Uo(onSelectedSceneType, (six.CN3) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            z3 = z2;
            O(cn3Rl, z3, false, false, false, (Function1) objIF, composerKN, (i3 & 112) | 28032);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.psW
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Md.KN(selectedSceneType, z3, onSelectedSceneType, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
