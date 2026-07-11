package UB;

import KA9.Md;
import KA9.o;
import KA9.u;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import six.I28;
import u.QJ;
import u.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Wre {

    static final class j implements Function3 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ u f10620O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ I28.j f10621n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f10622o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ BitmapLruCache f10623r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f10624t;

        j(I28.j jVar, List list, u uVar, Function1 function1, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker) {
            this.f10621n = jVar;
            this.f10624t = list;
            this.f10620O = uVar;
            this.J2 = function1;
            this.f10623r = bitmapLruCache;
            this.f10622o = sceneThumbnailMaker;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(-427347171, i2, -1, "com.alightcreative.maineditor.templateimport.ui.ProjectListSheetContent.<anonymous>.<anonymous>.<anonymous> (ProjectListSheetContent.kt:76)");
            }
            I28.j jVar = this.f10621n;
            List list = this.f10624t;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ProjectInfo) obj).getType() == SceneType.SCENE) {
                    arrayList.add(obj);
                }
            }
            o.Uo(jVar, arrayList, false, CollectionsKt.emptyList(), this.f10620O, (LazyListState) this.f10621n.gh().get(0), null, this.J2, null, false, null, this.f10623r, this.f10622o, null, composer, 805309824, 0, 9536);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function3 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ u f10625O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ I28.j f10626n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f10627o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ BitmapLruCache f10628r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f10629t;

        n(I28.j jVar, List list, u uVar, Function1 function1, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker) {
            this.f10626n = jVar;
            this.f10629t = list;
            this.f10625O = uVar;
            this.J2 = function1;
            this.f10628r = bitmapLruCache;
            this.f10627o = sceneThumbnailMaker;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(1652814100, i2, -1, "com.alightcreative.maineditor.templateimport.ui.ProjectListSheetContent.<anonymous>.<anonymous>.<anonymous> (ProjectListSheetContent.kt:94)");
            }
            I28.j jVar = this.f10626n;
            List list = this.f10629t;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ProjectInfo) obj).getType() == SceneType.ELEMENT) {
                    arrayList.add(obj);
                }
            }
            o.Uo(jVar, arrayList, false, CollectionsKt.emptyList(), this.f10625O, (LazyListState) this.f10626n.gh().get(1), null, this.J2, null, false, null, this.f10628r, this.f10627o, null, composer, 805309824, 0, 9536);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int KN(MutableState mutableState, int i2) {
        return (-i2) + qie(mutableState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int xMQ(MutableState mutableState, int i2) {
        return (-i2) + qie(mutableState);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0426  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final List projectList, final SceneType selectedSceneType, final u selectedSortOption, final Function1 onSelectedSceneType, final Function1 function1, final Function0 onCloseButtonClicked, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, Composer composer, final int i2, final int i3) {
        int i5;
        BitmapLruCache bitmapLruCache2;
        SceneThumbnailMaker sceneThumbnailMaker2;
        BitmapLruCache bitmapLruCache3;
        Function1 onProjectClicked = function1;
        Intrinsics.checkNotNullParameter(projectList, "projectList");
        Intrinsics.checkNotNullParameter(selectedSceneType, "selectedSceneType");
        Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
        Intrinsics.checkNotNullParameter(onSelectedSceneType, "onSelectedSceneType");
        Intrinsics.checkNotNullParameter(onProjectClicked, "onProjectClicked");
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Composer composerKN = composer.KN(915182117);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerKN.E2(projectList) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(selectedSceneType) ? 32 : 16;
        }
        int i7 = i5;
        if ((i3 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.p5(selectedSortOption) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= composerKN.E2(onSelectedSceneType) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i7 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i7 |= composerKN.E2(onProjectClicked) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i7 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i7 |= composerKN.E2(onCloseButtonClicked) ? 131072 : 65536;
        }
        int i8 = i3 & 64;
        if (i8 != 0) {
            i7 |= 1572864;
            bitmapLruCache2 = bitmapLruCache;
        } else {
            bitmapLruCache2 = bitmapLruCache;
            if ((i2 & 1572864) == 0) {
                i7 |= composerKN.p5(bitmapLruCache2) ? 1048576 : 524288;
            }
        }
        int i9 = 128 & i3;
        if (i9 != 0) {
            i7 |= 12582912;
            sceneThumbnailMaker2 = sceneThumbnailMaker;
        } else {
            sceneThumbnailMaker2 = sceneThumbnailMaker;
            if ((i2 & 12582912) == 0) {
                i7 |= composerKN.E2(sceneThumbnailMaker2) ? 8388608 : 4194304;
            }
        }
        if ((i7 & 4793491) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
            bitmapLruCache3 = bitmapLruCache2;
        } else {
            BitmapLruCache bitmapLruCache4 = i8 != 0 ? null : bitmapLruCache2;
            if (i9 != 0) {
                sceneThumbnailMaker2 = null;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(915182117, i7, -1, "com.alightcreative.maineditor.templateimport.ui.ProjectListSheetContent (ProjectListSheetContent.kt:43)");
            }
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            composerKN.eF(598884571);
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Integer.valueOf(density.How(Dp.KN(16))), null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            int i10 = i7;
            bitmapLruCache3 = bitmapLruCache4;
            I28.j jVarN = six.Wre.n(composerKN, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNr = BackgroundKt.nr(SizeKt.KN(SizeKt.t(companion, 0.98f), 0.0f, 1, null), aD.w6.W(), null, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Dj7.Ml.rl(columnScopeInstance, 0L, composerKN, 6, 1);
            composerKN = composerKN;
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(44)), composerKN, 6);
            QJ.rl(six.Dsr.rl(selectedSceneType, null, 1, null), onCloseButtonClicked, composerKN, (i10 >> 12) & 112);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(32)), composerKN, 6);
            int i11 = i10 >> 3;
            Md.nr(selectedSceneType, true, onSelectedSceneType, composerKN, (i11 & 896) | (i11 & 14) | 48);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(16)), composerKN, 6);
            if (projectList == null || !projectList.isEmpty()) {
                Iterator it = projectList.iterator();
                while (it.hasNext()) {
                    if (((ProjectInfo) it.next()).getType() == selectedSceneType) {
                        composerKN.eF(-296007867);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                        int iN2 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion3);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0 function0N2 = companion4.n();
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
                        Updater.O(composerN2, measurePolicyUo, companion4.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                        Function2 function2Rl2 = companion4.rl();
                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO2, companion4.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        boolean z2 = selectedSceneType == SceneType.SCENE;
                        composerKN.eF(-1792110927);
                        Object objIF2 = composerKN.iF();
                        Composer.Companion companion5 = Composer.INSTANCE;
                        if (objIF2 == companion5.n()) {
                            objIF2 = new Function1() { // from class: UB.j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(Wre.KN(mutableState, ((Integer) obj).intValue()));
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        composerKN.Xw();
                        EnterTransition enterTransitionTe = EnterExitTransitionKt.te(null, (Function1) objIF2, 1, null);
                        composerKN.eF(-1792108559);
                        Object objIF3 = composerKN.iF();
                        if (objIF3 == companion5.n()) {
                            objIF3 = new Function1() { // from class: UB.n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(Wre.xMQ(mutableState, ((Integer) obj).intValue()));
                                }
                            };
                            composerKN.o(objIF3);
                        }
                        composerKN.Xw();
                        AnimatedVisibilityKt.Uo(columnScopeInstance, z2, null, enterTransitionTe, EnterExitTransitionKt.X(null, (Function1) objIF3, 1, null), null, ComposableLambdaKt.nr(-427347171, true, new j(jVarN, projectList, selectedSortOption, onProjectClicked, bitmapLruCache3, sceneThumbnailMaker2), composerKN, 54), composerKN, 1600518, 18);
                        boolean z3 = selectedSceneType == SceneType.ELEMENT;
                        composerKN.eF(-1792079792);
                        Object objIF4 = composerKN.iF();
                        if (objIF4 == companion5.n()) {
                            objIF4 = new Function1() { // from class: UB.w6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(Wre.mUb(mutableState, ((Integer) obj).intValue()));
                                }
                            };
                            composerKN.o(objIF4);
                        }
                        composerKN.Xw();
                        EnterTransition enterTransitionTe2 = EnterExitTransitionKt.te(null, (Function1) objIF4, 1, null);
                        composerKN.eF(-1792077456);
                        Object objIF5 = composerKN.iF();
                        if (objIF5 == companion5.n()) {
                            objIF5 = new Function1() { // from class: UB.Ml
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(Wre.Uo(mutableState, ((Integer) obj).intValue()));
                                }
                            };
                            composerKN.o(objIF5);
                        }
                        composerKN.Xw();
                        AnimatedVisibilityKt.Uo(columnScopeInstance, z3, null, enterTransitionTe2, EnterExitTransitionKt.X(null, (Function1) objIF5, 1, null), null, ComposableLambdaKt.nr(1652814100, true, new n(jVarN, projectList, selectedSortOption, function1, bitmapLruCache3, sceneThumbnailMaker2), composerKN, 54), composerKN, 1600518, 18);
                        composerKN = composerKN;
                        composerKN.XQ();
                        composerKN.Xw();
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    } else {
                        onProjectClicked = function1;
                    }
                }
                composerKN.eF(-296170555);
                eO.rl(columnScopeInstance, six.Dsr.rl(selectedSceneType, null, 1, null), composerKN, 6);
                composerKN.Xw();
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
            } else {
                composerKN.eF(-296170555);
                eO.rl(columnScopeInstance, six.Dsr.rl(selectedSceneType, null, 1, null), composerKN, 6);
                composerKN.Xw();
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
            }
        }
        final SceneThumbnailMaker sceneThumbnailMaker3 = sceneThumbnailMaker2;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final BitmapLruCache bitmapLruCache5 = bitmapLruCache3;
            scopeUpdateScopeGh.n(new Function2() { // from class: UB.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.gh(projectList, selectedSceneType, selectedSortOption, onSelectedSceneType, function1, onCloseButtonClicked, bitmapLruCache5, sceneThumbnailMaker3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(List list, SceneType sceneType, u uVar, Function1 function1, Function1 function12, Function0 function0, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, int i2, int i3, Composer composer, int i5) {
        J2(list, sceneType, uVar, function1, function12, function0, bitmapLruCache, sceneThumbnailMaker, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Uo(MutableState mutableState, int i2) {
        return i2 - qie(mutableState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mUb(MutableState mutableState, int i2) {
        return i2 - qie(mutableState);
    }

    private static final int qie(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }
}
