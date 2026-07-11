package uOq;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import uOq.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Pl implements Ml, uC.j {
    private static final oSp.n xMQ = new oSp.n() { // from class: uOq.aC
        @Override // oSp.n
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };
    private final l3D J2;
    private final Dsr KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Set f74365O;
    private final AtomicReference Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f74366n;
    private final List nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f74367t;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Executor f74368n;
        private final List rl = new ArrayList();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f74369t = new ArrayList();
        private Dsr nr = Dsr.f74363n;

        public static /* synthetic */ ComponentRegistrar n(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public n J2(Dsr dsr) {
            this.nr = dsr;
            return this;
        }

        public Pl O() {
            return new Pl(this.f74368n, this.rl, this.f74369t, this.nr);
        }

        public n nr(Collection collection) {
            this.rl.addAll(collection);
            return this;
        }

        public n rl(w6 w6Var) {
            this.f74369t.add(w6Var);
            return this;
        }

        public n t(final ComponentRegistrar componentRegistrar) {
            this.rl.add(new oSp.n() { // from class: uOq.Xo
                @Override // oSp.n
                public final Object get() {
                    return Pl.n.n(componentRegistrar);
                }
            });
            return this;
        }

        n(Executor executor) {
            this.f74368n = executor;
        }
    }

    @Override // uOq.Ml
    public synchronized oSp.n Uo(g9s g9sVar) {
        s4 s4Var = (s4) this.f74367t.get(g9sVar);
        if (s4Var != null) {
            return s4Var;
        }
        return xMQ;
    }

    @Override // uOq.Ml
    public synchronized oSp.n rl(g9s g9sVar) {
        ci.t(g9sVar, "Null interface requested.");
        return (oSp.n) this.rl.get(g9sVar);
    }

    private Pl(Executor executor, Iterable iterable, Collection collection, Dsr dsr) {
        this.f74366n = new HashMap();
        this.rl = new HashMap();
        this.f74367t = new HashMap();
        this.f74365O = new HashSet();
        this.Uo = new AtomicReference();
        l3D l3d = new l3D(executor);
        this.J2 = l3d;
        this.KN = dsr;
        ArrayList arrayList = new ArrayList();
        arrayList.add(w6.Ik(l3d, l3D.class, WU.Ml.class, WU.w6.class));
        arrayList.add(w6.Ik(this, uC.j.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w6 w6Var = (w6) it.next();
            if (w6Var != null) {
                arrayList.add(w6Var);
            }
        }
        this.nr = Ik(iterable);
        ty(arrayList);
    }

    private static List Ik(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private List XQ() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f74366n.entrySet()) {
            w6 w6Var = (w6) entry.getKey();
            if (!w6Var.ck()) {
                oSp.n nVar = (oSp.n) entry.getValue();
                for (g9s g9sVar : w6Var.mUb()) {
                    if (!map.containsKey(g9sVar)) {
                        map.put(g9sVar, new HashSet());
                    }
                    ((Set) map.get(g9sVar)).add(nVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f74367t.containsKey(entry2.getKey())) {
                final s4 s4Var = (s4) this.f74367t.get(entry2.getKey());
                for (final oSp.n nVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: uOq.qz
                        @Override // java.lang.Runnable
                        public final void run() {
                            s4Var.n(nVar2);
                        }
                    });
                }
            } else {
                this.f74367t.put((g9s) entry2.getKey(), s4.rl((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    private List Z(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w6 w6Var = (w6) it.next();
            if (w6Var.ck()) {
                final oSp.n nVar = (oSp.n) this.f74366n.get(w6Var);
                for (g9s g9sVar : w6Var.mUb()) {
                    if (this.rl.containsKey(g9sVar)) {
                        final SPz sPz = (SPz) ((oSp.n) this.rl.get(g9sVar));
                        arrayList.add(new Runnable() { // from class: uOq.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                sPz.Uo(nVar);
                            }
                        });
                    } else {
                        this.rl.put(g9sVar, nVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public static n az(Executor executor) {
        return new n(executor);
    }

    private void o() {
        for (w6 w6Var : this.f74366n.keySet()) {
            for (z zVar : w6Var.Uo()) {
                if (zVar.Uo() && !this.f74367t.containsKey(zVar.t())) {
                    this.f74367t.put(zVar.t(), s4.rl(Collections.EMPTY_SET));
                } else if (this.rl.containsKey(zVar.t())) {
                    continue;
                } else {
                    if (zVar.J2()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", w6Var, zVar.t()));
                    }
                    if (!zVar.Uo()) {
                        this.rl.put(zVar.t(), SPz.O());
                    }
                }
            }
        }
    }

    private void r() {
        Boolean bool = (Boolean) this.Uo.get();
        if (bool != null) {
            HI(this.f74366n, bool.booleanValue());
        }
    }

    private void ty(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.nr.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((oSp.n) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.KN.n(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((w6) it2.next()).mUb().toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f74365O.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f74365O.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.f74366n.isEmpty()) {
                eO.n(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f74366n.keySet());
                arrayList2.addAll(list);
                eO.n(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final w6 w6Var = (w6) it3.next();
                this.f74366n.put(w6Var, new C2403c(new oSp.n() { // from class: uOq.C
                    @Override // oSp.n
                    public final Object get() {
                        return Pl.mUb(this.f74362n, w6Var);
                    }
                }));
            }
            arrayList.addAll(Z(list));
            arrayList.addAll(XQ());
            o();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        r();
    }

    public void ck(boolean z2) {
        HashMap map;
        if (androidx.compose.animation.core.fuX.n(this.Uo, null, Boolean.valueOf(z2))) {
            synchronized (this) {
                map = new HashMap(this.f74366n);
            }
            HI(map, z2);
        }
    }

    private void HI(Map map, boolean z2) {
        for (Map.Entry entry : map.entrySet()) {
            w6 w6Var = (w6) entry.getKey();
            oSp.n nVar = (oSp.n) entry.getValue();
            if (w6Var.ty() || (w6Var.HI() && z2)) {
                nVar.get();
            }
        }
        this.J2.t();
    }

    public static /* synthetic */ Object mUb(Pl pl, w6 w6Var) {
        pl.getClass();
        return w6Var.KN().n(new afx(w6Var, pl));
    }

    @Override // uOq.Ml
    public oSp.j t(g9s g9sVar) {
        oSp.n nVarRl = rl(g9sVar);
        if (nVarRl == null) {
            return SPz.O();
        }
        if (nVarRl instanceof SPz) {
            return (SPz) nVarRl;
        }
        return SPz.J2(nVarRl);
    }
}
