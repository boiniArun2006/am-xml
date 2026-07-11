package androidx.compose.material3.internal;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.R;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ac\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a<\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/material3/TooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "t", "(ZLandroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LGJW/vd;", "scope", "rl", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/material3/TooltipState;LGJW/vd;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "enabled", "Uo", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/TooltipState;)Landroidx/compose/ui/Modifier;", "", "label", "J2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/material3/TooltipState;LGJW/vd;)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/internal/BasicTooltip_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,247:1\n488#2:248\n487#2,4:249\n491#2,2:256\n495#2:262\n488#2:310\n487#2,4:311\n491#2,2:318\n495#2:324\n1223#3,3:253\n1226#3,3:259\n1223#3,6:304\n1223#3,3:315\n1226#3,3:321\n1223#3,6:365\n487#4:258\n487#4:320\n71#5:263\n67#5,7:264\n74#5:299\n78#5:303\n71#5:325\n68#5,6:326\n74#5:360\n78#5:364\n78#6,6:271\n85#6,4:286\n89#6,2:296\n93#6:302\n78#6,6:332\n85#6,4:347\n89#6,2:357\n93#6:363\n368#7,9:277\n377#7:298\n378#7,2:300\n368#7,9:338\n377#7:359\n378#7,2:361\n4032#8,6:290\n4032#8,6:351\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/internal/BasicTooltip_androidKt\n*L\n87#1:248\n87#1:249,4\n87#1:256,2\n87#1:262\n117#1:310\n117#1:311,4\n117#1:318,2\n117#1:324\n87#1:253,3\n87#1:259,3\n107#1:304,6\n117#1:315,3\n117#1:321,3\n140#1:365,6\n87#1:258\n117#1:320\n88#1:263\n88#1:264,7\n88#1:299\n88#1:303\n119#1:325\n119#1:326,6\n119#1:360\n119#1:364\n88#1:271,6\n88#1:286,4\n88#1:296,2\n88#1:302\n119#1:332,6\n119#1:347,4\n119#1:357,2\n119#1:363\n88#1:277,9\n88#1:298\n88#1:300,2\n119#1:338,9\n119#1:359\n119#1:361,2\n88#1:290,6\n119#1:351,6\n*E\n"})
public final class BasicTooltip_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final boolean z2, final TooltipState tooltipState, Modifier modifier, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Composer composerKN = composer.KN(1848240995);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((2 & i3) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? composerKN.p5(tooltipState) : composerKN.E2(tooltipState) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i7 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1848240995, i5, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.android.kt:115)");
            }
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                composerKN.o(compositionScopedCoroutineScopeCanceller);
                objIF = compositionScopedCoroutineScopeCanceller;
            }
            Modifier modifierJ2 = J2(Uo(modifier, z2, tooltipState), StringResources_androidKt.t(R.string.f16265t, composerKN, 0), z2, tooltipState, ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope());
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            function2.invoke(composerKN, Integer.valueOf((i5 >> 9) & 14));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$WrappedAnchor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    BasicTooltip_androidKt.t(z2, tooltipState, modifier2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    private static final Modifier J2(Modifier modifier, final String str, boolean z2, final TooltipState tooltipState, final vd vdVar) {
        return z2 ? SemanticsModifierKt.t(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                n(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                String str2 = str;
                final vd vdVar2 = vdVar;
                final TooltipState tooltipState2 = tooltipState;
                SemanticsPropertiesKt.E2(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1.1

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
                    static final class C05501 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f29121n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ TooltipState f29122t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C05501(TooltipState tooltipState, Continuation continuation) {
                            super(2, continuation);
                            this.f29122t = tooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new C05501(this.f29122t, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((C05501) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f29121n;
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                TooltipState tooltipState = this.f29122t;
                                this.f29121n = 1;
                                if (TooltipState.nr(tooltipState, null, this, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        C.nr(vdVar2, null, null, new C05501(tooltipState2, null), 3, null);
                        return Boolean.TRUE;
                    }
                });
            }
        }) : modifier;
    }

    private static final Modifier Uo(Modifier modifier, boolean z2, TooltipState tooltipState) {
        return z2 ? modifier.Zmq(new SuspendPointerInputElement(tooltipState, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new BasicTooltip_androidKt$handleGestures$1(tooltipState, null)), 6, null)).Zmq(new SuspendPointerInputElement(tooltipState, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new BasicTooltip_androidKt$handleGestures$2(tooltipState, null)), 6, null)) : modifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final PopupPositionProvider popupPositionProvider, final Function2 function2, TooltipState tooltipState, Modifier modifier, boolean z2, boolean z3, final Function2 function22, Composer composer, final int i2, final int i3) {
        PopupPositionProvider popupPositionProvider2;
        int i5;
        Function2 function23;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        Function2 function24;
        Object objIF;
        Composer.Companion companion;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        boolean z6;
        Object objIF2;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeGh;
        final TooltipState tooltipState2 = tooltipState;
        Composer composerKN = composer.KN(-550509567);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            popupPositionProvider2 = popupPositionProvider;
        } else if ((i2 & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i5 = (composerKN.p5(popupPositionProvider2) ? 4 : 2) | i2;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function23 = function2;
                i5 |= composerKN.E2(function23) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= (i2 & 512) == 0 ? composerKN.p5(tooltipState2) : composerKN.E2(tooltipState2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z4 = z2;
                        i5 |= composerKN.n(z4) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            z5 = z3;
                            i5 |= composerKN.n(z5) ? 131072 : 65536;
                        }
                        if ((i3 & 64) == 0) {
                            if ((i2 & 1572864) == 0) {
                                function24 = function22;
                                i5 |= composerKN.E2(function24) ? 1048576 : 524288;
                            }
                            if ((i5 & 599187) == 599186 || !composerKN.xMQ()) {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i8 != 0) {
                                    z4 = true;
                                }
                                if (i9 != 0) {
                                    z5 = true;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-550509567, i5, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.android.kt:85)");
                                }
                                objIF = composerKN.iF();
                                companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                                    composerKN.o(compositionScopedCoroutineScopeCanceller);
                                    objIF = compositionScopedCoroutineScopeCanceller;
                                }
                                vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                iN = ComposablesKt.n(composerKN, 0);
                                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composerKN, companion2);
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
                                composerKN.eF(-625876949);
                                if (tooltipState.getIsVisible()) {
                                    composer2 = composerKN;
                                } else {
                                    int i10 = i5 >> 3;
                                    PopupPositionProvider popupPositionProvider3 = popupPositionProvider2;
                                    rl(popupPositionProvider3, tooltipState, coroutineScope, z4, function23, composerKN, (i5 & 14) | (i10 & 112) | (i10 & 7168) | ((i5 << 9) & 57344));
                                    composer2 = composerKN;
                                }
                                composer2.Xw();
                                int i11 = i5 >> 3;
                                int i12 = ((i5 >> 15) & 14) | (i11 & 112) | (i11 & 896) | ((i5 >> 9) & 7168);
                                tooltipState2 = tooltipState;
                                Modifier modifier3 = modifier2;
                                boolean z9 = z5;
                                t(z9, tooltipState2, modifier3, function24, composer2, i12, 0);
                                composer2.XQ();
                                z6 = (i5 & 896) != 256 || ((i5 & 512) != 0 && composer2.E2(tooltipState2));
                                objIF2 = composer2.iF();
                                if (!z6 || objIF2 == companion.n()) {
                                    objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$BasicTooltipBox$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                            final TooltipState tooltipState3 = tooltipState2;
                                            return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$BasicTooltipBox$2$1$invoke$$inlined$onDispose$1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void n() {
                                                    tooltipState3.n();
                                                }
                                            };
                                        }
                                    };
                                    composer2.o(objIF2);
                                }
                                EffectsKt.rl(tooltipState2, (Function1) objIF2, composer2, (i5 >> 6) & 14);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                z7 = z9;
                                modifier2 = modifier3;
                            } else {
                                composerKN.wTp();
                                composer2 = composerKN;
                                z7 = z5;
                            }
                            final boolean z10 = z4;
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                final TooltipState tooltipState3 = tooltipState2;
                                final Modifier modifier4 = modifier2;
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$BasicTooltipBox$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i13) {
                                        BasicTooltip_androidKt.n(popupPositionProvider, function2, tooltipState3, modifier4, z10, z7, function22, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 1572864;
                        function24 = function22;
                        if ((i5 & 599187) == 599186) {
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (ComposerKt.v()) {
                            }
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                            }
                            vd coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                            Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion22);
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
                                composerKN.eF(-625876949);
                                if (tooltipState.getIsVisible()) {
                                }
                                composer2.Xw();
                                int i112 = i5 >> 3;
                                int i122 = ((i5 >> 15) & 14) | (i112 & 112) | (i112 & 896) | ((i5 >> 9) & 7168);
                                tooltipState2 = tooltipState;
                                Modifier modifier32 = modifier2;
                                boolean z92 = z5;
                                t(z92, tooltipState2, modifier32, function24, composer2, i122, 0);
                                composer2.XQ();
                                if ((i5 & 896) != 256) {
                                    objIF2 = composer2.iF();
                                    if (!z6) {
                                        objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$BasicTooltipBox$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                final TooltipState tooltipState32 = tooltipState2;
                                                return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$BasicTooltipBox$2$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void n() {
                                                        tooltipState32.n();
                                                    }
                                                };
                                            }
                                        };
                                        composer2.o(objIF2);
                                        EffectsKt.rl(tooltipState2, (Function1) objIF2, composer2, (i5 >> 6) & 14);
                                        if (ComposerKt.v()) {
                                        }
                                        z7 = z92;
                                        modifier2 = modifier32;
                                    }
                                }
                            }
                        }
                        final boolean z102 = z4;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    z5 = z3;
                    if ((i3 & 64) == 0) {
                    }
                    function24 = function22;
                    if ((i5 & 599187) == 599186) {
                    }
                    final boolean z1022 = z4;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                z4 = z2;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                z5 = z3;
                if ((i3 & 64) == 0) {
                }
                function24 = function22;
                if ((i5 & 599187) == 599186) {
                }
                final boolean z10222 = z4;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            z4 = z2;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            z5 = z3;
            if ((i3 & 64) == 0) {
            }
            function24 = function22;
            if ((i5 & 599187) == 599186) {
            }
            final boolean z102222 = z4;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        function23 = function2;
        if ((i3 & 4) == 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        z4 = z2;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        z5 = z3;
        if ((i3 & 64) == 0) {
        }
        function24 = function22;
        if ((i5 & 599187) == 599186) {
        }
        final boolean z1022222 = z4;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final PopupPositionProvider popupPositionProvider, final TooltipState tooltipState, final vd vdVar, final boolean z2, final Function2 function2, Composer composer, final int i2) {
        PopupPositionProvider popupPositionProvider2;
        int i3;
        Composer composerKN = composer.KN(-273292979);
        if ((i2 & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i3 = (composerKN.p5(popupPositionProvider2) ? 4 : 2) | i2;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerKN.p5(tooltipState) : composerKN.E2(tooltipState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(vdVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function2) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-273292979, i3, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.android.kt:135)");
            }
            boolean z3 = false;
            final String strT = StringResources_androidKt.t(R.string.rl, composerKN, 0);
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerKN.E2(tooltipState))) {
                z3 = true;
            }
            boolean zE2 = z3 | composerKN.E2(vdVar);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0<Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f29101n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ TooltipState f29102t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(TooltipState tooltipState, Continuation continuation) {
                            super(2, continuation);
                            this.f29102t = tooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.f29102t, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.f29101n == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.f29102t.dismiss();
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (tooltipState.getIsVisible()) {
                            C.nr(vdVar, null, null, new AnonymousClass1(tooltipState, null), 3, null);
                        }
                    }
                };
                composerKN.o(objIF);
            }
            AndroidPopup_androidKt.n(popupPositionProvider2, (Function0) objIF, new PopupProperties(z2, false, false, false, 14, (DefaultConstructorMarker) null), ComposableLambdaKt.nr(610617071, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(610617071, i5, -1, "androidx.compose.material3.internal.TooltipPopup.<anonymous> (BasicTooltip.android.kt:146)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zP5 = composer2.p5(strT);
                    final String str = strT;
                    Object objIF2 = composer2.iF();
                    if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.ijL(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.n());
                                SemanticsPropertiesKt.eTf(semanticsPropertyReceiver, str);
                            }
                        };
                        composer2.o(objIF2);
                    }
                    Modifier modifierNr = SemanticsModifierKt.nr(companion, false, (Function1) objIF2, 1, null);
                    Function2 function22 = function2;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    int iN = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierNr);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer2.T();
                    if (composer2.getInserting()) {
                        composer2.s7N(function0N);
                    } else {
                        composer2.r();
                    }
                    Composer composerN = Updater.n(composer2);
                    Updater.O(composerN, measurePolicyUo, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    Function2 function2Rl = companion2.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    function22.invoke(composer2, 0);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, (i3 & 14) | 3072, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    BasicTooltip_androidKt.rl(popupPositionProvider, tooltipState, vdVar, z2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            });
        }
    }
}
