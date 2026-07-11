package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001.B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "readable", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "forceDependencyReads", "E2", "(Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "", "e", "()Ljava/lang/String;", "Landroidx/compose/runtime/snapshots/StateRecord;", "fD", "(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "HI", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "toString", "t", "Lkotlin/jvm/functions/Function0;", "O", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "J2", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "first", "ck", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "Landroidx/compose/runtime/DerivedState$Record;", "g", "()Landroidx/compose/runtime/DerivedState$Record;", "currentRecord", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 8 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,401:1\n373#2,2:402\n375#2,2:413\n82#2:415\n81#2,3:417\n378#2,2:445\n82#2:447\n81#2,3:449\n373#2,2:452\n375#2,5:463\n423#3,9:404\n423#3,9:454\n1#4:416\n1#4:448\n395#5,4:420\n367#5,6:424\n377#5,3:431\n380#5,9:435\n399#5:444\n1399#6:430\n1270#6:434\n1894#7,2:468\n1894#7,2:472\n2475#7:476\n2475#7:477\n2475#7:478\n33#8,2:470\n33#8,2:474\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n188#1:402,2\n188#1:413,2\n190#1:415\n190#1:417,3\n188#1:445,2\n204#1:447\n204#1:449,3\n206#1:452,2\n206#1:463,5\n188#1:404,9\n206#1:454,9\n190#1:416\n204#1:448\n192#1:420,4\n192#1:424,6\n192#1:431,3\n192#1:435,9\n192#1:444\n192#1:430\n192#1:434\n231#1:468,2\n254#1:472,2\n296#1:476\n306#1:477\n312#1:478\n231#1:470,2\n254#1:474,2\n*E\n"})
final class DerivedState<T> extends StateObjectImpl implements androidx.compose.runtime.DerivedState<T> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private ResultRecord first = new ResultRecord(SnapshotKt.N().getSnapshotId());

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final SnapshotMutationPolicy policy;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function0 calculation;

    /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$ResultRecord */
    @StabilityInferred
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u0000 <*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001=B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00182\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u001f\u001a\u00060\u0004j\u0002`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\"\u0010%\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010-\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u0014\u0010;\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00102¨\u0006>"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "value", "", "t", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "nr", "()Landroidx/compose/runtime/snapshots/StateRecord;", "O", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "qie", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)Z", "", "az", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)I", "J", "getValidSnapshotId", "()J", "Ik", "validSnapshotId", "I", "getValidSnapshotWriteCount", "()I", "r", "(I)V", "validSnapshotWriteCount", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/collection/ObjectIntMap;", "rl", "()Landroidx/collection/ObjectIntMap;", "ty", "(Landroidx/collection/ObjectIntMap;)V", "dependencies", "", "J2", "Ljava/lang/Object;", "gh", "()Ljava/lang/Object;", "HI", "(Ljava/lang/Object;)V", "result", "Uo", "getResultHash", "ck", "resultHash", c.f62177j, "currentValue", "KN", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,401:1\n1894#2,2:402\n1894#2,2:406\n1894#2,2:410\n33#3,2:404\n33#3,2:408\n33#3,2:412\n373#4,2:414\n375#4,2:425\n378#4,2:452\n423#5,9:416\n395#6,4:427\n367#6,6:431\n377#6,3:438\n380#6,9:442\n399#6:451\n1399#7:437\n1270#7:441\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n117#1:402,2\n126#1:406,2\n137#1:410,2\n117#1:404,2\n126#1:408,2\n137#1:412,2\n139#1:414,2\n139#1:425,2\n139#1:452,2\n139#1:416,9\n140#1:427,4\n140#1:431,6\n140#1:438,3\n140#1:442,9\n140#1:451\n140#1:437\n140#1:441\n*E\n"})
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private Object result;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private ObjectIntMap dependencies;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private int resultHash;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private int validSnapshotWriteCount;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private long validSnapshotId;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int xMQ = 8;
        private static final Object mUb = new Object();

        /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$ResultRecord$Companion, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", c.f62177j, "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Object n() {
                return ResultRecord.mUb;
            }
        }

        public final void HI(Object obj) {
            this.result = obj;
        }

        public final void Ik(long j2) {
            this.validSnapshotId = j2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord O(long snapshotId) {
            return new ResultRecord(snapshotId);
        }

        public final int az(androidx.compose.runtime.DerivedState derivedState, Snapshot snapshot) {
            ObjectIntMap dependencies;
            int iN;
            int i2;
            int i3;
            synchronized (SnapshotKt.nHg()) {
                dependencies = getDependencies();
            }
            int i5 = 7;
            if (!dependencies.KN()) {
                return 7;
            }
            MutableVector mutableVectorT = SnapshotStateKt.t();
            Object[] objArr = mutableVectorT.content;
            int size = mutableVectorT.getSize();
            for (int i7 = 0; i7 < size; i7++) {
                ((DerivedStateObserver) objArr[i7]).rl(derivedState);
            }
            try {
                Object[] objArr2 = dependencies.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
                int[] iArr = dependencies.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iN = 7;
                    int i8 = 0;
                    while (true) {
                        long j2 = jArr[i8];
                        if ((((~j2) << i5) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8;
                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                            i2 = i5;
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((j2 & 255) < 128) {
                                    int i12 = (i8 << 3) + i11;
                                    Object obj = objArr2[i12];
                                    int i13 = iArr[i12];
                                    i3 = i9;
                                    StateObject stateObject = (StateObject) obj;
                                    if (i13 == 1) {
                                        StateRecord stateRecordFD = stateObject instanceof DerivedState ? ((DerivedState) stateObject).fD(snapshot) : SnapshotKt.T(stateObject.getFirstStateRecord(), snapshot);
                                        iN = (((iN * 31) + Utils_jvmKt.n(stateRecordFD)) * 31) + Long.hashCode(stateRecordFD.getSnapshotId());
                                    }
                                } else {
                                    i3 = i9;
                                }
                                j2 >>= i3;
                                i11++;
                                i9 = i3;
                            }
                            if (i10 != i9) {
                                break;
                            }
                        } else {
                            i2 = i5;
                        }
                        if (i8 == length) {
                            i5 = iN;
                            break;
                        }
                        i8++;
                        i5 = i2;
                    }
                }
                iN = i5;
                Unit unit = Unit.INSTANCE;
                Object[] objArr3 = mutableVectorT.content;
                int size2 = mutableVectorT.getSize();
                for (int i14 = 0; i14 < size2; i14++) {
                    ((DerivedStateObserver) objArr3[i14]).n(derivedState);
                }
                return iN;
            } catch (Throwable th) {
                Object[] objArr4 = mutableVectorT.content;
                int size3 = mutableVectorT.getSize();
                for (int i15 = 0; i15 < size3; i15++) {
                    ((DerivedStateObserver) objArr4[i15]).n(derivedState);
                }
                throw th;
            }
        }

        public final void ck(int i2) {
            this.resultHash = i2;
        }

        /* JADX INFO: renamed from: gh, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public Object n() {
            return this.result;
        }

        public final void r(int i2) {
            this.validSnapshotWriteCount = i2;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        /* JADX INFO: renamed from: rl, reason: from getter */
        public ObjectIntMap getDependencies() {
            return this.dependencies;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void t(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) value;
            ty(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        public void ty(ObjectIntMap objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public ResultRecord(long j2) {
            super(j2);
            this.dependencies = ObjectIntMapKt.n();
            this.result = mUb;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord nr() {
            return O(SnapshotKt.N().getSnapshotId());
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean qie(androidx.compose.runtime.DerivedState derivedState, Snapshot snapshot) {
            boolean z2;
            boolean z3;
            synchronized (SnapshotKt.nHg()) {
                z2 = true;
                if (this.validSnapshotId == snapshot.getSnapshotId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
            }
            if (this.result == mUb || (z3 && this.resultHash != az(derivedState, snapshot))) {
                z2 = false;
            }
            if (z2 && z3) {
                synchronized (SnapshotKt.nHg()) {
                    this.validSnapshotId = snapshot.getSnapshotId();
                    this.validSnapshotWriteCount = snapshot.getWriteCount();
                    Unit unit = Unit.INSTANCE;
                }
                return z2;
            }
            return z2;
        }
    }

    private final ResultRecord E2(ResultRecord readable, Snapshot snapshot, boolean forceDependencyReads, Function0 calculation) throws Throwable {
        Snapshot.Companion companion;
        SnapshotMutationPolicy policy;
        boolean z2;
        int i2;
        ResultRecord resultRecord = readable;
        boolean z3 = true;
        int i3 = 0;
        if (!resultRecord.qie(this, snapshot)) {
            final MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
            final IntRef intRef = (IntRef) SnapshotStateKt__DerivedStateKt.f30416n.n();
            if (intRef == null) {
                intRef = new IntRef(0);
                SnapshotStateKt__DerivedStateKt.f30416n.rl(intRef);
            }
            final int element = intRef.getElement();
            MutableVector mutableVectorT = SnapshotStateKt.t();
            Object[] objArr = mutableVectorT.content;
            int size = mutableVectorT.getSize();
            for (int i5 = 0; i5 < size; i5++) {
                ((DerivedStateObserver) objArr[i5]).rl(this);
            }
            try {
                intRef.rl(element + 1);
                Object objUo = Snapshot.INSTANCE.Uo(new Function1<Object, Unit>() { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$1$result$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void n(Object obj) {
                        if (obj == this.f30160n) {
                            throw new IllegalStateException("A derived state calculation cannot read itself");
                        }
                        if (obj instanceof StateObject) {
                            int element2 = intRef.getElement();
                            MutableObjectIntMap mutableObjectIntMap2 = mutableObjectIntMap;
                            mutableObjectIntMap2.XQ(obj, Math.min(element2 - element, mutableObjectIntMap2.O(obj, Integer.MAX_VALUE)));
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                        n(obj);
                        return Unit.INSTANCE;
                    }
                }, null, calculation);
                intRef.rl(element);
                Object[] objArr2 = mutableVectorT.content;
                int size2 = mutableVectorT.getSize();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((DerivedStateObserver) objArr2[i7]).n(this);
                }
                synchronized (SnapshotKt.nHg()) {
                    try {
                        companion = Snapshot.INSTANCE;
                        Snapshot snapshotT = companion.t();
                        if (resultRecord.getResult() == ResultRecord.INSTANCE.n() || (policy = getPolicy()) == null || !policy.rl(objUo, resultRecord.getResult())) {
                            resultRecord = (ResultRecord) SnapshotKt.bzg(this.first, this, snapshotT);
                            resultRecord.ty(mutableObjectIntMap);
                            resultRecord.ck(resultRecord.az(this, snapshotT));
                            resultRecord.HI(objUo);
                        } else {
                            resultRecord.ty(mutableObjectIntMap);
                            resultRecord.ck(resultRecord.az(this, snapshotT));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                IntRef intRef2 = (IntRef) SnapshotStateKt__DerivedStateKt.f30416n.n();
                if (intRef2 == null || intRef2.getElement() != 0) {
                    return resultRecord;
                }
                companion.J2();
                synchronized (SnapshotKt.nHg()) {
                    Snapshot snapshotT2 = companion.t();
                    resultRecord.Ik(snapshotT2.getSnapshotId());
                    resultRecord.r(snapshotT2.getWriteCount());
                    Unit unit = Unit.INSTANCE;
                }
                return resultRecord;
            } catch (Throwable th2) {
                Object[] objArr3 = mutableVectorT.content;
                int size3 = mutableVectorT.getSize();
                for (int i8 = 0; i8 < size3; i8++) {
                    ((DerivedStateObserver) objArr3[i8]).n(this);
                }
                throw th2;
            }
        }
        if (forceDependencyReads) {
            MutableVector mutableVectorT2 = SnapshotStateKt.t();
            Object[] objArr4 = mutableVectorT2.content;
            int size4 = mutableVectorT2.getSize();
            for (int i9 = 0; i9 < size4; i9++) {
                ((DerivedStateObserver) objArr4[i9]).rl(this);
            }
            try {
                ObjectIntMap dependencies = resultRecord.getDependencies();
                IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.f30416n.n();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    SnapshotStateKt__DerivedStateKt.f30416n.rl(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr5 = dependencies.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
                int[] iArr = dependencies.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j2 = jArr[i10];
                        boolean z4 = z3;
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            z2 = z4;
                            int i13 = i3;
                            while (i13 < i12) {
                                if ((j2 & 255) < 128) {
                                    int i14 = (i10 << 3) + i13;
                                    try {
                                        StateObject stateObject = (StateObject) objArr5[i14];
                                        i2 = i11;
                                        intRef3.rl(element2 + iArr[i14]);
                                        Function1 readObserver = snapshot.getReadObserver();
                                        if (readObserver != null) {
                                            readObserver.invoke(stateObject);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Object[] objArr6 = mutableVectorT2.content;
                                        int size5 = mutableVectorT2.getSize();
                                        for (int i15 = 0; i15 < size5; i15++) {
                                            ((DerivedStateObserver) objArr6[i15]).n(this);
                                        }
                                        throw th;
                                    }
                                } else {
                                    i2 = i11;
                                }
                                j2 >>= i2;
                                i13++;
                                i11 = i2;
                            }
                            if (i12 != i11) {
                                break;
                            }
                        } else {
                            z2 = z4;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        z3 = z2;
                        i3 = 0;
                    }
                }
                intRef3.rl(element2);
                Unit unit2 = Unit.INSTANCE;
                Object[] objArr7 = mutableVectorT2.content;
                int size6 = mutableVectorT2.getSize();
                for (int i16 = 0; i16 < size6; i16++) {
                    ((DerivedStateObserver) objArr7[i16]).n(this);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return resultRecord;
    }

    private final String e() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.X(this.first);
        return resultRecord.qie(this, Snapshot.INSTANCE.t()) ? String.valueOf(resultRecord.getResult()) : "<Not calculated>";
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void HI(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (ResultRecord) value;
    }

    @Override // androidx.compose.runtime.DerivedState
    /* JADX INFO: renamed from: O, reason: from getter */
    public SnapshotMutationPolicy getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: ck */
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    public final StateRecord fD(Snapshot snapshot) {
        return E2((ResultRecord) SnapshotKt.T(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // androidx.compose.runtime.DerivedState
    public DerivedState.Record g() {
        Snapshot snapshotT = Snapshot.INSTANCE.t();
        return E2((ResultRecord) SnapshotKt.T(this.first, snapshotT), snapshotT, false, this.calculation);
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Function1 readObserver = companion.t().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        Snapshot snapshotT = companion.t();
        return E2((ResultRecord) SnapshotKt.T(this.first, snapshotT), snapshotT, true, this.calculation).getResult();
    }

    public String toString() {
        return "DerivedState(value=" + e() + ")@" + hashCode();
    }

    public DerivedState(Function0 function0, SnapshotMutationPolicy snapshotMutationPolicy) {
        this.calculation = function0;
        this.policy = snapshotMutationPolicy;
    }
}
