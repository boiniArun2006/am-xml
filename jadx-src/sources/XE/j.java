package XE;

import XE.n;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f11798n = new j();
    private static final Map rl = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: XE.j$j, reason: collision with other inner class name */
    private static final class C0426j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final yB.j f11799n;
        private XE.n rl;

        public C0426j(yB.j mutex, XE.n nVar) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.f11799n = mutex;
            this.rl = nVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0426j)) {
                return false;
            }
            C0426j c0426j = (C0426j) obj;
            return Intrinsics.areEqual(this.f11799n, c0426j.f11799n) && Intrinsics.areEqual(this.rl, c0426j.rl);
        }

        public /* synthetic */ C0426j(yB.j jVar, XE.n nVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(jVar, (i2 & 2) != 0 ? null : nVar);
        }

        public int hashCode() {
            int iHashCode = this.f11799n.hashCode() * 31;
            XE.n nVar = this.rl;
            return iHashCode + (nVar == null ? 0 : nVar.hashCode());
        }

        public final yB.j n() {
            return this.f11799n;
        }

        public final XE.n rl() {
            return this.rl;
        }

        public final void t(XE.n nVar) {
            this.rl = nVar;
        }

        public String toString() {
            return "Dependency(mutex=" + this.f11799n + ", subscriber=" + this.rl + ')';
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f11800O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f11802Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f11803g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f11804n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f11805o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f11806r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f11807t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11802Z = obj;
            this.f11803g |= Integer.MIN_VALUE;
            return j.this.t(this);
        }
    }

    public static final void O(XE.n subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        n.j jVarRl = subscriber.rl();
        C0426j c0426jRl = f11798n.rl(jVarRl);
        if (c0426jRl.rl() != null) {
            Log.d("SessionsDependencies", "Subscriber " + jVarRl + " already registered.");
            return;
        }
        c0426jRl.t(subscriber);
        Log.d("SessionsDependencies", "Subscriber " + jVarRl + " registered.");
        j.C1281j.t(c0426jRl.n(), null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(n.j subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        if (subscriberName == n.j.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map dependencies = rl;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        dependencies.put(subscriberName, new C0426j(CN3.n(true), null, 2, 0 == true ? 1 : 0));
        Log.d("SessionsDependencies", "Dependency to " + subscriberName + " added.");
    }

    private final C0426j rl(n.j jVar) {
        Map dependencies = rl;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        Object obj = dependencies.get(jVar);
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C0426j) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + jVar + ". Dependencies should be added at class load time.");
    }

    public final XE.n nr(n.j subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        XE.n nVarRl = rl(subscriberName).rl();
        if (nVarRl != null) {
            return nVarRl;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(Continuation continuation) {
        n nVar;
        Iterator it;
        Map map;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f11803g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f11803g = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f11802Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f11803g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Map dependencies = rl;
            Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(dependencies.size()));
            it = dependencies.entrySet().iterator();
            map = linkedHashMap;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object key = nVar.f11805o;
            map = (Map) nVar.f11806r;
            yB.j jVarN = (yB.j) nVar.J2;
            n.j jVar = (n.j) nVar.f11800O;
            it = (Iterator) nVar.f11807t;
            Map map2 = (Map) nVar.f11804n;
            ResultKt.throwOnFailure(obj);
            try {
                XE.n nVarNr = f11798n.nr(jVar);
                jVarN.T(null);
                map.put(key, nVarNr);
                map = map2;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    key = entry.getKey();
                    jVar = (n.j) entry.getKey();
                    jVarN = ((C0426j) entry.getValue()).n();
                    nVar.f11804n = map;
                    nVar.f11807t = it;
                    nVar.f11800O = jVar;
                    nVar.J2 = jVarN;
                    nVar.f11806r = map;
                    nVar.f11805o = key;
                    nVar.f11803g = 1;
                    if (jVarN.Z(null, nVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map2 = map;
                    XE.n nVarNr2 = f11798n.nr(jVar);
                    jVarN.T(null);
                    map.put(key, nVarNr2);
                    map = map2;
                    if (it.hasNext()) {
                        return map;
                    }
                }
            } catch (Throwable th) {
                jVarN.T(null);
                throw th;
            }
        }
    }

    private j() {
    }
}
