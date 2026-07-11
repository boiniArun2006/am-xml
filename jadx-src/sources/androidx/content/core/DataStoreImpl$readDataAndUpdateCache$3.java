package androidx.content.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.internal.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", i = {}, l = {298, d.f62986a}, m = "invokeSuspend", n = {}, s = {})
final class DataStoreImpl$readDataAndUpdateCache$3<T> extends SuspendLambda implements Function1<Continuation<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl f37457O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37458n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f37459t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$3(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(1, continuation);
        this.f37457O = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$readDataAndUpdateCache$3(this.f37457O, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        return ((DataStoreImpl$readDataAndUpdateCache$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        State readException;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f37459t;
        try {
        } catch (Throwable th2) {
            InterProcessCoordinator interProcessCoordinatorR = this.f37457O.r();
            this.f37458n = th2;
            this.f37459t = 2;
            Object objN = interProcessCoordinatorR.n(this);
            if (objN != coroutine_suspended) {
                th = th2;
                obj = objN;
            }
            return coroutine_suspended;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    th = (Throwable) this.f37458n;
                    ResultKt.throwOnFailure(obj);
                    readException = new ReadException(th, ((Number) obj).intValue());
                    return TuplesKt.to(readException, Boxing.boxBoolean(true));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            DataStoreImpl dataStoreImpl = this.f37457O;
            this.f37459t = 1;
            obj = dataStoreImpl.ViF(true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        readException = (State) obj;
        return TuplesKt.to(readException, Boxing.boxBoolean(true));
    }
}
