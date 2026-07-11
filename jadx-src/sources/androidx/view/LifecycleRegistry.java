package androidx.view;

import TFv.Lu;
import TFv.SPz;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.view.Lifecycle;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0002ABB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R&\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t04j\b\u0012\u0004\u0012\u00020\t`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010<R$\u0010@\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010>\"\u0004\b?\u0010\r¨\u0006C"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleOwner;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "next", "", "gh", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "observer", "J2", "(Landroidx/lifecycle/LifecycleObserver;)Landroidx/lifecycle/Lifecycle$State;", "qie", "()V", "state", "az", "lifecycleOwner", "KN", "O", "HI", "", JavetError.PARAMETER_METHOD_NAME, "Uo", "(Ljava/lang/String;)V", "Landroidx/lifecycle/Lifecycle$Event;", a.f62811a, "xMQ", "(Landroidx/lifecycle/Lifecycle$Event;)V", c.f62177j, "(Landroidx/lifecycle/LifecycleObserver;)V", "nr", "rl", "Z", "Landroidx/arch/core/internal/FastSafeIterableMap;", "Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "t", "Landroidx/arch/core/internal/FastSafeIterableMap;", "observerMap", "Landroidx/lifecycle/Lifecycle$State;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "LTFv/SPz;", "mUb", "LTFv/SPz;", "_currentStateFlow", "()Z", "isSynced", "()Landroidx/lifecycle/Lifecycle$State;", "ty", "currentState", "ObserverWithState", "Companion", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLifecycleRegistry.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleRegistry.jvm.kt\nandroidx/lifecycle/LifecycleRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
public class LifecycleRegistry extends Lifecycle {

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int addingObserverCounter;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean newEventOccurred;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final WeakReference lifecycleOwner;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean handlingEvent;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final SPz _currentStateFlow;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Lifecycle.State state;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean enforceMainThread;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private FastSafeIterableMap observerMap;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private ArrayList parentStates;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", c.f62177j, "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Lifecycle.State n(Lifecycle.State state1, Lifecycle.State state2) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "Landroidx/lifecycle/LifecycleObserver;", "observer", "Landroidx/lifecycle/Lifecycle$State;", "initialState", "<init>", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Lifecycle$Event;", a.f62811a, "", c.f62177j, "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/Lifecycle$State;", "rl", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "state", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "lifecycleObserver", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ObserverWithState {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Lifecycle.State state;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private LifecycleEventObserver lifecycleObserver;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(lifecycleObserver);
            this.lifecycleObserver = Lifecycling.J2(lifecycleObserver);
            this.state = initialState;
        }

        public final void n(LifecycleOwner owner, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Lifecycle.State stateT = event.t();
            this.state = LifecycleRegistry.INSTANCE.n(this.state, stateT);
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            Intrinsics.checkNotNull(owner);
            lifecycleEventObserver.Z(owner, event);
            this.state = stateT;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final Lifecycle.State getState() {
            return this.state;
        }
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z2) {
        this.enforceMainThread = z2;
        this.observerMap = new FastSafeIterableMap();
        Lifecycle.State state = Lifecycle.State.f38885t;
        this.state = state;
        this.parentStates = new ArrayList();
        this.lifecycleOwner = new WeakReference(lifecycleOwner);
        this._currentStateFlow = Lu.n(state);
    }

    private final void HI() {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!mUb()) {
            this.newEventOccurred = false;
            Lifecycle.State state = this.state;
            Map.Entry entryRl = this.observerMap.rl();
            Intrinsics.checkNotNull(entryRl);
            if (state.compareTo(((ObserverWithState) entryRl.getValue()).getState()) < 0) {
                O(lifecycleOwner);
            }
            Map.Entry entryO = this.observerMap.O();
            if (!this.newEventOccurred && entryO != null && this.state.compareTo(((ObserverWithState) entryO.getValue()).getState()) > 0) {
                KN(lifecycleOwner);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    private final Lifecycle.State J2(LifecycleObserver observer) {
        ObserverWithState observerWithState;
        Map.Entry entryXMQ = this.observerMap.xMQ(observer);
        Lifecycle.State state = null;
        Lifecycle.State state2 = (entryXMQ == null || (observerWithState = (ObserverWithState) entryXMQ.getValue()) == null) ? null : observerWithState.getState();
        if (!this.parentStates.isEmpty()) {
            state = (Lifecycle.State) this.parentStates.get(r0.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.n(companion.n(this.state, state2), state);
    }

    private final void KN(LifecycleOwner lifecycleOwner) {
        SafeIterableMap.IteratorWithAdditions iteratorWithAdditionsNr = this.observerMap.nr();
        Intrinsics.checkNotNullExpressionValue(iteratorWithAdditionsNr, "iteratorWithAdditions(...)");
        while (iteratorWithAdditionsNr.hasNext() && !this.newEventOccurred) {
            Map.Entry next = iteratorWithAdditionsNr.next();
            LifecycleObserver lifecycleObserver = (LifecycleObserver) next.getKey();
            ObserverWithState observerWithState = (ObserverWithState) next.getValue();
            while (observerWithState.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(lifecycleObserver)) {
                az(observerWithState.getState());
                Lifecycle.Event eventRl = Lifecycle.Event.INSTANCE.rl(observerWithState.getState());
                if (eventRl == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.n(lifecycleOwner, eventRl);
                qie();
            }
        }
    }

    private final void O(LifecycleOwner lifecycleOwner) {
        Iterator itDescendingIterator = this.observerMap.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            Intrinsics.checkNotNull(entry);
            LifecycleObserver lifecycleObserver = (LifecycleObserver) entry.getKey();
            ObserverWithState observerWithState = (ObserverWithState) entry.getValue();
            while (observerWithState.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(lifecycleObserver)) {
                Lifecycle.Event eventN = Lifecycle.Event.INSTANCE.n(observerWithState.getState());
                if (eventN == null) {
                    throw new IllegalStateException("no event down from " + observerWithState.getState());
                }
                az(eventN.t());
                observerWithState.n(lifecycleOwner, eventN);
                qie();
            }
        }
    }

    private final void Uo(String methodName) {
        if (!this.enforceMainThread || LifecycleRegistry_androidKt.n()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    private final void az(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    private final void gh(Lifecycle.State next) {
        if (this.state == next) {
            return;
        }
        LifecycleRegistryKt.n((LifecycleOwner) this.lifecycleOwner.get(), this.state, next);
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        HI();
        this.handlingEvent = false;
        if (this.state == Lifecycle.State.f38882n) {
            this.observerMap = new FastSafeIterableMap();
        }
    }

    private final boolean mUb() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry entryRl = this.observerMap.rl();
        Intrinsics.checkNotNull(entryRl);
        Lifecycle.State state = ((ObserverWithState) entryRl.getValue()).getState();
        Map.Entry entryO = this.observerMap.O();
        Intrinsics.checkNotNull(entryO);
        Lifecycle.State state2 = ((ObserverWithState) entryO.getValue()).getState();
        return state == state2 && this.state == state2;
    }

    private final void qie() {
        this.parentStates.remove(r0.size() - 1);
    }

    @Override // androidx.view.Lifecycle
    public void n(LifecycleObserver observer) {
        LifecycleOwner lifecycleOwner;
        Intrinsics.checkNotNullParameter(observer, "observer");
        Uo("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.f38882n;
        if (state != state2) {
            state2 = Lifecycle.State.f38885t;
        }
        ObserverWithState observerWithState = new ObserverWithState(observer, state2);
        if (((ObserverWithState) this.observerMap.Uo(observer, observerWithState)) == null && (lifecycleOwner = (LifecycleOwner) this.lifecycleOwner.get()) != null) {
            boolean z2 = this.addingObserverCounter != 0 || this.handlingEvent;
            Lifecycle.State stateJ2 = J2(observer);
            this.addingObserverCounter++;
            while (observerWithState.getState().compareTo(stateJ2) < 0 && this.observerMap.contains(observer)) {
                az(observerWithState.getState());
                Lifecycle.Event eventRl = Lifecycle.Event.INSTANCE.rl(observerWithState.getState());
                if (eventRl == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.n(lifecycleOwner, eventRl);
                qie();
                stateJ2 = J2(observer);
            }
            if (!z2) {
                HI();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.view.Lifecycle
    public void nr(LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Uo("removeObserver");
        this.observerMap.KN(observer);
    }

    @Override // androidx.view.Lifecycle
    /* JADX INFO: renamed from: rl, reason: from getter */
    public Lifecycle.State getState() {
        return this.state;
    }

    public void ty(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Uo("setCurrentState");
        gh(state);
    }

    public void xMQ(Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Uo("handleLifecycleEvent");
        gh(event.t());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(LifecycleOwner provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
