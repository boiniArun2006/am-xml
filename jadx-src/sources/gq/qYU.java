package gq;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.Timestamp;
import com.google.protobuf.InvalidProtocolBufferException;
import gq.mrQ;
import gq.qz;
import gq.rv6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import pUk.C2331c;
import pUk.eO;
import uh.AbstractC2405z;
import uh.C;
import uh.eO;
import uh.qf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class qYU implements qz {
    private static final String gh = "qYU";
    private static final byte[] qie = new byte[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mrQ f67834n;
    private final eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f67835t;
    private final Map nr = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rv6.j f67833O = new rv6.j();
    private final Map J2 = new HashMap();
    private final Queue Uo = new PriorityQueue(10, new Comparator() { // from class: gq.QaP
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return qYU.HI((pUk.eO) obj, (pUk.eO) obj2);
        }
    });
    private boolean KN = false;
    private int xMQ = -1;
    private long mUb = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public void S(pUk.fuX fux, Vst.I28 i28) {
        this.f67834n.XQ("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(i28.Uo()), this.f67835t, i28.t(), i28.nr(), fux.getKey().toString());
    }

    private byte[] ViF(pUk.eO eOVar) {
        return this.rl.mUb(eOVar.KN()).toByteArray();
    }

    private pUk.eO X(uh.vd vdVar) {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        pUk.r rVar = new pUk.r(vdVar);
        Collection<pUk.eO> collectionT = T(vdVar.nr() != null ? vdVar.nr() : vdVar.ty().xMQ());
        pUk.eO eOVar = null;
        if (collectionT.isEmpty()) {
            return null;
        }
        for (pUk.eO eOVar2 : collectionT) {
            if (rVar.Uo(eOVar2) && (eOVar == null || eOVar2.KN().size() > eOVar.KN().size())) {
                eOVar = eOVar2;
            }
        }
        return eOVar;
    }

    private SortedSet XQ(pUk.fuX fux, pUk.eO eOVar) {
        TreeSet treeSet = new TreeSet();
        byte[] bArrAYN = aYN(eOVar, fux);
        if (bArrAYN != null) {
            eO.w6 w6VarT = eOVar.t();
            if (w6VarT == null) {
                treeSet.add(Vst.I28.rl(eOVar.J2(), fux.getKey(), new byte[0], bArrAYN));
                return treeSet;
            }
            uB.s4 s4VarNr = fux.nr(w6VarT.t());
            if (pUk.SPz.XQ(s4VarNr)) {
                Iterator it = s4VarNr.Z().KN().iterator();
                while (it.hasNext()) {
                    treeSet.add(Vst.I28.rl(eOVar.J2(), fux.getKey(), nY((uB.s4) it.next()), bArrAYN));
                }
            }
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(pUk.fuX fux, Vst.I28 i28) {
        this.f67834n.XQ("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(i28.Uo()), this.f67835t, i28.t(), i28.nr(), fux.getKey().toString());
    }

    private byte[] aYN(pUk.eO eOVar, pUk.fuX fux) {
        Vst.Ml ml = new Vst.Ml();
        for (eO.w6 w6Var : eOVar.O()) {
            uB.s4 s4VarNr = fux.nr(w6Var.t());
            if (s4VarNr == null) {
                return null;
            }
            Vst.w6.f11351n.O(s4VarNr, ml.rl(w6Var.nr()));
        }
        return ml.t();
    }

    private SortedSet e(final pUk.C c2, final pUk.eO eOVar) {
        final TreeSet treeSet = new TreeSet();
        this.f67834n.te("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").rl(Integer.valueOf(eOVar.J2()), c2.toString(), this.f67835t).O(new wqP.C() { // from class: gq.pq
            @Override // wqP.C
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                treeSet.add(Vst.I28.rl(eOVar.J2(), c2, cursor.getBlob(0), cursor.getBlob(1)));
            }
        });
        return treeSet;
    }

    private Object[] fD(uh.vd vdVar, int i2, List list, Object[] objArr, String str, Object[] objArr2, String str2, Object[] objArr3) {
        int i3;
        StringBuilder sb;
        List list2;
        int size = (list != null ? list.size() : 1) * Math.max(objArr.length, objArr2.length);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT document_key, directional_value FROM index_entries ");
        sb2.append("WHERE index_id = ? AND uid = ? ");
        sb2.append("AND array_value = ? ");
        sb2.append("AND directional_value ");
        sb2.append(str);
        sb2.append(" ? ");
        sb2.append("AND directional_value ");
        sb2.append(str2);
        sb2.append(" ? ");
        CharSequence charSequenceS = wqP.Z.S(sb2, size, " UNION ");
        if (objArr3 != null) {
            StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb3.append(charSequenceS);
            sb3.append(") WHERE directional_value NOT IN (");
            sb3.append((CharSequence) wqP.Z.S("?", objArr3.length, ", "));
            sb3.append(")");
            list2 = list;
            i3 = size;
            sb = sb3;
        } else {
            i3 = size;
            sb = charSequenceS;
            list2 = list;
        }
        Object[] objArrIF = iF(i3, i2, list2, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        arrayList.addAll(Arrays.asList(objArrIF));
        return arrayList.toArray();
    }

    private Object[] g(pUk.eO eOVar, uh.vd vdVar, Collection collection) {
        if (collection == null) {
            return null;
        }
        List<Vst.Ml> arrayList = new ArrayList();
        arrayList.add(new Vst.Ml());
        Iterator it = collection.iterator();
        for (eO.w6 w6Var : eOVar.O()) {
            uB.s4 s4Var = (uB.s4) it.next();
            for (Vst.Ml ml : arrayList) {
                if (s7N(vdVar, w6Var.t()) && pUk.SPz.XQ(s4Var)) {
                    arrayList = te(arrayList, w6Var, s4Var);
                } else {
                    Vst.w6.f11351n.O(s4Var, ml.rl(w6Var.nr()));
                }
            }
        }
        return E2(arrayList);
    }

    private Object[] iF(int i2, int i3, List list, Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = i2 / (list != null ? list.size() : 1);
        int i5 = 0;
        Object[] objArr4 = new Object[(i2 * 5) + (objArr3 != null ? objArr3.length : 0)];
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            objArr4[i7] = Integer.valueOf(i3);
            int i9 = i7 + 2;
            objArr4[i7 + 1] = this.f67835t;
            int i10 = i7 + 3;
            objArr4[i9] = list != null ? nY((uB.s4) list.get(i8 / size)) : qie;
            int i11 = i7 + 4;
            int i12 = i8 % size;
            objArr4[i10] = objArr[i12];
            i7 += 5;
            objArr4[i11] = objArr2[i12];
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (i5 < length) {
                objArr4[i7] = objArr3[i5];
                i5++;
                i7++;
            }
        }
        return objArr4;
    }

    private List nHg(uh.vd vdVar) {
        if (this.nr.containsKey(vdVar)) {
            return (List) this.nr.get(vdVar);
        }
        ArrayList arrayList = new ArrayList();
        if (vdVar.KN().isEmpty()) {
            arrayList.add(vdVar);
        } else {
            Iterator it = wqP.l3D.xMQ(new uh.C(vdVar.KN(), C.j.AND)).iterator();
            while (it.hasNext()) {
                arrayList.add(new uh.vd(vdVar.ty(), vdVar.nr(), ((AbstractC2405z) it.next()).rl(), vdVar.az(), vdVar.mUb(), vdVar.ck(), vdVar.J2()));
            }
        }
        this.nr.put(vdVar, arrayList);
        return arrayList;
    }

    private byte[] nY(uB.s4 s4Var) {
        Vst.Ml ml = new Vst.Ml();
        Vst.w6.f11351n.O(s4Var, ml.rl(eO.w6.j.ASCENDING));
        return ml.t();
    }

    private List te(List list, eO.w6 w6Var, uB.s4 s4Var) {
        ArrayList<Vst.Ml> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (uB.s4 s4Var2 : s4Var.Z().KN()) {
            for (Vst.Ml ml : arrayList) {
                Vst.Ml ml2 = new Vst.Ml();
                ml2.nr(ml.t());
                Vst.w6.f11351n.O(s4Var2, ml2.rl(w6Var.nr()));
                arrayList2.add(ml2);
            }
        }
        return arrayList2;
    }

    private void v(final pUk.fuX fux, SortedSet sortedSet, SortedSet sortedSet2) {
        wqP.QJ.n(gh, "Updating index entries for document '%s'", fux.getKey());
        wqP.Z.r(sortedSet, sortedSet2, new wqP.C() { // from class: gq.FKk
            @Override // wqP.C
            public final void accept(Object obj) {
                this.f67682n.Z(fux, (Vst.I28) obj);
            }
        }, new wqP.C() { // from class: gq.Fl
            @Override // wqP.C
            public final void accept(Object obj) {
                this.f67686n.S(fux, (Vst.I28) obj);
            }
        });
    }

    private void wTp(pUk.eO eOVar) {
        Map map = (Map) this.J2.get(eOVar.nr());
        if (map == null) {
            map = new HashMap();
            this.J2.put(eOVar.nr(), map);
        }
        pUk.eO eOVar2 = (pUk.eO) map.get(Integer.valueOf(eOVar.J2()));
        if (eOVar2 != null) {
            this.Uo.remove(eOVar2);
        }
        map.put(Integer.valueOf(eOVar.J2()), eOVar);
        this.Uo.add(eOVar);
        this.xMQ = Math.max(this.xMQ, eOVar.J2());
        this.mUb = Math.max(this.mUb, eOVar.Uo().nr());
    }

    @Override // gq.qz
    public void J2(C2331c c2331c) {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        wqP.n.t(c2331c.ty() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f67833O.n(c2331c)) {
            this.f67834n.XQ("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", c2331c.xMQ(), Wre.t((C2331c) c2331c.ck()));
        }
    }

    @Override // gq.qz
    public void KN(uh.vd vdVar) {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        for (uh.vd vdVar2 : nHg(vdVar)) {
            qz.j jVarO = O(vdVar2);
            if (jVarO == qz.j.NONE || jVarO == qz.j.PARTIAL) {
                pUk.eO eOVarRl = new pUk.r(vdVar2).rl();
                if (eOVarRl != null) {
                    o(eOVarRl);
                }
            }
        }
    }

    @Override // gq.qz
    public qz.j O(uh.vd vdVar) {
        qz.j jVar = qz.j.FULL;
        List listNHg = nHg(vdVar);
        Iterator it = listNHg.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            uh.vd vdVar2 = (uh.vd) it.next();
            pUk.eO eOVarX = X(vdVar2);
            if (eOVarX == null) {
                jVar = qz.j.NONE;
                break;
            }
            if (eOVarX.KN().size() < vdVar2.HI()) {
                jVar = qz.j.PARTIAL;
            }
        }
        return (vdVar.r() && listNHg.size() > 1 && jVar == qz.j.FULL) ? qz.j.PARTIAL : jVar;
    }

    public Collection T(String str) {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        Map map = (Map) this.J2.get(str);
        return map == null ? Collections.EMPTY_LIST : map.values();
    }

    @Override // gq.qz
    public List Uo(uh.vd vdVar) {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (uh.vd vdVar2 : nHg(vdVar)) {
            pUk.eO eOVarX = X(vdVar2);
            if (eOVarX == null) {
                return null;
            }
            arrayList3.add(Pair.create(vdVar2, eOVarX));
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            uh.vd vdVar3 = (uh.vd) pair.first;
            pUk.eO eOVar = (pUk.eO) pair.second;
            List listN = vdVar3.n(eOVar);
            Collection collectionQie = vdVar3.qie(eOVar);
            uh.Dsr dsrGh = vdVar3.gh(eOVar);
            uh.Dsr dsrIk = vdVar3.Ik(eOVar);
            if (wqP.QJ.t()) {
                wqP.QJ.n(gh, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", eOVar, vdVar3, listN, dsrGh, dsrIk);
            }
            Object[] objArrFD = fD(vdVar3, eOVar.J2(), listN, WPU(eOVar, vdVar3, dsrGh), dsrGh.t() ? ">=" : ">", WPU(eOVar, vdVar3, dsrIk), dsrIk.t() ? "<=" : "<", g(eOVar, vdVar3, collectionQie));
            arrayList.add(String.valueOf(objArrFD[0]));
            arrayList2.addAll(Arrays.asList(objArrFD).subList(1, objArrFD.length));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(" UNION ", arrayList));
        sb.append("ORDER BY directional_value, document_key ");
        sb.append(vdVar.xMQ().equals(qf.j.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb.toString() + ")";
        if (vdVar.r()) {
            str = str + " LIMIT " + vdVar.mUb();
        }
        wqP.n.t(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        mrQ.Ml mlRl = this.f67834n.te(str).rl(arrayList2.toArray());
        final ArrayList arrayList4 = new ArrayList();
        mlRl.O(new wqP.C() { // from class: gq.RzR
            @Override // wqP.C
            public final void accept(Object obj) {
                arrayList4.add(pUk.C.Uo(C2331c.o(((Cursor) obj).getString(0))));
            }
        });
        wqP.QJ.n(gh, "Index scan returned %s documents", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    @Override // gq.qz
    public eO.j mUb(uh.vd vdVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = nHg(vdVar).iterator();
        while (it.hasNext()) {
            pUk.eO eOVarX = X((uh.vd) it.next());
            if (eOVarX != null) {
                arrayList.add(eOVarX);
            }
        }
        return N(arrayList);
    }

    @Override // gq.qz
    public void n(eZ.w6 w6Var) {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        Iterator it = w6Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            for (pUk.eO eOVar : T(((pUk.C) entry.getKey()).xMQ())) {
                SortedSet sortedSetE = e((pUk.C) entry.getKey(), eOVar);
                SortedSet sortedSetXQ = XQ((pUk.fuX) entry.getValue(), eOVar);
                if (!sortedSetE.equals(sortedSetXQ)) {
                    v((pUk.fuX) entry.getValue(), sortedSetE, sortedSetXQ);
                }
            }
        }
    }

    public void o(pUk.eO eOVar) {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        int i2 = this.xMQ + 1;
        pUk.eO eOVarRl = pUk.eO.rl(i2, eOVar.nr(), eOVar.KN(), eOVar.Uo());
        this.f67834n.XQ("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", Integer.valueOf(i2), eOVarRl.nr(), ViF(eOVarRl));
        wTp(eOVarRl);
    }

    @Override // gq.qz
    public String rl() {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        pUk.eO eOVar = (pUk.eO) this.Uo.peek();
        if (eOVar != null) {
            return eOVar.nr();
        }
        return null;
    }

    @Override // gq.qz
    public void start() {
        final HashMap map = new HashMap();
        this.f67834n.te("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").rl(this.f67835t).O(new wqP.C() { // from class: gq.kO4
            @Override // wqP.C
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                map.put(Integer.valueOf(cursor.getInt(0)), eO.n.rl(cursor.getLong(1), new pUk.UGc(new Timestamp(cursor.getLong(2), cursor.getInt(3))), pUk.C.Uo(Wre.rl(cursor.getString(4))), cursor.getInt(5)));
            }
        });
        this.f67834n.te("SELECT index_id, collection_group, index_proto FROM index_configuration").O(new wqP.C() { // from class: gq.hQ
            @Override // wqP.C
            public final void accept(Object obj) {
                qYU.az(this.f67787n, map, (Cursor) obj);
            }
        });
        this.KN = true;
    }

    @Override // gq.qz
    public void t(String str, eO.j jVar) {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        this.mUb++;
        for (pUk.eO eOVar : T(str)) {
            pUk.eO eOVarRl = pUk.eO.rl(eOVar.J2(), eOVar.nr(), eOVar.KN(), eO.n.n(this.mUb, jVar));
            this.f67834n.XQ("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(eOVar.J2()), this.f67835t, Long.valueOf(this.mUb), Long.valueOf(jVar.xMQ().rl().getSeconds()), Integer.valueOf(jVar.xMQ().rl().getNanoseconds()), Wre.t(jVar.Uo().qie()), Integer.valueOf(jVar.KN()));
            wTp(eOVarRl);
        }
    }

    @Override // gq.qz
    public List xMQ(String str) {
        wqP.n.t(this.KN, "IndexManager not started", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        this.f67834n.te("SELECT parent FROM collection_parents WHERE collection_id = ?").rl(str).O(new wqP.C() { // from class: gq.R6
            @Override // wqP.C
            public final void accept(Object obj) {
                arrayList.add(Wre.rl(((Cursor) obj).getString(0)));
            }
        });
        return arrayList;
    }

    qYU(mrQ mrq, eO eOVar, VtZ.aC aCVar) {
        String strN;
        this.f67834n = mrq;
        this.rl = eOVar;
        if (aCVar.rl()) {
            strN = aCVar.n();
        } else {
            strN = "";
        }
        this.f67835t = strN;
    }

    private Object[] E2(List list) {
        Object[] objArr = new Object[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            objArr[i2] = ((Vst.Ml) list.get(i2)).t();
        }
        return objArr;
    }

    public static /* synthetic */ int HI(pUk.eO eOVar, pUk.eO eOVar2) {
        int iCompare = Long.compare(eOVar.Uo().nr(), eOVar2.Uo().nr());
        if (iCompare == 0) {
            return eOVar.nr().compareTo(eOVar2.nr());
        }
        return iCompare;
    }

    private eO.j N(Collection collection) {
        wqP.n.t(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        eO.j jVarT = ((pUk.eO) it.next()).Uo().t();
        int iKN = jVarT.KN();
        while (it.hasNext()) {
            eO.j jVarT2 = ((pUk.eO) it.next()).Uo().t();
            if (jVarT2.compareTo(jVarT) < 0) {
                jVarT = jVarT2;
            }
            iKN = Math.max(jVarT2.KN(), iKN);
        }
        return eO.j.t(jVarT.xMQ(), jVarT.Uo(), iKN);
    }

    private Object[] WPU(pUk.eO eOVar, uh.vd vdVar, uh.Dsr dsr) {
        return g(eOVar, vdVar, dsr.rl());
    }

    public static /* synthetic */ void az(qYU qyu, Map map, Cursor cursor) {
        eO.n nVar;
        qyu.getClass();
        try {
            int i2 = cursor.getInt(0);
            String string = cursor.getString(1);
            List listRl = qyu.rl.rl(g0.j.HI(cursor.getBlob(2)));
            if (map.containsKey(Integer.valueOf(i2))) {
                nVar = (eO.n) map.get(Integer.valueOf(i2));
            } else {
                nVar = pUk.eO.f72013n;
            }
            qyu.wTp(pUk.eO.rl(i2, string, listRl, nVar));
        } catch (InvalidProtocolBufferException e2) {
            throw wqP.n.n("Failed to decode index: " + e2, new Object[0]);
        }
    }

    private boolean s7N(uh.vd vdVar, pUk.z zVar) {
        for (AbstractC2405z abstractC2405z : vdVar.KN()) {
            if (abstractC2405z instanceof uh.eO) {
                uh.eO eOVar = (uh.eO) abstractC2405z;
                if (eOVar.J2().equals(zVar)) {
                    eO.n nVarUo = eOVar.Uo();
                    if (nVarUo.equals(eO.n.IN) || nVarUo.equals(eO.n.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // gq.qz
    public eO.j nr(String str) {
        Collection collectionT = T(str);
        wqP.n.t(!collectionT.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return N(collectionT);
    }
}
