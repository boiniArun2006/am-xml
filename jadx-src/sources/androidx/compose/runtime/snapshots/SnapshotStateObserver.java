package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.fuX;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001LB0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001c\u001a\u00020\u001b\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010!\u001a\u00020\u0004\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0006\u0010\u001e\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$J0\u0010&\u001a\u00020\u00042!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u000fJ\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u000fR5\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R(\u00100\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010,j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R,\u00107\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0004038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010+R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010'R\u0018\u0010H\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010J¨\u0006M"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "ty", "()Z", "o", "()V", "", "set", "mUb", "(Ljava/util/Set;)V", "Ik", "()Ljava/util/Set;", "", "r", "()Ljava/lang/Void;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "onChanged", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "HI", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "scope", "onValueChangedForScope", "block", "ck", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "qie", "(Ljava/lang/Object;)V", "predicate", "az", "Z", "XQ", "gh", c.f62177j, "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "rl", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "t", "sendingNotifications", "Lkotlin/Function2;", "Landroidx/compose/runtime/snapshots/Snapshot;", "nr", "Lkotlin/jvm/functions/Function2;", "applyObserver", "O", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "J2", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMaps", "Uo", "Ljava/lang/Object;", "observedScopeMapsLock", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "KN", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", "xMQ", "isPaused", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMap", "", "J", "currentMapThreadId", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,597:1\n183#1:604\n184#1:616\n187#1:652\n188#1:670\n187#1:671\n188#1:689\n183#1:690\n184#1:702\n1101#2:598\n1083#2,2:599\n27#3:601\n33#3,2:602\n33#3,2:605\n33#3,2:617\n33#3,2:628\n33#3,2:645\n33#3,2:653\n33#3,2:672\n33#3,2:691\n423#4,9:607\n423#4,9:619\n740#4,15:630\n740#4,15:655\n740#4,15:674\n423#4,9:693\n347#4,8:703\n641#4,2:711\n33#5,5:647\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n71#1:604\n71#1:616\n278#1:652\n278#1:670\n289#1:671\n289#1:689\n316#1:690\n316#1:702\n174#1:598\n174#1:599,2\n175#1:601\n65#1:602,2\n71#1:605,2\n183#1:617,2\n187#1:628,2\n222#1:645,2\n278#1:653,2\n289#1:672,2\n316#1:691,2\n71#1:607,9\n183#1:619,9\n187#1:630,15\n278#1:655,15\n289#1:674,15\n316#1:693,9\n327#1:703,8\n330#1:711,2\n229#1:647,5\n*E\n"})
public final class SnapshotStateObserver {
    public static final int qie = 8;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private ObserverHandle applyUnsubscribe;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private ObservedScopeMap currentMap;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 onChangedExecutor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean sendingNotifications;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean isPaused;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final AtomicReference pendingChanges = new AtomicReference(null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function2 applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
            n(set, snapshot);
            return Unit.INSTANCE;
        }

        public final void n(Set set, Snapshot snapshot) {
            this.f30991n.mUb(set);
            if (this.f30991n.ty()) {
                this.f30991n.o();
            }
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function1 readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        public final void n(Object obj) {
            if (this.f30992n.isPaused) {
                return;
            }
            Object obj2 = this.f30992n.observedScopeMapsLock;
            SnapshotStateObserver snapshotStateObserver = this.f30992n;
            synchronized (obj2) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                Intrinsics.checkNotNull(observedScopeMap);
                observedScopeMap.gh(obj);
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            n(obj);
            return Unit.INSTANCE;
        }
    };

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableVector observedScopeMaps = new MutableVector(new ObservedScopeMap[16], 0);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Object observedScopeMapsLock = new Object();

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private long currentMapThreadId = -1;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0011J7\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u0011J0\u0010\u001f\u001a\u00020\u00032!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u001d0\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010$¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00032\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0003¢\u0006\u0004\b,\u0010#R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00103R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u00107R&\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010<R\u001e\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010?R\u0017\u0010E\u001a\u00020A8\u0006¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00105R*\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030(068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u00107R<\u0010K\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030(\u0012\u0006\u0012\u0004\u0018\u00010\u00010Hj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030(\u0012\u0006\u0012\u0004\u0018\u00010\u0001`I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "Lkotlin/Function1;", "", "onChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "currentToken", "currentScope", "Landroidx/collection/MutableObjectIntMap;", "recordedValues", "qie", "(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/MutableObjectIntMap;)V", "scope", "nr", "(Ljava/lang/Object;)V", "az", "(Ljava/lang/Object;Ljava/lang/Object;)V", "gh", "readObserver", "Lkotlin/Function0;", "block", "xMQ", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "O", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "predicate", "ty", "Uo", "()Z", "t", "()V", "", "changes", "mUb", "(Ljava/util/Set;)Z", "Landroidx/compose/runtime/DerivedState;", "derivedState", "HI", "(Landroidx/compose/runtime/DerivedState;)V", "KN", c.f62177j, "Lkotlin/jvm/functions/Function1;", "J2", "()Lkotlin/jvm/functions/Function1;", "rl", "Ljava/lang/Object;", "Landroidx/collection/MutableObjectIntMap;", "currentScopeReads", "I", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/collection/MutableScatterMap;", "valueToScopes", "Landroidx/collection/MutableScatterMap;", "scopeToValues", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterSet;", "invalidated", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "statesToReread", "Landroidx/compose/runtime/DerivedStateObserver;", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateObserver", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 12 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 15 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,597:1\n1101#2:598\n1083#2,2:599\n403#3,3:601\n367#3,6:604\n377#3,3:611\n380#3,2:615\n383#3,6:618\n406#3:624\n367#3,6:636\n377#3,3:643\n380#3,2:647\n383#3,6:653\n395#3,4:660\n367#3,6:664\n377#3,3:671\n380#3,9:675\n399#3:684\n395#3,4:700\n367#3,6:704\n377#3,3:711\n380#3,9:715\n399#3:724\n1399#4:610\n1270#4:614\n1399#4:642\n1270#4:646\n1399#4:670\n1270#4:674\n1399#4:692\n1270#4:696\n1399#4:710\n1270#4:714\n1399#4:748\n1270#4:752\n1399#4:772\n1270#4:776\n1399#4:795\n1270#4:799\n1399#4:838\n1270#4:842\n1399#4:874\n1270#4:878\n1399#4:912\n1270#4:916\n1399#4:935\n1270#4:939\n1399#4:978\n1270#4:982\n1399#4:1014\n1270#4:1018\n1399#4:1061\n1270#4:1065\n1399#4:1090\n1270#4:1094\n57#5:617\n57#5:625\n57#5:755\n393#6,6:626\n399#6,2:633\n44#7:632\n519#7:1035\n423#7,9:1036\n775#8:635\n777#8,4:649\n781#8:659\n842#9:685\n844#9:699\n845#9,3:725\n848#9:734\n329#10,6:686\n339#10,3:693\n342#10,2:697\n345#10,6:728\n41#11,3:735\n46#11:900\n48#11:1034\n231#12,3:738\n200#12,7:741\n211#12,3:749\n214#12,2:753\n231#12,3:762\n200#12,7:765\n211#12,3:773\n214#12,2:777\n231#12,3:785\n200#12,7:788\n211#12,3:796\n214#12,9:800\n234#12:809\n217#12,6:814\n234#12:820\n231#12,3:828\n200#12,7:831\n211#12,3:839\n214#12,9:843\n234#12:852\n231#12,3:864\n200#12,7:867\n211#12,3:875\n214#12,9:879\n234#12:888\n217#12,6:893\n234#12:899\n231#12,3:902\n200#12,7:905\n211#12,3:913\n214#12,2:917\n231#12,3:925\n200#12,7:928\n211#12,3:936\n214#12,9:940\n234#12:949\n217#12,6:954\n234#12:960\n231#12,3:968\n200#12,7:971\n211#12,3:979\n214#12,9:983\n234#12:992\n231#12,3:1004\n200#12,7:1007\n211#12,3:1015\n214#12,9:1019\n234#12:1028\n231#12,3:1051\n200#12,7:1054\n211#12,3:1062\n214#12,2:1066\n217#12,6:1069\n234#12:1075\n231#12,3:1080\n200#12,7:1083\n211#12,3:1091\n214#12,9:1095\n234#12:1104\n67#13,6:756\n67#13,6:779\n75#13,4:810\n75#13:821\n67#13,6:822\n75#13,4:853\n78#13:857\n67#13,6:858\n75#13,4:889\n67#13,6:919\n75#13,4:950\n75#13:961\n67#13,6:962\n75#13,4:993\n78#13:997\n67#13,6:998\n75#13,4:1029\n67#13,6:1045\n75#13,4:1076\n1855#14:901\n1856#14:1033\n1#15:1068\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n365#1:598\n365#1:599,2\n431#1:601,3\n431#1:604,6\n431#1:611,3\n431#1:615,2\n431#1:618,6\n431#1:624\n472#1:636,6\n472#1:643,3\n472#1:647,2\n472#1:653,6\n484#1:660,4\n484#1:664,6\n484#1:671,3\n484#1:675,9\n484#1:684\n492#1:700,4\n492#1:704,6\n492#1:711,3\n492#1:715,9\n492#1:724\n431#1:610\n431#1:614\n472#1:642\n472#1:646\n484#1:670\n484#1:674\n489#1:692\n489#1:696\n492#1:710\n492#1:714\n529#1:748\n529#1:752\n536#1:772\n536#1:776\n548#1:795\n548#1:799\n548#1:838\n548#1:842\n559#1:874\n559#1:878\n536#1:912\n536#1:916\n548#1:935\n548#1:939\n548#1:978\n548#1:982\n559#1:1014\n559#1:1018\n577#1:1061\n577#1:1065\n592#1:1090\n592#1:1094\n433#1:617\n441#1:625\n530#1:755\n459#1:626,6\n459#1:633,2\n459#1:632\n565#1:1035\n566#1:1036,9\n472#1:635\n472#1:649,4\n472#1:659\n489#1:685\n489#1:699\n489#1:725,3\n489#1:734\n489#1:686,6\n489#1:693,3\n489#1:697,2\n489#1:728,6\n529#1:735,3\n529#1:900\n529#1:1034\n529#1:738,3\n529#1:741,7\n529#1:749,3\n529#1:753,2\n536#1:762,3\n536#1:765,7\n536#1:773,3\n536#1:777,2\n548#1:785,3\n548#1:788,7\n548#1:796,3\n548#1:800,9\n548#1:809\n536#1:814,6\n536#1:820\n548#1:828,3\n548#1:831,7\n548#1:839,3\n548#1:843,9\n548#1:852\n559#1:864,3\n559#1:867,7\n559#1:875,3\n559#1:879,9\n559#1:888\n529#1:893,6\n529#1:899\n536#1:902,3\n536#1:905,7\n536#1:913,3\n536#1:917,2\n548#1:925,3\n548#1:928,7\n548#1:936,3\n548#1:940,9\n548#1:949\n536#1:954,6\n536#1:960\n548#1:968,3\n548#1:971,7\n548#1:979,3\n548#1:983,9\n548#1:992\n559#1:1004,3\n559#1:1007,7\n559#1:1015,3\n559#1:1019,9\n559#1:1028\n577#1:1051,3\n577#1:1054,7\n577#1:1062,3\n577#1:1066,2\n577#1:1069,6\n577#1:1075\n592#1:1080,3\n592#1:1083,7\n592#1:1091,3\n592#1:1095,9\n592#1:1104\n536#1:756,6\n548#1:779,6\n548#1:810,4\n536#1:821\n548#1:822,6\n548#1:853,4\n536#1:857\n559#1:858,6\n559#1:889,4\n548#1:919,6\n548#1:950,4\n536#1:961\n548#1:962,6\n548#1:993,4\n536#1:997\n559#1:998,6\n559#1:1029,4\n577#1:1045,6\n577#1:1076,4\n529#1:901\n529#1:1033\n*E\n"})
    static final class ObservedScopeMap {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final MutableScatterMap scopeToValues;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private int deriveStateScopeCount;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Function1 onChanged;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private Object currentScope;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private MutableObjectIntMap currentScopeReads;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private int currentToken = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final MutableScatterMap valueToScopes = ScopeMap.O(null, 1, null);

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private final MutableScatterSet invalidated = new MutableScatterSet(0, 1, null);

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private final MutableVector statesToReread = new MutableVector(new DerivedState[16], 0);

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void n(DerivedState derivedState) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.f30990n;
                observedScopeMap.deriveStateScopeCount--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void rl(DerivedState derivedState) {
                this.f30990n.deriveStateScopeCount++;
            }
        };

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
        private final MutableScatterMap dependencyToDerivedStates = ScopeMap.O(null, 1, null);

        /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
        private final HashMap recordedDerivedStateValues = new HashMap();

        /* JADX WARN: Removed duplicated region for block: B:100:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02a2 A[PHI: r11
          0x02a2: PHI (r11v42 boolean) = (r11v41 boolean), (r11v43 boolean) binds: [B:111:0x027a, B:119:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:179:0x03fc A[PHI: r13
          0x03fc: PHI (r13v8 boolean) = (r13v7 boolean), (r13v10 boolean) binds: [B:170:0x03d0, B:178:0x03fa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:216:0x04bf A[PHI: r11
          0x04bf: PHI (r11v14 boolean) = (r11v13 boolean), (r11v15 boolean) binds: [B:207:0x0497, B:215:0x04bd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:220:0x04cf  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x04d9  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[PHI: r37
          0x0146: PHI (r37v5 boolean) = (r37v4 boolean), (r37v6 boolean) binds: [B:47:0x011a, B:56:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x022f A[PHI: r11
          0x022f: PHI (r11v52 boolean) = (r11v51 boolean), (r11v53 boolean) binds: [B:87:0x0207, B:95:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mUb(Set changes) {
            boolean z2;
            Iterator it;
            MutableScatterMap mutableScatterMap;
            Object objO;
            int i2;
            Object objO2;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            MutableScatterMap mutableScatterMap2;
            long[] jArr2;
            Object[] objArr2;
            long j2;
            long[] jArr3;
            Object[] objArr3;
            String str;
            int i3;
            long[] jArr4;
            Object[] objArr4;
            String str2;
            int i5;
            int i7;
            long j3;
            int i8;
            int i9;
            Object obj;
            Object obj2;
            String str3;
            Object obj3;
            int i10;
            long j4;
            int i11;
            int i12;
            MutableScatterMap mutableScatterMap3 = this.dependencyToDerivedStates;
            HashMap map = this.recordedDerivedStateValues;
            MutableScatterMap mutableScatterMap4 = this.valueToScopes;
            MutableScatterSet mutableScatterSet = this.invalidated;
            String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i13 = 8;
            if (changes instanceof ScatterSetWrapper) {
                ScatterSet set = ((ScatterSetWrapper) changes).getSet();
                Object[] objArr5 = set.elements;
                long[] jArr5 = set.metadata;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    z2 = false;
                    while (true) {
                        long j5 = jArr5[i14];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j5 & 255) < 128) {
                                    int i17 = i13;
                                    Object obj4 = objArr5[(i14 << 3) + i16];
                                    jArr4 = jArr5;
                                    if (obj4 instanceof StateObjectImpl) {
                                        objArr4 = objArr5;
                                        if (!((StateObjectImpl) obj4).te(ReaderKind.n(2))) {
                                            str2 = str4;
                                            i5 = length;
                                            i7 = i14;
                                            j3 = j5;
                                            i8 = i15;
                                        }
                                        i9 = 8;
                                    } else {
                                        objArr4 = objArr5;
                                    }
                                    if (ScopeMap.J2(mutableScatterMap3, obj4)) {
                                        Object objO3 = mutableScatterMap3.O(obj4);
                                        if (objO3 == null) {
                                            str2 = str4;
                                            obj2 = obj4;
                                            i5 = length;
                                            i7 = i14;
                                            j3 = j5;
                                            i8 = i15;
                                            obj = obj2;
                                        } else {
                                            if (objO3 instanceof MutableScatterSet) {
                                                MutableScatterSet mutableScatterSet2 = (MutableScatterSet) objO3;
                                                Object[] objArr6 = mutableScatterSet2.elements;
                                                long[] jArr6 = mutableScatterSet2.metadata;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    j3 = j5;
                                                    int i18 = 0;
                                                    boolean z3 = z2;
                                                    while (true) {
                                                        long j6 = jArr6[i18];
                                                        i5 = length;
                                                        i7 = i14;
                                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                            int i20 = 0;
                                                            while (i20 < i19) {
                                                                if ((j6 & 255) < 128) {
                                                                    i10 = i20;
                                                                    DerivedState derivedState = (DerivedState) objArr6[(i18 << 3) + i20];
                                                                    Intrinsics.checkNotNull(derivedState, str4);
                                                                    j4 = j6;
                                                                    Object obj5 = map.get(derivedState);
                                                                    SnapshotMutationPolicy snapshotMutationPolicyO = derivedState.getPolicy();
                                                                    if (snapshotMutationPolicyO == null) {
                                                                        snapshotMutationPolicyO = SnapshotStateKt.r();
                                                                    }
                                                                    boolean z4 = z3;
                                                                    if (snapshotMutationPolicyO.rl(derivedState.g().n(), obj5)) {
                                                                        str3 = str4;
                                                                        obj3 = obj4;
                                                                        i11 = i15;
                                                                        this.statesToReread.rl(derivedState);
                                                                    } else {
                                                                        Object objO4 = mutableScatterMap4.O(derivedState);
                                                                        if (objO4 == null) {
                                                                            str3 = str4;
                                                                            obj3 = obj4;
                                                                            i11 = i15;
                                                                        } else if (objO4 instanceof MutableScatterSet) {
                                                                            MutableScatterSet mutableScatterSet3 = (MutableScatterSet) objO4;
                                                                            Object[] objArr7 = mutableScatterSet3.elements;
                                                                            long[] jArr7 = mutableScatterSet3.metadata;
                                                                            int length3 = jArr7.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i11 = i15;
                                                                                int i21 = 0;
                                                                                while (true) {
                                                                                    long j7 = jArr7[i21];
                                                                                    str3 = str4;
                                                                                    obj3 = obj4;
                                                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                                                                        int i23 = 0;
                                                                                        while (i23 < i22) {
                                                                                            if ((j7 & 255) < 128) {
                                                                                                i12 = i23;
                                                                                                mutableScatterSet.xMQ(objArr7[(i21 << 3) + i23]);
                                                                                                z4 = true;
                                                                                            } else {
                                                                                                i12 = i23;
                                                                                            }
                                                                                            j7 >>= i17;
                                                                                            i23 = i12 + 1;
                                                                                        }
                                                                                        if (i22 != i17) {
                                                                                            break;
                                                                                        }
                                                                                        if (i21 == length3) {
                                                                                            break;
                                                                                        }
                                                                                        i21++;
                                                                                        str4 = str3;
                                                                                        obj4 = obj3;
                                                                                        i17 = 8;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str3 = str4;
                                                                            obj3 = obj4;
                                                                            i11 = i15;
                                                                            mutableScatterSet.xMQ(objO4);
                                                                            z3 = true;
                                                                        }
                                                                    }
                                                                    z3 = z4;
                                                                } else {
                                                                    str3 = str4;
                                                                    obj3 = obj4;
                                                                    i10 = i20;
                                                                    j4 = j6;
                                                                    i11 = i15;
                                                                }
                                                                j6 = j4 >> 8;
                                                                i20 = i10 + 1;
                                                                i17 = 8;
                                                                i15 = i11;
                                                                str4 = str3;
                                                                obj4 = obj3;
                                                            }
                                                            str2 = str4;
                                                            obj2 = obj4;
                                                            boolean z5 = z3;
                                                            i8 = i15;
                                                            if (i19 != i17) {
                                                                z2 = z5;
                                                                break;
                                                            }
                                                            z3 = z5;
                                                        } else {
                                                            str2 = str4;
                                                            obj2 = obj4;
                                                            i8 = i15;
                                                        }
                                                        if (i18 == length2) {
                                                            z2 = z3;
                                                            break;
                                                        }
                                                        i18++;
                                                        length = i5;
                                                        i14 = i7;
                                                        i15 = i8;
                                                        str4 = str2;
                                                        obj4 = obj2;
                                                        i17 = 8;
                                                    }
                                                }
                                            } else {
                                                str2 = str4;
                                                obj2 = obj4;
                                                i5 = length;
                                                i7 = i14;
                                                j3 = j5;
                                                i8 = i15;
                                                DerivedState derivedState2 = (DerivedState) objO3;
                                                Object obj6 = map.get(derivedState2);
                                                SnapshotMutationPolicy snapshotMutationPolicyO2 = derivedState2.getPolicy();
                                                if (snapshotMutationPolicyO2 == null) {
                                                    snapshotMutationPolicyO2 = SnapshotStateKt.r();
                                                }
                                                if (snapshotMutationPolicyO2.rl(derivedState2.g().n(), obj6)) {
                                                    this.statesToReread.rl(derivedState2);
                                                } else {
                                                    Object objO5 = mutableScatterMap4.O(derivedState2);
                                                    if (objO5 != null) {
                                                        if (objO5 instanceof MutableScatterSet) {
                                                            MutableScatterSet mutableScatterSet4 = (MutableScatterSet) objO5;
                                                            Object[] objArr8 = mutableScatterSet4.elements;
                                                            long[] jArr8 = mutableScatterSet4.metadata;
                                                            int length4 = jArr8.length - 2;
                                                            if (length4 >= 0) {
                                                                int i24 = 0;
                                                                while (true) {
                                                                    long j9 = jArr8[i24];
                                                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i25 = 8 - ((~(i24 - length4)) >>> 31);
                                                                        for (int i26 = 0; i26 < i25; i26++) {
                                                                            if ((j9 & 255) < 128) {
                                                                                mutableScatterSet.xMQ(objArr8[(i24 << 3) + i26]);
                                                                                z2 = true;
                                                                            }
                                                                            j9 >>= 8;
                                                                        }
                                                                        if (i25 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i24 == length4) {
                                                                            break;
                                                                        }
                                                                        i24++;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            mutableScatterSet.xMQ(objO5);
                                                            z2 = true;
                                                        }
                                                    }
                                                }
                                            }
                                            obj = obj2;
                                        }
                                    } else {
                                        str2 = str4;
                                        i5 = length;
                                        i7 = i14;
                                        j3 = j5;
                                        i8 = i15;
                                        obj = obj4;
                                    }
                                    Object objO6 = mutableScatterMap4.O(obj);
                                    if (objO6 != null) {
                                        if (objO6 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet5 = (MutableScatterSet) objO6;
                                            Object[] objArr9 = mutableScatterSet5.elements;
                                            long[] jArr9 = mutableScatterSet5.metadata;
                                            int length5 = jArr9.length - 2;
                                            if (length5 >= 0) {
                                                int i27 = 0;
                                                while (true) {
                                                    long j10 = jArr9[i27];
                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i28 = 8 - ((~(i27 - length5)) >>> 31);
                                                        for (int i29 = 0; i29 < i28; i29++) {
                                                            if ((j10 & 255) < 128) {
                                                                mutableScatterSet.xMQ(objArr9[(i27 << 3) + i29]);
                                                                z2 = true;
                                                            }
                                                            j10 >>= 8;
                                                        }
                                                        if (i28 != 8) {
                                                            break;
                                                        }
                                                        if (i27 == length5) {
                                                            break;
                                                        }
                                                        i27++;
                                                    }
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.xMQ(objO6);
                                            z2 = true;
                                        }
                                    }
                                    i9 = 8;
                                } else {
                                    jArr4 = jArr5;
                                    objArr4 = objArr5;
                                    str2 = str4;
                                    i5 = length;
                                    i7 = i14;
                                    j3 = j5;
                                    i8 = i15;
                                    i9 = i13;
                                }
                                j5 = j3 >> i9;
                                i16++;
                                objArr5 = objArr4;
                                i13 = i9;
                                jArr5 = jArr4;
                                length = i5;
                                i14 = i7;
                                i15 = i8;
                                str4 = str2;
                            }
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            str = str4;
                            int i30 = length;
                            int i31 = i14;
                            if (i15 != i13) {
                                break;
                            }
                            length = i30;
                            i3 = i31;
                        } else {
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            str = str4;
                            i3 = i14;
                        }
                        if (i3 == length) {
                            break;
                        }
                        i14 = i3 + 1;
                        objArr5 = objArr3;
                        jArr5 = jArr3;
                        str4 = str;
                        i13 = 8;
                    }
                } else {
                    z2 = false;
                }
            } else {
                Iterator it3 = changes.iterator();
                z2 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof StateObjectImpl) || ((StateObjectImpl) next).te(ReaderKind.n(2))) {
                        if (!ScopeMap.J2(mutableScatterMap3, next) || (objO2 = mutableScatterMap3.O(next)) == null) {
                            it = it3;
                            mutableScatterMap = mutableScatterMap3;
                            objO = mutableScatterMap4.O(next);
                            if (objO != null) {
                                if (objO instanceof MutableScatterSet) {
                                    MutableScatterSet mutableScatterSet6 = (MutableScatterSet) objO;
                                    Object[] objArr10 = mutableScatterSet6.elements;
                                    long[] jArr10 = mutableScatterSet6.metadata;
                                    int length6 = jArr10.length - 2;
                                    if (length6 >= 0) {
                                        while (true) {
                                            long j11 = jArr10[i2];
                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i32 = 8 - ((~(i2 - length6)) >>> 31);
                                                for (int i33 = 0; i33 < i32; i33++) {
                                                    if ((j11 & 255) < 128) {
                                                        mutableScatterSet.xMQ(objArr10[(i2 << 3) + i33]);
                                                        z2 = true;
                                                    }
                                                    j11 >>= 8;
                                                }
                                                if (i32 == 8) {
                                                    break;
                                                }
                                            }
                                            i2 = i2 != length6 ? i2 + 1 : 0;
                                        }
                                    }
                                } else {
                                    mutableScatterSet.xMQ(objO);
                                    z2 = true;
                                }
                            }
                        } else {
                            if (objO2 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet7 = (MutableScatterSet) objO2;
                                Object[] objArr11 = mutableScatterSet7.elements;
                                long[] jArr11 = mutableScatterSet7.metadata;
                                int length7 = jArr11.length - 2;
                                if (length7 >= 0) {
                                    int i34 = 0;
                                    while (true) {
                                        long j12 = jArr11[i34];
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i35 = 8 - ((~(i34 - length7)) >>> 31);
                                            int i36 = 0;
                                            while (i36 < i35) {
                                                if ((j12 & 255) < 128) {
                                                    it2 = it3;
                                                    DerivedState derivedState3 = (DerivedState) objArr11[(i34 << 3) + i36];
                                                    mutableScatterMap2 = mutableScatterMap3;
                                                    Intrinsics.checkNotNull(derivedState3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                    Object obj7 = map.get(derivedState3);
                                                    SnapshotMutationPolicy snapshotMutationPolicyO3 = derivedState3.getPolicy();
                                                    if (snapshotMutationPolicyO3 == null) {
                                                        snapshotMutationPolicyO3 = SnapshotStateKt.r();
                                                    }
                                                    jArr2 = jArr11;
                                                    objArr2 = objArr11;
                                                    if (snapshotMutationPolicyO3.rl(derivedState3.g().n(), obj7)) {
                                                        j2 = j12;
                                                        this.statesToReread.rl(derivedState3);
                                                    } else {
                                                        Object objO7 = mutableScatterMap4.O(derivedState3);
                                                        if (objO7 != null) {
                                                            if (objO7 instanceof MutableScatterSet) {
                                                                MutableScatterSet mutableScatterSet8 = (MutableScatterSet) objO7;
                                                                Object[] objArr12 = mutableScatterSet8.elements;
                                                                long[] jArr12 = mutableScatterSet8.metadata;
                                                                int length8 = jArr12.length - 2;
                                                                if (length8 >= 0) {
                                                                    j2 = j12;
                                                                    int i37 = 0;
                                                                    boolean z6 = z2;
                                                                    while (true) {
                                                                        long j13 = jArr12[i37];
                                                                        long[] jArr13 = jArr12;
                                                                        Object[] objArr13 = objArr12;
                                                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i38 = 8 - ((~(i37 - length8)) >>> 31);
                                                                            for (int i39 = 0; i39 < i38; i39++) {
                                                                                if ((j13 & 255) < 128) {
                                                                                    mutableScatterSet.xMQ(objArr13[(i37 << 3) + i39]);
                                                                                    z6 = true;
                                                                                }
                                                                                j13 >>= 8;
                                                                            }
                                                                            if (i38 != 8) {
                                                                                break;
                                                                            }
                                                                            if (i37 == length8) {
                                                                                break;
                                                                            }
                                                                            i37++;
                                                                            objArr12 = objArr13;
                                                                            jArr12 = jArr13;
                                                                        }
                                                                    }
                                                                    z2 = z6;
                                                                }
                                                            } else {
                                                                j2 = j12;
                                                                mutableScatterSet.xMQ(objO7);
                                                                z2 = true;
                                                            }
                                                        }
                                                    }
                                                    j12 = j2 >> 8;
                                                    i36++;
                                                    it3 = it2;
                                                    mutableScatterMap3 = mutableScatterMap2;
                                                    jArr11 = jArr2;
                                                    objArr11 = objArr2;
                                                } else {
                                                    it2 = it3;
                                                    mutableScatterMap2 = mutableScatterMap3;
                                                    jArr2 = jArr11;
                                                    objArr2 = objArr11;
                                                }
                                                j2 = j12;
                                                j12 = j2 >> 8;
                                                i36++;
                                                it3 = it2;
                                                mutableScatterMap3 = mutableScatterMap2;
                                                jArr11 = jArr2;
                                                objArr11 = objArr2;
                                            }
                                            it = it3;
                                            mutableScatterMap = mutableScatterMap3;
                                            jArr = jArr11;
                                            objArr = objArr11;
                                            if (i35 != 8) {
                                                break;
                                            }
                                        } else {
                                            it = it3;
                                            mutableScatterMap = mutableScatterMap3;
                                            jArr = jArr11;
                                            objArr = objArr11;
                                        }
                                        if (i34 == length7) {
                                            break;
                                        }
                                        i34++;
                                        it3 = it;
                                        mutableScatterMap3 = mutableScatterMap;
                                        jArr11 = jArr;
                                        objArr11 = objArr;
                                    }
                                }
                            } else {
                                it = it3;
                                mutableScatterMap = mutableScatterMap3;
                                DerivedState derivedState4 = (DerivedState) objO2;
                                Object obj8 = map.get(derivedState4);
                                SnapshotMutationPolicy snapshotMutationPolicyO4 = derivedState4.getPolicy();
                                if (snapshotMutationPolicyO4 == null) {
                                    snapshotMutationPolicyO4 = SnapshotStateKt.r();
                                }
                                if (snapshotMutationPolicyO4.rl(derivedState4.g().n(), obj8)) {
                                    this.statesToReread.rl(derivedState4);
                                } else {
                                    Object objO8 = mutableScatterMap4.O(derivedState4);
                                    if (objO8 != null) {
                                        if (objO8 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet9 = (MutableScatterSet) objO8;
                                            Object[] objArr14 = mutableScatterSet9.elements;
                                            long[] jArr14 = mutableScatterSet9.metadata;
                                            int length9 = jArr14.length - 2;
                                            if (length9 >= 0) {
                                                int i40 = 0;
                                                while (true) {
                                                    long j14 = jArr14[i40];
                                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i41 = 8 - ((~(i40 - length9)) >>> 31);
                                                        for (int i42 = 0; i42 < i41; i42++) {
                                                            if ((j14 & 255) < 128) {
                                                                mutableScatterSet.xMQ(objArr14[(i40 << 3) + i42]);
                                                                z2 = true;
                                                            }
                                                            j14 >>= 8;
                                                        }
                                                        if (i41 != 8) {
                                                            break;
                                                        }
                                                        if (i40 == length9) {
                                                            break;
                                                        }
                                                        i40++;
                                                    }
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.xMQ(objO8);
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                            objO = mutableScatterMap4.O(next);
                            if (objO != null) {
                            }
                        }
                        it3 = it;
                        mutableScatterMap3 = mutableScatterMap;
                    } else {
                        it = it3;
                        mutableScatterMap = mutableScatterMap3;
                    }
                    it3 = it;
                    mutableScatterMap3 = mutableScatterMap;
                }
            }
            if (this.statesToReread.getSize() != 0) {
                MutableVector mutableVector = this.statesToReread;
                Object[] objArr15 = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i43 = 0; i43 < size; i43++) {
                    HI((DerivedState) objArr15[i43]);
                }
                this.statesToReread.KN();
            }
            return z2;
        }

        private final void az(Object scope, Object value) {
            ScopeMap.mUb(this.valueToScopes, value, scope);
            if (!(value instanceof DerivedState) || ScopeMap.J2(this.valueToScopes, value)) {
                return;
            }
            ScopeMap.gh(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        private final void nr(Object scope) {
            int i2 = this.currentToken;
            MutableObjectIntMap mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                return;
            }
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i7 = 0; i7 < i5; i7++) {
                        if ((255 & j2) < 128) {
                            int i8 = (i3 << 3) + i7;
                            Object obj = mutableObjectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i8];
                            boolean z2 = mutableObjectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i8] != i2;
                            if (z2) {
                                az(scope, obj);
                            }
                            if (z2) {
                                mutableObjectIntMap.o(i8);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i3 == length) {
                    return;
                } else {
                    i3++;
                }
            }
        }

        private final void qie(Object value, int currentToken, Object currentScope, MutableObjectIntMap recordedValues) {
            int i2;
            int i3;
            int i5;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iIk = recordedValues.Ik(value, currentToken, -1);
            int i7 = 2;
            if (!(value instanceof DerivedState) || iIk == currentToken) {
                i2 = 2;
                i3 = -1;
            } else {
                DerivedState.Record recordG = ((DerivedState) value).g();
                this.recordedDerivedStateValues.put(value, recordG.n());
                ObjectIntMap objectIntMapRl = recordG.getDependencies();
                MutableScatterMap mutableScatterMap = this.dependencyToDerivedStates;
                ScopeMap.gh(mutableScatterMap, value);
                Object[] objArr = objectIntMapRl.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
                long[] jArr = objectIntMapRl.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j2 = jArr[i8];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j2 & 255) < 128) {
                                    i5 = i7;
                                    StateObject stateObject = (StateObject) objArr[(i8 << 3) + i10];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).iF(ReaderKind.n(i5));
                                    }
                                    ScopeMap.n(mutableScatterMap, stateObject, value);
                                } else {
                                    i5 = i7;
                                }
                                j2 >>= 8;
                                i10++;
                                i7 = i5;
                            }
                            i2 = i7;
                            if (i9 != 8) {
                                break;
                            }
                        } else {
                            i2 = i7;
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                        i7 = i2;
                    }
                } else {
                    i2 = 2;
                }
                i3 = -1;
            }
            if (iIk == i3) {
                if (value instanceof StateObjectImpl) {
                    ((StateObjectImpl) value).iF(ReaderKind.n(i2));
                }
                ScopeMap.n(this.valueToScopes, value, currentScope);
            }
        }

        public final void HI(DerivedState derivedState) {
            long[] jArr;
            long[] jArr2;
            int i2;
            MutableObjectIntMap mutableObjectIntMap;
            int i3 = 1;
            MutableScatterMap mutableScatterMap = this.scopeToValues;
            int iHashCode = Long.hashCode(SnapshotKt.N().getSnapshotId());
            Object objO = this.valueToScopes.O(derivedState);
            if (objO == null) {
                return;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i5 = 0;
            if (!(objO instanceof MutableScatterSet)) {
                MutableObjectIntMap mutableObjectIntMap2 = (MutableObjectIntMap) mutableScatterMap.O(objO);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new MutableObjectIntMap(i5, i3, defaultConstructorMarker);
                    mutableScatterMap.aYN(objO, mutableObjectIntMap2);
                    Unit unit = Unit.INSTANCE;
                }
                qie(derivedState, iHashCode, objO, mutableObjectIntMap2);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) objO;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                long j2 = jArr3[i7];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j2 & 255) < 128) {
                            i2 = i8;
                            Object obj = objArr[(i7 << 3) + i10];
                            MutableObjectIntMap mutableObjectIntMap3 = (MutableObjectIntMap) mutableScatterMap.O(obj);
                            jArr2 = jArr3;
                            if (mutableObjectIntMap3 == null) {
                                mutableObjectIntMap = new MutableObjectIntMap(i5, i3, defaultConstructorMarker);
                                mutableScatterMap.aYN(obj, mutableObjectIntMap);
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            qie(derivedState, iHashCode, obj, mutableObjectIntMap);
                        } else {
                            jArr2 = jArr3;
                            i2 = i8;
                        }
                        j2 >>= i2;
                        i10++;
                        i8 = i2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i9 != i8) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i7 == length) {
                    return;
                }
                i7++;
                jArr3 = jArr;
            }
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final Function1 getOnChanged() {
            return this.onChanged;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void KN() {
            MutableScatterSet mutableScatterSet = this.invalidated;
            Function1 function1 = this.onChanged;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                function1.invoke(objArr[(i2 << 3) + i5]);
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            mutableScatterSet.ty();
        }

        public final void O(Object scope) {
            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) this.scopeToValues.XQ(scope);
            if (mutableObjectIntMap == null) {
                return;
            }
            Object[] objArr = mutableObjectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
            int[] iArr = mutableObjectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i2 << 3) + i5;
                            Object obj = objArr[i7];
                            int i8 = iArr[i7];
                            az(scope, obj);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        public final boolean Uo() {
            return this.scopeToValues.xMQ();
        }

        public final void gh(Object value) {
            Object obj = this.currentScope;
            Intrinsics.checkNotNull(obj);
            int i2 = this.currentToken;
            MutableObjectIntMap mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.aYN(obj, mutableObjectIntMap);
                Unit unit = Unit.INSTANCE;
            }
            qie(value, i2, obj, mutableObjectIntMap);
        }

        public final void t() {
            ScopeMap.t(this.valueToScopes);
            this.scopeToValues.gh();
            ScopeMap.t(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void ty(Function1 predicate) {
            long[] jArr;
            long[] jArr2;
            long j2;
            char c2;
            long j3;
            int i2;
            long j4;
            MutableScatterMap mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                long j5 = jArr3[i3];
                char c4 = 7;
                long j6 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i7 = 8 - ((~(i3 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j5 & 255) < 128) {
                            int i9 = (i3 << 3) + i8;
                            c2 = c4;
                            Object obj = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i9];
                            j3 = j6;
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i9];
                            Boolean bool = (Boolean) predicate.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = mutableObjectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
                                int[] iArr = mutableObjectIntMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
                                long[] jArr4 = mutableObjectIntMap.metadata;
                                int i10 = i5;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j2 = j5;
                                    int i11 = 0;
                                    while (true) {
                                        long j7 = jArr4[i11];
                                        long[] jArr5 = jArr4;
                                        if ((((~j7) << c2) & j7 & j3) != j3) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            for (int i13 = 0; i13 < i12; i13++) {
                                                if ((j7 & 255) < 128) {
                                                    int i14 = (i11 << 3) + i13;
                                                    j4 = j7;
                                                    Object obj2 = objArr[i14];
                                                    int i15 = iArr[i14];
                                                    az(obj, obj2);
                                                } else {
                                                    j4 = j7;
                                                }
                                                j7 = j4 >> i10;
                                            }
                                            if (i12 != i10) {
                                                break;
                                            }
                                            if (i11 == length2) {
                                                break;
                                            }
                                            i11++;
                                            jArr4 = jArr5;
                                            i10 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j2 = j5;
                                }
                                if (bool.booleanValue()) {
                                    mutableScatterMap.S(i9);
                                }
                                i2 = 8;
                            }
                        } else {
                            jArr2 = jArr3;
                            j2 = j5;
                            c2 = c4;
                            j3 = j6;
                            i2 = i5;
                        }
                        i8++;
                        i5 = i2;
                        j5 = j2 >> i2;
                        c4 = c2;
                        j6 = j3;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i7 != i5) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i3 == length) {
                    return;
                }
                i3++;
                jArr3 = jArr;
            }
        }

        public final void xMQ(Object scope, Function1 readObserver, Function0 block) {
            Object obj = this.currentScope;
            MutableObjectIntMap mutableObjectIntMap = this.currentScopeReads;
            int i2 = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = (MutableObjectIntMap) this.scopeToValues.O(scope);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(SnapshotKt.N().getSnapshotId());
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector mutableVectorT = SnapshotStateKt.t();
            try {
                mutableVectorT.rl(derivedStateObserver);
                Snapshot.INSTANCE.Uo(readObserver, null, block);
                mutableVectorT.r(mutableVectorT.getSize() - 1);
                Object obj2 = this.currentScope;
                Intrinsics.checkNotNull(obj2);
                nr(obj2);
                this.currentScope = obj;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i2;
            } catch (Throwable th) {
                mutableVectorT.r(mutableVectorT.getSize() - 1);
                throw th;
            }
        }

        public ObservedScopeMap(Function1 function1) {
            this.onChanged = function1;
            int i2 = 0;
            this.scopeToValues = new MutableScatterMap(i2, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ty() {
        boolean z2;
        synchronized (this.observedScopeMapsLock) {
            z2 = this.sendingNotifications;
        }
        if (z2) {
            return false;
        }
        boolean z3 = false;
        while (true) {
            Set setIk = Ik();
            if (setIk == null) {
                return z3;
            }
            synchronized (this.observedScopeMapsLock) {
                try {
                    MutableVector mutableVector = this.observedScopeMaps;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    for (int i2 = 0; i2 < size; i2++) {
                        z3 = ((ObservedScopeMap) objArr[i2]).mUb(setIk) || z3;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final ObservedScopeMap HI(Function1 onChanged) {
        Object obj;
        MutableVector mutableVector = this.observedScopeMaps;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = objArr[i2];
            if (((ObservedScopeMap) obj).getOnChanged() == onChanged) {
                break;
            }
            i2++;
        }
        ObservedScopeMap observedScopeMap = (ObservedScopeMap) obj;
        if (observedScopeMap != null) {
            return observedScopeMap;
        }
        Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap2 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onChanged, 1));
        this.observedScopeMaps.rl(observedScopeMap2);
        return observedScopeMap2;
    }

    private final Set Ik() {
        Object obj;
        Object objSubList;
        Set set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    r();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!fuX.n(this.pendingChanges, obj, objSubList));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void mUb(Set set) {
        Object obj;
        Set setPlus;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                setPlus = set;
            } else if (obj instanceof Set) {
                setPlus = CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    r();
                    throw new KotlinNothingValueException();
                }
                setPlus = CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt.listOf(set));
            }
        } while (!fuX.n(this.pendingChanges, obj, setPlus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.onChangedExecutor.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                do {
                    Object obj = this.f30993n.observedScopeMapsLock;
                    SnapshotStateObserver snapshotStateObserver = this.f30993n;
                    synchronized (obj) {
                        try {
                            if (!snapshotStateObserver.sendingNotifications) {
                                snapshotStateObserver.sendingNotifications = true;
                                try {
                                    MutableVector mutableVector = snapshotStateObserver.observedScopeMaps;
                                    Object[] objArr = mutableVector.content;
                                    int size = mutableVector.getSize();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        ((SnapshotStateObserver.ObservedScopeMap) objArr[i2]).KN();
                                    }
                                    snapshotStateObserver.sendingNotifications = false;
                                } finally {
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (this.f30993n.ty());
            }
        });
    }

    private final Void r() {
        ComposerKt.XQ("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    public final void XQ() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.n();
        }
    }

    public final void Z() {
        this.applyUnsubscribe = Snapshot.INSTANCE.xMQ(this.applyObserver);
    }

    public final void az(Function1 predicate) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.content[i3];
                    observedScopeMap.ty(predicate);
                    if (!observedScopeMap.Uo()) {
                        i2++;
                    } else if (i2 > 0) {
                        Object[] objArr = mutableVector.content;
                        objArr[i3 - i2] = objArr[i3];
                    }
                }
                int i5 = size - i2;
                ArraysKt.fill(mutableVector.content, (Object) null, i5, size);
                mutableVector.WPU(i5);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ck(Object scope, Function1 onValueChangedForScope, Function0 block) {
        ObservedScopeMap observedScopeMapHI;
        synchronized (this.observedScopeMapsLock) {
            observedScopeMapHI = HI(onValueChangedForScope);
        }
        boolean z2 = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j2 = this.currentMapThreadId;
        if (j2 != -1) {
            if (!(j2 == Thread_jvmKt.n())) {
                PreconditionsKt.n("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j2 + "), currentThread={id=" + Thread_jvmKt.n() + ", name=" + Thread_jvmKt.rl() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = observedScopeMapHI;
            this.currentMapThreadId = Thread_jvmKt.n();
            observedScopeMapHI.xMQ(scope, this.readObserver, block);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z2;
            this.currentMapThreadId = j2;
        }
    }

    public final void gh() {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector mutableVector = this.observedScopeMaps;
                Object[] objArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ObservedScopeMap) objArr[i2]).t();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void qie(Object scope) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ObservedScopeMap observedScopeMap = (ObservedScopeMap) mutableVector.content[i3];
                    observedScopeMap.O(scope);
                    if (!observedScopeMap.Uo()) {
                        i2++;
                    } else if (i2 > 0) {
                        Object[] objArr = mutableVector.content;
                        objArr[i3 - i2] = objArr[i3];
                    }
                }
                int i5 = size - i2;
                ArraysKt.fill(mutableVector.content, (Object) null, i5, size);
                mutableVector.WPU(i5);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SnapshotStateObserver(Function1 function1) {
        this.onChangedExecutor = function1;
    }
}
