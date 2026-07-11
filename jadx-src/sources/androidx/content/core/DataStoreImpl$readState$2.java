package androidx.content.core;

import GJW.vd;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "Landroidx/datastore/core/State;", "<anonymous>", "(LGJW/vd;)Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
final class DataStoreImpl$readState$2<T> extends SuspendLambda implements Function2<vd, Continuation<? super State<T>>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ boolean f37480O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f37481n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl f37482t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readState$2(DataStoreImpl dataStoreImpl, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f37482t = dataStoreImpl;
        this.f37480O = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DataStoreImpl$readState$2(this.f37482t, this.f37480O, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vd vdVar, Continuation continuation) {
        return ((DataStoreImpl$readState$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r5 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f37481n;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return (State) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.f37482t.inMemoryCache.n() instanceof Final) {
                    return this.f37482t.inMemoryCache.n();
                }
                DataStoreImpl dataStoreImpl = this.f37482t;
                this.f37481n = 1;
                if (dataStoreImpl.S(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            DataStoreImpl dataStoreImpl2 = this.f37482t;
            boolean z2 = this.f37480O;
            this.f37481n = 2;
            obj = dataStoreImpl2.WPU(z2, this);
        } catch (Throwable th) {
            return new ReadException(th, -1);
        }
    }
}
