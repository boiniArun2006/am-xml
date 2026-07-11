package androidx.room;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.InvalidationTracker;
import androidx.view.LiveData;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\n\u0010\u0007R\u001a\u0010\u000f\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%\u0082\u0001\u0002'(¨\u0006)"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/LiveData;", "", "WPU", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "S", "()V", "o", "qie", "az", "Landroidx/room/RoomDatabase;", "Landroidx/room/RoomDatabase;", "Z", "()Landroidx/room/RoomDatabase;", "database", "Landroidx/room/InvalidationLiveDataContainer;", "Landroidx/room/InvalidationLiveDataContainer;", TtmlNode.RUBY_CONTAINER, "", "ty", "XQ", "()Z", "inTransaction", "Landroidx/room/InvalidationTracker$Observer;", "HI", "Landroidx/room/InvalidationTracker$Observer;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ck", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "Ik", "computing", "r", "registeredObserver", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "launchContext", "Landroidx/room/RoomCallableTrackingLiveData;", "Landroidx/room/RoomLambdaTrackingLiveData;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RoomTrackingLiveData<T> extends LiveData<T> {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final InvalidationTracker.Observer observer;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final AtomicBoolean computing;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final InvalidationLiveDataContainer container;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final AtomicBoolean invalid;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext launchContext;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final RoomDatabase database;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean registeredObserver;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final boolean inTransaction;

    public abstract Object o(Continuation continuation);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x0033, Exception -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x002c, B:29:0x0069), top: B:49:0x002c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002c, B:27:0x0061, B:29:0x0069, B:36:0x0083, B:33:0x0079, B:34:0x0080), top: B:48:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005e -> B:27:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0092 -> B:41:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WPU(Continuation continuation) {
        RoomTrackingLiveData$refresh$1 roomTrackingLiveData$refresh$1;
        RoomTrackingLiveData<T> roomTrackingLiveData;
        RoomTrackingLiveData<T> roomTrackingLiveData2;
        if (continuation instanceof RoomTrackingLiveData$refresh$1) {
            roomTrackingLiveData$refresh$1 = (RoomTrackingLiveData$refresh$1) continuation;
            int i2 = roomTrackingLiveData$refresh$1.f41442r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roomTrackingLiveData$refresh$1.f41442r = i2 - Integer.MIN_VALUE;
            } else {
                roomTrackingLiveData$refresh$1 = new RoomTrackingLiveData$refresh$1(this, continuation);
            }
        }
        Object obj = roomTrackingLiveData$refresh$1.f41440O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = roomTrackingLiveData$refresh$1.f41442r;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = roomTrackingLiveData$refresh$1.f41443t;
                roomTrackingLiveData = (RoomTrackingLiveData) roomTrackingLiveData$refresh$1.f41441n;
                try {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = obj;
                    int i7 = i5;
                    while (roomTrackingLiveData.invalid.compareAndSet(true, false)) {
                        roomTrackingLiveData$refresh$1.f41441n = roomTrackingLiveData;
                        roomTrackingLiveData$refresh$1.f41443t = 1;
                        roomTrackingLiveData$refresh$1.f41442r = 1;
                        Object objO = roomTrackingLiveData.o(roomTrackingLiveData$refresh$1);
                        if (objO == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = objO;
                        i7 = 1;
                    }
                    if (i7 != 0) {
                        roomTrackingLiveData.ty(obj2);
                    }
                    if (i7 != 0 || !roomTrackingLiveData.invalid.get()) {
                        return Unit.INSTANCE;
                    }
                    roomTrackingLiveData2 = roomTrackingLiveData;
                    if (roomTrackingLiveData2.computing.compareAndSet(false, true)) {
                        roomTrackingLiveData = roomTrackingLiveData2;
                        i7 = 0;
                        if (i7 != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    obj2 = null;
                    roomTrackingLiveData = roomTrackingLiveData2;
                    i7 = 0;
                    while (roomTrackingLiveData.invalid.compareAndSet(true, false)) {
                    }
                    if (i7 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                } catch (Exception e2) {
                    throw new RuntimeException("Exception while computing database live data.", e2);
                }
            }
            ResultKt.throwOnFailure(obj);
            if (this.registeredObserver.compareAndSet(false, true)) {
                this.database.WPU().az(this.observer);
            }
            roomTrackingLiveData2 = this;
            if (roomTrackingLiveData2.computing.compareAndSet(false, true)) {
            }
        } finally {
            roomTrackingLiveData.computing.set(false);
        }
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    protected final boolean getInTransaction() {
        return this.inTransaction;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    protected final RoomDatabase getDatabase() {
        return this.database;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        boolean zKN = KN();
        if (this.invalid.compareAndSet(false, true) && zKN) {
            GJW.C.nr(this.database.S(), this.launchContext, null, new RoomTrackingLiveData$invalidated$1(this, null), 2, null);
        }
    }

    @Override // androidx.view.LiveData
    protected void az() {
        super.az();
        this.container.rl(this);
    }

    @Override // androidx.view.LiveData
    protected void qie() {
        super.qie();
        this.container.n(this);
        GJW.C.nr(this.database.S(), this.launchContext, null, new RoomTrackingLiveData$onActive$1(this, null), 2, null);
    }
}
