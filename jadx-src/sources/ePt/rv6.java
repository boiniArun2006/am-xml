package ePt;

import Do.j;
import Dy.j;
import Dy.w6;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import qp.InterfaceC2342j;
import veW.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class rv6 implements ePt.Ml, Do.j, ePt.w6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final bF.n f63668o = bF.n.rl("proto");
    private final I28 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MR.j f63669O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1962m f63670n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC2342j f63671r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MR.j f63672t;

    interface Ml {
        Object n();
    }

    interface n {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f63673n;
        final String rl;

        private w6(String str, String str2) {
            this.f63673n = str;
            this.rl = str2;
        }
    }

    public static /* synthetic */ List Mx(SQLiteDatabase sQLiteDatabase) {
        return (List) Mh(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new n() { // from class: ePt.lej
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.U((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Dy.Wre Qu(final long j2, SQLiteDatabase sQLiteDatabase) {
        return (Dy.Wre) Mh(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new n() { // from class: ePt.Ew
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.T(j2, (Cursor) obj);
            }
        });
    }

    private w6.n HBN(int i2) {
        w6.n nVar = w6.n.REASON_UNKNOWN;
        if (i2 == nVar.getNumber()) {
            return nVar;
        }
        w6.n nVar2 = w6.n.MESSAGE_TOO_OLD;
        if (i2 == nVar2.getNumber()) {
            return nVar2;
        }
        w6.n nVar3 = w6.n.CACHE_FULL;
        if (i2 == nVar3.getNumber()) {
            return nVar3;
        }
        w6.n nVar4 = w6.n.PAYLOAD_TOO_BIG;
        if (i2 == nVar4.getNumber()) {
            return nVar4;
        }
        w6.n nVar5 = w6.n.MAX_RETRIES_REACHED;
        if (i2 == nVar5.getNumber()) {
            return nVar5;
        }
        w6.n nVar6 = w6.n.INVALID_PAYLOD;
        if (i2 == nVar6.getNumber()) {
            return nVar6;
        }
        w6.n nVar7 = w6.n.SERVER_ERROR;
        if (i2 == nVar7.getNumber()) {
            return nVar7;
        }
        l0.j.rl("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i2));
        return nVar;
    }

    public static /* synthetic */ Object K(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    private static bF.n Lp6(String str) {
        return str == null ? f63668o : bF.n.rl(str);
    }

    public static /* synthetic */ List U(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(veW.eO.n().rl(cursor.getString(1)).nr(Kn.j.rl(cursor.getInt(2))).t(o9(cursor.getString(3))).n());
        }
        return arrayList;
    }

    private void UF(final SQLiteDatabase sQLiteDatabase) {
        s(new Ml() { // from class: ePt.o
            @Override // ePt.rv6.Ml
            public final Object n() {
                return rv6.Org(sQLiteDatabase);
            }
        }, new n() { // from class: ePt.Q
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.K((Throwable) obj);
            }
        });
    }

    private Long Vvq(SQLiteDatabase sQLiteDatabase, veW.eO eOVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(eOVar.rl(), String.valueOf(Kn.j.n(eOVar.nr()))));
        if (eOVar.t() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(eOVar.t(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) Mh(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new n() { // from class: ePt.r
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.GD((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object a(long j2, veW.eO eOVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{eOVar.rl(), String.valueOf(Kn.j.n(eOVar.nr()))}) < 1) {
            contentValues.put("backend_name", eOVar.rl());
            contentValues.put("priority", Integer.valueOf(Kn.j.n(eOVar.nr())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private static String g6(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C) it.next()).t());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ List jB(rv6 rv6Var, veW.eO eOVar, SQLiteDatabase sQLiteDatabase) {
        List listVl = rv6Var.vl(sQLiteDatabase, eOVar, rv6Var.J2.nr());
        for (bF.I28 i28 : bF.I28.values()) {
            if (i28 != eOVar.nr()) {
                int iNr = rv6Var.J2.nr() - listVl.size();
                if (iNr <= 0) {
                    break;
                }
                listVl.addAll(rv6Var.vl(sQLiteDatabase, eOVar.J2(i28), iNr));
            }
        }
        return rv6Var.nO(listVl, rv6Var.v0j(sQLiteDatabase, listVl));
    }

    private static byte[] o9(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ SQLiteDatabase p5(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    private Object s(Ml ml, n nVar) {
        long time = this.f63669O.getTime();
        while (true) {
            try {
                return ml.n();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f63669O.getTime() >= ((long) this.J2.rl()) + time) {
                    return nVar.apply(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private Dy.Wre uG() {
        final long time = this.f63672t.getTime();
        return (Dy.Wre) y(new n() { // from class: ePt.Z
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.Qu(time, (SQLiteDatabase) obj);
            }
        });
    }

    private Map v0j(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C) list.get(i2)).t());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Mh(sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, "value"}, sb.toString(), null, null, null, null), new n() { // from class: ePt.ci
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.T3L(map, (Cursor) obj);
            }
        });
        return map;
    }

    private List vl(SQLiteDatabase sQLiteDatabase, final veW.eO eOVar, int i2) {
        final ArrayList arrayList = new ArrayList();
        Long lVvq = Vvq(sQLiteDatabase, eOVar);
        if (lVvq == null) {
            return arrayList;
        }
        Mh(sQLiteDatabase.query(CrashEvent.f62787f, new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lVvq.toString()}, null, null, null, String.valueOf(i2)), new n() { // from class: ePt.UGc
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.p0N(this.f63631n, arrayList, eOVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ byte[] z(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr2 = (byte[]) arrayList.get(i2);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    @Override // ePt.Ml
    public void Ik(final veW.eO eOVar, final long j2) {
        y(new n() { // from class: ePt.Xo
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.a(j2, eOVar, (SQLiteDatabase) obj);
            }
        });
    }

    SQLiteDatabase JVN() {
        final C1962m c1962m = this.f63670n;
        Objects.requireNonNull(c1962m);
        return (SQLiteDatabase) s(new Ml() { // from class: ePt.nKK
            @Override // ePt.rv6.Ml
            public final Object n() {
                return c1962m.getWritableDatabase();
            }
        }, new n() { // from class: ePt.DAz
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.p5((Throwable) obj);
            }
        });
    }

    @Override // ePt.w6
    public void Uo(final long j2, final w6.n nVar, final String str) {
        y(new n() { // from class: ePt.z
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.How(str, nVar, j2, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // ePt.Ml
    public Iterable a63(final veW.eO eOVar) {
        return (Iterable) y(new n() { // from class: ePt.M
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.jB(this.f63628n, eOVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f63670n.close();
    }

    @Override // ePt.w6
    public void n() {
        y(new n() { // from class: ePt.eO
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.Uf(this.f63637n, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // ePt.Ml
    public Iterable nY() {
        return (Iterable) y(new n() { // from class: ePt.u
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.Mx((SQLiteDatabase) obj);
            }
        });
    }

    @Override // ePt.Ml
    public int t() {
        final long time = this.f63672t.getTime() - this.J2.t();
        return ((Integer) y(new n() { // from class: ePt.Ln
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.Bu(this.f63627n, time, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // ePt.Ml
    public boolean tUK(final veW.eO eOVar) {
        return ((Boolean) y(new n() { // from class: ePt.Pl
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.FX(this.f63629n, eOVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    rv6(MR.j jVar, MR.j jVar2, I28 i28, C1962m c1962m, InterfaceC2342j interfaceC2342j) {
        this.f63670n = c1962m;
        this.f63672t = jVar;
        this.f63669O = jVar2;
        this.J2 = i28;
        this.f63671r = interfaceC2342j;
    }

    private byte[] Aum(long j2) {
        return (byte[]) Mh(JVN().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), new n() { // from class: ePt.afx
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.z((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Integer Bu(final rv6 rv6Var, long j2, SQLiteDatabase sQLiteDatabase) {
        rv6Var.getClass();
        String[] strArr = {String.valueOf(j2)};
        Mh(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new n() { // from class: ePt.QJ
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.eF(this.f63630n, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete(CrashEvent.f62787f, "timestamp_ms < ?", strArr));
    }

    private long EF() {
        return JVN().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static /* synthetic */ Boolean FX(rv6 rv6Var, veW.eO eOVar, SQLiteDatabase sQLiteDatabase) {
        Long lVvq = rv6Var.Vvq(sQLiteDatabase, eOVar);
        if (lVvq == null) {
            return Boolean.FALSE;
        }
        return (Boolean) Mh(rv6Var.JVN().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lVvq.toString()}), new n() { // from class: ePt.c
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Long GD(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    public static /* synthetic */ Object How(String str, w6.n nVar, long j2, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) Mh(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(nVar.getNumber())}), new n() { // from class: ePt.SPz
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.n1((Cursor) obj);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(JavetError.PARAMETER_REASON, Integer.valueOf(nVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j2));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        }
        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(nVar.getNumber())});
        return null;
    }

    private long J2() {
        return JVN().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ Object M(final rv6 rv6Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        rv6Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        Mh(sQLiteDatabase.rawQuery(str2, null), new n() { // from class: ePt.s4
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.M7(this.f63674n, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Object M7(rv6 rv6Var, Cursor cursor) {
        rv6Var.getClass();
        while (cursor.moveToNext()) {
            rv6Var.Uo(cursor.getInt(0), w6.n.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    static Object Mh(Cursor cursor, n nVar) {
        try {
            return nVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object Org(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Dy.Wre T(long j2, Cursor cursor) {
        cursor.moveToNext();
        return Dy.Wre.t().t(cursor.getLong(0)).rl(j2).n();
    }

    public static /* synthetic */ Object T3L(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j2 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j2));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j2), hashSet);
            }
            hashSet.add(new w6(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Object Uf(rv6 rv6Var, SQLiteDatabase sQLiteDatabase) {
        rv6Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + rv6Var.f63672t.getTime()).execute();
        return null;
    }

    private long X4T(SQLiteDatabase sQLiteDatabase, veW.eO eOVar) {
        Long lVvq = Vvq(sQLiteDatabase, eOVar);
        if (lVvq != null) {
            return lVvq.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", eOVar.rl());
        contentValues.put("priority", Integer.valueOf(Kn.j.n(eOVar.nr())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (eOVar.t() != null) {
            contentValues.put("extras", Base64.encodeToString(eOVar.t(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private boolean Zn() {
        if (EF() * J2() >= this.J2.J2()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object eF(rv6 rv6Var, Cursor cursor) {
        rv6Var.getClass();
        while (cursor.moveToNext()) {
            rv6Var.Uo(cursor.getInt(0), w6.n.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Dy.j f(final rv6 rv6Var, String str, final Map map, final j.C0072j c0072j, SQLiteDatabase sQLiteDatabase) {
        rv6Var.getClass();
        return (Dy.j) Mh(sQLiteDatabase.rawQuery(str, new String[0]), new n() { // from class: ePt.g9s
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.fcU(this.f63639n, map, c0072j, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Dy.j fcU(rv6 rv6Var, Map map, j.C0072j c0072j, Cursor cursor) {
        rv6Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            w6.n nVarHBN = rv6Var.HBN(cursor.getInt(1));
            long j2 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(Dy.w6.t().t(nVarHBN).rl(j2).n());
        }
        rv6Var.n7b(c0072j, map);
        return c0072j.O(rv6Var.uG()).nr(rv6Var.xVH()).t((String) rv6Var.f63671r.get()).rl();
    }

    public static /* synthetic */ Boolean n1(Cursor cursor) {
        boolean z2;
        if (cursor.getCount() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    private void n7b(j.C0072j c0072j, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0072j.n(Dy.Ml.t().t((String) entry.getKey()).rl((List) entry.getValue()).n());
        }
    }

    private List nO(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C c2 = (C) listIterator.next();
            if (map.containsKey(Long.valueOf(c2.t()))) {
                Dsr.j jVarCk = c2.rl().ck();
                for (w6 w6Var : (Set) map.get(Long.valueOf(c2.t()))) {
                    jVarCk.t(w6Var.f63673n, w6Var.rl);
                }
                listIterator.set(C.n(c2.t(), c2.nr(), jVarCk.nr()));
            }
        }
        return list;
    }

    public static /* synthetic */ Object p0N(rv6 rv6Var, List list, veW.eO eOVar, Cursor cursor) {
        rv6Var.getClass();
        while (cursor.moveToNext()) {
            boolean z2 = false;
            long j2 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z2 = true;
            }
            Dsr.j jVarHI = veW.Dsr.n().ty(cursor.getString(1)).xMQ(cursor.getLong(2)).HI(cursor.getLong(3));
            if (z2) {
                jVarHI.KN(new veW.fuX(Lp6(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                jVarHI.KN(new veW.fuX(Lp6(cursor.getString(4)), rv6Var.Aum(j2)));
            }
            if (!cursor.isNull(6)) {
                jVarHI.Uo(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                jVarHI.qie(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                jVarHI.az(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                jVarHI.mUb(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                jVarHI.gh(cursor.getBlob(11));
            }
            list.add(C.n(j2, eOVar, jVarHI.nr()));
        }
        return null;
    }

    public static /* synthetic */ Long qm(rv6 rv6Var, veW.Dsr dsr, veW.eO eOVar, SQLiteDatabase sQLiteDatabase) {
        boolean z2;
        byte[] bArr;
        if (rv6Var.Zn()) {
            rv6Var.Uo(1L, w6.n.CACHE_FULL, dsr.ty());
            return -1L;
        }
        long jX4T = rv6Var.X4T(sQLiteDatabase, eOVar);
        int iO = rv6Var.J2.O();
        byte[] bArrN = dsr.O().n();
        if (bArrN.length <= iO) {
            z2 = true;
        } else {
            z2 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jX4T));
        contentValues.put("transport_name", dsr.ty());
        contentValues.put("timestamp_ms", Long.valueOf(dsr.J2()));
        contentValues.put("uptime_ms", Long.valueOf(dsr.HI()));
        contentValues.put("payload_encoding", dsr.O().rl().n());
        contentValues.put("code", dsr.nr());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z2));
        if (z2) {
            bArr = bArrN;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        contentValues.put("product_id", dsr.qie());
        contentValues.put("pseudonymous_id", dsr.az());
        contentValues.put("experiment_ids_clear_blob", dsr.Uo());
        contentValues.put("experiment_ids_encrypted_blob", dsr.KN());
        long jInsert = sQLiteDatabase.insert(CrashEvent.f62787f, null, contentValues);
        if (!z2) {
            int iCeil = (int) Math.ceil(((double) bArrN.length) / ((double) iO));
            for (int i2 = 1; i2 <= iCeil; i2++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrN, (i2 - 1) * iO, Math.min(i2 * iO, bArrN.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : dsr.gh().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Long ub(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private Dy.n xVH() {
        return Dy.n.rl().rl(Dy.I28.t().rl(Zmq()).t(I28.f63626n.J2()).n()).n();
    }

    @Override // ePt.Ml
    public void D(Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + g6(iterable);
        final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        y(new n() { // from class: ePt.iwV
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.M(this.f63643n, str, str2, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // ePt.w6
    public Dy.j Z() {
        final j.C0072j c0072jO = Dy.j.O();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (Dy.j) y(new n() { // from class: ePt.l3D
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.f(this.f63650n, str, map, c0072jO, (SQLiteDatabase) obj);
            }
        });
    }

    long Zmq() {
        return EF() * J2();
    }

    @Override // ePt.Ml
    public long g(veW.eO eOVar) {
        return ((Long) Mh(JVN().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{eOVar.rl(), String.valueOf(Kn.j.n(eOVar.nr()))}), new n() { // from class: ePt.qf
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.ub((Cursor) obj);
            }
        })).longValue();
    }

    @Override // Do.j
    public Object rl(j.InterfaceC0070j interfaceC0070j) {
        SQLiteDatabase sQLiteDatabaseJVN = JVN();
        UF(sQLiteDatabaseJVN);
        try {
            Object objExecute = interfaceC0070j.execute();
            sQLiteDatabaseJVN.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseJVN.endTransaction();
        }
    }

    @Override // ePt.Ml
    public C te(final veW.eO eOVar, final veW.Dsr dsr) {
        l0.j.t("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", eOVar.nr(), dsr.ty(), eOVar.rl());
        long jLongValue = ((Long) y(new n() { // from class: ePt.qz
            @Override // ePt.rv6.n
            public final Object apply(Object obj) {
                return rv6.qm(this.f63666n, dsr, eOVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return C.n(jLongValue, eOVar, dsr);
    }

    @Override // ePt.Ml
    public void ty(Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        JVN().compileStatement("DELETE FROM events WHERE _id in " + g6(iterable)).execute();
    }

    Object y(n nVar) {
        SQLiteDatabase sQLiteDatabaseJVN = JVN();
        sQLiteDatabaseJVN.beginTransaction();
        try {
            Object objApply = nVar.apply(sQLiteDatabaseJVN);
            sQLiteDatabaseJVN.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseJVN.endTransaction();
        }
    }
}
