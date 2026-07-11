package BQ;

import Bj.j;
import GJW.vd;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.ui.compose.PlayerSurfaceKt;
import com.alightcreative.app.motion.templates.Template;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class C {

    public static final class Ml implements DisposableEffectResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f430n;
        final /* synthetic */ Function1 rl;

        public Ml(MutableState mutableState, Function1 function1) {
            this.f430n = mutableState;
            this.rl = function1;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void n() {
            Player playerUo = C.Uo(this.f430n);
            if (playerUo != null) {
                this.rl.invoke(playerUo);
            }
            C.xMQ(this.f430n, null);
        }
    }

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f431n;

        j(boolean z2) {
            this.f431n = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(BoxScope PulsingView, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(PulsingView, "$this$PulsingView");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(297474901, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.composables.PlaceholderGridCell.<anonymous> (TemplatesGridCell.kt:132)");
            }
            float f3 = 12;
            BoxKt.n(ClipKt.n(BackgroundKt.t(SizeKt.KN(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(this.f431n ? 224 : 264)), 0.0f, 1, null), ((aF1.j) composer.ty(aF1.w6.t())).J2(), RoundedCornerShapeKt.t(Dp.KN(f3))), RoundedCornerShapeKt.t(Dp.KN(f3))), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ j.C0016j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f432O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f433n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableState f434r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f435t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z2, Function1 function1, j.C0016j c0016j, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f435t = z2;
            this.f432O = function1;
            this.J2 = c0016j;
            this.f434r = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f435t, this.f432O, this.J2, this.f434r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f433n == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f435t && C.Uo(this.f434r) == null) {
                    C.xMQ(this.f434r, (Player) this.f432O.invoke(this.J2));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class w6 implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ j.C0016j f436n;

        w6(j.C0016j c0016j) {
            this.f436n = c0016j;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((FlowRowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(FlowRowScope FlowRow, Composer composer, int i2) {
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
            if ((i2 & 17) == 16 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-27185343, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.composables.TemplatesGridCell.<anonymous>.<anonymous> (TemplatesGridCell.kt:109)");
            }
            Iterator it = this.f436n.rl().iterator();
            while (it.hasNext()) {
                TextKt.t(com.alightcreative.app.motion.templates.Ml.gh(((Template.Tag) it.next()).getValue(), composer2, 0), PaddingKt.mUb(BackgroundKt.t(Modifier.INSTANCE, aD.w6.HV(), RoundedCornerShapeKt.t(Dp.KN(4))), Dp.KN(6), Dp.KN((float) 4.5d)), aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer2, 6).WPU(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                composer2 = composer;
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(j.C0016j c0016j, final boolean z2, final Function1 playerProvider, final Function1 onPlayerRelease, final boolean z3, final Function0 onPreviewClicked, final Function0 onSaveClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        boolean z4;
        int i7;
        Modifier modifier2;
        Object objIF;
        Composer.Companion companion;
        final MutableState mutableState;
        String strN;
        boolean zE2;
        Object nVar;
        int i8;
        String str;
        boolean z5;
        Object objIF2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Player playerUo;
        Unit unit;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        final j.C0016j template = c0016j;
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        Intrinsics.checkNotNullParameter(onPlayerRelease, "onPlayerRelease");
        Intrinsics.checkNotNullParameter(onPreviewClicked, "onPreviewClicked");
        Intrinsics.checkNotNullParameter(onSaveClicked, "onSaveClicked");
        Composer composerKN = composer.KN(2005764236);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(template) ? 4 : 2) | i2;
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
            i5 |= composerKN.E2(playerProvider) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onPlayerRelease) ? 2048 : 1024;
        }
        if ((i3 & 16) == 0) {
            if ((i2 & 24576) == 0) {
                z4 = z3;
                i5 |= composerKN.n(z4) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i5 |= composerKN.E2(onPreviewClicked) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i5 |= composerKN.E2(onSaveClicked) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i5 |= 12582912;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.p5(modifier2) ? 8388608 : 4194304;
                }
            }
            if ((i5 & 4793491) == 4793490 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(2005764236, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.composables.TemplatesGridCell (TemplatesGridCell.kt:53)");
                }
                composerKN.eF(-514865607);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                    composerKN.o(objIF);
                }
                mutableState = (MutableState) objIF;
                composerKN.Xw();
                strN = template.n();
                Boolean boolValueOf = Boolean.valueOf(z4);
                composerKN.eF(-514862330);
                zE2 = ((57344 & i5) != 16384) | ((i5 & 896) != 256) | composerKN.E2(template);
                Object objIF3 = composerKN.iF();
                if (!zE2 || objIF3 == companion.n()) {
                    i8 = i5;
                    str = strN;
                    nVar = new n(z3, playerProvider, template, mutableState, null);
                    template = template;
                    composerKN.o(nVar);
                } else {
                    nVar = objIF3;
                    str = strN;
                    i8 = i5;
                }
                composerKN.Xw();
                EffectsKt.nr(str, boolValueOf, (Function2) nVar, composerKN, (i8 >> 9) & 112);
                String strN2 = template.n();
                composerKN.eF(-514857378);
                z5 = (i8 & 7168) != 2048;
                objIF2 = composerKN.iF();
                if (!z5 || objIF2 == companion.n()) {
                    objIF2 = new Function1() { // from class: BQ.Dsr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C.mUb(mutableState, onPlayerRelease, (DisposableEffectScope) obj);
                        }
                    };
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                EffectsKt.rl(strN2, (Function1) objIF2, composerKN, 0);
                float f3 = 12;
                Modifier modifier5 = modifier4;
                Modifier modifierN = ClipKt.n(ClickableKt.J2(BackgroundKt.t(SizeKt.xMQ(modifier4, Dp.KN(!z2 ? 224 : 264)), ColorKt.nr(4293519849L), RoundedCornerShapeKt.t(Dp.KN(f3))), false, null, null, onPreviewClicked, 7, null), RoundedCornerShapeKt.t(Dp.KN(f3)));
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion3.n();
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
                Updater.O(composerN, measurePolicyUo, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                function2Rl = companion3.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                playerUo = Uo(mutableState);
                composerKN.eF(1077053272);
                if (playerUo != null) {
                    unit = null;
                } else {
                    PlayerSurfaceKt.PlayerSurface(playerUo, null, 2, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                    unit = Unit.INSTANCE;
                }
                composerKN.Xw();
                composerKN.eF(1077053212);
                if (unit == null) {
                    ProgressIndicatorKt.nr(boxScopeInstance.n(SizeKt.Z(Modifier.INSTANCE, Dp.KN(32)), companion2.O()), ((aF1.j) composerKN.ty(aF1.w6.t())).J2(), 0.0f, 0L, 0, composerKN, 0, 28);
                }
                composerKN.Xw();
                Painter painterT = PainterResources_androidKt.t(!template.nr() ? 2131231552 : 2131231553, composerKN, 0);
                composerKN.eF(1077072183);
                long jCk = !template.nr() ? ((aF1.j) composerKN.ty(aF1.w6.t())).ck() : Color.INSTANCE.KN();
                composerKN.Xw();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                IconKt.t(painterT, null, SizeKt.Z(PaddingKt.az(boxScopeInstance.n(ClickableKt.J2(companion4, false, null, null, onSaveClicked, 7, null), companion2.ty()), 0.0f, Dp.KN(f3), Dp.KN(f3), 0.0f, 9, null), Dp.KN(24)), jCk, composerKN, 48, 0);
                composer2 = composerKN;
                Arrangement arrangement = Arrangement.f17400n;
                float f4 = 4;
                FlowLayoutKt.nr(SizeKt.KN(boxScopeInstance.n(PaddingKt.xMQ(companion4, Dp.KN(f3)), companion2.nr()), 0.0f, 1, null), arrangement.ty(Dp.KN(f4)), arrangement.ty(Dp.KN(f4)), null, 0, 0, ComposableLambdaKt.nr(-27185343, true, new w6(template), composer2, 54), composer2, 1573296, 56);
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: BQ.aC
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.KN(template, z2, playerProvider, onPlayerRelease, z3, onPreviewClicked, onSaveClicked, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 24576;
        z4 = z3;
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            composerKN.eF(-514865607);
            objIF = composerKN.iF();
            companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
            }
            mutableState = (MutableState) objIF;
            composerKN.Xw();
            strN = template.n();
            Boolean boolValueOf2 = Boolean.valueOf(z4);
            composerKN.eF(-514862330);
            zE2 = ((57344 & i5) != 16384) | ((i5 & 896) != 256) | composerKN.E2(template);
            Object objIF32 = composerKN.iF();
            if (zE2) {
                i8 = i5;
                str = strN;
                nVar = new n(z3, playerProvider, template, mutableState, null);
                template = template;
                composerKN.o(nVar);
                composerKN.Xw();
                EffectsKt.nr(str, boolValueOf2, (Function2) nVar, composerKN, (i8 >> 9) & 112);
                String strN22 = template.n();
                composerKN.eF(-514857378);
                if ((i8 & 7168) != 2048) {
                }
                objIF2 = composerKN.iF();
                if (!z5) {
                    objIF2 = new Function1() { // from class: BQ.Dsr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C.mUb(mutableState, onPlayerRelease, (DisposableEffectScope) obj);
                        }
                    };
                    composerKN.o(objIF2);
                    composerKN.Xw();
                    EffectsKt.rl(strN22, (Function1) objIF2, composerKN, 0);
                    float f32 = 12;
                    Modifier modifier52 = modifier4;
                    Modifier modifierN2 = ClipKt.n(ClickableKt.J2(BackgroundKt.t(SizeKt.xMQ(modifier4, Dp.KN(!z2 ? 224 : 264)), ColorKt.nr(4293519849L), RoundedCornerShapeKt.t(Dp.KN(f32))), false, null, null, onPreviewClicked, 7, null), RoundedCornerShapeKt.t(Dp.KN(f32)));
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion22.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion32.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo2, companion32.t());
                    Updater.O(composerN, compositionLocalMapIk2, companion32.O());
                    function2Rl = companion32.rl();
                    if (!composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO2, companion32.nr());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                        playerUo = Uo(mutableState);
                        composerKN.eF(1077053272);
                        if (playerUo != null) {
                        }
                        composerKN.Xw();
                        composerKN.eF(1077053212);
                        if (unit == null) {
                        }
                        composerKN.Xw();
                        Painter painterT2 = PainterResources_androidKt.t(!template.nr() ? 2131231552 : 2131231553, composerKN, 0);
                        composerKN.eF(1077072183);
                        if (!template.nr()) {
                        }
                        composerKN.Xw();
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        IconKt.t(painterT2, null, SizeKt.Z(PaddingKt.az(boxScopeInstance2.n(ClickableKt.J2(companion42, false, null, null, onSaveClicked, 7, null), companion22.ty()), 0.0f, Dp.KN(f32), Dp.KN(f32), 0.0f, 9, null), Dp.KN(24)), jCk, composerKN, 48, 0);
                        composer2 = composerKN;
                        Arrangement arrangement2 = Arrangement.f17400n;
                        float f42 = 4;
                        FlowLayoutKt.nr(SizeKt.KN(boxScopeInstance2.n(PaddingKt.xMQ(companion42, Dp.KN(f32)), companion22.nr()), 0.0f, 1, null), arrangement2.ty(Dp.KN(f42)), arrangement2.ty(Dp.KN(f42)), null, 0, 0, ComposableLambdaKt.nr(-27185343, true, new w6(template), composer2, 54), composer2, 1573296, 56);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(j.C0016j c0016j, boolean z2, Function1 function1, Function1 function12, boolean z3, Function0 function0, Function0 function02, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        J2(c0016j, z2, function1, function12, z3, function0, function02, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(boolean z2, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        nr(z2, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult mUb(MutableState mutableState, Function1 function1, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new Ml(mutableState, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Player Uo(MutableState mutableState) {
        return (Player) mutableState.getValue();
    }

    public static final void nr(final boolean z2, final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(1693052589);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.n(z2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i9 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1693052589, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.composables.PlaceholderGridCell (TemplatesGridCell.kt:130)");
            }
            PB.w6.rl(modifier, ComposableLambdaKt.nr(297474901, true, new j(z2), composerKN, 54), composerKN, ((i5 >> 3) & 14) | 48, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: BQ.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.O(z2, modifier, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(MutableState mutableState, Player player) {
        mutableState.setValue(player);
    }
}
