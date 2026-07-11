package gq;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import gq.C2147u;
import gq.mrQ;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class mrQ extends yg {
    private final LEl J2;
    private final c7r KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rfW f67801O;
    private final Y5 Uo;
    private boolean gh;
    private SQLiteDatabase mUb;
    private final eO nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w6 f67802t;
    private final SQLiteTransactionListener xMQ;

    static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SQLiteDatabase f67803n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private SQLiteDatabase.CursorFactory f67804t;

        private Cursor Uo() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f67804t;
            return cursorFactory != null ? this.f67803n.rawQueryWithFactory(cursorFactory, this.rl, null, null) : this.f67803n.rawQuery(this.rl, null);
        }

        Ml rl(final Object... objArr) {
            this.f67804t = new SQLiteDatabase.CursorFactory() { // from class: gq.i
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return mrQ.Ml.n(objArr, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            return this;
        }

        Ml(SQLiteDatabase sQLiteDatabase, String str) {
            this.f67803n = sQLiteDatabase;
            this.rl = str;
        }

        public static /* synthetic */ Cursor n(Object[] objArr, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            mrQ.r(sQLiteQuery, objArr);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        boolean J2() {
            Cursor cursorUo = Uo();
            try {
                boolean z2 = !cursorUo.moveToFirst();
                cursorUo.close();
                return z2;
            } catch (Throwable th) {
                if (cursorUo != null) {
                    try {
                        cursorUo.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        int O(wqP.C c2) {
            Cursor cursorUo = Uo();
            int i2 = 0;
            while (cursorUo.moveToNext()) {
                try {
                    i2++;
                    c2.accept(cursorUo);
                } catch (Throwable th) {
                    if (cursorUo != null) {
                        try {
                            cursorUo.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorUo.close();
            return i2;
        }

        Object nr(wqP.eO eOVar) {
            Cursor cursorUo = Uo();
            try {
                if (cursorUo.moveToFirst()) {
                    Object objApply = eOVar.apply(cursorUo);
                    cursorUo.close();
                    return objApply;
                }
                cursorUo.close();
                return null;
            } catch (Throwable th) {
                if (cursorUo != null) {
                    try {
                        cursorUo.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        int t(wqP.C c2) {
            Cursor cursorUo = Uo();
            try {
                if (cursorUo.moveToFirst()) {
                    c2.accept(cursorUo);
                    cursorUo.close();
                    return 1;
                }
                cursorUo.close();
                return 0;
            } catch (Throwable th) {
                if (cursorUo != null) {
                    try {
                        cursorUo.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    class j implements SQLiteTransactionListener {
        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }

        j() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            mrQ.this.KN.az();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            mrQ.this.KN.qie();
        }
    }

    static class n {
        private final Iterator J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f67806O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final mrQ f67807n;
        private final List nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f67808t;

        n(mrQ mrq, String str, List list, String str2) {
            this.f67806O = 0;
            this.f67807n = mrq;
            this.rl = str;
            this.nr = Collections.EMPTY_LIST;
            this.f67808t = str2;
            this.J2 = list.iterator();
        }

        private Object[] rl() {
            ArrayList arrayList = new ArrayList(this.nr);
            for (int i2 = 0; this.J2.hasNext() && i2 < 900 - this.nr.size(); i2++) {
                arrayList.add(this.J2.next());
            }
            return arrayList.toArray();
        }

        Ml O() {
            this.f67806O++;
            Object[] objArrRl = rl();
            return this.f67807n.te(this.rl + ((Object) wqP.Z.S("?", objArrRl.length, ", ")) + this.f67808t).rl(objArrRl);
        }

        void n() {
            this.f67806O++;
            Object[] objArrRl = rl();
            this.f67807n.XQ(this.rl + ((Object) wqP.Z.S("?", objArrRl.length, ", ")) + this.f67808t, objArrRl);
        }

        boolean nr() {
            return this.J2.hasNext();
        }

        int t() {
            return this.f67806O;
        }

        n(mrQ mrq, String str, List list, List list2, String str2) {
            this.f67806O = 0;
            this.f67807n = mrq;
            this.rl = str;
            this.nr = list;
            this.f67808t = str2;
            this.J2 = list2.iterator();
        }
    }

    static class w6 extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final eO f67809n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f67810t;

        /* synthetic */ w6(Context context, eO eOVar, String str, j jVar) {
            this(context, eOVar, str);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f67810t = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        private w6(Context context, eO eOVar, String str) {
            this(context, eOVar, str, 17);
        }

        private void n(SQLiteDatabase sQLiteDatabase) {
            if (this.f67810t) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        w6(Context context, eO eOVar, String str, int i2) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
            this.f67809n = eOVar;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            n(sQLiteDatabase);
            new IE(sQLiteDatabase, this.f67809n).M7(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            n(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            n(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            n(sQLiteDatabase);
            new IE(sQLiteDatabase, this.f67809n).M7(i2);
        }
    }

    public mrQ(Context context, String str, pUk.Wre wre, eO eOVar, C2147u.n nVar) {
        this(eOVar, nVar, new w6(context, eOVar, o(str, wre), (j) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sQLiteProgram.bindNull(i2 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i2 + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i2 + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i2 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i2 + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    throw wqP.n.n("Unknown argument %s of type %s", obj, obj.getClass());
                }
                sQLiteProgram.bindBlob(i2 + 1, (byte[]) obj);
            }
        }
    }

    private long WPU() {
        return ((Long) te("PRAGMA page_count").nr(new wqP.eO() { // from class: gq.tI
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        })).longValue();
    }

    private long aYN() {
        return ((Long) te("PRAGMA page_size").nr(new wqP.eO() { // from class: gq.Pmq
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        })).longValue();
    }

    public static String o(String str, pUk.Wre wre) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(wre.J2(), "utf-8") + "." + URLEncoder.encode(wre.nr(), "utf-8");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // gq.yg
    InterfaceC2142m J2() {
        return new lS(this);
    }

    @Override // gq.yg
    O KN() {
        return this.Uo;
    }

    @Override // gq.yg
    P O(VtZ.aC aCVar, qz qzVar) {
        return new V1(this, this.nr, aCVar, qzVar);
    }

    @Override // gq.yg
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public c7r Uo() {
        return this.KN;
    }

    void XQ(String str, Object... objArr) {
        this.mUb.execSQL(str, objArr);
    }

    @Override // gq.yg
    public void az() {
        wqP.n.t(!this.gh, "SQLitePersistence double-started!", new Object[0]);
        this.gh = true;
        try {
            this.mUb = this.f67802t.getWritableDatabase();
            this.f67801O.WPU();
            this.KN.WPU(this.f67801O.Ik());
        } catch (SQLiteDatabaseLockedException e2) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e2);
        }
    }

    SQLiteStatement g(String str) {
        return this.mUb.compileStatement(str);
    }

    @Override // gq.yg
    Object gh(String str, wqP.s4 s4Var) {
        wqP.QJ.n(yg.f67869n, "Starting transaction: %s", str);
        this.mUb.beginTransactionWithListener(this.xMQ);
        try {
            Object obj = s4Var.get();
            this.mUb.setTransactionSuccessful();
            return obj;
        } finally {
            this.mUb.endTransaction();
        }
    }

    @Override // gq.yg
    public boolean mUb() {
        return this.gh;
    }

    @Override // gq.yg
    gq.j n() {
        return this.J2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gq.yg
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public rfW xMQ() {
        return this.f67801O;
    }

    @Override // gq.yg
    qz nr(VtZ.aC aCVar) {
        return new qYU(this, this.nr, aCVar);
    }

    @Override // gq.yg
    void qie(String str, Runnable runnable) {
        wqP.QJ.n(yg.f67869n, "Starting transaction: %s", str);
        this.mUb.beginTransactionWithListener(this.xMQ);
        try {
            runnable.run();
            this.mUb.setTransactionSuccessful();
        } finally {
            this.mUb.endTransaction();
        }
    }

    @Override // gq.yg
    InterfaceC2143n rl(VtZ.aC aCVar) {
        return new M5(this, this.nr, aCVar);
    }

    @Override // gq.yg
    CN3 t() {
        return new YzO(this);
    }

    Ml te(String str) {
        return new Ml(this.mUb, str);
    }

    long S() {
        return WPU() * aYN();
    }

    int Z(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        r(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    public mrQ(eO eOVar, C2147u.n nVar, w6 w6Var) {
        this.xMQ = new j();
        this.f67802t = w6Var;
        this.nr = eOVar;
        this.f67801O = new rfW(this, eOVar);
        this.J2 = new LEl(this, eOVar);
        this.Uo = new Y5(this, eOVar);
        this.KN = new c7r(this, nVar);
    }
}
