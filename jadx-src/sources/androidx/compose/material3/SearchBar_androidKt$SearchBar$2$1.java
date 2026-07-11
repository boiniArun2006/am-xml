package androidx.compose.material3;

import TFv.CN3;
import TFv.Wre;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.view.BackEventCompat;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTFv/Wre;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "progress", "", "<anonymous>", "(LTFv/Wre;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1", f = "SearchBar.android.kt", i = {}, l = {Sdk.SDKError.Reason.AD_CONSUMED_VALUE}, m = "invokeSuspend", n = {}, s = {})
final class SearchBar_androidKt$SearchBar$2$1 extends SuspendLambda implements Function2<Wre, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableFloatState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ MutatorMutex f27323O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ MutableState f27324S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutableState f27325Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f27326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function1 f27327o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Animatable f27328r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f27329t;

    /* JADX INFO: renamed from: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1", f = "SearchBar.android.kt", i = {}, l = {Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Wre f27330O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ MutableState f27331Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f27332n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ MutableState f27333o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f27334r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableFloatState f27335t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.f27335t, this.f27330O, this.J2, this.f27334r, this.f27333o, this.f27331Z, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableFloatState mutableFloatState, Wre wre, Animatable animatable, Function1 function1, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
            super(1, continuation);
            this.f27335t = mutableFloatState;
            this.f27330O = wre;
            this.J2 = animatable;
            this.f27334r = function1;
            this.f27333o = mutableState;
            this.f27331Z = mutableState2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            if (androidx.compose.animation.core.Animatable.J2(r4, r5, r6, null, null, r9, 12, null) != r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f27332n;
            try {
            } catch (CancellationException unused) {
                Animatable animatable = this.J2;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                FiniteAnimationSpec finiteAnimationSpec = SearchBar_androidKt.ty;
                this.f27332n = 2;
                anonymousClass1 = this;
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                        anonymousClass1.f27335t.Z(Float.NaN);
                        anonymousClass1.f27333o.setValue(null);
                        anonymousClass1.f27331Z.setValue(null);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.f27335t.Z(Float.NaN);
                Wre wre = this.f27330O;
                final MutableState mutableState = this.f27333o;
                final MutableState mutableState2 = this.f27331Z;
                final Animatable animatable2 = this.J2;
                CN3 cn3 = new CN3() { // from class: androidx.compose.material3.SearchBar_androidKt.SearchBar.2.1.1.1
                    @Override // TFv.CN3
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object rl(BackEventCompat backEventCompat, Continuation continuation) {
                        if (mutableState.getValue() == null) {
                            mutableState.setValue(backEventCompat);
                        }
                        mutableState2.setValue(backEventCompat);
                        Object objXQ = animatable2.XQ(Boxing.boxFloat(1 - PredictiveBack.f29233n.n(backEventCompat.getProgress())), continuation);
                        return objXQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objXQ : Unit.INSTANCE;
                    }
                };
                this.f27332n = 1;
                if (wre.n(cn3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f27335t.Z(((Number) this.J2.ty()).floatValue());
            this.f27334r.invoke(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBar_androidKt$SearchBar$2$1(MutatorMutex mutatorMutex, MutableFloatState mutableFloatState, Animatable animatable, Function1 function1, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.f27323O = mutatorMutex;
        this.J2 = mutableFloatState;
        this.f27328r = animatable;
        this.f27327o = function1;
        this.f27325Z = mutableState;
        this.f27324S = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchBar_androidKt$SearchBar$2$1 searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(this.f27323O, this.J2, this.f27328r, this.f27327o, this.f27325Z, this.f27324S, continuation);
        searchBar_androidKt$SearchBar$2$1.f27329t = obj;
        return searchBar_androidKt$SearchBar$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f27326n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Wre wre = (Wre) this.f27329t;
            MutatorMutex mutatorMutex = this.f27323O;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.J2, wre, this.f27328r, this.f27327o, this.f27325Z, this.f27324S, null);
            this.f27326n = 1;
            if (MutatorMutex.O(mutatorMutex, null, anonymousClass1, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Wre wre, Continuation continuation) {
        return ((SearchBar_androidKt$SearchBar$2$1) create(wre, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
