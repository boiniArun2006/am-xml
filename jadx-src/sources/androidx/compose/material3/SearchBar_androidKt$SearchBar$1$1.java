package androidx.compose.material3;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$1$1", f = "SearchBar.android.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
final class SearchBar_androidKt$SearchBar$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableFloatState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ boolean f27318O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f27319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutableState f27320o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MutableState f27321r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Animatable f27322t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBar_androidKt$SearchBar$1$1(Animatable animatable, boolean z2, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.f27322t = animatable;
        this.f27318O = z2;
        this.J2 = mutableFloatState;
        this.f27321r = mutableState;
        this.f27320o = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchBar_androidKt$SearchBar$1$1(this.f27322t, this.f27318O, this.J2, this.f27321r, this.f27320o, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((SearchBar_androidKt$SearchBar$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FiniteAnimationSpec finiteAnimationSpec;
        SearchBar_androidKt$SearchBar$1$1 searchBar_androidKt$SearchBar$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f27319n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            float f3 = 0.0f;
            if (((Number) this.f27322t.ty()).floatValue() > 0.0f && ((Number) this.f27322t.ty()).floatValue() < 1.0f) {
                finiteAnimationSpec = SearchBar_androidKt.ty;
            } else {
                finiteAnimationSpec = this.f27318O ? SearchBar_androidKt.qie : SearchBar_androidKt.az;
            }
            FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
            if (this.f27318O) {
                f3 = 1.0f;
            }
            if (((Number) this.f27322t.ty()).floatValue() != f3) {
                Animatable animatable = this.f27322t;
                Float fBoxFloat = Boxing.boxFloat(f3);
                this.f27319n = 1;
                searchBar_androidKt$SearchBar$1$1 = this;
                if (Animatable.J2(animatable, fBoxFloat, finiteAnimationSpec2, null, null, searchBar_androidKt$SearchBar$1$1, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!searchBar_androidKt$SearchBar$1$1.f27318O) {
                searchBar_androidKt$SearchBar$1$1.J2.Z(Float.NaN);
                searchBar_androidKt$SearchBar$1$1.f27321r.setValue(null);
                searchBar_androidKt$SearchBar$1$1.f27320o.setValue(null);
            }
            return Unit.INSTANCE;
        }
        searchBar_androidKt$SearchBar$1$1 = this;
        if (!searchBar_androidKt$SearchBar$1$1.f27318O) {
        }
        return Unit.INSTANCE;
    }
}
