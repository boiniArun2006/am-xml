package uOq;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class afx implements Ml {
    private final Set J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Set f74376O;
    private final Ml Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f74377n;
    private final Set nr;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f74378t;

    private static class j implements WU.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Set f74379n;
        private final WU.w6 rl;

        public j(Set set, WU.w6 w6Var) {
            this.f74379n = set;
            this.rl = w6Var;
        }
    }

    @Override // uOq.Ml
    public Set J2(g9s g9sVar) {
        if (this.nr.contains(g9sVar)) {
            return this.Uo.J2(g9sVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", g9sVar));
    }

    @Override // uOq.Ml
    public Object KN(g9s g9sVar) {
        if (this.f74377n.contains(g9sVar)) {
            return this.Uo.KN(g9sVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", g9sVar));
    }

    @Override // uOq.Ml
    public oSp.n Uo(g9s g9sVar) {
        if (this.f74376O.contains(g9sVar)) {
            return this.Uo.Uo(g9sVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", g9sVar));
    }

    @Override // uOq.Ml
    public Object n(Class cls) {
        if (!this.f74377n.contains(g9s.rl(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objN = this.Uo.n(cls);
        return !cls.equals(WU.w6.class) ? objN : new j(this.J2, (WU.w6) objN);
    }

    @Override // uOq.Ml
    public oSp.n rl(g9s g9sVar) {
        if (this.rl.contains(g9sVar)) {
            return this.Uo.rl(g9sVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", g9sVar));
    }

    @Override // uOq.Ml
    public oSp.j t(g9s g9sVar) {
        if (this.f74378t.contains(g9sVar)) {
            return this.Uo.t(g9sVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", g9sVar));
    }

    afx(w6 w6Var, Ml ml) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (z zVar : w6Var.Uo()) {
            if (zVar.O()) {
                if (zVar.Uo()) {
                    hashSet4.add(zVar.t());
                } else {
                    hashSet.add(zVar.t());
                }
            } else if (zVar.nr()) {
                hashSet3.add(zVar.t());
            } else if (zVar.Uo()) {
                hashSet5.add(zVar.t());
            } else {
                hashSet2.add(zVar.t());
            }
        }
        if (!w6Var.gh().isEmpty()) {
            hashSet.add(g9s.rl(WU.w6.class));
        }
        this.f74377n = Collections.unmodifiableSet(hashSet);
        this.rl = Collections.unmodifiableSet(hashSet2);
        this.f74378t = Collections.unmodifiableSet(hashSet3);
        this.nr = Collections.unmodifiableSet(hashSet4);
        this.f74376O = Collections.unmodifiableSet(hashSet5);
        this.J2 = w6Var.gh();
        this.Uo = ml;
    }

    @Override // uOq.Ml
    public oSp.n O(Class cls) {
        return rl(g9s.rl(cls));
    }

    @Override // uOq.Ml
    public oSp.j xMQ(Class cls) {
        return t(g9s.rl(cls));
    }
}
