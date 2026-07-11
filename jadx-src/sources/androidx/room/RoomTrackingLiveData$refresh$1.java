package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.RoomTrackingLiveData", f = "RoomTrackingLiveData.android.kt", i = {0, 0}, l = {82}, m = "refresh", n = {"this", "computed"}, s = {"L$0", "I$0"})
final class RoomTrackingLiveData$refresh$1 extends ContinuationImpl {
    final /* synthetic */ RoomTrackingLiveData J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f41440O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41441n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f41442r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f41443t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomTrackingLiveData$refresh$1(RoomTrackingLiveData roomTrackingLiveData, Continuation continuation) {
        super(continuation);
        this.J2 = roomTrackingLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41440O = obj;
        this.f41442r |= Integer.MIN_VALUE;
        return this.J2.WPU(this);
    }
}
