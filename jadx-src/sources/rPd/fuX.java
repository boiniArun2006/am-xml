package rPd;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.OnBackPressedCallback;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rPd.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class fuX {

    static final class j implements Function2 {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f73035O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f73036n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f73037t;

        j(Function0 function0, Function0 function02, boolean z2, Function2 function2) {
            this.f73036n = function0;
            this.f73037t = function02;
            this.f73035O = z2;
            this.J2 = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0, OnBackPressedCallback BackPressHandler) {
            Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
            function0.invoke();
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
                ComposerKt.p5(966196747, i2, -1, "com.alightcreative.privacy.ui.components.PrivacySettingsWrapper.<anonymous> (PrivacySettingsWrapper.kt:23)");
            }
            Modifier modifierO = WindowInsetsPadding_androidKt.O(Modifier.INSTANCE);
            Function0 function0 = this.f73036n;
            Function0 function02 = this.f73037t;
            boolean z2 = this.f73035O;
            Function2 function2 = this.J2;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierO);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO2, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            I28.t(function0, function02, z2, composer, 0, 0);
            function2.invoke(composer, 0);
            composer.XQ();
            composer.eF(1506543515);
            boolean zP5 = composer.p5(this.f73036n);
            final Function0 function03 = this.f73036n;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: rPd.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return fuX.j.t(function03, (OnBackPressedCallback) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            N.I28.O(null, (Function1) objIF, composer, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function0 onBackClicked, final Function0 onDoneClicked, boolean z2, final Function2 content, Composer composer, final int i2, final int i3) {
        int i5;
        boolean z3;
        Composer composer2;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onDoneClicked, "onDoneClicked");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerKN = composer.KN(145582000);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onBackClicked) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onDoneClicked) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                z3 = z2;
                i5 |= composerKN.n(z3) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(content) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                boolean z5 = i7 == 0 ? true : z3;
                if (ComposerKt.v()) {
                    ComposerKt.p5(145582000, i5, -1, "com.alightcreative.privacy.ui.components.PrivacySettingsWrapper (PrivacySettingsWrapper.kt:18)");
                }
                boolean z6 = z5;
                composer2 = composerKN;
                SurfaceKt.n(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), null, aD.w6.hRu(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(966196747, true, new j(onBackClicked, onDoneClicked, z5, content), composerKN, 54), composer2, 12583302, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                z4 = z6;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                z4 = z3;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: rPd.Wre
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return fuX.t(onBackClicked, onDoneClicked, z4, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        z3 = z2;
        if ((i3 & 8) == 0) {
        }
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            boolean z62 = z5;
            composer2 = composerKN;
            SurfaceKt.n(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), null, aD.w6.hRu(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(966196747, true, new j(onBackClicked, onDoneClicked, z5, content), composerKN, 54), composer2, 12583302, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            if (ComposerKt.v()) {
            }
            z4 = z62;
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0, Function0 function02, boolean z2, Function2 function2, int i2, int i3, Composer composer, int i5) {
        rl(function0, function02, z2, function2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
