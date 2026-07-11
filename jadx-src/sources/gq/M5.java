package gq;

import android.database.Cursor;
import com.google.protobuf.InvalidProtocolBufferException;
import gq.mrQ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import pUk.C2331c;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class M5 implements InterfaceC2143n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mrQ f67706n;
    private final eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f67707t;

    /* JADX INFO: Access modifiers changed from: private */
    public void ty(wqP.aC aCVar, final Map map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i2 = cursor.getInt(1);
        Executor executor = aCVar;
        if (cursor.isLast()) {
            executor = wqP.qz.rl;
        }
        executor.execute(new Runnable() { // from class: gq.Mf
            @Override // java.lang.Runnable
            public final void run() {
                M5.Uo(this.f67713n, blob, i2, map);
            }
        });
    }

    @Override // gq.InterfaceC2143n
    public Map J2(String str, int i2, int i3) {
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final wqP.aC aCVar = new wqP.aC();
        this.f67706n.te("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").rl(this.f67707t, str, Integer.valueOf(i2), Integer.valueOf(i3)).O(new wqP.C() { // from class: gq.o7q
            @Override // wqP.C
            public final void accept(Object obj) {
                M5.gh(this.f67820n, iArr, strArr, strArr2, aCVar, map, (Cursor) obj);
            }
        });
        if (strArr[0] == null) {
            return map;
        }
        mrQ.Ml mlTe = this.f67706n.te("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = this.f67707t;
        String str3 = strArr[0];
        mlTe.rl(str2, str, str3, str3, strArr2[0], Integer.valueOf(iArr[0])).O(new wqP.C() { // from class: gq.xZD
            @Override // wqP.C
            public final void accept(Object obj) {
                this.f67865n.ty(aCVar, map, (Cursor) obj);
            }
        });
        aCVar.rl();
        return map;
    }

    @Override // gq.InterfaceC2143n
    public void n(int i2) {
        this.f67706n.XQ("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f67707t, Integer.valueOf(i2));
    }

    @Override // gq.InterfaceC2143n
    public Map nr(C2331c c2331c, int i2) {
        final HashMap map = new HashMap();
        final wqP.aC aCVar = new wqP.aC();
        this.f67706n.te("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").rl(this.f67707t, Wre.t(c2331c), Integer.valueOf(i2)).O(new wqP.C() { // from class: gq.gnv
            @Override // wqP.C
            public final void accept(Object obj) {
                this.f67781n.ty(aCVar, map, (Cursor) obj);
            }
        });
        aCVar.rl();
        return map;
    }

    public M5(mrQ mrq, eO eOVar, VtZ.aC aCVar) {
        String strN;
        this.f67706n = mrq;
        this.rl = eOVar;
        if (aCVar.rl()) {
            strN = aCVar.n();
        } else {
            strN = "";
        }
        this.f67707t = strN;
    }

    private void HI(final Map map, final wqP.aC aCVar, C2331c c2331c, List list) {
        if (!list.isEmpty()) {
            mrQ.n nVar = new mrQ.n(this.f67706n, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.f67707t, Wre.t(c2331c)), list, ")");
            while (nVar.nr()) {
                nVar.O().O(new wqP.C() { // from class: gq.KH
                    @Override // wqP.C
                    public final void accept(Object obj) {
                        this.f67696n.ty(aCVar, map, (Cursor) obj);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void Uo(M5 m5, byte[] bArr, int i2, Map map) {
        BC.C cAz = m5.az(bArr, i2);
        synchronized (map) {
            map.put(cAz.rl(), cAz);
        }
    }

    private BC.C az(byte[] bArr, int i2) {
        try {
            return BC.C.n(i2, this.rl.nr(uB.UGc.E2(bArr)));
        } catch (InvalidProtocolBufferException e2) {
            throw wqP.n.n("Overlay failed to parse: %s", e2);
        }
    }

    private void ck(int i2, pUk.C c2, BC.Wre wre) {
        this.f67706n.XQ("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f67707t, c2.xMQ(), Wre.t((C2331c) c2.qie().ck()), c2.qie().xMQ(), Integer.valueOf(i2), this.rl.qie(wre).toByteArray());
    }

    public static /* synthetic */ void gh(M5 m5, int[] iArr, String[] strArr, String[] strArr2, wqP.aC aCVar, Map map, Cursor cursor) {
        m5.getClass();
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        m5.ty(aCVar, map, cursor);
    }

    public static /* synthetic */ BC.C xMQ(M5 m5, Cursor cursor) {
        m5.getClass();
        return m5.az(cursor.getBlob(0), cursor.getInt(1));
    }

    @Override // gq.InterfaceC2143n
    public BC.C O(pUk.C c2) {
        return (BC.C) this.f67706n.te("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").rl(this.f67707t, Wre.t((C2331c) c2.qie().ck()), c2.qie().xMQ()).nr(new wqP.eO() { // from class: gq.fg
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return M5.xMQ(this.f67773n, (Cursor) obj);
            }
        });
    }

    @Override // gq.InterfaceC2143n
    public void rl(int i2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            pUk.C c2 = (pUk.C) entry.getKey();
            ck(i2, c2, (BC.Wre) AbstractC2418c.nr((BC.Wre) entry.getValue(), "null value for key: %s", c2));
        }
    }

    @Override // gq.InterfaceC2143n
    public Map t(SortedSet sortedSet) {
        boolean z2;
        if (sortedSet.comparator() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "getOverlays() requires natural order", new Object[0]);
        HashMap map = new HashMap();
        wqP.aC aCVar = new wqP.aC();
        C2331c c2331cMUb = C2331c.f72012t;
        ArrayList arrayList = new ArrayList();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            if (!c2331cMUb.equals(c2.mUb())) {
                HI(map, aCVar, c2331cMUb, arrayList);
                c2331cMUb = c2.mUb();
                arrayList.clear();
            }
            arrayList.add(c2.gh());
        }
        HI(map, aCVar, c2331cMUb, arrayList);
        aCVar.rl();
        return map;
    }
}
