package androidx.view;

import TFv.Lu;
import TFv.SPz;
import TFv.fuX;
import TFv.rv6;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001a\u0010\bR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R*\u0010,\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0-8\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b \u0010/R#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0-8\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b$\u0010/¨\u00062"}, d2 = {"Landroidx/navigation/NavigatorState;", "", "<init>", "()V", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "", "gh", "(Landroidx/navigation/NavBackStackEntry;)V", "qie", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", c.f62177j, "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "saveState", "KN", "(Landroidx/navigation/NavBackStackEntry;Z)V", "xMQ", "J2", "Uo", "entry", "O", "mUb", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "LTFv/SPz;", "", "rl", "LTFv/SPz;", "_backStack", "", "t", "_transitionsInProgress", "<set-?>", "nr", "Z", "()Z", "az", "(Z)V", "isNavigating", "LTFv/rv6;", "LTFv/rv6;", "()LTFv/rv6;", "backStack", "transitionsInProgress", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1#2:218\n1747#3,3:219\n1747#3,3:222\n959#3,7:225\n1747#3,3:232\n2624#3,3:235\n533#3,6:238\n378#3,7:244\n451#3,6:251\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n76#1:219,3\n77#1:222,3\n102#1:225,7\n123#1:232,3\n124#1:235,3\n130#1:238,6\n158#1:244,7\n181#1:251,6\n*E\n"})
public abstract class NavigatorState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final rv6 transitionsInProgress;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final rv6 backStack;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock backStackLock = new ReentrantLock(true);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean isNavigating;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SPz _backStack;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SPz _transitionsInProgress;

    public abstract NavBackStackEntry n(NavDestination destination, Bundle arguments);

    public void J2(NavBackStackEntry backStackEntry) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            List mutableList = CollectionsKt.toMutableList((Collection) this.backStack.getValue());
            ListIterator listIterator = mutableList.listIterator(mutableList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (Intrinsics.areEqual(((NavBackStackEntry) listIterator.previous()).getId(), backStackEntry.getId())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            mutableList.set(iNextIndex, backStackEntry);
            this._backStack.setValue(mutableList);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void KN(NavBackStackEntry popUpTo, boolean saveState) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            SPz sPz = this._backStack;
            Iterable iterable = (Iterable) sPz.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (Intrinsics.areEqual((NavBackStackEntry) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            sPz.setValue(arrayList);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void O(NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        SPz sPz = this._transitionsInProgress;
        sPz.setValue(SetsKt.minus((Set<? extends NavBackStackEntry>) sPz.getValue(), entry));
    }

    public void Uo(NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (Intrinsics.areEqual(navBackStackEntry.getId(), backStackEntry.getId())) {
                SPz sPz = this._transitionsInProgress;
                sPz.setValue(SetsKt.plus((Set<? extends NavBackStackEntry>) SetsKt.plus((Set<? extends NavBackStackEntry>) sPz.getValue(), navBackStackEntry), backStackEntry));
                J2(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public final void az(boolean z2) {
        this.isNavigating = z2;
    }

    public void gh(NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            SPz sPz = this._backStack;
            sPz.setValue(CollectionsKt.plus((Collection<? extends NavBackStackEntry>) sPz.getValue(), backStackEntry));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void mUb(NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        SPz sPz = this._transitionsInProgress;
        sPz.setValue(SetsKt.plus((Set<? extends NavBackStackEntry>) sPz.getValue(), entry));
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public void qie(NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this._transitionsInProgress.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) this.backStack.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) this.backStack.getValue());
        if (navBackStackEntry != null) {
            SPz sPz = this._transitionsInProgress;
            sPz.setValue(SetsKt.plus((Set<? extends NavBackStackEntry>) sPz.getValue(), navBackStackEntry));
        }
        SPz sPz2 = this._transitionsInProgress;
        sPz2.setValue(SetsKt.plus((Set<? extends NavBackStackEntry>) sPz2.getValue(), backStackEntry));
        gh(backStackEntry);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final rv6 getBackStack() {
        return this.backStack;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final rv6 getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    public void xMQ(NavBackStackEntry popUpTo, boolean saveState) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) this._transitionsInProgress.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) this.backStack.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((NavBackStackEntry) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        SPz sPz = this._transitionsInProgress;
        sPz.setValue(SetsKt.plus((Set<? extends NavBackStackEntry>) sPz.getValue(), popUpTo));
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (!Intrinsics.areEqual(navBackStackEntry, popUpTo) && ((List) this.backStack.getValue()).lastIndexOf(navBackStackEntry) < ((List) this.backStack.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry2 != null) {
            SPz sPz2 = this._transitionsInProgress;
            sPz2.setValue(SetsKt.plus((Set<? extends NavBackStackEntry>) sPz2.getValue(), navBackStackEntry2));
        }
        KN(popUpTo, saveState);
    }

    public NavigatorState() {
        SPz sPzN = Lu.n(CollectionsKt.emptyList());
        this._backStack = sPzN;
        SPz sPzN2 = Lu.n(SetsKt.emptySet());
        this._transitionsInProgress = sPzN2;
        this.backStack = fuX.t(sPzN);
        this.transitionsInProgress = fuX.t(sPzN2);
    }
}
