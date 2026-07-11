package androidx.content.core;

import aT.dE.JLZo;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "locked", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", i = {0, 1}, l = {370, 371}, m = "invokeSuspend", n = {"locked", "data"}, s = {"Z$0", "L$0"})
final class DataStoreImpl$readDataOrHandleCorruption$2<T> extends SuspendLambda implements Function2<Boolean, Continuation<? super Data<T>>, Object> {
    final /* synthetic */ DataStoreImpl J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ boolean f37472O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37473n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f37474r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f37475t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$2(DataStoreImpl dataStoreImpl, int i2, Continuation continuation) {
        super(2, continuation);
        this.J2 = dataStoreImpl;
        this.f37474r = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(this.J2, this.f37474r, continuation);
        dataStoreImpl$readDataOrHandleCorruption$2.f37472O = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataOrHandleCorruption$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
        return n(bool.booleanValue(), (Continuation) obj);
    }

    public final Object n(boolean z2, Continuation continuation) {
        return ((DataStoreImpl$readDataOrHandleCorruption$2) create(Boolean.valueOf(z2), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Object obj2;
        int iIntValue;
        int iHashCode;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f37475t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    obj2 = this.f37473n;
                    ResultKt.throwOnFailure(obj);
                    iIntValue = ((Number) obj).intValue();
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    return new Data(obj2, iHashCode, iIntValue);
                }
                throw new IllegalStateException(JLZo.bvHfX);
            }
            z2 = this.f37472O;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            z2 = this.f37472O;
            DataStoreImpl dataStoreImpl = this.J2;
            this.f37472O = z2;
            this.f37475t = 1;
            obj = dataStoreImpl.aYN(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (z2) {
            InterProcessCoordinator interProcessCoordinatorR = this.J2.r();
            this.f37473n = obj;
            this.f37475t = 2;
            Object objN = interProcessCoordinatorR.n(this);
            if (objN != coroutine_suspended) {
                obj2 = obj;
                obj = objN;
                iIntValue = ((Number) obj).intValue();
                if (obj2 != null) {
                }
                return new Data(obj2, iHashCode, iIntValue);
            }
            return coroutine_suspended;
        }
        obj2 = obj;
        iIntValue = this.f37474r;
        if (obj2 != null) {
        }
        return new Data(obj2, iHashCode, iIntValue);
    }
}
