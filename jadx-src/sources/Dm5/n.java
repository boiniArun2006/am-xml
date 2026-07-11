package Dm5;

import Dm5.n;
import android.content.Context;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.models.Settings;
import fb.AbstractC2109j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.I28;
import qu.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f1926n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: renamed from: Dm5.n$j$j, reason: collision with other inner class name */
        static final class C0068j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f1927n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28 f1928t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0068j(I28 i28, Continuation continuation) {
                super(1, continuation);
                this.f1928t = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0068j(this.f1928t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Settings settings;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1927n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    I28 i28 = this.f1928t;
                    this.f1927n = 1;
                    obj = Wre.n(i28, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                OracleResponse oracleResponse = (OracleResponse) obj;
                if (oracleResponse != null && (settings = oracleResponse.getSettings()) != null) {
                    return Boxing.boxInt(settings.getMinRequiredBuildNumber());
                }
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C0068j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: Dm5.n$j$n, reason: collision with other inner class name */
        static final class C0069n extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f1929n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28 f1930t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0069n(I28 i28, Continuation continuation) {
                super(1, continuation);
                this.f1930t = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0069n(this.f1930t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Settings settings;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1929n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    I28 i28 = this.f1930t;
                    this.f1929n = 1;
                    obj = Wre.n(i28, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                OracleResponse oracleResponse = (OracleResponse) obj;
                if (oracleResponse != null && (settings = oracleResponse.getSettings()) != null) {
                    return Boxing.boxInt(settings.getMinSuggestedBuildNumber());
                }
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C0069n) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n O(Context context, Function1 function1, Function1 function12) {
            return new com.bendingspoons.forceupdater.internal.w6(context, function1, function12);
        }

        public final n nr(Context context, I28 oracleResponseStore) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            return t(context, new C0068j(oracleResponseStore, null), new C0069n(oracleResponseStore, null));
        }

        public final n t(final Context context, final Function1 minRequiredBuildNumberProvider, final Function1 minSuggestedBuildNumberProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(minRequiredBuildNumberProvider, "minRequiredBuildNumberProvider");
            Intrinsics.checkNotNullParameter(minSuggestedBuildNumberProvider, "minSuggestedBuildNumberProvider");
            return (n) n(new Function0() { // from class: Dm5.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.O(context, minRequiredBuildNumberProvider, minSuggestedBuildNumberProvider);
                }
            });
        }

        private j() {
        }
    }

    Object n(Continuation continuation);
}
