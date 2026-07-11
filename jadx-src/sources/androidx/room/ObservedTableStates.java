package androidx.room;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0017\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/room/ObservedTableStates;", "", "", "size", "<init>", "(I)V", "", "Landroidx/room/ObservedTableStates$ObserveOp;", "rl", "()[Landroidx/room/ObservedTableStates$ObserveOp;", "", "tableIds", "", "t", "([I)Z", "nr", "", "O", "()V", c.f62177j, "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "[J", "tableObserversCount", "", "[Z", "tableObservedState", "Z", "needsSync", "ObserveOp", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/ObservedTableStates\n+ 2 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,604:1\n28#2,5:605\n28#2,3:610\n32#2:615\n28#2,3:616\n32#2:621\n28#2,5:622\n28#2,5:627\n13423#3,2:613\n13423#3,2:619\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/ObservedTableStates\n*L\n508#1:605,5\n530#1:610,3\n530#1:615\n545#1:616,3\n545#1:621\n559#1:622,5\n565#1:627,5\n532#1:613,2\n547#1:619,2\n*E\n"})
public final class ObservedTableStates {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean needsSync;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long[] tableObserversCount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean[] tableObservedState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/ObservedTableStates$ObserveOp;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ObserveOp {
        private static final /* synthetic */ ObserveOp[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f41349r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final ObserveOp f41348n = new ObserveOp("NO_OP", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final ObserveOp f41350t = new ObserveOp("ADD", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final ObserveOp f41347O = new ObserveOp("REMOVE", 2);

        private static final /* synthetic */ ObserveOp[] n() {
            return new ObserveOp[]{f41348n, f41350t, f41347O};
        }

        static {
            ObserveOp[] observeOpArrN = n();
            J2 = observeOpArrN;
            f41349r = EnumEntriesKt.enumEntries(observeOpArrN);
        }

        public static ObserveOp valueOf(String str) {
            return (ObserveOp) Enum.valueOf(ObserveOp.class, str);
        }

        public static ObserveOp[] values() {
            return (ObserveOp[]) J2.clone();
        }

        private ObserveOp(String str, int i2) {
        }
    }

    public final void O() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            ArraysKt.fill$default(this.tableObservedState, false, 0, 0, 6, (Object) null);
            this.needsSync = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void n() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.needsSync = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean nr(int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z2 = false;
            for (int i2 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j2 = jArr[i2];
                jArr[i2] = j2 - 1;
                if (j2 == 1) {
                    z2 = true;
                    this.needsSync = true;
                }
            }
            return z2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ObserveOp[] rl() {
        ObserveOp observeOp;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.needsSync) {
                reentrantLock.unlock();
                return null;
            }
            this.needsSync = false;
            int length = this.tableObserversCount.length;
            ObserveOp[] observeOpArr = new ObserveOp[length];
            int i2 = 0;
            boolean z2 = false;
            while (i2 < length) {
                boolean z3 = true;
                boolean z4 = this.tableObserversCount[i2] > 0;
                boolean[] zArr = this.tableObservedState;
                if (z4 != zArr[i2]) {
                    zArr[i2] = z4;
                    observeOp = z4 ? ObserveOp.f41350t : ObserveOp.f41347O;
                } else {
                    z3 = z2;
                    observeOp = ObserveOp.f41348n;
                }
                observeOpArr[i2] = observeOp;
                i2++;
                z2 = z3;
            }
            ObserveOp[] observeOpArr2 = z2 ? observeOpArr : null;
            reentrantLock.unlock();
            return observeOpArr2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean t(int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z2 = false;
            for (int i2 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j2 = jArr[i2];
                jArr[i2] = 1 + j2;
                if (j2 == 0) {
                    z2 = true;
                    this.needsSync = true;
                }
            }
            return z2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public ObservedTableStates(int i2) {
        this.tableObserversCount = new long[i2];
        this.tableObservedState = new boolean[i2];
    }
}
