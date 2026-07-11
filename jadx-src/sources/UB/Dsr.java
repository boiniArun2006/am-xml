package UB;

import IG.aC;
import KA9.o;
import KA9.u;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import six.I28;
import u.QJ;
import u.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Dsr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(aC.w6 w6Var, List list, Function1 function1, Function0 function0, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, int i2, int i3, Composer composer, int i5) {
        t(w6Var, list, function1, function0, bitmapLruCache, sceneThumbnailMaker, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function1 function1, ProjectInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ProjectInfo.n) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final aC.w6 viewState, final List templateList, final Function1 onTemplateClicked, final Function0 onCloseButtonClicked, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, Composer composer, final int i2, final int i3) {
        int i5;
        BitmapLruCache bitmapLruCache2;
        int i7;
        SceneThumbnailMaker sceneThumbnailMaker2;
        int i8;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        SceneThumbnailMaker sceneThumbnailMaker3;
        BitmapLruCache bitmapLruCache3;
        final BitmapLruCache bitmapLruCache4;
        final SceneThumbnailMaker sceneThumbnailMaker4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(templateList, "templateList");
        Intrinsics.checkNotNullParameter(onTemplateClicked, "onTemplateClicked");
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Composer composerKN = composer.KN(-1803759621);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(viewState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(templateList) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onTemplateClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onCloseButtonClicked) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                bitmapLruCache2 = bitmapLruCache;
                i5 |= composerKN.p5(bitmapLruCache2) ? 16384 : 8192;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    sceneThumbnailMaker2 = sceneThumbnailMaker;
                    i5 |= composerKN.E2(sceneThumbnailMaker2) ? 131072 : 65536;
                }
                i8 = i5;
                if ((74899 & i8) == 74898 && composerKN.xMQ()) {
                    composerKN.wTp();
                    bitmapLruCache4 = bitmapLruCache2;
                    sceneThumbnailMaker4 = sceneThumbnailMaker2;
                } else {
                    BitmapLruCache bitmapLruCache5 = i9 == 0 ? null : bitmapLruCache2;
                    SceneThumbnailMaker sceneThumbnailMaker5 = i7 == 0 ? null : sceneThumbnailMaker2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1803759621, i8, -1, "com.alightcreative.maineditor.templateimport.ui.TemplateListSheetContent (TemplateListSheetContent.kt:31)");
                    }
                    I28.n nVarRl = six.Wre.rl(composerKN, 0);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierNr = BackgroundKt.nr(SizeKt.KN(SizeKt.t(companion, 0.98f), 0.0f, 1, null), aD.w6.W(), null, 2, null);
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
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
                    Updater.O(composerN, measurePolicyN, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    function2Rl = companion2.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    Dj7.Ml.rl(columnScopeInstance, 0L, composerKN, 6, 1);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(44)), composerKN, 6);
                    six.fuX fux = six.fuX.f73288O;
                    QJ.rl(fux, onCloseButtonClicked, composerKN, ((i8 >> 6) & 112) | 6);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(16)), composerKN, 6);
                    if (templateList.isEmpty()) {
                        composerKN.eF(947481048);
                        List listEmptyList = CollectionsKt.emptyList();
                        u uVarN = viewState.n();
                        LazyListState lazyListStateGh = nVarRl.gh();
                        composerKN.eF(1416048433);
                        boolean z2 = (i8 & 896) == 256;
                        Object objIF = composerKN.iF();
                        if (z2 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function1() { // from class: UB.CN3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Dsr.nr(onTemplateClicked, (ProjectInfo) obj);
                                }
                            };
                            composerKN.o(objIF);
                        }
                        composerKN.Xw();
                        int i10 = (i8 & 112) | 805309824;
                        int i11 = (i8 >> 9) & 1008;
                        sceneThumbnailMaker3 = sceneThumbnailMaker5;
                        bitmapLruCache3 = bitmapLruCache5;
                        o.Uo(nVarRl, templateList, false, listEmptyList, uVarN, lazyListStateGh, null, (Function1) objIF, null, false, null, bitmapLruCache3, sceneThumbnailMaker3, null, composerKN, i10, i11, 9536);
                        composerKN = composerKN;
                        composerKN.Xw();
                    } else {
                        composerKN.eF(947371525);
                        eO.rl(columnScopeInstance, fux, composerKN, 54);
                        composerKN.Xw();
                        bitmapLruCache3 = bitmapLruCache5;
                        sceneThumbnailMaker3 = sceneThumbnailMaker5;
                    }
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    bitmapLruCache4 = bitmapLruCache3;
                    sceneThumbnailMaker4 = sceneThumbnailMaker3;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: UB.fuX
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Dsr.O(viewState, templateList, onTemplateClicked, onCloseButtonClicked, bitmapLruCache4, sceneThumbnailMaker4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 196608;
            sceneThumbnailMaker2 = sceneThumbnailMaker;
            i8 = i5;
            if ((74899 & i8) == 74898) {
                if (i9 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                I28.n nVarRl2 = six.Wre.rl(composerKN, 0);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierNr2 = BackgroundKt.nr(SizeKt.KN(SizeKt.t(companion3, 0.98f), 0.0f, 1, null), aD.w6.W(), null, 2, null);
                MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierNr2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN2, companion22.t());
                Updater.O(composerN, compositionLocalMapIk2, companion22.O());
                function2Rl = companion22.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion22.nr());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                    Dj7.Ml.rl(columnScopeInstance2, 0L, composerKN, 6, 1);
                    SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(44)), composerKN, 6);
                    six.fuX fux2 = six.fuX.f73288O;
                    QJ.rl(fux2, onCloseButtonClicked, composerKN, ((i8 >> 6) & 112) | 6);
                    SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(16)), composerKN, 6);
                    if (templateList.isEmpty()) {
                    }
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                    bitmapLruCache4 = bitmapLruCache3;
                    sceneThumbnailMaker4 = sceneThumbnailMaker3;
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        bitmapLruCache2 = bitmapLruCache;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        sceneThumbnailMaker2 = sceneThumbnailMaker;
        i8 = i5;
        if ((74899 & i8) == 74898) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
