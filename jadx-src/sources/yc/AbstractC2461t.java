package yc;

import IG.aC;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yc.AbstractC2461t;
import zRY.AbstractC2495c;
import zRY.g9s;

/* JADX INFO: renamed from: yc.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC2461t {

    /* JADX INFO: renamed from: yc.t$j */
    static final class j implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f76115O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f76116Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f76117n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ BitmapLruCache f76118o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f76119r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ IG.aC f76120t;

        j(List list, IG.aC aCVar, Function1 function1, Function1 function12, Function0 function0, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker) {
            this.f76117n = list;
            this.f76120t = aCVar;
            this.f76115O = function1;
            this.J2 = function12;
            this.f76119r = function0;
            this.f76118o = bitmapLruCache;
            this.f76116Z = sceneThumbnailMaker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, ProjectInfo it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it.getId());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-643040230, i2, -1, "com.alightcreative.app.motion.activities.edit.EditBottomSheet.<anonymous> (EditBottomSheet.kt:41)");
            }
            List list = this.f76117n;
            SceneType sceneTypeN = ((aC.n) this.f76120t).n();
            KA9.u uVarRl = ((aC.n) this.f76120t).rl();
            Function1 function1 = this.f76115O;
            composer.eF(-1807135255);
            boolean zP5 = composer.p5(this.J2);
            final Function1 function12 = this.J2;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: yc.c7r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC2461t.j.t(function12, (ProjectInfo) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            UB.Wre.J2(list, sceneTypeN, uVarRl, function1, (Function1) objIF, this.f76119r, this.f76118o, this.f76116Z, composer, 0, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: yc.t$n */
    static final class n implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f76121O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ IG.aC f76122n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f76123o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ BitmapLruCache f76124r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f76125t;

        n(IG.aC aCVar, List list, Function1 function1, Function0 function0, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker) {
            this.f76122n = aCVar;
            this.f76125t = list;
            this.f76121O = function1;
            this.J2 = function0;
            this.f76124r = bitmapLruCache;
            this.f76123o = sceneThumbnailMaker;
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
                ComposerKt.p5(78726531, i2, -1, "com.alightcreative.app.motion.activities.edit.EditBottomSheet.<anonymous> (EditBottomSheet.kt:60)");
            }
            UB.Dsr.t((aC.w6) this.f76122n, this.f76125t, this.f76121O, this.J2, this.f76124r, this.f76123o, composer, 0, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: yc.t$w6 */
    static final class w6 implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f76126O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ g9s.n f76127n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ IG.aC f76128t;

        /* JADX INFO: renamed from: yc.t$w6$j */
        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[tN.CN3.values().length];
                try {
                    iArr[tN.CN3.f73454n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[tN.CN3.f73455t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        w6(g9s.n nVar, IG.aC aCVar, Function1 function1, Function0 function0) {
            this.f76127n = nVar;
            this.f76128t = aCVar;
            this.f76126O = function1;
            this.J2 = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            tN.fuX fux;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1794487006, i2, -1, "com.alightcreative.app.motion.activities.edit.EditBottomSheet.<anonymous> (EditBottomSheet.kt:76)");
            }
            g9s.j jVar = zRY.g9s.gh;
            g9s.n nVar = this.f76127n;
            int i3 = j.$EnumSwitchMapping$0[((aC.j) this.f76128t).n().ordinal()];
            if (i3 == 1) {
                fux = new tN.fuX(tN.CN3.f73454n, false, 2, null);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fux = new tN.fuX(tN.CN3.f73455t, false, 2, null);
            }
            ViewModelProvider.Factory factoryN = jVar.n(nVar, CollectionsKt.listOf(fux));
            String strName = ((aC.j) this.f76128t).n().name();
            composer.eF(297168033);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStoreOwnerT, factoryN);
            uW.w6 w6Var = strName != null ? (uW.w6) viewModelProvider.rl(strName, zRY.g9s.class) : (uW.w6) viewModelProvider.n(zRY.g9s.class);
            composer.eF(-589589419);
            Lifecycle lifecycleRegistry = ((LifecycleOwner) composer.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycleRegistry();
            composer.eF(23938127);
            boolean zE2 = composer.E2(w6Var) | composer.E2(lifecycleRegistry);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new uW.Wre(w6Var, lifecycleRegistry, null);
                composer.o(objIF);
            }
            composer.Xw();
            EffectsKt.nr(w6Var, lifecycleRegistry, (Function2) objIF, composer, 0);
            composer.Xw();
            composer.Xw();
            AbstractC2495c.J2((zRY.g9s) w6Var, this.f76126O, this.J2, null, composer, 0, 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(IG.aC aCVar, final g9s.n viewModelFactory, final Function0 onBackPressed, final Function1 onSelectedSceneType, final Function1 onElementSelectedForAdding, Function0 function0, final Function1 onPremadeItemClicked, final Function1 onTemplateSelected, final List projectsList, final List templatesList, final BitmapLruCache elementThumbnailCache, final SceneThumbnailMaker elementThumbnailMaker, ModalBottomSheetState sheetState, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        ModalBottomSheetState modalBottomSheetState;
        final IG.aC aCVar2 = aCVar;
        Function0 onCloseButtonClicked = function0;
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onSelectedSceneType, "onSelectedSceneType");
        Intrinsics.checkNotNullParameter(onElementSelectedForAdding, "onElementSelectedForAdding");
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(onPremadeItemClicked, "onPremadeItemClicked");
        Intrinsics.checkNotNullParameter(onTemplateSelected, "onTemplateSelected");
        Intrinsics.checkNotNullParameter(projectsList, "projectsList");
        Intrinsics.checkNotNullParameter(templatesList, "templatesList");
        Intrinsics.checkNotNullParameter(elementThumbnailCache, "elementThumbnailCache");
        Intrinsics.checkNotNullParameter(elementThumbnailMaker, "elementThumbnailMaker");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Composer composerKN = composer.KN(-258138683);
        if ((i2 & 6) == 0) {
            i5 = i2 | ((i2 & 8) == 0 ? composerKN.p5(aCVar2) : composerKN.E2(aCVar2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? composerKN.p5(viewModelFactory) : composerKN.E2(viewModelFactory) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onBackPressed) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onSelectedSceneType) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(onElementSelectedForAdding) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= composerKN.E2(onCloseButtonClicked) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= composerKN.E2(onPremadeItemClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= composerKN.E2(onTemplateSelected) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= composerKN.E2(projectsList) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= composerKN.E2(templatesList) ? 536870912 : 268435456;
        }
        int i8 = i5;
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.p5(elementThumbnailCache) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(elementThumbnailMaker) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= (i3 & 512) == 0 ? composerKN.p5(sheetState) : composerKN.E2(sheetState) ? 256 : 128;
        }
        int i9 = i7;
        if ((i8 & 306783379) == 306783378 && (i9 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modalBottomSheetState = sheetState;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-258138683, i8, i9, "com.alightcreative.app.motion.activities.edit.EditBottomSheet (EditBottomSheet.kt:34)");
            }
            if (aCVar2 instanceof aC.n) {
                composerKN.eF(2141973026);
                j jVar = new j(projectsList, aCVar2, onSelectedSceneType, onElementSelectedForAdding, onCloseButtonClicked, elementThumbnailCache, elementThumbnailMaker);
                aCVar2 = aCVar2;
                modalBottomSheetState = sheetState;
                Dj7.rv6.t(modalBottomSheetState, onBackPressed, ComposableLambdaKt.nr(-643040230, true, jVar, composerKN, 54), composerKN, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK | ((i9 >> 6) & 14) | ((i8 >> 3) & 112));
                composerKN.Xw();
                onCloseButtonClicked = function0;
            } else {
                modalBottomSheetState = sheetState;
                if (aCVar2 instanceof aC.w6) {
                    composerKN.eF(2142781661);
                    onCloseButtonClicked = function0;
                    Dj7.rv6.t(modalBottomSheetState, onBackPressed, ComposableLambdaKt.nr(78726531, true, new n(aCVar2, templatesList, onTemplateSelected, function0, elementThumbnailCache, elementThumbnailMaker), composerKN, 54), composerKN, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK | ((i9 >> 6) & 14) | ((i8 >> 3) & 112));
                    composerKN.Xw();
                } else {
                    onCloseButtonClicked = function0;
                    if (aCVar2 instanceof aC.j) {
                        composerKN.eF(2143401568);
                        Dj7.rv6.t(modalBottomSheetState, onBackPressed, ComposableLambdaKt.nr(-1794487006, true, new w6(viewModelFactory, aCVar2, onPremadeItemClicked, onCloseButtonClicked), composerKN, 54), composerKN, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK | ((i9 >> 6) & 14) | ((i8 >> 3) & 112));
                        composerKN.Xw();
                    } else {
                        composerKN.eF(2144441959);
                        composerKN.Xw();
                    }
                }
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Function0 function02 = onCloseButtonClicked;
            final ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
            scopeUpdateScopeGh.n(new Function2() { // from class: yc.xuv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2461t.t(aCVar2, viewModelFactory, onBackPressed, onSelectedSceneType, onElementSelectedForAdding, function02, onPremadeItemClicked, onTemplateSelected, projectsList, templatesList, elementThumbnailCache, elementThumbnailMaker, modalBottomSheetState2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(IG.aC aCVar, g9s.n nVar, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function1 function13, Function1 function14, List list, List list2, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, ModalBottomSheetState modalBottomSheetState, int i2, int i3, Composer composer, int i5) {
        rl(aCVar, nVar, function0, function1, function12, function02, function13, function14, list, list2, bitmapLruCache, sceneThumbnailMaker, modalBottomSheetState, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
        return Unit.INSTANCE;
    }
}
