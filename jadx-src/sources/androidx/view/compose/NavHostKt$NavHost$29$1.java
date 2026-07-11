package androidx.view.compose;

import GJW.C;
import GJW.vd;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.view.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", i = {}, l = {628, 635}, m = "invokeSuspend", n = {}, s = {})
final class NavHostKt$NavHost$29$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavBackStackEntry J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ SeekableTransitionState f40322O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f40323n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Transition f40324r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f40325t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostKt$NavHost$29$1(SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, Transition transition, Continuation continuation) {
        super(2, continuation);
        this.f40322O = seekableTransitionState;
        this.J2 = navBackStackEntry;
        this.f40324r = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(this.f40322O, this.J2, this.f40324r, continuation);
        navHostKt$NavHost$29$1.f40325t = obj;
        return navHostKt$NavHost$29$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((NavHostKt$NavHost$29$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.iF(r4, r5, null, r10, 2, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.O(r1, 0.0f, 0.0f, r4, r5, r10, 4, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f40323n;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final vd vdVar = (vd) this.f40325t;
            if (!Intrinsics.areEqual(this.f40322O.n(), this.J2)) {
                SeekableTransitionState seekableTransitionState = this.f40322O;
                NavBackStackEntry navBackStackEntry = this.J2;
                this.f40323n = 1;
            } else {
                long jR = this.f40324r.r() / ((long) 1000000);
                float fN = this.f40322O.N();
                TweenSpec tweenSpecTy = AnimationSpecKt.ty((int) (this.f40322O.N() * jR), 0, null, 6, null);
                final SeekableTransitionState seekableTransitionState2 = this.f40322O;
                final NavBackStackEntry navBackStackEntry2 = this.J2;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$29$1.1

                    /* JADX INFO: renamed from: androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", i = {}, l = {643, 647}, m = "invokeSuspend", n = {}, s = {})
                    static final class C05631 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                        final /* synthetic */ NavBackStackEntry J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ SeekableTransitionState f40329O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f40330n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ float f40331t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C05631(float f3, SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, Continuation continuation) {
                            super(2, continuation);
                            this.f40331t = f3;
                            this.f40329O = seekableTransitionState;
                            this.J2 = navBackStackEntry;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new C05631(this.f40331t, this.f40329O, this.J2, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((C05631) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
                        
                            if (r11.M(r1, r10) == r0) goto L20;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(Object obj) {
                            C05631 c05631;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f40330n;
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        ResultKt.throwOnFailure(obj);
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            } else {
                                ResultKt.throwOnFailure(obj);
                                float f3 = this.f40331t;
                                if (f3 > 0.0f) {
                                    SeekableTransitionState seekableTransitionState = this.f40329O;
                                    this.f40330n = 1;
                                    c05631 = this;
                                    if (SeekableTransitionState.jB(seekableTransitionState, f3, null, c05631, 2, null) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                                if (c05631.f40331t == 0.0f) {
                                    SeekableTransitionState seekableTransitionState2 = c05631.f40329O;
                                    NavBackStackEntry navBackStackEntry = c05631.J2;
                                    c05631.f40330n = 2;
                                }
                                return Unit.INSTANCE;
                            }
                            c05631 = this;
                            if (c05631.f40331t == 0.0f) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f3, Float f4) {
                        n(f3.floatValue(), f4.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(float f3, float f4) {
                        C.nr(vdVar, null, null, new C05631(f3, seekableTransitionState2, navBackStackEntry2, null), 3, null);
                    }
                };
                this.f40323n = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
