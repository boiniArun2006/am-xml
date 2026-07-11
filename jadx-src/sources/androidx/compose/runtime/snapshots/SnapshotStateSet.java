package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001<J)\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010\u0019J\u001d\u0010'\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b'\u0010\u001dJ\u000f\u0010(\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010\u0019J\u001d\u0010+\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b+\u0010\u001dJ\u001d\u0010,\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b,\u0010\u001dR$\u00102\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00128\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R \u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b8\u0010)\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00104¨\u0006="}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/Function1;", "", "block", "KN", "(Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "", "currentModification", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "newSet", "t", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)Z", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "HI", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", l.f62657l, "addAll", "clear", "()V", "remove", "removeAll", "retainAll", "<set-?>", c.f62177j, "Landroidx/compose/runtime/snapshots/StateRecord;", "ck", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "O", "()I", "modification", "J2", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "getReadable$runtime_release$annotations", "readable", "Uo", "size", "StateSetStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n139#1:269\n161#1,6:272\n167#1:280\n139#1:281\n168#1,9:283\n136#1:292\n177#1,6:302\n161#1,6:308\n167#1:316\n139#1:317\n168#1,9:319\n136#1:328\n177#1,6:338\n136#1:344\n161#1,6:357\n167#1:365\n139#1:366\n168#1,9:368\n136#1:377\n177#1,6:387\n161#1,6:393\n167#1:401\n139#1:402\n168#1,9:404\n136#1:413\n177#1,6:423\n139#1:429\n144#1,5:443\n149#1:450\n139#1:451\n150#1,7:453\n136#1:460\n158#1:470\n139#1:473\n136#1:475\n139#1:489\n136#1:491\n2475#2:270\n2475#2:271\n2475#2:282\n2365#2,2:293\n1894#2,2:295\n2367#2,4:297\n2475#2:318\n2365#2,2:329\n1894#2,2:331\n2367#2,4:333\n2365#2,2:345\n1894#2,2:347\n2367#2,2:351\n2370#2:355\n2475#2:367\n2365#2,2:378\n1894#2,2:380\n2367#2,4:382\n2475#2:403\n2365#2,2:414\n1894#2,2:416\n2367#2,4:418\n2475#2:430\n2365#2,2:431\n1894#2,2:433\n2367#2,4:437\n2475#2:442\n2475#2:452\n2365#2,2:461\n1894#2,2:463\n2367#2,4:465\n2475#2:474\n2365#2,2:476\n1894#2,2:478\n2367#2,4:482\n2475#2:490\n2365#2,2:492\n1894#2,2:494\n2367#2,4:498\n33#3,2:278\n33#3,2:314\n33#3,2:349\n33#3,2:353\n33#3,2:363\n33#3,2:399\n33#3,2:435\n33#3,2:448\n33#3,2:471\n33#3,2:480\n33#3,2:487\n33#3,2:496\n33#3,2:503\n1#4:301\n1#4:337\n1#4:356\n1#4:386\n1#4:422\n1#4:441\n1#4:469\n1#4:486\n1#4:502\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n*L\n62#1:269\n105#1:272,6\n105#1:280\n105#1:281\n105#1:283,9\n105#1:292\n105#1:302,6\n107#1:308,6\n107#1:316\n107#1:317\n107#1:319,9\n107#1:328\n107#1:338,6\n110#1:344\n118#1:357,6\n118#1:365\n118#1:366\n118#1:368,9\n118#1:377\n118#1:387,6\n120#1:393,6\n120#1:401\n120#1:402\n120#1:404,9\n120#1:413\n120#1:423,6\n132#1:429\n141#1:443,5\n141#1:450\n141#1:451\n141#1:453,7\n141#1:460\n141#1:470\n149#1:473\n156#1:475\n167#1:489\n176#1:491\n62#1:270\n101#1:271\n105#1:282\n105#1:293,2\n105#1:295,2\n105#1:297,4\n107#1:318\n107#1:329,2\n107#1:331,2\n107#1:333,4\n110#1:345,2\n110#1:347,2\n110#1:351,2\n110#1:355\n118#1:367\n118#1:378,2\n118#1:380,2\n118#1:382,4\n120#1:403\n120#1:414,2\n120#1:416,2\n120#1:418,4\n132#1:430\n136#1:431,2\n136#1:433,2\n136#1:437,4\n139#1:442\n141#1:452\n141#1:461,2\n141#1:463,2\n141#1:465,4\n149#1:474\n156#1:476,2\n156#1:478,2\n156#1:482,4\n167#1:490\n176#1:492,2\n176#1:494,2\n176#1:498,4\n105#1:278,2\n107#1:314,2\n110#1:349,2\n111#1:353,2\n118#1:363,2\n120#1:399,2\n136#1:435,2\n141#1:448,2\n148#1:471,2\n156#1:480,2\n166#1:487,2\n176#1:496,2\n189#1:503,2\n105#1:301\n107#1:337\n110#1:356\n118#1:386\n120#1:422\n136#1:441\n141#1:469\n156#1:486\n176#1:502\n*E\n"})
public final class SnapshotStateSet<T> implements StateObject, Set<T>, RandomAccess, KMutableSet {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private StateRecord firstStateRecord;

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "set", "<init>", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", "value", "", "t", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "nr", "()Landroidx/compose/runtime/snapshots/StateRecord;", "O", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "gh", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "az", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", "", "I", "mUb", "()I", "qie", "(I)V", "modification", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,268:1\n33#2,2:269\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord\n*L\n75#1:269,2\n*E\n"})
    public static final class StateSetStateRecord<T> extends StateRecord {

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private int modification;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private PersistentSet set;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord O(long snapshotId) {
            return new StateSetStateRecord(snapshotId, this.set);
        }

