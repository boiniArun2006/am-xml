package gq;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class lS implements InterfaceC2142m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mrQ f67799n;

    private Set O() {
        final HashSet hashSet = new HashSet();
        this.f67799n.te("SELECT DISTINCT uid FROM mutation_queues").O(new wqP.C() { // from class: gq.h6y
            @Override // wqP.C
            public final void accept(Object obj) {
                hashSet.add(((Cursor) obj).getString(0));
            }
        });
        return hashSet;
    }

    private void Uo() {
        this.f67799n.XQ("DELETE FROM data_migrations WHERE migration_name = ?", yg.rl);
    }

    private void nr() {
        this.f67799n.qie("build overlays", new Runnable() { // from class: gq.oXP
            @Override // java.lang.Runnable
            public final void run() {
                lS.n(this.f67825n);
            }
        });
    }

    public static /* synthetic */ void t(Boolean[] boolArr, Cursor cursor) {
        try {
            if (yg.rl.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e2) {
            throw wqP.n.n("SQLitePersistence.DataMigration failed to parse: %s", e2);
        }
    }

    boolean J2() {
        final Boolean[] boolArr = {Boolean.FALSE};
        this.f67799n.te("SELECT migration_name FROM data_migrations").O(new wqP.C() { // from class: gq.U4
            @Override // wqP.C
            public final void accept(Object obj) {
                lS.t(boolArr, (Cursor) obj);
            }
        });
        return boolArr[0].booleanValue();
    }

    public lS(mrQ mrq) {
        this.f67799n = mrq;
    }

    public static /* synthetic */ void n(lS lSVar) {
        if (!lSVar.J2()) {
            return;
        }
        Set setO = lSVar.O();
        O oKN = lSVar.f67799n.KN();
        Iterator it = setO.iterator();
        while (it.hasNext()) {
            VtZ.aC aCVar = new VtZ.aC((String) it.next());
            mrQ mrq = lSVar.f67799n;
            P pO = mrq.O(aCVar, mrq.nr(aCVar));
            HashSet hashSet = new HashSet();
            Iterator it2 = pO.xMQ().iterator();
            while (it2.hasNext()) {
                hashSet.addAll(((BC.CN3) it2.next()).O());
            }
            new Xo(oKN, pO, lSVar.f67799n.rl(aCVar), lSVar.f67799n.nr(aCVar)).ty(hashSet);
        }
        lSVar.Uo();
    }

    @Override // gq.InterfaceC2142m
    public void run() {
        nr();
    }
}
