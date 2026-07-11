package androidx.compose.animation.core;

import GJW.vd;
import ILs.C;
import ILs.Dsr;
import androidx.compose.runtime.State;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {0}, l = {418}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ ILs.CN3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f15423O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ State f15424Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ State f15426o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Animatable f15427r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f15428t;

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ State J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Animatable f15429O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f15430n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ State f15431r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f15432t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj, Animatable animatable, State state, State state2, Continuation continuation) {
            super(2, continuation);
            this.f15432t = obj;
            this.f15429O = animatable;
            this.J2 = state;
            this.f15431r = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f15432t, this.f15429O, this.J2, this.f15431r, continuation);
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
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f15430n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(this.f15432t, this.f15429O.qie())) {
                    Animatable animatable = this.f15429O;
                    Object obj2 = this.f15432t;
                    AnimationSpec animationSpecUo = AnimateAsStateKt.Uo(this.J2);
                    this.f15430n = 1;
                    anonymousClass1 = this;
                    if (Animatable.J2(animatable, obj2, animationSpecUo, null, null, anonymousClass1, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
            Function1 function1J2 = AnimateAsStateKt.J2(anonymousClass1.f15431r);
            if (function1J2 != null) {
                function1J2.invoke(anonymousClass1.f15429O.ty());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.J2, this.f15427r, this.f15426o, this.f15424Z, continuation);
        animateAsStateKt$animateValueAsState$3$1.f15423O = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimateAsStateKt$animateValueAsState$3$1(ILs.CN3 cn3, Animatable animatable, State state, State state2, Continuation continuation) {
        super(2, continuation);
        this.J2 = cn3;
        this.f15427r = animatable;
        this.f15426o = state;
        this.f15424Z = state2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:12:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Dsr it;
        vd vdVar;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15428t;
        if (i2 != 0) {
            if (i2 == 1) {
                it = (Dsr) this.f15425n;
                vdVar = (vd) this.f15423O;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    Object objJ2 = C.J2(this.J2.O());
                    if (objJ2 == null) {
                        obj2 = next;
                    } else {
                        obj2 = objJ2;
                    }
                    GJW.C.nr(vdVar, null, null, new AnonymousClass1(obj2, this.f15427r, this.f15426o, this.f15424Z, null), 3, null);
                    this.f15423O = vdVar;
                    this.f15425n = it;
                    this.f15428t = 1;
                    obj = it.rl(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            vd vdVar2 = (vd) this.f15423O;
            it = this.J2.iterator();
            vdVar = vdVar2;
            this.f15423O = vdVar;
            this.f15425n = it;
            this.f15428t = 1;
            obj = it.rl(this);
            if (obj == coroutine_suspended) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }
}
