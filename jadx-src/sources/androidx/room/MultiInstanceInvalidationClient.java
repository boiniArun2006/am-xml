package androidx.room;

import GJW.vd;
import TFv.nKK;
import TFv.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00012\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001a*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109¨\u0006;"}, d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "Landroid/content/Context;", "context", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/room/InvalidationTracker;", "invalidationTracker", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/InvalidationTracker;)V", "", "xMQ", "()V", "Landroid/content/Intent;", "serviceIntent", "mUb", "(Landroid/content/Intent;)V", "gh", c.f62177j, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "rl", "Landroidx/room/InvalidationTracker;", "KN", "()Landroidx/room/InvalidationTracker;", "kotlin.jvm.PlatformType", "t", "Landroid/content/Context;", "appContext", "LGJW/vd;", "nr", "LGJW/vd;", "coroutineScope", "Ljava/util/concurrent/atomic/AtomicBoolean;", "O", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "", "J2", "I", "clientId", "Landroidx/room/IMultiInstanceInvalidationService;", "Uo", "Landroidx/room/IMultiInstanceInvalidationService;", "invalidationService", "LTFv/r;", "", "LTFv/r;", "invalidatedTables", "androidx/room/MultiInstanceInvalidationClient$observer$1", "Landroidx/room/MultiInstanceInvalidationClient$observer$1;", "observer", "Landroidx/room/IMultiInstanceInvalidationCallback;", "Landroidx/room/IMultiInstanceInvalidationCallback;", "invalidationCallback", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiInstanceInvalidationClient.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.android.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,146:1\n1#2:147\n60#3:148\n63#3:152\n50#4:149\n55#4:151\n107#5:150\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.android.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n133#1:148\n133#1:152\n133#1:149\n133#1:151\n133#1:150\n*E\n"})
public final class MultiInstanceInvalidationClient {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int clientId;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final r invalidatedTables;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean stopped;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private IMultiInstanceInvalidationService invalidationService;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final IMultiInstanceInvalidationCallback invalidationCallback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final InvalidationTracker invalidationTracker;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MultiInstanceInvalidationClient$observer$1 observer;

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.room.MultiInstanceInvalidationClient$observer$1] */
    public MultiInstanceInvalidationClient(Context context, String name, InvalidationTracker invalidationTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = invalidationTracker.getDatabase().S();
        this.stopped = new AtomicBoolean(true);
        this.invalidatedTables = nKK.n(0, 0, ILs.j.f4185n);
        final String[] tableNames = invalidationTracker.getTableNames();
        this.observer = new InvalidationTracker.Observer(tableNames) { // from class: androidx.room.MultiInstanceInvalidationClient$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public boolean rl() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void t(Set tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                if (this.rl.stopped.get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.rl.invalidationService;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.e(this.rl.clientId, (String[]) tables.toArray(new String[0]));
                    }
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e2);
                }
            }
        };
        this.invalidationCallback = new IMultiInstanceInvalidationCallback.Stub() { // from class: androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1
            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public void qie(String[] tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                GJW.C.nr(this.f41335n.coroutineScope, null, null, new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(tables, this.f41335n, null), 3, null);
            }
        };
        this.serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name2, IBinder service) {
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(service, "service");
                this.f41339n.invalidationService = IMultiInstanceInvalidationService.Stub.fcU(service);
                this.f41339n.xMQ();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name2) {
                Intrinsics.checkNotNullParameter(name2, "name");
                this.f41339n.invalidationService = null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xMQ() {
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.invalidationService;
            if (iMultiInstanceInvalidationService != null) {
                this.clientId = iMultiInstanceInvalidationService.jB(this.invalidationCallback, this.name);
            }
        } catch (RemoteException e2) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
        }
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final void gh() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.nY(this.observer);
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.invalidationService;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.C(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e2);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }

    public final void mUb(Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(serviceIntent, this.serviceConnection, 1);
            this.invalidationTracker.qie(this.observer);
        }
    }
}
