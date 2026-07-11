package eZ;

import eZ.w6;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 implements Iterable {

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final InterfaceC0853j f63775n = new InterfaceC0853j() { // from class: eZ.n
            @Override // eZ.w6.j.InterfaceC0853j
            public final Object n(Object obj) {
                return w6.j.n(obj);
            }
        };

        /* JADX INFO: renamed from: eZ.w6$j$j, reason: collision with other inner class name */
        public interface InterfaceC0853j {
            Object n(Object obj);
        }

        public static /* synthetic */ Object n(Object obj) {
            return obj;
        }

        public static InterfaceC0853j nr() {
            return f63775n;
        }

        public static w6 t(Comparator comparator) {
            return new eZ.j(comparator);
        }

        public static w6 rl(List list, Map map, InterfaceC0853j interfaceC0853j, Comparator comparator) {
            if (list.size() < 25) {
                return eZ.j.az(list, map, interfaceC0853j, comparator);
            }
            return C.mUb(list, map, interfaceC0853j, comparator);
        }
    }

    public abstract Object J2();

    public abstract Iterator KN(Object obj);

    public abstract Object O();

    public abstract w6 Uo(Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        if (!nr().equals(w6Var.nr()) || size() != w6Var.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = w6Var.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    public abstract Comparator nr();

    public abstract boolean rl(Object obj);

    public abstract int size();

    public abstract Object t(Object obj);

    public abstract w6 xMQ(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    public int hashCode() {
        int iHashCode = nr().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }
}
