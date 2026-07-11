package androidx.compose.material3;

import GJW.vd;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LGJW/vd;", "", "velocity", "", "<anonymous>", "(LGJW/vd;F)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {2031}, m = "invokeSuspend", n = {}, s = {})
final class AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 extends SuspendLambda implements Function3<vd, Float, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TopAppBarScrollBehavior f24419O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f24420n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ float f24421t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, Continuation continuation) {
        super(3, continuation);
        this.f24419O = topAppBarScrollBehavior;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Float f3, Continuation<? super Unit> continuation) {
        return n(vdVar, f3.floatValue(), continuation);
    }

    public final Object n(vd vdVar, float f3, Continuation continuation) {
        AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(this.f24419O, continuation);
        appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1.f24421t = f3;
        return appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f24420n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            float f3 = this.f24421t;
            TopAppBarState state = this.f24419O.getState();
            DecayAnimationSpec flingAnimationSpec = this.f24419O.getFlingAnimationSpec();
            AnimationSpec snapAnimationSpec = this.f24419O.getSnapAnimationSpec();
            this.f24420n = 1;
            if (AppBarKt.iF(state, f3, flingAnimationSpec, snapAnimationSpec, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
