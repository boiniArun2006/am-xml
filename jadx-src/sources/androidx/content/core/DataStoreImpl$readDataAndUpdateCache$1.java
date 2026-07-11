package androidx.content.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 2}, l = {l.f62282d, l.f62284f, Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "readDataAndUpdateCache", n = {"this", "currentState", "requireLock", "this", "this"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$0"})
final class DataStoreImpl$readDataAndUpdateCache$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f37452O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f37454o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl f37455r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37456t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.f37455r = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f37454o |= Integer.MIN_VALUE;
        return this.f37455r.WPU(false, this);
    }
}
