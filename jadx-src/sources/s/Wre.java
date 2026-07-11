package s;

import Si.C1469c;
import Si.Xo;
import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.app.motion.scene.rendering.TextureCropModeKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Wre {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f73154O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f73155n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f73156t;

        /* JADX INFO: renamed from: s.Wre$j$j, reason: collision with other inner class name */
        static final class C1160j implements Function3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ int f73157n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f73158t;

            C1160j(int i2, String str) {
                this.f73157n = i2;
                this.f73158t = str;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.v()) {
                    ComposerKt.p5(1275919612, i2, -1, "com.alightcreative.common.compose.components.player.PlayerPlayButton.<anonymous>.<anonymous> (PlayerContainer.kt:91)");
                }
                ImageKt.n(PainterResources_androidKt.t(this.f73157n, composer, 0), this.f73158t, null, null, ContentScale.INSTANCE.O(), 0.0f, null, composer, 24576, 108);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(boolean z2, int i2, String str) {
            this.f73155n = z2;
            this.f73156t = i2;
            this.f73154O = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope Button, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i2 & 6) == 0) {
                i2 |= composer.p5(Button) ? 4 : 2;
            }
            if ((i2 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(606792228, i2, -1, "com.alightcreative.common.compose.components.player.PlayerPlayButton.<anonymous> (PlayerContainer.kt:85)");
            }
            AnimatedVisibilityKt.xMQ(Button, !this.f73155n, SizeKt.Z(Modifier.INSTANCE, Dp.KN(56)), EnterTransition.INSTANCE.n(), ExitTransition.INSTANCE.n(), null, ComposableLambdaKt.nr(1275919612, true, new C1160j(this.f73156t, this.f73154O), composer, 54), composer, (i2 & 14) | 1573248, 16);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TextureCropMode f73159n;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TextureCropMode.values().length];
                try {
                    iArr[TextureCropMode.FILL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextureCropMode.FIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TextureCropMode.STRETCH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        n(TextureCropMode textureCropMode) {
            this.f73159n = textureCropMode;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope Button, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-4129666, i2, -1, "com.alightcreative.common.compose.components.player.TextureCropModeButton.<anonymous> (PlayerContainer.kt:122)");
            }
            int i5 = j.$EnumSwitchMapping$0[TextureCropModeKt.nextTextureCropMode(this.f73159n).ordinal()];
            if (i5 == 1) {
                i3 = 2131232017;
            } else if (i5 == 2) {
                i3 = 2131232018;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 2131232019;
            }
            ImageKt.n(PainterResources_androidKt.t(i3, composer, 0), null, null, null, null, 0.0f, null, composer, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final Xo player, final boolean z2, final Function0 onPlayButtonClicked, Modifier modifier, TextureCropMode textureCropMode, Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        TextureCropMode textureCropMode2;
        int i8;
        Function0 function02;
        int i9;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        boolean z3;
        Object objIF;
        final TextureCropMode textureCropMode3;
        final Function0 function03;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(onPlayButtonClicked, "onPlayButtonClicked");
        Composer composerKN = composer.KN(-1101793893);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(player) : composerKN.E2(player) ? 4 : 2) | i2;
        } else {
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
            i5 |= composerKN.E2(onPlayButtonClicked) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    textureCropMode2 = textureCropMode;
                    i5 |= composerKN.p5(textureCropMode2) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        function02 = function0;
                        i5 |= composerKN.E2(function02) ? 131072 : 65536;
                    }
                    i9 = i5;
                    if ((74899 & i9) == 74898 || !composerKN.xMQ()) {
                        Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 != 0) {
                            textureCropMode2 = null;
                        }
                        if (i8 != 0) {
                            composerKN.eF(88574123);
                            Object objIF2 = composerKN.iF();
                            if (objIF2 == Composer.INSTANCE.n()) {
                                objIF2 = new Function0() { // from class: s.j
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Wre.Uo();
                                    }
                                };
                                composerKN.o(objIF2);
                            }
                            composerKN.Xw();
                            function02 = (Function0) objIF2;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1101793893, i9, -1, "com.alightcreative.common.compose.components.player.PlayerContainer (PlayerContainer.kt:40)");
                        }
                        float f3 = 12;
                        Modifier modifierN = ClipKt.n(BackgroundKt.t(modifier4, aD.w6.xVH(), RoundedCornerShapeKt.t(Dp.KN(f3))), RoundedCornerShapeKt.t(Dp.KN(f3)));
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
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
                        Updater.O(composerN, measurePolicyUo, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        function2Rl = companion2.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        composerKN.eF(-1408780741);
                        z3 = (i9 & 14) != 4 || ((i9 & 8) != 0 && composerKN.E2(player));
                        objIF = composerKN.iF();
                        if (!z3 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function1() { // from class: s.n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Wre.KN(player, (Context) obj);
                                }
                            };
                            composerKN.o(objIF);
                        }
                        composerKN.Xw();
                        AndroidView_androidKt.n((Function1) objIF, null, null, composerKN, 0, 6);
                        mUb(z2, onPlayButtonClicked, !z2 ? 2131232078 : 2131232079, null, composerKN, (i9 >> 3) & 126, 8);
                        composerKN = composerKN;
                        composerKN.eF(-1408771141);
                        if (textureCropMode2 != null) {
                            textureCropMode3 = textureCropMode2;
                            function03 = function02;
                        } else {
                            textureCropMode3 = textureCropMode2;
                            function03 = function02;
                            qie(textureCropMode3, function03, boxScopeInstance.n(Modifier.INSTANCE, companion.t()), composerKN, (i9 >> 12) & 112, 0);
                        }
                        composerKN.Xw();
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        textureCropMode3 = textureCropMode2;
                        function03 = function02;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: s.w6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Wre.xMQ(player, z2, onPlayButtonClicked, modifier3, textureCropMode3, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                function02 = function0;
                i9 = i5;
                if ((74899 & i9) == 74898) {
                    if (i10 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    float f32 = 12;
                    Modifier modifierN2 = ClipKt.n(BackgroundKt.t(modifier4, aD.w6.xVH(), RoundedCornerShapeKt.t(Dp.KN(f32))), RoundedCornerShapeKt.t(Dp.KN(f32)));
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion22.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo2, companion22.t());
                    Updater.O(composerN, compositionLocalMapIk2, companion22.O());
                    function2Rl = companion22.rl();
                    if (!composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO2, companion22.nr());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                        composerKN.eF(-1408780741);
                        if ((i9 & 14) != 4) {
                            objIF = composerKN.iF();
                            if (!z3) {
                                objIF = new Function1() { // from class: s.n
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Wre.KN(player, (Context) obj);
                                    }
                                };
                                composerKN.o(objIF);
                                composerKN.Xw();
                                AndroidView_androidKt.n((Function1) objIF, null, null, composerKN, 0, 6);
                                mUb(z2, onPlayButtonClicked, !z2 ? 2131232078 : 2131232079, null, composerKN, (i9 >> 3) & 126, 8);
                                composerKN = composerKN;
                                composerKN.eF(-1408771141);
                                if (textureCropMode2 != null) {
                                }
                                composerKN.Xw();
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                }
                                modifier3 = modifier4;
                            }
                        }
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            textureCropMode2 = textureCropMode;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            function02 = function0;
            i9 = i5;
            if ((74899 & i9) == 74898) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        textureCropMode2 = textureCropMode;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        function02 = function0;
        i9 = i5;
        if ((74899 & i9) == 74898) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1469c KN(Xo xo, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C1469c c1469c = new C1469c(it, null, 0, 6, null);
        c1469c.setPlayer(xo);
        return c1469c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(TextureCropMode textureCropMode, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        qie(textureCropMode, function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(boolean z2, Function0 function0, int i2, String str, int i3, int i5, Composer composer, int i7) {
        mUb(z2, function0, i2, str, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void mUb(final boolean z2, final Function0 function0, final int i2, String str, Composer composer, final int i3, final int i5) {
        int i7;
        Function0 function02;
        int i8;
        String str2;
        Composer composer2;
        final String str3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1640805356);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.n(z2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                function02 = function0;
                i7 |= composerKN.E2(function02) ? 32 : 16;
            }
            if ((i5 & 4) == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.t(i2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    str2 = str;
                    i7 |= composerKN.p5(str2) ? 2048 : 1024;
                }
                if ((i7 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    str3 = str2;
                    composer2 = composerKN;
                } else {
                    if (i8 != 0) {
                        str2 = null;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1640805356, i7, -1, "com.alightcreative.common.compose.components.player.PlayerPlayButton (PlayerContainer.kt:71)");
                    }
                    Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
                    float f3 = 0;
                    PaddingValues paddingValuesN = PaddingKt.n(Dp.KN(f3));
                    ButtonDefaults buttonDefaults = ButtonDefaults.f21598n;
                    Color.Companion companion = Color.INSTANCE;
                    String str4 = str2;
                    long jJ2 = companion.J2();
                    long jJ22 = companion.J2();
                    int i9 = ButtonDefaults.qie;
                    ButtonKt.n(function02, modifierJ2, false, null, buttonDefaults.rl(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 0.0f, composerKN, (i9 << 15) | 54, 28), null, null, buttonDefaults.n(jJ2, jJ22, 0L, 0L, composerKN, (i9 << 12) | 54, 12), paddingValuesN, ComposableLambdaKt.nr(606792228, true, new j(z2, i2, str4), composerKN, 54), composerKN, ((i7 >> 3) & 14) | 905969712, 108);
                    composer2 = composerKN;
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    str3 = str4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: s.Ml
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Wre.gh(z2, function0, i2, str3, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 3072;
            str2 = str;
            if ((i7 & 1171) == 1170) {
                if (i8 != 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier modifierJ22 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
                float f32 = 0;
                PaddingValues paddingValuesN2 = PaddingKt.n(Dp.KN(f32));
                ButtonDefaults buttonDefaults2 = ButtonDefaults.f21598n;
                Color.Companion companion2 = Color.INSTANCE;
                String str42 = str2;
                long jJ23 = companion2.J2();
                long jJ222 = companion2.J2();
                int i92 = ButtonDefaults.qie;
                ButtonKt.n(function02, modifierJ22, false, null, buttonDefaults2.rl(Dp.KN(f32), Dp.KN(f32), 0.0f, 0.0f, 0.0f, composerKN, (i92 << 15) | 54, 28), null, null, buttonDefaults2.n(jJ23, jJ222, 0L, 0L, composerKN, (i92 << 12) | 54, 12), paddingValuesN2, ComposableLambdaKt.nr(606792228, true, new j(z2, i2, str42), composerKN, 54), composerKN, ((i7 >> 3) & 14) | 905969712, 108);
                composer2 = composerKN;
                if (ComposerKt.v()) {
                }
                str3 = str42;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function02 = function0;
        if ((i5 & 4) == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        str2 = str;
        if ((i7 & 1171) == 1170) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void qie(final TextureCropMode mode, final Function0 onClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Composer composerKN = composer.KN(-152238962);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(mode) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onClicked) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i5;
            if ((i7 & 147) == 146 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-152238962, i7, -1, "com.alightcreative.common.compose.components.player.TextureCropModeButton (PlayerContainer.kt:105)");
                }
                Modifier modifierZ = SizeKt.Z(PaddingKt.xMQ(modifier4, Dp.KN(8)), Dp.KN(40));
                ButtonDefaults buttonDefaults = ButtonDefaults.f21598n;
                float f3 = 0;
                float fKN = Dp.KN(f3);
                float fKN2 = Dp.KN(f3);
                int i9 = ButtonDefaults.qie;
                ButtonKt.n(onClicked, modifierZ, false, null, buttonDefaults.rl(fKN, fKN2, 0.0f, 0.0f, 0.0f, composerKN, (i9 << 15) | 54, 28), RoundedCornerShapeKt.n(50), null, buttonDefaults.Uo(Color.INSTANCE.J2(), aD.w6.F(), 0L, composerKN, (i9 << 9) | 54, 4), PaddingKt.n(Dp.KN(f3)), ComposableLambdaKt.nr(-4129666, true, new n(mode), composerKN, 54), composerKN, ((i7 >> 3) & 14) | 905969664, 76);
                composerKN = composerKN;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: s.I28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wre.az(mode, onClicked, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        i7 = i5;
        if ((i7 & 147) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierZ2 = SizeKt.Z(PaddingKt.xMQ(modifier4, Dp.KN(8)), Dp.KN(40));
            ButtonDefaults buttonDefaults2 = ButtonDefaults.f21598n;
            float f32 = 0;
            float fKN3 = Dp.KN(f32);
            float fKN22 = Dp.KN(f32);
            int i92 = ButtonDefaults.qie;
            ButtonKt.n(onClicked, modifierZ2, false, null, buttonDefaults2.rl(fKN3, fKN22, 0.0f, 0.0f, 0.0f, composerKN, (i92 << 15) | 54, 28), RoundedCornerShapeKt.n(50), null, buttonDefaults2.Uo(Color.INSTANCE.J2(), aD.w6.F(), 0L, composerKN, (i92 << 9) | 54, 4), PaddingKt.n(Dp.KN(f32)), ComposableLambdaKt.nr(-4129666, true, new n(mode), composerKN, 54), composerKN, ((i7 >> 3) & 14) | 905969664, 76);
            composerKN = composerKN;
            if (ComposerKt.v()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Xo xo, boolean z2, Function0 function0, Modifier modifier, TextureCropMode textureCropMode, Function0 function02, int i2, int i3, Composer composer, int i5) {
        J2(xo, z2, function0, modifier, textureCropMode, function02, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