        public final void az(PersistentSet persistentSet) {
            this.set = persistentSet;
        }

        /* JADX INFO: renamed from: gh, reason: from getter */
        public final PersistentSet getSet() {
            return this.set;
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord nr() {
            return new StateSetStateRecord(SnapshotKt.N().getSnapshotId(), this.set);
        }

        public final void qie(int i2) {
            this.modification = i2;
        }

        public StateSetStateRecord(long j2, PersistentSet persistentSet) {
            super(j2);
            this.set = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void t(StateRecord value) {
            synchronized (SnapshotStateSetKt.f30997n) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord>");
                this.set = ((StateSetStateRecord) value).set;
                this.modification = ((StateSetStateRecord) value).modification;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: ck, reason: from getter */
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new StateSetIterator(this, J2().getSet().iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(final Collection elements) {
        return KN(new Function1<Set<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateSet.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Set set) {
                return Boolean.valueOf(set.retainAll(CollectionsKt.toSet(elements)));
            }
        });
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    private final boolean KN(Function1 block) {
        int modification;
        PersistentSet set;
        PersistentSet.Builder builderN;
        Object objInvoke;
        Snapshot snapshotT;
        boolean zT2;
        do {
            synchronized (SnapshotStateSetKt.f30997n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.X((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set = stateSetStateRecord.getSet();
                Unit unit = Unit.INSTANCE;
            }
            if (set != null && (builderN = set.n()) != null) {
                objInvoke = block.invoke(builderN);
                PersistentSet persistentSetBuild = builderN.build();
                if (Intrinsics.areEqual(persistentSetBuild, set)) {
                    break;
                }
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.nHg()) {
                    snapshotT = Snapshot.INSTANCE.t();
                    zT2 = t((StateSetStateRecord) SnapshotKt.k(stateSetStateRecord2, this, snapshotT), modification, persistentSetBuild);
                }
                SnapshotKt.jB(snapshotT, this);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zT2);
        return ((Boolean) objInvoke).booleanValue();
    }

    private final boolean t(StateSetStateRecord stateSetStateRecord, int i2, PersistentSet persistentSet) {
        boolean z2;
        synchronized (SnapshotStateSetKt.f30997n) {
            if (stateSetStateRecord.getModification() == i2) {
                stateSetStateRecord.az(persistentSet);
                z2 = true;
                stateSetStateRecord.qie(stateSetStateRecord.getModification() + 1);
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void HI(StateRecord value) {
        value.KN(getFirstStateRecord());
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.firstStateRecord = (StateSetStateRecord) value;
    }

    public final StateSetStateRecord J2() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return (StateSetStateRecord) SnapshotKt.M((StateSetStateRecord) firstStateRecord, this);
    }

    public final int O() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.X((StateSetStateRecord) firstStateRecord)).getModification();
    }

    public int Uo() {
        return J2().getSet().size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object element) {
        int modification;
        PersistentSet set;
        Snapshot snapshotT;
        boolean zT2;
        do {
            synchronized (SnapshotStateSetKt.f30997n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.X((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set = stateSetStateRecord.getSet();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(set);
            PersistentSet persistentSetAdd = set.add(element);
            if (Intrinsics.areEqual(persistentSetAdd, set)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zT2 = t((StateSetStateRecord) SnapshotKt.k(stateSetStateRecord2, this, snapshotT), modification, persistentSetAdd);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zT2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        int modification;
        PersistentSet set;
        Snapshot snapshotT;
        boolean zT2;
        do {
            synchronized (SnapshotStateSetKt.f30997n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.X((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set = stateSetStateRecord.getSet();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(set);
            PersistentSet persistentSetAddAll = set.addAll(elements);
            if (Intrinsics.areEqual(persistentSetAddAll, set)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zT2 = t((StateSetStateRecord) SnapshotKt.k(stateSetStateRecord2, this, snapshotT), modification, persistentSetAddAll);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zT2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        Snapshot snapshotT;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.nHg()) {
            snapshotT = Snapshot.INSTANCE.t();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.k(stateSetStateRecord, this, snapshotT);
            synchronized (SnapshotStateSetKt.f30997n) {
                stateSetStateRecord2.az(ExtensionsKt.t());
                stateSetStateRecord2.qie(stateSetStateRecord2.getModification() + 1);
            }
        }
        SnapshotKt.jB(snapshotT, this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return J2().getSet().contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        return J2().getSet().containsAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return J2().getSet().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        PersistentSet set;
        Snapshot snapshotT;
        boolean zT2;
        do {
            synchronized (SnapshotStateSetKt.f30997n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.X((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set = stateSetStateRecord.getSet();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(set);
            PersistentSet persistentSetRemove = set.remove(element);
            if (Intrinsics.areEqual(persistentSetRemove, set)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zT2 = t((StateSetStateRecord) SnapshotKt.k(stateSetStateRecord2, this, snapshotT), modification, persistentSetRemove);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zT2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        int modification;
        PersistentSet set;
        Snapshot snapshotT;
        boolean zT2;
        do {
            synchronized (SnapshotStateSetKt.f30997n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.X((StateSetStateRecord) firstStateRecord);
                modification = stateSetStateRecord.getModification();
                set = stateSetStateRecord.getSet();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(set);
            PersistentSet persistentSetRemoveAll = set.removeAll(elements);
            if (Intrinsics.areEqual(persistentSetRemoveAll, set)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zT2 = t((StateSetStateRecord) SnapshotKt.k(stateSetStateRecord2, this, snapshotT), modification, persistentSetRemoveAll);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zT2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return Uo();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.X((StateSetStateRecord) firstStateRecord)).getSet() + ")@" + hashCode();
    }
}
