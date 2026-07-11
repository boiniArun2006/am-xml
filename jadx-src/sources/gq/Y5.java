package gq;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import com.google.protobuf.InvalidProtocolBufferException;
import gq.mrQ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import pUk.C2331c;
import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Y5 implements O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mrQ f67751n;
    private final eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private qz f67752t;

    private Map qie(List list, eO.j jVar, int i2, wqP.eO eOVar) {
        return az(list, jVar, i2, eOVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ty(wqP.aC aCVar, final Map map, Cursor cursor, final wqP.eO eOVar) {
        final byte[] blob = cursor.getBlob(0);
        final int i2 = cursor.getInt(1);
        final int i3 = cursor.getInt(2);
        Executor executor = aCVar;
        if (cursor.isLast()) {
            executor = wqP.qz.rl;
        }
        executor.execute(new Runnable() { // from class: gq.IG
            @Override // java.lang.Runnable
            public final void run() {
                Y5.KN(this.f67692n, blob, i2, i3, eOVar, map);
            }
        });
    }

    private pUk.QJ gh(byte[] bArr, int i2, int i3) {
        try {
            return this.rl.t(hoV.j.o(bArr)).XQ(new pUk.UGc(new Timestamp(i2, i3)));
        } catch (InvalidProtocolBufferException e2) {
            throw wqP.n.n("MaybeDocument failed to parse: %s", e2);
        }
    }

    @Override // gq.O
    public Map J2(String str, eO.j jVar, int i2) {
        List listXMQ = this.f67752t.xMQ(str);
        ArrayList arrayList = new ArrayList(listXMQ.size());
        Iterator it = listXMQ.iterator();
        while (it.hasNext()) {
            arrayList.add((C2331c) ((C2331c) it.next()).n(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        if (arrayList.size() * 9 < 900) {
            return qie(arrayList, jVar, i2, null);
        }
        HashMap map = new HashMap();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            int i5 = i3 + 100;
            map.putAll(qie(arrayList.subList(i3, Math.min(arrayList.size(), i5)), jVar, i2, null));
            i3 = i5;
        }
        return wqP.Z.Z(map, i2, eO.j.f72015t);
    }

    @Override // gq.O
    public void n(pUk.QJ qj, pUk.UGc uGc) {
        wqP.n.t(!uGc.equals(pUk.UGc.f72007t), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        pUk.C key = qj.getKey();
        Timestamp timestampRl = uGc.rl();
        this.f67751n.XQ("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", Wre.t(key.qie()), Integer.valueOf(key.qie().ty()), Long.valueOf(timestampRl.getSeconds()), Integer.valueOf(timestampRl.getNanoseconds()), this.rl.gh(qj).toByteArray());
        this.f67752t.J2(qj.getKey().mUb());
    }

    @Override // gq.O
    public Map rl(Iterable iterable) {
        final HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            arrayList.add(Wre.t(c2.qie()));
            map.put(c2, pUk.QJ.ck(c2));
        }
        mrQ.n nVar = new mrQ.n(this.f67751n, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        final wqP.aC aCVar = new wqP.aC();
        while (nVar.nr()) {
            nVar.O().O(new wqP.C() { // from class: gq.Pp
                @Override // wqP.C
                public final void accept(Object obj) {
                    this.f67720n.ty(aCVar, map, (Cursor) obj, null);
                }
            });
        }
        aCVar.rl();
        return map;
    }

    @Override // gq.O
    public void t(qz qzVar) {
        this.f67752t = qzVar;
    }

    Y5(mrQ mrq, eO eOVar) {
        this.f67751n = mrq;
        this.rl = eOVar;
    }

    public static /* synthetic */ void KN(Y5 y5, byte[] bArr, int i2, int i3, wqP.eO eOVar, Map map) {
        pUk.QJ qjGh = y5.gh(bArr, i2, i3);
        if (eOVar != null && !((Boolean) eOVar.apply(qjGh)).booleanValue()) {
            return;
        }
        synchronized (map) {
            map.put(qjGh.getKey(), qjGh);
        }
    }

    public static /* synthetic */ Boolean Uo(uh.Ln ln2, Set set, pUk.QJ qj) {
        boolean z2;
        if (!ln2.r(qj) && !set.contains(qj.getKey())) {
            z2 = false;
        } else {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    private Map az(List list, eO.j jVar, int i2, final wqP.eO eOVar, final pO pOVar) {
        Timestamp timestampRl = jVar.xMQ().rl();
        pUk.C cUo = jVar.Uo();
        StringBuilder sbS = wqP.Z.S("SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size(), " UNION ");
        sbS.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        Object[] objArr = new Object[(list.size() * 9) + 1];
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C2331c c2331c = (C2331c) it.next();
            String strT = Wre.t(c2331c);
            objArr[i3] = strT;
            objArr[i3 + 1] = Wre.J2(strT);
            objArr[i3 + 2] = Integer.valueOf(c2331c.ty() + 1);
            objArr[i3 + 3] = Long.valueOf(timestampRl.getSeconds());
            objArr[i3 + 4] = Long.valueOf(timestampRl.getSeconds());
            objArr[i3 + 5] = Integer.valueOf(timestampRl.getNanoseconds());
            objArr[i3 + 6] = Long.valueOf(timestampRl.getSeconds());
            int i5 = i3 + 8;
            objArr[i3 + 7] = Integer.valueOf(timestampRl.getNanoseconds());
            i3 += 9;
            objArr[i5] = Wre.t(cUo.qie());
        }
        objArr[i3] = Integer.valueOf(i2);
        final wqP.aC aCVar = new wqP.aC();
        final HashMap map = new HashMap();
        this.f67751n.te(sbS.toString()).rl(objArr).O(new wqP.C() { // from class: gq.FPL
            @Override // wqP.C
            public final void accept(Object obj) {
                Y5.xMQ(this.f67684n, aCVar, map, eOVar, pOVar, (Cursor) obj);
            }
        });
        aCVar.rl();
        return map;
    }

    public static /* synthetic */ void xMQ(Y5 y5, wqP.aC aCVar, Map map, wqP.eO eOVar, pO pOVar, Cursor cursor) {
        y5.ty(aCVar, map, cursor, eOVar);
        if (pOVar != null) {
            pOVar.rl();
        }
    }

    @Override // gq.O
    public Map O(final uh.Ln ln2, eO.j jVar, final Set set, pO pOVar) {
        return az(Collections.singletonList(ln2.qie()), jVar, Integer.MAX_VALUE, new wqP.eO() { // from class: gq.N
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return Y5.Uo(ln2, set, (pUk.QJ) obj);
            }
        }, pOVar);
    }

    @Override // gq.O
    public pUk.QJ nr(pUk.C c2) {
        return (pUk.QJ) rl(Collections.singletonList(c2)).get(c2);
    }

    @Override // gq.O
    public void removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        eZ.w6 w6VarN = pUk.Dsr.n();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            arrayList.add(Wre.t(c2.qie()));
            w6VarN = w6VarN.Uo(c2, pUk.QJ.Ik(c2, pUk.UGc.f72007t));
        }
        mrQ.n nVar = new mrQ.n(this.f67751n, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
        while (nVar.nr()) {
            nVar.n();
        }
        this.f67752t.n(w6VarN);
    }
}
