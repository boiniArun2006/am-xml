package androidx.content.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
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
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "locked"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", i = {0, 1}, l = {306, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend", n = {"locked", "locked"}, s = {"Z$0", "Z$0"})
final class DataStoreImpl$readDataAndUpdateCache$4<T> extends SuspendLambda implements Function2<Boolean, Continuation<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {
    final /* synthetic */ DataStoreImpl J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ boolean f37460O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37461n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f37462r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f37463t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$4(DataStoreImpl dataStoreImpl, int i2, Continuation continuation) {
        super(2, continuation);
        this.J2 = dataStoreImpl;
        this.f37462r = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this.J2, this.f37462r, continuation);
        dataStoreImpl$readDataAndUpdateCache$4.f37460O = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
        return n(bool.booleanValue(), (Continuation) obj);
    }

    public final Object n(boolean z2, Continuation continuation) {
        return ((DataStoreImpl$readDataAndUpdateCache$4) create(Boolean.valueOf(z2), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r02;
        ?? r03;
        State state;
        ?? r12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r13 = this.f37463t;
        try {
        } catch (Throwable th2) {
            if (r13 != 0) {
                InterProcessCoordinator interProcessCoordinatorR = this.J2.r();
                this.f37461n = th2;
                this.f37460O = r13;
                this.f37463t = 2;
                Object objN = interProcessCoordinatorR.n(this);
                if (objN != coroutine_suspended) {
                    r03 = r13;
                    th = th2;
                    obj = objN;
                }
                return coroutine_suspended;
            }
            ?? r42 = r13;
            th = th2;
            iIntValue = this.f37462r;
            r02 = r42 == true ? 1 : 0;
        }
        if (r13 != 0) {
            if (r13 != 1) {
                if (r13 == 2) {
                    boolean z2 = this.f37460O;
                    th = (Throwable) this.f37461n;
                    ResultKt.throwOnFailure(obj);
                    r03 = z2;
                    iIntValue = ((Number) obj).intValue();
                    r02 = r03;
                    ReadException readException = new ReadException(th, iIntValue);
                    r12 = r02;
                    state = readException;
                    return TuplesKt.to(state, Boxing.boxBoolean(r12));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = this.f37460O;
            ResultKt.throwOnFailure(obj);
            r13 = z3;
        } else {
            ResultKt.throwOnFailure(obj);
            boolean z4 = this.f37460O;
            DataStoreImpl dataStoreImpl = this.J2;
            this.f37460O = z4;
            this.f37463t = 1;
            obj = dataStoreImpl.ViF(z4, this);
            r13 = z4;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        state = (State) obj;
        r12 = r13;
        return TuplesKt.to(state, Boxing.boxBoolean(r12));
    }
}
