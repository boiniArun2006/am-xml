package uh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C extends AbstractC2405z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f74431n;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f74432t;

    public enum j {
        AND("and"),
        OR("or");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f74435n;

        @Override // java.lang.Enum
        public String toString() {
            return this.f74435n;
        }

        j(String str) {
            this.f74435n = str;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C)) {
            C c2 = (C) obj;
            if (this.rl == c2.rl && this.f74431n.equals(c2.f74431n)) {
                return true;
            }
        }
        return false;
    }

    public boolean J2() {
        return this.rl == j.AND;
    }

    public boolean KN() {
        Iterator it = this.f74431n.iterator();
        while (it.hasNext()) {
            if (((AbstractC2405z) it.next()) instanceof C) {
                return false;
            }
        }
        return true;
    }

    public j O() {
        return this.rl;
    }

    public boolean Uo() {
        return this.rl == j.OR;
    }

    public int hashCode() {
        return ((1147 + this.rl.hashCode()) * 31) + this.f74431n.hashCode();
    }

    public C mUb(List list) {
        ArrayList arrayList = new ArrayList(this.f74431n);
        arrayList.addAll(list);
        return new C(arrayList, this.rl);
    }

    @Override // uh.AbstractC2405z
    public String n() {
        StringBuilder sb = new StringBuilder();
        if (xMQ()) {
            Iterator it = this.f74431n.iterator();
            while (it.hasNext()) {
                sb.append(((AbstractC2405z) it.next()).n());
            }
            return sb.toString();
        }
        sb.append(this.rl.toString() + "(");
        sb.append(TextUtils.join(",", this.f74431n));
        sb.append(")");
        return sb.toString();
    }

    @Override // uh.AbstractC2405z
    public List rl() {
        return Collections.unmodifiableList(this.f74431n);
    }

    @Override // uh.AbstractC2405z
    public List t() {
        List list = this.f74432t;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        this.f74432t = new ArrayList();
        Iterator it = this.f74431n.iterator();
        while (it.hasNext()) {
            this.f74432t.addAll(((AbstractC2405z) it.next()).t());
        }
        return Collections.unmodifiableList(this.f74432t);
    }

    public C(List list, j jVar) {
        this.f74431n = new ArrayList(list);
        this.rl = jVar;
    }

    @Override // uh.AbstractC2405z
    public boolean nr(pUk.fuX fux) {
        if (J2()) {
            Iterator it = this.f74431n.iterator();
            while (it.hasNext()) {
                if (!((AbstractC2405z) it.next()).nr(fux)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = this.f74431n.iterator();
        while (it2.hasNext()) {
            if (((AbstractC2405z) it2.next()).nr(fux)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return n();
    }

    public boolean xMQ() {
        if (KN() && J2()) {
            return true;
        }
        return false;
    }
}
