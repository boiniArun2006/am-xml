package androidx.room;

import androidx.room.InvalidationTracker;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/room/ObserverWrapper;", "", "Landroidx/room/InvalidationTracker$Observer;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "", "t", "(Ljava/util/Set;)V", "invalidatedTablesNames", "nr", c.f62177j, "Landroidx/room/InvalidationTracker$Observer;", "()Landroidx/room/InvalidationTracker$Observer;", "rl", "[I", "()[I", "[Ljava/lang/String;", "Ljava/util/Set;", "singleTableSet", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvalidationTracker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,592:1\n13497#2,3:593\n1755#3,3:596\n1863#3,2:599\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/ObserverWrapper\n*L\n532#1:593,3\n550#1:596,3\n558#1:599,2\n*E\n"})
public final class ObserverWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InvalidationTracker.Observer observer;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Set singleTableSet;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int[] tableIds;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String[] tableNames;

    public ObserverWrapper(InvalidationTracker.Observer observer, int[] tableIds, String[] tableNames) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? SetsKt.setOf(tableNames[0]) : SetsKt.emptySet();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    public final void nr(Set invalidatedTablesNames) {
        Set setEmptySet;
        Intrinsics.checkNotNullParameter(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setEmptySet = SetsKt.emptySet();
        } else if (length != 1) {
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            Iterator it = invalidatedTablesNames.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String[] strArr = this.tableNames;
                int length2 = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        String str2 = strArr[i2];
                        if (StringsKt.equals(str2, str, true)) {
                            setCreateSetBuilder.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
            }
            setEmptySet = SetsKt.build(setCreateSetBuilder);
        } else {
            Set set = invalidatedTablesNames;
            if ((set instanceof Collection) && set.isEmpty()) {
                setEmptySet = SetsKt.emptySet();
            } else {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (StringsKt.equals((String) it2.next(), this.tableNames[0], true)) {
                        setEmptySet = this.singleTableSet;
                        break;
                    }
                }
                setEmptySet = SetsKt.emptySet();
            }
        }
        if (setEmptySet.isEmpty()) {
            return;
        }
        this.observer.t(setEmptySet);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    public final void t(Set invalidatedTablesIds) {
        Set setEmptySet;
        Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1) {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i3 = 0;
                while (i2 < length2) {
                    int i5 = i3 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i2]))) {
                        setCreateSetBuilder.add(this.tableNames[i3]);
                    }
                    i2++;
                    i3 = i5;
                }
                setEmptySet = SetsKt.build(setCreateSetBuilder);
            } else {
                setEmptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : SetsKt.emptySet();
            }
        } else {
            setEmptySet = SetsKt.emptySet();
        }
        if (setEmptySet.isEmpty()) {
            return;
        }
        this.observer.t(setEmptySet);
    }
}
