package androidx.content.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/WriteScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", i = {0}, l = {352, 353}, m = "invokeSuspend", n = {"$this$writeScope"}, s = {"L$0"})
final class DataStoreImpl$writeData$2<T> extends SuspendLambda implements Function2<WriteScope<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.IntRef J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f37502O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ boolean f37503Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Object f37505o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl f37506r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f37507t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$writeData$2(Ref.IntRef intRef, DataStoreImpl dataStoreImpl, Object obj, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.J2 = intRef;
        this.f37506r = dataStoreImpl;
        this.f37505o = obj;
        this.f37503Z = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.J2, this.f37506r, this.f37505o, this.f37503Z, continuation);
        dataStoreImpl$writeData$2.f37502O = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(WriteScope writeScope, Continuation continuation) {
        return ((DataStoreImpl$writeData$2) create(writeScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r3.n(r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.IntRef intRef;
        WriteScope writeScope;
        int iHashCode;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f37507t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f37503Z) {
                        DataStoreInMemoryCache dataStoreInMemoryCache = this.f37506r.inMemoryCache;
                        Object obj2 = this.f37505o;
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        dataStoreInMemoryCache.t(new Data(obj2, iHashCode, this.J2.element));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) this.f37504n;
            writeScope = (WriteScope) this.f37502O;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            WriteScope writeScope2 = (WriteScope) this.f37502O;
            intRef = this.J2;
            InterProcessCoordinator interProcessCoordinatorR = this.f37506r.r();
            this.f37502O = writeScope2;
            this.f37504n = intRef;
            this.f37507t = 1;
            Object objO = interProcessCoordinatorR.O(this);
            if (objO != coroutine_suspended) {
                writeScope = writeScope2;
                obj = objO;
            }
            return coroutine_suspended;
        }
        intRef.element = ((Number) obj).intValue();
        Object obj3 = this.f37505o;
        this.f37502O = null;
        this.f37504n = null;
        this.f37507t = 2;
    }
}
