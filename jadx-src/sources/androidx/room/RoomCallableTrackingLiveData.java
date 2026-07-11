package androidx.room;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/room/RoomCallableTrackingLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/room/RoomTrackingLiveData;", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/Callable;", "Z", "Ljava/util/concurrent/Callable;", "callableFunction", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoomCallableTrackingLiveData<T> extends RoomTrackingLiveData<T> {

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final Callable callableFunction;

    @Override // androidx.room.RoomTrackingLiveData
    public Object o(Continuation continuation) {
        return this.callableFunction.call();
    }
}
