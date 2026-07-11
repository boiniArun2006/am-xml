package com.alightcreative.app.motion.activities.main;

import Dj7.rv6;
import KA9.u;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import com.alightcreative.app.motion.activities.main.SPz;
import com.alightcreative.app.motion.activities.main.s4;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.SceneType;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zRY.AbstractC2495c;
import zRY.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class s4 {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class Ml implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ Function0 f45469O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ SPz f45470n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function0 f45471t;

        public Ml(SPz sPz, Function0 function0, Function0 function02) {
            this.f45470n = sPz;
            this.f45471t = function0;
            this.f45469O = function02;
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
                ComposerKt.p5(-1260043187, i2, -1, "com.alightcreative.app.motion.activities.main.MainBottomSheet.<anonymous> (MainBottomSheet.kt:95)");
            }
            ka.r.rl(((SPz.I28) this.f45470n).n(), this.f45471t, this.f45469O, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ Function0 f45472O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ g9s.n f45473n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function1 f45474t;

        public j(g9s.n nVar, Function1 function1, Function0 function0) {
            this.f45473n = nVar;
            this.f45474t = function1;
            this.f45472O = function0;
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
                ComposerKt.p5(1943109670, i2, -1, "com.alightcreative.app.motion.activities.main.MainBottomSheet.<anonymous> (MainBottomSheet.kt:42)");
            }
            ViewModelProvider.Factory factoryN = zRY.g9s.gh.n(this.f45473n, CollectionsKt.listOf((Object[]) new tN.fuX[]{new tN.fuX(tN.CN3.f73454n, false, 2, null), new tN.fuX(tN.CN3.f73455t, false, 2, null)}));
            composer.eF(297168033);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uW.w6 w6Var = (uW.w6) new ViewModelProvider(viewModelStoreOwnerT, factoryN).n(zRY.g9s.class);
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
            AbstractC2495c.J2((zRY.g9s) w6Var, this.f45474t, this.f45472O, null, composer, 0, 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class n implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ Function0 f45475O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Function0 f45476n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function0 f45477t;

        public n(Function0 function0, Function0 function02, Function0 function03) {
            this.f45476n = function0;
            this.f45477t = function02;
            this.f45475O = function03;
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
                ComposerKt.p5(1488840207, i2, -1, "com.alightcreative.app.motion.activities.main.MainBottomSheet.<anonymous> (MainBottomSheet.kt:62)");
            }
            ka.UGc.rl(this.f45476n, this.f45477t, this.f45475O, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ Function1 f45478O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ SPz f45479n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function0 f45480t;

        public w6(SPz sPz, Function0 function0, Function1 function1) {
            this.f45479n = sPz;
            this.f45480t = function0;
            this.f45478O = function1;
        }

        public static final Unit J2(MutableState mutableState, SceneType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            O(mutableState, it);
            return Unit.INSTANCE;
        }

        public static final Unit Uo(Function0 function0, Function1 function1, ProjectInfo it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function0.invoke();
            function1.invoke((ProjectInfo.n) it);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-2033085138, i2, -1, "com.alightcreative.app.motion.activities.main.MainBottomSheet.<anonymous> (MainBottomSheet.kt:74)");
            }
            composer.eF(-213897148);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(SceneType.SCENE, null, 2, null);
                composer.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composer.Xw();
            List listN = ((SPz.n) this.f45479n).n();
            SceneType sceneTypeNr = nr(mutableState);
            u uVarRl = ((SPz.n) this.f45479n).rl();
            composer.eF(-213887086);
            Object objIF2 = composer.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new Function1() { // from class: com.alightcreative.app.motion.activities.main.UGc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s4.w6.J2(mutableState, (SceneType) obj);
                    }
                };
                composer.o(objIF2);
            }
            Function1 function1 = (Function1) objIF2;
            composer.Xw();
            composer.eF(-213884826);
            boolean zP5 = composer.p5(this.f45480t) | composer.p5(this.f45478O);
            final Function0 function0 = this.f45480t;
            final Function1 function12 = this.f45478O;
            Object objIF3 = composer.iF();
            if (zP5 || objIF3 == companion.n()) {
                objIF3 = new Function1() { // from class: com.alightcreative.app.motion.activities.main.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return s4.w6.Uo(function0, function12, (ProjectInfo) obj);
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            UB.Wre.J2(listN, sceneTypeNr, uVarRl, function1, (Function1) objIF3, this.f45480t, ((SPz.n) this.f45479n).t(), ((SPz.n) this.f45479n).nr(), composer, 3072, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        public static final void O(MutableState mutableState, SceneType sceneType) {
            mutableState.setValue(sceneType);
        }

        public static final SceneType nr(MutableState mutableState) {
            return (SceneType) mutableState.getValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final SPz sPz, final g9s.n viewModelFactory, final ModalBottomSheetState sheetState, final Function0 onBackPressed, final Function1 onPremadeItemClick, final Function0 onCloseButtonClick, final Function0 onRankingAcceptButtonClick, final Function0 onRankingTosLinkClick, final Function0 onRankingPPLinkClick, Function0 onRankingOptOutButtonClick, final Function0 onRankingStayButtonClick, final Function1 onProjectSelectedForUploading, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Function0 function0;
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onPremadeItemClick, "onPremadeItemClick");
        Intrinsics.checkNotNullParameter(onCloseButtonClick, "onCloseButtonClick");
        Intrinsics.checkNotNullParameter(onRankingAcceptButtonClick, "onRankingAcceptButtonClick");
        Intrinsics.checkNotNullParameter(onRankingTosLinkClick, "onRankingTosLinkClick");
        Intrinsics.checkNotNullParameter(onRankingPPLinkClick, "onRankingPPLinkClick");
        Intrinsics.checkNotNullParameter(onRankingOptOutButtonClick, "onRankingOptOutButtonClick");
        Intrinsics.checkNotNullParameter(onRankingStayButtonClick, "onRankingStayButtonClick");
        Intrinsics.checkNotNullParameter(onProjectSelectedForUploading, "onProjectSelectedForUploading");
        Composer composerKN = composer.KN(2002005841);
        if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(sPz) : composerKN.E2(sPz) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? composerKN.p5(viewModelFactory) : composerKN.E2(viewModelFactory) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= (i2 & 512) == 0 ? composerKN.p5(sheetState) : composerKN.E2(sheetState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onBackPressed) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(onPremadeItemClick) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= composerKN.E2(onCloseButtonClick) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= composerKN.E2(onRankingAcceptButtonClick) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= composerKN.E2(onRankingTosLinkClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= composerKN.E2(onRankingPPLinkClick) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= composerKN.E2(onRankingOptOutButtonClick) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.E2(onRankingStayButtonClick) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(onProjectSelectedForUploading) ? 32 : 16;
        }
        if ((i5 & 306783379) == 306783378 && (i7 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            function0 = onRankingOptOutButtonClick;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2002005841, i5, i7, "com.alightcreative.app.motion.activities.main.MainBottomSheet (MainBottomSheet.kt:35)");
            }
            if (sPz instanceof SPz.j) {
                composerKN.eF(-414582384);
                int i8 = i5 >> 6;
                rv6.t(sheetState, onBackPressed, ComposableLambdaKt.nr(1943109670, true, new j(viewModelFactory, onPremadeItemClick, onCloseButtonClick), composerKN, 54), composerKN, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK | (i8 & 14) | (i8 & 112));
                composerKN.Xw();
            } else if (sPz instanceof SPz.Ml) {
                composerKN.eF(-413723529);
                int i9 = i5 >> 6;
                rv6.t(sheetState, onBackPressed, ComposableLambdaKt.nr(1488840207, true, new n(onRankingAcceptButtonClick, onRankingTosLinkClick, onRankingPPLinkClick), composerKN, 54), composerKN, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK | (i9 & 14) | (i9 & 112));
                composerKN.Xw();
            } else if (sPz instanceof SPz.n) {
                composerKN.eF(-413213238);
                int i10 = i5 >> 6;
                rv6.t(sheetState, onBackPressed, ComposableLambdaKt.nr(-2033085138, true, new w6(sPz, onBackPressed, onProjectSelectedForUploading), composerKN, 54), composerKN, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK | (i10 & 14) | (i10 & 112));
                composerKN.Xw();
            } else {
                if (sPz instanceof SPz.I28) {
                    composerKN.eF(-412255989);
                    function0 = onRankingOptOutButtonClick;
                    int i11 = i5 >> 6;
                    rv6.t(sheetState, onBackPressed, ComposableLambdaKt.nr(-1260043187, true, new Ml(sPz, function0, onRankingStayButtonClick), composerKN, 54), composerKN, ModalBottomSheetState.f22280O | RendererCapabilities.DECODER_SUPPORT_MASK | (i11 & 14) | (i11 & 112));
                    composerKN.Xw();
                } else {
                    function0 = onRankingOptOutButtonClick;
                    composerKN.eF(-411841209);
                    composerKN.Xw();
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
            function0 = onRankingOptOutButtonClick;
            if (ComposerKt.v()) {
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Function0 function02 = function0;
            scopeUpdateScopeGh.n(new Function2() { // from class: KC.D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return com.alightcreative.app.motion.activities.main.s4.t(sPz, viewModelFactory, sheetState, onBackPressed, onPremadeItemClick, onCloseButtonClick, onRankingAcceptButtonClick, onRankingTosLinkClick, onRankingPPLinkClick, function02, onRankingStayButtonClick, onProjectSelectedForUploading, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit t(SPz sPz, g9s.n nVar, ModalBottomSheetState modalBottomSheetState, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function1 function12, int i2, int i3, Composer composer, int i5) {
        rl(sPz, nVar, modalBottomSheetState, function0, function1, function02, function03, function04, function05, function06, function07, function12, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
        return Unit.INSTANCE;
    }
}
