package androidx.compose.foundation;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.LongPressResult;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ac\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a<\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/foundation/BasicTooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "t", "(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LGJW/vd;", "scope", "rl", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;LGJW/vd;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "enabled", "Uo", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/BasicTooltipState;)Landroidx/compose/ui/Modifier;", "", "label", "J2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/foundation/BasicTooltipState;LGJW/vd;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,390:1\n557#2:391\n554#2,6:392\n557#2:453\n554#2,6:454\n1247#3,3:398\n1250#3,3:402\n1247#3,6:447\n1247#3,3:460\n1250#3,3:464\n1247#3,6:508\n1247#3,6:514\n555#4:401\n555#4:463\n70#5:405\n66#5,10:406\n77#5:446\n70#5:467\n67#5,9:468\n77#5:507\n79#6,6:416\n86#6,3:431\n89#6,2:440\n93#6:445\n79#6,6:477\n86#6,3:492\n89#6,2:501\n93#6:506\n347#7,9:422\n356#7,3:442\n347#7,9:483\n356#7,3:503\n4206#8,6:434\n4206#8,6:495\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n83#1:391\n83#1:392,6\n114#1:453\n114#1:454,6\n83#1:398,3\n83#1:402,3\n103#1:447,6\n114#1:460,3\n114#1:464,3\n138#1:508,6\n246#1:514,6\n83#1:401\n114#1:463\n84#1:405\n84#1:406,10\n84#1:446\n116#1:467\n116#1:468,9\n116#1:507\n84#1:416,6\n84#1:431,3\n84#1:440,2\n84#1:445\n116#1:477,6\n116#1:492,3\n116#1:501,2\n116#1:506\n84#1:422,9\n84#1:442,3\n116#1:483,9\n116#1:503,3\n84#1:434,6\n116#1:495,6\n*E\n"})
public final class BasicTooltipKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final boolean z2, final BasicTooltipState basicTooltipState, Modifier modifier, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Composer composerKN = composer.KN(-111661630);
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
            i5 |= composerKN.p5(basicTooltipState) ? 32 : 16;
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
        if (composerKN.HI((i5 & 1171) != 1170, 1 & i5)) {
            if (i7 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-111661630, i5, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)");
            }
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF);
            }
            Modifier modifierJ2 = J2(Uo(modifier, z2, basicTooltipState), BasicTooltipStrings.f15961n.rl(composerKN, 6), z2, basicTooltipState, (vd) objIF);
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
        } else {
            composerKN.wTp();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.BasicTooltipKt$WrappedAnchor$2
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
                    BasicTooltipKt.t(z2, basicTooltipState, modifier2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    private static final Modifier J2(Modifier modifier, final String str, boolean z2, final BasicTooltipState basicTooltipState, final vd vdVar) {
        return z2 ? SemanticsModifierKt.t(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1
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
                final BasicTooltipState basicTooltipState2 = basicTooltipState;
                SemanticsPropertiesKt.E2(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1.1

                    /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1", f = "BasicTooltip.kt", i = {}, l = {Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "invokeSuspend", n = {}, s = {})
                    static final class C04931 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f15929n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ BasicTooltipState f15930t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C04931(BasicTooltipState basicTooltipState, Continuation continuation) {
                            super(2, continuation);
                            this.f15930t = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new C04931(this.f15930t, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((C04931) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f15929n;
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                BasicTooltipState basicTooltipState = this.f15930t;
                                this.f15929n = 1;
                                if (BasicTooltipState.nr(basicTooltipState, null, this, 1, null) == coroutine_suspended) {
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
                        C.nr(vdVar2, null, null, new C04931(basicTooltipState2, null), 3, null);
                        return Boolean.TRUE;
                    }
                });
            }
        }) : modifier;
    }

    private static final Modifier Uo(Modifier modifier, boolean z2, final BasicTooltipState basicTooltipState) {
        return z2 ? SuspendingPointerInputFilterKt.nr(SuspendingPointerInputFilterKt.nr(modifier, basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt$handleGestures$1

            /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                final /* synthetic */ BasicTooltipState J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ PointerInputScope f15932O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f15933n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f15934t;

                /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", i = {0, 0, 1, 1}, l = {166, 169, 175}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
                static final class C04941 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ vd J2;

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    private /* synthetic */ Object f15935O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f15936n;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ BasicTooltipState f15937r;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f15938t;

                    /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
                    static final class C04951 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f15939n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ BasicTooltipState f15940t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C04951(BasicTooltipState basicTooltipState, Continuation continuation) {
                            super(2, continuation);
                            this.f15940t = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new C04951(this.f15940t, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((C04951) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f15939n;
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                BasicTooltipState basicTooltipState = this.f15940t;
                                MutatePriority mutatePriority = MutatePriority.f16229t;
                                this.f15939n = 1;
                                if (basicTooltipState.t(mutatePriority, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C04941 c04941 = new C04941(this.J2, this.f15937r, continuation);
                        c04941.f15935O = obj;
                        return c04941;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                        return ((C04941) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04941(vd vdVar, BasicTooltipState basicTooltipState, Continuation continuation) {
                        super(2, continuation);
                        this.J2 = vdVar;
                        this.f15937r = basicTooltipState;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
                    
                        if (r1 == r0) goto L28;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        PointerEventPass pointerEventPass;
                        Object objJ2;
                        AwaitPointerEventScope awaitPointerEventScope;
                        Object objO;
                        AwaitPointerEventScope awaitPointerEventScope2;
                        Object objHBN;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f15938t;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        ResultKt.throwOnFailure(obj);
                                        objHBN = obj;
                                        List changes = ((PointerEvent) objHBN).getChanges();
                                        int size = changes.size();
                                        for (int i3 = 0; i3 < size; i3++) {
                                            ((PointerInputChange) changes.get(i3)).n();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                PointerEventPass pointerEventPass2 = (PointerEventPass) this.f15936n;
                                awaitPointerEventScope2 = (AwaitPointerEventScope) this.f15935O;
                                ResultKt.throwOnFailure(obj);
                                pointerEventPass = pointerEventPass2;
                                objO = obj;
                                if (((LongPressResult) objO) instanceof LongPressResult.Success) {
                                    C.nr(this.J2, null, null, new C04951(this.f15937r, null), 3, null);
                                    this.f15935O = null;
                                    this.f15936n = null;
                                    this.f15938t = 3;
                                    objHBN = awaitPointerEventScope2.HBN(pointerEventPass, this);
                                }
                                return Unit.INSTANCE;
                            }
                            PointerEventPass pointerEventPass3 = (PointerEventPass) this.f15936n;
                            awaitPointerEventScope = (AwaitPointerEventScope) this.f15935O;
                            ResultKt.throwOnFailure(obj);
                            pointerEventPass = pointerEventPass3;
                            objJ2 = obj;
                        } else {
                            ResultKt.throwOnFailure(obj);
                            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f15935O;
                            pointerEventPass = PointerEventPass.f32078n;
                            this.f15935O = awaitPointerEventScope3;
                            this.f15936n = pointerEventPass;
                            this.f15938t = 1;
                            objJ2 = TapGestureDetectorKt.J2(awaitPointerEventScope3, false, pointerEventPass, this, 1, null);
                            if (objJ2 != coroutine_suspended) {
                                awaitPointerEventScope = awaitPointerEventScope3;
                            }
                            return coroutine_suspended;
                        }
                        int type = ((PointerInputChange) objJ2).getType();
                        PointerType.Companion companion = PointerType.INSTANCE;
                        if (PointerType.KN(type, companion.nr()) || PointerType.KN(type, companion.t())) {
                            this.f15935O = awaitPointerEventScope;
                            this.f15936n = pointerEventPass;
                            this.f15938t = 2;
                            objO = TapGestureDetectorKt.o(awaitPointerEventScope, pointerEventPass, this);
                            if (objO != coroutine_suspended) {
                                awaitPointerEventScope2 = awaitPointerEventScope;
                                if (((LongPressResult) objO) instanceof LongPressResult.Success) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, Continuation continuation) {
                    super(2, continuation);
                    this.f15932O = pointerInputScope;
                    this.J2 = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15932O, this.J2, continuation);
                    anonymousClass1.f15934t = obj;
                    return anonymousClass1;
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
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f15933n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        vd vdVar = (vd) this.f15934t;
                        PointerInputScope pointerInputScope = this.f15932O;
                        C04941 c04941 = new C04941(vdVar, this.J2, null);
                        this.f15933n = 1;
                        if (ForEachGestureKt.O(pointerInputScope, c04941, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objJ2 = Lu.J2(new AnonymousClass1(pointerInputScope, basicTooltipState, null), continuation);
                return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
            }
        }), basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt$handleGestures$2

            /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                final /* synthetic */ BasicTooltipState J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ PointerInputScope f15942O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f15943n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f15944t;

                /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", i = {0, 0}, l = {190}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
                static final class C04961 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ vd J2;

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    private /* synthetic */ Object f15945O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f15946n;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ BasicTooltipState f15947r;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f15948t;

                    /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
                    static final class C04971 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f15949n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ BasicTooltipState f15950t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C04971(BasicTooltipState basicTooltipState, Continuation continuation) {
                            super(2, continuation);
                            this.f15950t = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new C04971(this.f15950t, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((C04971) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f15949n;
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                BasicTooltipState basicTooltipState = this.f15950t;
                                MutatePriority mutatePriority = MutatePriority.f16229t;
                                this.f15949n = 1;
                                if (basicTooltipState.t(mutatePriority, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C04961 c04961 = new C04961(this.J2, this.f15947r, continuation);
                        c04961.f15945O = obj;
                        return c04961;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                        return ((C04961) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C04961(vd vdVar, BasicTooltipState basicTooltipState, Continuation continuation) {
                        super(2, continuation);
                        this.J2 = vdVar;
                        this.f15947r = basicTooltipState;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                        /*
                            r12 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r12.f15948t
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r12.f15946n
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r12.f15945O
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                            kotlin.ResultKt.throwOnFailure(r13)
                            goto L36
                        L17:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L1f:
                            kotlin.ResultKt.throwOnFailure(r13)
                            java.lang.Object r13 = r12.f15945O
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.f32080t
                            r3 = r13
                        L29:
                            r12.f15945O = r3
                            r12.f15946n = r1
                            r12.f15948t = r2
                            java.lang.Object r13 = r3.HBN(r1, r12)
                            if (r13 != r0) goto L36
                            return r0
                        L36:
                            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                            java.util.List r4 = r13.getChanges()
                            r5 = 0
                            java.lang.Object r4 = r4.get(r5)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            int r4 = r4.getType()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.INSTANCE
                            int r5 = r5.rl()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerType.KN(r4, r5)
                            if (r4 == 0) goto L29
                            int r13 = r13.getType()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                            int r5 = r4.n()
                            boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.mUb(r13, r5)
                            if (r5 == 0) goto L75
                            GJW.vd r6 = r12.J2
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1 r9 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1
                            androidx.compose.foundation.BasicTooltipState r13 = r12.f15947r
                            r4 = 0
                            r9.<init>(r13, r4)
                            r10 = 3
                            r11 = 0
                            r7 = 0
                            r8 = 0
                            GJW.Dsr.nr(r6, r7, r8, r9, r10, r11)
                            goto L29
                        L75:
                            int r4 = r4.rl()
                            boolean r13 = androidx.compose.ui.input.pointer.PointerEventType.mUb(r13, r4)
                            if (r13 == 0) goto L29
                            androidx.compose.foundation.BasicTooltipState r13 = r12.f15947r
                            r13.dismiss()
                            goto L29
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt$handleGestures$2.AnonymousClass1.C04961.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, Continuation continuation) {
                    super(2, continuation);
                    this.f15942O = pointerInputScope;
                    this.J2 = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15942O, this.J2, continuation);
                    anonymousClass1.f15944t = obj;
                    return anonymousClass1;
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
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f15943n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        vd vdVar = (vd) this.f15944t;
                        PointerInputScope pointerInputScope = this.f15942O;
                        C04961 c04961 = new C04961(vdVar, this.J2, null);
                        this.f15943n = 1;
                        if (pointerInputScope.eTf(c04961, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objJ2 = Lu.J2(new AnonymousClass1(pointerInputScope, basicTooltipState, null), continuation);
                return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
            }
        }) : modifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final PopupPositionProvider popupPositionProvider, final Function2 function2, BasicTooltipState basicTooltipState, Modifier modifier, boolean z2, boolean z3, final Function2 function22, Composer composer, final int i2, final int i3) {
        PopupPositionProvider popupPositionProvider2;
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        Function2 function23;
        Composer composer2;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        boolean z7;
        final BasicTooltipState basicTooltipState2 = basicTooltipState;
        Composer composerKN = composer.KN(1841478228);
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
                i5 |= composerKN.E2(function2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.p5(basicTooltipState2) ? 256 : 128;
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
                                function23 = function22;
                                i5 |= composerKN.E2(function23) ? 1048576 : 524288;
                            }
                            if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                z6 = z5;
                            } else {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                boolean z9 = i8 != 0 ? true : z4;
                                if (i9 != 0) {
                                    z5 = true;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1841478228, i5, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                                }
                                Object objIF = composerKN.iF();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                    objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                                    composerKN.o(objIF);
                                }
                                vd vdVar = (vd) objIF;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN = ComposablesKt.n(composerKN, 0);
                                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composerKN, companion2);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion3.n();
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
                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                Function2 function2Rl = companion3.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion3.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                if (basicTooltipState.isVisible()) {
                                    composerKN.eF(137118168);
                                    int i10 = i5 >> 3;
                                    z7 = false;
                                    rl(popupPositionProvider2, basicTooltipState, vdVar, z9, function2, composerKN, (i5 & 14) | (i10 & 112) | (i10 & 7168) | ((i5 << 9) & 57344));
                                    z4 = z9;
                                    composer2 = composerKN;
                                    composer2.Xw();
                                } else {
                                    z4 = z9;
                                    composer2 = composerKN;
                                    z7 = false;
                                    composer2.eF(137347847);
                                    composer2.Xw();
                                }
                                int i11 = i5 >> 3;
                                int i12 = ((i5 >> 15) & 14) | (i11 & 112) | (i11 & 896) | ((i5 >> 9) & 7168);
                                basicTooltipState2 = basicTooltipState;
                                Modifier modifier3 = modifier2;
                                boolean z10 = z5;
                                t(z10, basicTooltipState2, modifier3, function23, composer2, i12, 0);
                                composer2.XQ();
                                if ((i5 & 896) == 256) {
                                    z7 = true;
                                }
                                Object objIF2 = composer2.iF();
                                if (z7 || objIF2 == companion.n()) {
                                    objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                            final BasicTooltipState basicTooltipState3 = basicTooltipState2;
                                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$2$1$invoke$$inlined$onDispose$1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void n() {
                                                    basicTooltipState3.n();
                                                }
                                            };
                                        }
                                    };
                                    composer2.o(objIF2);
                                }
                                EffectsKt.rl(basicTooltipState2, (Function1) objIF2, composer2, (i5 >> 6) & 14);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                z6 = z10;
                                modifier2 = modifier3;
                            }
                            final boolean z11 = z4;
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                final BasicTooltipState basicTooltipState3 = basicTooltipState2;
                                final Modifier modifier4 = modifier2;
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$3
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
                                        BasicTooltipKt.n(popupPositionProvider, function2, basicTooltipState3, modifier4, z11, z6, function22, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 1572864;
                        function23 = function22;
                        if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
                        }
                        final boolean z112 = z4;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    z5 = z3;
                    if ((i3 & 64) == 0) {
                    }
                    function23 = function22;
                    if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
                    }
                    final boolean z1122 = z4;
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
                function23 = function22;
                if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
                }
                final boolean z11222 = z4;
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
            function23 = function22;
            if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
            }
            final boolean z112222 = z4;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
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
        function23 = function22;
        if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
        }
        final boolean z1122222 = z4;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final PopupPositionProvider popupPositionProvider, final BasicTooltipState basicTooltipState, final vd vdVar, final boolean z2, final Function2 function2, Composer composer, final int i2) {
        PopupPositionProvider popupPositionProvider2;
        int i3;
        Composer composerKN = composer.KN(-487341126);
        if ((i2 & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i3 = (composerKN.p5(popupPositionProvider2) ? 4 : 2) | i2;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(basicTooltipState) ? 32 : 16;
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
        if (composerKN.HI((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-487341126, i3, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)");
            }
            final String strN = BasicTooltipStrings.f15961n.n(composerKN, 6);
            boolean zE2 = composerKN.E2(vdVar) | ((i3 & 112) == 32);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0<Unit>() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1

                    /* JADX INFO: renamed from: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1", f = "BasicTooltip.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f15909n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ BasicTooltipState f15910t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(BasicTooltipState basicTooltipState, Continuation continuation) {
                            super(2, continuation);
                            this.f15910t = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.f15910t, continuation);
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
                            if (this.f15909n == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.f15910t.dismiss();
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
                        if (basicTooltipState.isVisible()) {
                            C.nr(vdVar, null, null, new AnonymousClass1(basicTooltipState, null), 3, null);
                        }
                    }
                };
                composerKN.o(objIF);
            }
            AndroidPopup_androidKt.n(popupPositionProvider2, (Function0) objIF, new PopupProperties(z2, false, false, false, 14, (DefaultConstructorMarker) null), ComposableLambdaKt.nr(-2085908648, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$2
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
                    if (!composer2.HI((i5 & 3) != 2, i5 & 1)) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-2085908648, i5, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.kt:144)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zP5 = composer2.p5(strN);
                    final String str = strN;
                    Object objIF2 = composer2.iF();
                    if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$2$1$1
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
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    BasicTooltipKt.rl(popupPositionProvider, basicTooltipState, vdVar, z2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            });
        }
    }
}
