package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010 \u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010&J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010*R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010.R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00104R$\u00109\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u000207\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010>R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R*\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010A8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "", "Landroidx/compose/runtime/RememberObserver;", "abandoning", "<init>", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/RememberObserverHolder;", "list", "", "mUb", "(Landroidx/compose/runtime/collection/MutableVector;)V", "", "instance", "", "endRelativeOrder", "priority", "endRelativeAfter", "ty", "(Ljava/lang/Object;III)V", "az", "(I)V", "Uo", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "O", "(Landroidx/compose/runtime/RememberObserverHolder;III)V", "Lkotlin/Function0;", "effect", c.f62177j, "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "KN", "(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;III)V", "rl", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "t", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "J2", "nr", "gh", "()V", "qie", "xMQ", "Ljava/util/Set;", "Landroidx/compose/runtime/collection/MutableVector;", "remembering", "currentRememberingList", "leaving", "sideEffects", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterSet;", "releasing", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "Landroidx/collection/MutableScatterMap;", "pausedPlaceholders", "", "Ljava/util/List;", "pending", "Landroidx/collection/MutableIntList;", "Landroidx/collection/MutableIntList;", "priorities", "afters", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "nestedRemembersLists", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRememberEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 6 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,309:1\n1101#2:310\n1083#2,2:311\n1101#2:313\n1083#2,2:314\n1101#2:316\n1083#2,2:317\n641#3,2:319\n519#3:322\n472#3:326\n519#3:328\n423#3,9:334\n519#3:343\n423#3,9:347\n136#3:363\n1#4:321\n45#5,3:323\n49#5:327\n45#5,5:329\n45#5,3:344\n49#5:356\n45#5,5:357\n65#6:362\n*S KotlinDebug\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n*L\n61#1:310\n61#1:311,2\n63#1:313\n63#1:314,2\n64#1:316\n64#1:317,2\n88#1:319,2\n150#1:322\n154#1:326\n173#1:328\n179#1:334,9\n187#1:343\n189#1:347,9\n292#1:363\n151#1:323,3\n151#1:327\n174#1:329,5\n188#1:344,3\n188#1:356\n197#1:357,5\n232#1:362\n*E\n"})
public final class RememberEventDispatcher implements RememberManager {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private MutableScatterSet releasing;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final List pending;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableVector sideEffects;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private MutableScatterMap pausedPlaceholders;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private ArrayList nestedRemembersLists;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MutableIntList afters;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Set abandoning;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableVector leaving;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableVector remembering;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private MutableVector currentRememberingList;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableIntList priorities;

