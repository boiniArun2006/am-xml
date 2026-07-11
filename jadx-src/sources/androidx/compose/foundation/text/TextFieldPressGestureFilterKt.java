package androidx.compose.foundation.text;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onTap", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldPressGestureFilterKt {
    public static final Modifier n(Modifier modifier, final MutableInteractionSource mutableInteractionSource, boolean z2, final Function1 function1) {
        return z2 ? ComposedModifierKt.t(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(-102778667);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-102778667, i2, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                Object objIF = composer.iF();
                Composer.Companion companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer);
                    composer.o(objIF);
                }
                final vd vdVar = (vd) objIF;
                Object objIF2 = composer.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                    composer.o(objIF2);
                }
                final MutableState mutableState = (MutableState) objIF2;
                final State stateCk = SnapshotStateKt.ck(function1, composer, 0);
                Object obj = mutableInteractionSource;
                boolean zP5 = composer.p5(obj);
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                Object objIF3 = composer.iF();
                if (zP5 || objIF3 == companion.n()) {
                    objIF3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final MutableState mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void n() {
                                    PressInteraction.Press press = (PressInteraction.Press) mutableState2.getValue();
                                    if (press != null) {
                                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                        if (mutableInteractionSource4 != null) {
                                            mutableInteractionSource4.rl(cancel);
                                        }
                                        mutableState2.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.o(objIF3);
                }
                EffectsKt.rl(obj, (Function1) objIF3, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                boolean zE2 = composer.E2(vdVar) | composer.p5(mutableInteractionSource) | composer.p5(stateCk);
                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                Object objIF4 = composer.iF();
                if (zE2 || objIF4 == companion.n()) {
                    objIF4 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1

                        /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
                        static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
                            final /* synthetic */ vd J2;

                            /* JADX INFO: renamed from: O, reason: collision with root package name */
                            /* synthetic */ long f19869O;

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            int f19870n;

                            /* JADX INFO: renamed from: o, reason: collision with root package name */
                            final /* synthetic */ MutableInteractionSource f19871o;

                            /* JADX INFO: renamed from: r, reason: collision with root package name */
                            final /* synthetic */ MutableState f19872r;

                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                            private /* synthetic */ Object f19873t;

                            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                            @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {60, 64}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                            static final class C05121 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                                final /* synthetic */ long J2;

                                /* JADX INFO: renamed from: O, reason: collision with root package name */
                                final /* synthetic */ MutableState f19874O;

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                Object f19875n;

                                /* JADX INFO: renamed from: r, reason: collision with root package name */
                                final /* synthetic */ MutableInteractionSource f19876r;

                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                int f19877t;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C05121(MutableState mutableState, long j2, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                                    super(2, continuation);
                                    this.f19874O = mutableState;
                                    this.J2 = j2;
                                    this.f19876r = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    return new C05121(this.f19874O, this.J2, this.f19876r, continuation);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                    return ((C05121) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                    return invoke2(vdVar, (Continuation) continuation);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invokeSuspend(Object obj) {
                                    MutableState mutableState;
                                    MutableState mutableState2;
                                    PressInteraction.Press press;
                                    MutableInteractionSource mutableInteractionSource;
                                    PressInteraction.Press press2;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.f19877t;
                                    if (i2 != 0) {
                                        if (i2 != 1) {
                                            if (i2 == 2) {
                                                press2 = (PressInteraction.Press) this.f19875n;
                                                ResultKt.throwOnFailure(obj);
                                                press = press2;
                                                this.f19874O.setValue(press);
                                                return Unit.INSTANCE;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        mutableState2 = (MutableState) this.f19875n;
                                        ResultKt.throwOnFailure(obj);
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        PressInteraction.Press press3 = (PressInteraction.Press) this.f19874O.getValue();
                                        if (press3 != null) {
                                            MutableInteractionSource mutableInteractionSource2 = this.f19876r;
                                            mutableState = this.f19874O;
                                            PressInteraction.Cancel cancel = new PressInteraction.Cancel(press3);
                                            if (mutableInteractionSource2 != null) {
                                                this.f19875n = mutableState;
                                                this.f19877t = 1;
                                                if (mutableInteractionSource2.n(cancel, this) != coroutine_suspended) {
                                                    mutableState2 = mutableState;
                                                }
                                            }
                                            mutableState.setValue(null);
                                            press = new PressInteraction.Press(this.J2, null);
                                            mutableInteractionSource = this.f19876r;
                                            if (mutableInteractionSource != null) {
                                                this.f19875n = press;
                                                this.f19877t = 2;
                                                if (mutableInteractionSource.n(press, this) != coroutine_suspended) {
                                                    press2 = press;
                                                    press = press2;
                                                }
                                            }
                                            this.f19874O.setValue(press);
                                            return Unit.INSTANCE;
                                        }
                                        press = new PressInteraction.Press(this.J2, null);
                                        mutableInteractionSource = this.f19876r;
                                        if (mutableInteractionSource != null) {
                                        }
                                        this.f19874O.setValue(press);
                                        return Unit.INSTANCE;
                                        return coroutine_suspended;
                                    }
                                    mutableState = mutableState2;
                                    mutableState.setValue(null);
                                    press = new PressInteraction.Press(this.J2, null);
                                    mutableInteractionSource = this.f19876r;
                                    if (mutableInteractionSource != null) {
                                    }
                                    this.f19874O.setValue(press);
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                            @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
                            static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                                final /* synthetic */ boolean J2;

                                /* JADX INFO: renamed from: O, reason: collision with root package name */
                                final /* synthetic */ MutableState f19878O;

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                Object f19879n;

                                /* JADX INFO: renamed from: r, reason: collision with root package name */
                                final /* synthetic */ MutableInteractionSource f19880r;

                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                int f19881t;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass2(MutableState mutableState, boolean z2, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                                    super(2, continuation);
                                    this.f19878O = mutableState;
                                    this.J2 = z2;
                                    this.f19880r = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    return new AnonymousClass2(this.f19878O, this.J2, this.f19880r, continuation);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                    return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                    return invoke2(vdVar, (Continuation) continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    MutableState mutableState;
                                    Interaction cancel;
                                    MutableState mutableState2;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.f19881t;
                                    if (i2 != 0) {
                                        if (i2 == 1) {
                                            mutableState2 = (MutableState) this.f19879n;
                                            ResultKt.throwOnFailure(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        PressInteraction.Press press = (PressInteraction.Press) this.f19878O.getValue();
                                        if (press != null) {
                                            boolean z2 = this.J2;
                                            MutableInteractionSource mutableInteractionSource = this.f19880r;
                                            mutableState = this.f19878O;
                                            if (z2) {
                                                cancel = new PressInteraction.Release(press);
                                            } else {
                                                cancel = new PressInteraction.Cancel(press);
                                            }
                                            if (mutableInteractionSource != null) {
                                                this.f19879n = mutableState;
                                                this.f19881t = 1;
                                                if (mutableInteractionSource.n(cancel, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutableState2 = mutableState;
                                            }
                                            mutableState.setValue(null);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    mutableState = mutableState2;
                                    mutableState.setValue(null);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                                return n(pressGestureScope, offset.getPackedValue(), continuation);
                            }

                            public final Object n(PressGestureScope pressGestureScope, long j2, Continuation continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.J2, this.f19872r, this.f19871o, continuation);
                                anonymousClass1.f19873t = pressGestureScope;
                                anonymousClass1.f19869O = j2;
                                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(vd vdVar, MutableState mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                                super(3, continuation);
                                this.J2 = vdVar;
                                this.f19872r = mutableState;
                                this.f19871o = mutableInteractionSource;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = this.f19870n;
                                if (i2 != 0) {
                                    if (i2 == 1) {
                                        ResultKt.throwOnFailure(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj);
                                    PressGestureScope pressGestureScope = (PressGestureScope) this.f19873t;
                                    C.nr(this.J2, null, null, new C05121(this.f19872r, this.f19869O, this.f19871o, null), 3, null);
                                    this.f19870n = 1;
                                    obj = pressGestureScope.kSg(this);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                C.nr(this.J2, null, null, new AnonymousClass2(this.f19872r, ((Boolean) obj).booleanValue(), this.f19871o, null), 3, null);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(vdVar, mutableState, mutableInteractionSource4, null);
                            final State state = stateCk;
                            Object objGh = TapGestureDetectorKt.gh(pointerInputScope, anonymousClass1, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                    n(offset.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(long j2) {
                                    ((Function1) state.getValue()).invoke(Offset.nr(j2));
                                }
                            }, continuation);
                            return objGh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objGh : Unit.INSTANCE;
                        }
                    };
                    composer.o(objIF4);
                }
                Modifier modifierNr = SuspendingPointerInputFilterKt.nr(companion2, mutableInteractionSource3, (PointerInputEventHandler) objIF4);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierNr;
            }
        }, 1, null) : modifier;
    }
}
