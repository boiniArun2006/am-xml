package uOq;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 {
    private final CN3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f74396O;
    private final Set Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74397n;
    private final int nr;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f74398t;

    public static class n {
        private CN3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f74399O;
        private final Set Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f74400n;
        private int nr;
        private final Set rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Set f74401t;

        /* JADX INFO: Access modifiers changed from: private */
        public n Uo() {
            this.f74399O = 1;
            return this;
        }

        public n O() {
            return xMQ(2);
        }

        public n t() {
            return xMQ(1);
        }

        private void mUb(g9s g9sVar) {
            ci.n(!this.rl.contains(g9sVar), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        private n xMQ(int i2) {
            ci.nr(this.nr == 0, "Instantiation type has already been set.");
            this.nr = i2;
            return this;
        }

        public n J2(CN3 cn3) {
            this.J2 = (CN3) ci.t(cn3, "Null factory");
            return this;
        }

        public n KN(String str) {
            this.f74400n = str;
            return this;
        }

        public w6 nr() {
            ci.nr(this.J2 != null, "Missing required property: factory.");
            return new w6(this.f74400n, new HashSet(this.rl), new HashSet(this.f74401t), this.nr, this.f74399O, this.J2, this.Uo);
        }

        public n rl(z zVar) {
            ci.t(zVar, "Null dependency");
            mUb(zVar.t());
            this.f74401t.add(zVar);
            return this;
        }

        private n(Class cls, Class... clsArr) {
            this.f74400n = null;
            HashSet hashSet = new HashSet();
            this.rl = hashSet;
            this.f74401t = new HashSet();
            this.nr = 0;
            this.f74399O = 0;
            this.Uo = new HashSet();
            ci.t(cls, "Null interface");
            hashSet.add(g9s.rl(cls));
            for (Class cls2 : clsArr) {
                ci.t(cls2, "Null interface");
                this.rl.add(g9s.rl(cls2));
            }
        }

        private n(g9s g9sVar, g9s... g9sVarArr) {
            this.f74400n = null;
            HashSet hashSet = new HashSet();
            this.rl = hashSet;
            this.f74401t = new HashSet();
            this.nr = 0;
            this.f74399O = 0;
            this.Uo = new HashSet();
            ci.t(g9sVar, "Null interface");
            hashSet.add(g9sVar);
            for (g9s g9sVar2 : g9sVarArr) {
                ci.t(g9sVar2, "Null interface");
            }
            Collections.addAll(this.rl, g9sVarArr);
        }
    }

    public static /* synthetic */ Object n(Object obj, Ml ml) {
        return obj;
    }

    public static /* synthetic */ Object rl(Object obj, Ml ml) {
        return obj;
    }

    private w6(String str, Set set, Set set2, int i2, int i3, CN3 cn3, Set set3) {
        this.f74397n = str;
        this.rl = Collections.unmodifiableSet(set);
        this.f74398t = Collections.unmodifiableSet(set2);
        this.nr = i2;
        this.f74396O = i3;
        this.J2 = cn3;
        this.Uo = Collections.unmodifiableSet(set3);
    }

    public static n J2(g9s g9sVar, g9s... g9sVarArr) {
        return new n(g9sVar, g9sVarArr);
    }

    public static n O(g9s g9sVar) {
        return new n(g9sVar, new g9s[0]);
    }

    public static n nr(Class cls, Class... clsArr) {
        return new n(cls, clsArr);
    }

    public static n t(Class cls) {
        return new n(cls, new Class[0]);
    }

    public boolean HI() {
        return this.nr == 2;
    }

    public CN3 KN() {
        return this.J2;
    }

    public Set Uo() {
        return this.f74398t;
    }

    public boolean ck() {
        return this.f74396O == 0;
    }

    public Set gh() {
        return this.Uo;
    }

    public Set mUb() {
        return this.rl;
    }

    public w6 r(CN3 cn3) {
        return new w6(this.f74397n, this.rl, this.f74398t, this.nr, this.f74396O, cn3, this.Uo);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.rl.toArray()) + ">{" + this.nr + ", type=" + this.f74396O + ", deps=" + Arrays.toString(this.f74398t.toArray()) + "}";
    }

    public boolean ty() {
        return this.nr == 1;
    }

    public String xMQ() {
        return this.f74397n;
    }

    public static w6 Ik(final Object obj, Class cls, Class... clsArr) {
        return nr(cls, clsArr).J2(new CN3() { // from class: uOq.n
            @Override // uOq.CN3
            public final Object n(Ml ml) {
                return w6.n(obj, ml);
            }
        }).nr();
    }

    public static n az(Class cls) {
        return t(cls).Uo();
    }

    public static w6 qie(final Object obj, Class cls) {
        return az(cls).J2(new CN3() { // from class: uOq.j
            @Override // uOq.CN3
            public final Object n(Ml ml) {
                return w6.rl(obj, ml);
            }
        }).nr();
    }
}
