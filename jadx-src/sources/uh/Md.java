package uh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import uh.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Md {
    private final eZ.I28 J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f74455O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ln f74456n;
    private final List nr;
    private final pUk.qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final pUk.qz f74457t;
    private boolean xMQ;

    public enum j {
        NONE,
        LOCAL,
        SYNCED
    }

    public static Md t(Ln ln2, pUk.qz qzVar, eZ.I28 i28, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = qzVar.iterator();
        while (it.hasNext()) {
            arrayList.add(qz.n(qz.j.ADDED, (pUk.fuX) it.next()));
        }
        return new Md(ln2, qzVar, pUk.qz.nr(ln2.t()), arrayList, z2, i28, true, z3, z4);
    }

    public eZ.I28 J2() {
        return this.J2;
    }

    public Ln KN() {
        return this.f74456n;
    }

    public pUk.qz O() {
        return this.rl;
    }

    public pUk.qz Uo() {
        return this.f74457t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Md)) {
            return false;
        }
        Md md = (Md) obj;
        if (this.f74455O == md.f74455O && this.Uo == md.Uo && this.KN == md.KN && this.f74456n.equals(md.f74456n) && this.J2.equals(md.J2) && this.rl.equals(md.rl) && this.f74457t.equals(md.f74457t) && this.xMQ == md.xMQ) {
            return this.nr.equals(md.nr);
        }
        return false;
    }

    public boolean gh() {
        return this.f74455O;
    }

    public int hashCode() {
        return (((((((((((((((this.f74456n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f74457t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.J2.hashCode()) * 31) + (this.f74455O ? 1 : 0)) * 31) + (this.Uo ? 1 : 0)) * 31) + (this.KN ? 1 : 0)) * 31) + (this.xMQ ? 1 : 0);
    }

    public boolean mUb() {
        return !this.J2.isEmpty();
    }

    public boolean n() {
        return this.Uo;
    }

    public List nr() {
        return this.nr;
    }

    public boolean rl() {
        return this.KN;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f74456n + ", " + this.rl + ", " + this.f74457t + ", " + this.nr + ", isFromCache=" + this.f74455O + ", mutatedKeys=" + this.J2.size() + ", didSyncStateChange=" + this.Uo + ", excludesMetadataChanges=" + this.KN + ", hasCachedResults=" + this.xMQ + ")";
    }

    public boolean xMQ() {
        return this.xMQ;
    }

    public Md(Ln ln2, pUk.qz qzVar, pUk.qz qzVar2, List list, boolean z2, eZ.I28 i28, boolean z3, boolean z4, boolean z5) {
        this.f74456n = ln2;
        this.rl = qzVar;
        this.f74457t = qzVar2;
        this.nr = list;
        this.f74455O = z2;
        this.J2 = i28;
        this.Uo = z3;
        this.KN = z4;
        this.xMQ = z5;
    }
}
