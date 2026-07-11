package androidx.privacysandbox.ads.adservices.java.internal;

import GJW.P;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.util.concurrent.Xo;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/P;", "", "tag", "Lcom/google/common/util/concurrent/Xo;", "rl", "(LGJW/P;Ljava/lang/Object;)Lcom/google/common/util/concurrent/Xo;", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nr(final P this_asListenableFuture, Object obj, final CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th == null) {
                    completer.t(this_asListenableFuture.getCompleted());
                } else if (th instanceof CancellationException) {
                    completer.nr();
                } else {
                    completer.J2(th);
                }
            }
        });
        return obj;
    }

    public static final Xo rl(final P p2, final Object obj) {
        Intrinsics.checkNotNullParameter(p2, "<this>");
        Xo xoN = CallbackToFutureAdapter.n(new CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.j
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return CoroutineAdapterKt.nr(p2, obj, completer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(xoN, "getFuture { completer ->…      }\n        tag\n    }");
        return xoN;
    }

    public static /* synthetic */ Xo t(P p2, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return rl(p2, obj);
    }
}
