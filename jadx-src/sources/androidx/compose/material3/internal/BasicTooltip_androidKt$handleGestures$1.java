package androidx.compose.material3.internal;

import GJW.C;
import GJW.h;
import GJW.vd;
import TFv.Lu;
import TFv.SPz;
import TFv.fuX;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
final class BasicTooltip_androidKt$handleGestures$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TooltipState f29123O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f29124n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f29125t;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ TooltipState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PointerInputScope f29126O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f29127n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f29128t;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", i = {0, 0, 0, 0, 1, 1, 1, 2}, l = {171, 177, 197}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "isLongPressedFlow", "pass", "longPressTimeout", "$this$awaitEachGesture", "isLongPressedFlow", "pass", "isLongPressedFlow"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$0"})
        static final class C05511 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            long f29129O;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ TooltipState f29130Z;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f29131n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ vd f29132o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f29133r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f29134t;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", i = {}, l = {185, 187, 187}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                final /* synthetic */ TooltipState J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ SPz f29138O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f29139n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f29140t;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.f29138O, this.J2, continuation);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(vd vdVar, Continuation continuation) {
                    return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "isLongPressed", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1", f = "BasicTooltip.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class C05531 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ TooltipState f29141O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f29142n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    /* synthetic */ boolean f29143t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C05531(TooltipState tooltipState, Continuation continuation) {
                        super(2, continuation);
                        this.f29141O = tooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C05531 c05531 = new C05531(this.f29141O, continuation);
                        c05531.f29143t = ((Boolean) obj).booleanValue();
                        return c05531;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                        return n(bool.booleanValue(), continuation);
                    }

                    public final Object n(boolean z2, Continuation continuation) {
                        return ((C05531) create(Boolean.valueOf(z2), continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f29142n == 0) {
                            ResultKt.throwOnFailure(obj);
                            if (!this.f29143t) {
                                this.f29141O.dismiss();
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(SPz sPz, TooltipState tooltipState, Continuation continuation) {
                    super(2, continuation);
                    this.f29138O = sPz;
                    this.J2 = tooltipState;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
                
                    if (TFv.fuX.gh(r7, r1, r6) == r0) goto L26;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0 */
                /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.material3.TooltipState] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f29140t;
                    int i3 = 3;
                    try {
                    } catch (Throwable th) {
                        SPz sPz = this.f29138O;
                        C05531 c05531 = new C05531(this.J2, null);
                        this.f29139n = th;
                        this.f29140t = i3;
                        if (fuX.gh(sPz, c05531, this) != coroutine_suspended) {
                            throw th;
                        }
                    }
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Throwable th2 = (Throwable) this.f29139n;
                                ResultKt.throwOnFailure(obj);
                                throw th2;
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        this.f29138O.t(Boxing.boxBoolean(true));
                        TooltipState tooltipState = this.J2;
                        MutatePriority mutatePriority = MutatePriority.f16226O;
                        this.f29140t = 1;
                        if (tooltipState.t(mutatePriority, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    SPz sPz2 = this.f29138O;
                    i3 = this.J2;
                    C05531 c055312 = new C05531(i3, null);
                    this.f29140t = 2;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C05511 c05511 = new C05511(this.f29132o, this.f29130Z, continuation);
                c05511.f29133r = obj;
                return c05511;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                return ((C05511) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
            static final class C05521 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ PointerEventPass f29135O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f29136n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f29137t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C05521(PointerEventPass pointerEventPass, Continuation continuation) {
                    super(2, continuation);
                    this.f29135O = pointerEventPass;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C05521 c05521 = new C05521(this.f29135O, continuation);
                    c05521.f29137t = obj;
                    return c05521;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((C05521) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f29136n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f29137t;
                    PointerEventPass pointerEventPass = this.f29135O;
                    this.f29136n = 1;
                    Object objXQ = TapGestureDetectorKt.XQ(awaitPointerEventScope, pointerEventPass, this);
                    if (objXQ == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objXQ;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05511(vd vdVar, TooltipState tooltipState, Continuation continuation) {
                super(2, continuation);
                this.f29132o = vdVar;
                this.f29130Z = tooltipState;
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
            
                if (r0 == r6) goto L36;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v1, types: [TFv.r] */
            /* JADX WARN: Type inference failed for: r1v7 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                long jT2;
                Object objJ2;
                AwaitPointerEventScope awaitPointerEventScope;
                PointerEventPass pointerEventPass;
                SPz sPz;
                SPz sPz2;
                C05521 c05521;
                Object objXQ;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.J2;
                ?? r12 = 1;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.f29133r;
                        SPz sPzN = Lu.n(Boxing.boxBoolean(false));
                        jT2 = awaitPointerEventScope2.getViewConfiguration().t();
                        PointerEventPass pointerEventPass2 = PointerEventPass.f32078n;
                        this.f29133r = awaitPointerEventScope2;
                        this.f29131n = sPzN;
                        this.f29134t = pointerEventPass2;
                        this.f29129O = jT2;
                        this.J2 = 1;
                        objJ2 = TapGestureDetectorKt.J2(awaitPointerEventScope2, false, pointerEventPass2, this, 1, null);
                        if (objJ2 != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                            pointerEventPass = pointerEventPass2;
                            sPz = sPzN;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sPz2 = (SPz) this.f29133r;
                            ResultKt.throwOnFailure(obj);
                            objXQ = obj;
                            PointerInputChange pointerInputChange = (PointerInputChange) objXQ;
                            if (pointerInputChange != null) {
                                pointerInputChange.n();
                            }
                            sPz2.t(Boxing.boxBoolean(false));
                            return Unit.INSTANCE;
                        }
                        pointerEventPass = (PointerEventPass) this.f29134t;
                        sPz2 = (SPz) this.f29131n;
                        awaitPointerEventScope = (AwaitPointerEventScope) this.f29133r;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (PointerEventTimeoutCancellationException unused) {
                            C.nr(this.f29132o, null, h.J2, new AnonymousClass2(sPz2, this.f29130Z, null), 1, null);
                            this.f29133r = sPz2;
                            this.f29131n = null;
                            this.f29134t = null;
                            this.J2 = 3;
                            objXQ = TapGestureDetectorKt.XQ(awaitPointerEventScope, pointerEventPass, this);
                        }
                        sPz2.t(Boxing.boxBoolean(false));
                        return Unit.INSTANCE;
                    }
                    long j2 = this.f29129O;
                    PointerEventPass pointerEventPass3 = (PointerEventPass) this.f29134t;
                    sPz = (SPz) this.f29131n;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f29133r;
                    ResultKt.throwOnFailure(obj);
                    jT2 = j2;
                    pointerEventPass = pointerEventPass3;
                    awaitPointerEventScope = awaitPointerEventScope3;
                    objJ2 = obj;
                    int type = ((PointerInputChange) objJ2).getType();
                    PointerType.Companion companion = PointerType.INSTANCE;
                    if (PointerType.KN(type, companion.nr()) || PointerType.KN(type, companion.t())) {
                        try {
                            c05521 = new C05521(pointerEventPass, null);
                            this.f29133r = awaitPointerEventScope;
                            this.f29131n = sPz;
                            this.f29134t = pointerEventPass;
                            this.J2 = 2;
                        } catch (PointerEventTimeoutCancellationException unused2) {
                            sPz2 = sPz;
                            C.nr(this.f29132o, null, h.J2, new AnonymousClass2(sPz2, this.f29130Z, null), 1, null);
                            this.f29133r = sPz2;
                            this.f29131n = null;
                            this.f29134t = null;
                            this.J2 = 3;
                            objXQ = TapGestureDetectorKt.XQ(awaitPointerEventScope, pointerEventPass, this);
                        } catch (Throwable th) {
                            th = th;
                            r12 = sPz;
                            r12.t(Boxing.boxBoolean(false));
                            throw th;
                        }
                        if (awaitPointerEventScope.lLA(jT2, c05521, this) != coroutine_suspended) {
                            sPz2 = sPz;
                            sPz2.t(Boxing.boxBoolean(false));
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, Continuation continuation) {
            super(2, continuation);
            this.f29126O = pointerInputScope;
            this.J2 = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29126O, this.J2, continuation);
            anonymousClass1.f29128t = obj;
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
            int i2 = this.f29127n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f29128t;
                PointerInputScope pointerInputScope = this.f29126O;
                C05511 c05511 = new C05511(vdVar, this.J2, null);
                this.f29127n = 1;
                if (ForEachGestureKt.O(pointerInputScope, c05511, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTooltip_androidKt$handleGestures$1(TooltipState tooltipState, Continuation continuation) {
        super(2, continuation);
        this.f29123O = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasicTooltip_androidKt$handleGestures$1 basicTooltip_androidKt$handleGestures$1 = new BasicTooltip_androidKt$handleGestures$1(this.f29123O, continuation);
        basicTooltip_androidKt$handleGestures$1.f29125t = obj;
        return basicTooltip_androidKt$handleGestures$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        return ((BasicTooltip_androidKt$handleGestures$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f29124n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.f29125t, this.f29123O, null);
            this.f29124n = 1;
            if (GJW.Lu.J2(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