    public final void gh() {
        Object objN;
        az(Integer.MIN_VALUE);
        if (this.leaving.getSize() != 0) {
            objN = Trace.f30884n.n("Compose:onForgotten");
            try {
                MutableScatterSet mutableScatterSet = this.releasing;
                for (int size = this.leaving.getSize() - 1; -1 < size; size--) {
                    Object obj = this.leaving.content[size];
                    if (obj instanceof RememberObserverHolder) {
                        RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                        this.abandoning.remove(wrapped);
                        wrapped.O();
                    }
                    if (obj instanceof ComposeNodeLifecycleCallback) {
                        if (mutableScatterSet == null || !mutableScatterSet.rl(obj)) {
                            ((ComposeNodeLifecycleCallback) obj).Uo();
                        } else {
                            ((ComposeNodeLifecycleCallback) obj).t();
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace trace = Trace.f30884n;
            objN = trace.n("Compose:onRemembered");
            try {
                mUb(this.remembering);
                Unit unit2 = Unit.INSTANCE;
                trace.rl(objN);
            } finally {
                Trace.f30884n.rl(objN);
            }
        }
    }

    private final void az(int endRelativeOrder) {
        if (this.pending.isEmpty()) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        List listMutableListOf = null;
        MutableIntList mutableIntList = null;
        MutableIntList mutableIntList2 = null;
        while (true) {
            MutableIntList mutableIntList3 = this.afters;
            if (i3 >= mutableIntList3._size) {
                break;
            }
            if (endRelativeOrder <= mutableIntList3.O(i3)) {
                Object objRemove = this.pending.remove(i3);
                int iCk = this.afters.ck(i3);
                int iCk2 = this.priorities.ck(i3);
                if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt.mutableListOf(objRemove);
                    mutableIntList2 = new MutableIntList(0, 1, null);
                    mutableIntList2.qie(iCk);
                    mutableIntList = new MutableIntList(0, 1, null);
                    mutableIntList.qie(iCk2);
                } else {
                    Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    listMutableListOf.add(objRemove);
                    mutableIntList2.qie(iCk);
                    mutableIntList.qie(iCk2);
                }
            } else {
                i3++;
            }
        }
        if (listMutableListOf != null) {
            Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = listMutableListOf.size() - 1;
            while (i2 < size) {
                int i5 = i2 + 1;
                int size2 = listMutableListOf.size();
                for (int i7 = i5; i7 < size2; i7++) {
                    int iO = mutableIntList2.O(i2);
                    int iO2 = mutableIntList2.O(i7);
                    if (iO < iO2 || (iO2 == iO && mutableIntList.O(i2) < mutableIntList.O(i7))) {
                        RememberEventDispatcherKt.nr(listMutableListOf, i2, i7);
                        RememberEventDispatcherKt.t(mutableIntList, i2, i7);
                        RememberEventDispatcherKt.t(mutableIntList2, i2, i7);
                    }
                }
                i2 = i5;
            }
            MutableVector mutableVector = this.leaving;
            mutableVector.O(mutableVector.getSize(), listMutableListOf);
        }
    }

    private final void mUb(MutableVector list) {
        Object[] objArr = list.content;
        int size = list.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            RememberObserver wrapped = ((RememberObserverHolder) objArr[i2]).getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.t();
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void J2(RecomposeScopeImpl scope) {
        MutableScatterMap mutableScatterMap = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? (PausedCompositionRemembers) mutableScatterMap.O(scope) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList arrayListT = this.nestedRemembersLists;
            if (arrayListT == null) {
                arrayListT = Stack.t(null, 1, null);
                this.nestedRemembersLists = arrayListT;
            }
            Stack.qie(arrayListT, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void Uo(RememberObserverHolder instance) {
        this.currentRememberingList.rl(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void n(Function0 effect) {
        this.sideEffects.rl(effect);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void nr(RecomposeScopeImpl scope) {
        MutableVector mutableVector;
        MutableScatterMap mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null || ((PausedCompositionRemembers) mutableScatterMap.O(scope)) == null) {
            return;
        }
        ArrayList arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.gh(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        mutableScatterMap.XQ(scope);
    }

    public final void qie() {
        if (this.sideEffects.getSize() != 0) {
            Object objN = Trace.f30884n.n("Compose:sideeffects");
            try {
                MutableVector mutableVector = this.sideEffects;
                Object[] objArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                this.sideEffects.KN();
                Unit unit = Unit.INSTANCE;
                Trace.f30884n.rl(objN);
            } catch (Throwable th) {
                Trace.f30884n.rl(objN);
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void rl(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        MutableScatterSet mutableScatterSetN = this.releasing;
        if (mutableScatterSetN == null) {
            mutableScatterSetN = ScatterSetKt.n();
            this.releasing = mutableScatterSetN;
        }
        mutableScatterSetN.ViF(instance);
        ty(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void t(RecomposeScopeImpl scope) {
        PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(this.abandoning);
        MutableScatterMap mutableScatterMapT = this.pausedPlaceholders;
        if (mutableScatterMapT == null) {
            mutableScatterMapT = ScatterMapKt.t();
            this.pausedPlaceholders = mutableScatterMapT;
        }
        mutableScatterMapT.aYN(scope, pausedCompositionRemembers);
        this.currentRememberingList.rl(new RememberObserverHolder(pausedCompositionRemembers, null));
    }

    public final void xMQ() {
        if (this.abandoning.isEmpty()) {
            return;
        }
        Object objN = Trace.f30884n.n("Compose:abandons");
        try {
            Iterator it = this.abandoning.iterator();
            while (it.hasNext()) {
                RememberObserver rememberObserver = (RememberObserver) it.next();
                it.remove();
                rememberObserver.nr();
            }
            Unit unit = Unit.INSTANCE;
            Trace.f30884n.rl(objN);
        } catch (Throwable th) {
            Trace.f30884n.rl(objN);
            throw th;
        }
    }

    public RememberEventDispatcher(Set set) {
        this.abandoning = set;
        MutableVector mutableVector = new MutableVector(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector(new Object[16], 0);
        this.sideEffects = new MutableVector(new Function0[16], 0);
        this.pending = new ArrayList();
        this.priorities = new MutableIntList(0, 1, null);
        this.afters = new MutableIntList(0, 1, null);
    }

    private final void ty(Object instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        az(endRelativeOrder);
        if (endRelativeAfter >= 0 && endRelativeAfter < endRelativeOrder) {
            this.pending.add(instance);
            this.priorities.qie(priority);
            this.afters.qie(endRelativeAfter);
            return;
        }
        this.leaving.rl(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void KN(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        ty(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void O(RememberObserverHolder instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        ty(instance, endRelativeOrder, priority, endRelativeAfter);
    }
}
