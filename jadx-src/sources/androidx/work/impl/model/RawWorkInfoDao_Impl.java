package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.Data;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f42937n;

    /* JADX INFO: renamed from: androidx.work.impl.model.RawWorkInfoDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SupportSQLiteQuery f42938n;
        final /* synthetic */ RawWorkInfoDao_Impl rl;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorJ2 = DBUtil.J2(this.rl.f42937n, this.f42938n, true, null);
            try {
                int iNr = CursorUtil.nr(cursorJ2, "id");
                int iNr2 = CursorUtil.nr(cursorJ2, "state");
                int iNr3 = CursorUtil.nr(cursorJ2, "output");
                int iNr4 = CursorUtil.nr(cursorJ2, "run_attempt_count");
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = new ArrayMap();
                while (cursorJ2.moveToNext()) {
                    if (!cursorJ2.isNull(iNr)) {
                        String string = cursorJ2.getString(iNr);
                        if (((ArrayList) arrayMap.get(string)) == null) {
                            arrayMap.put(string, new ArrayList());
                        }
                    }
                    if (!cursorJ2.isNull(iNr)) {
                        String string2 = cursorJ2.getString(iNr);
                        if (((ArrayList) arrayMap2.get(string2)) == null) {
                            arrayMap2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorJ2.moveToPosition(-1);
                this.rl.t(arrayMap);
                this.rl.rl(arrayMap2);
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    ArrayList arrayList2 = !cursorJ2.isNull(iNr) ? (ArrayList) arrayMap.get(cursorJ2.getString(iNr)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !cursorJ2.isNull(iNr) ? (ArrayList) arrayMap2.get(cursorJ2.getString(iNr)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    if (iNr != -1) {
                        workInfoPojo.f42955n = cursorJ2.getString(iNr);
                    }
                    if (iNr2 != -1) {
                        workInfoPojo.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iNr2));
                    }
                    if (iNr3 != -1) {
                        workInfoPojo.f42956t = Data.Uo(cursorJ2.getBlob(iNr3));
                    }
                    if (iNr4 != -1) {
                        workInfoPojo.nr = cursorJ2.getInt(iNr4);
                    }
                    workInfoPojo.f42954O = arrayList2;
                    workInfoPojo.J2 = arrayList3;
                    arrayList.add(workInfoPojo);
                }
                cursorJ2.close();
                return arrayList;
            } catch (Throwable th) {
                cursorJ2.close();
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List n(SupportSQLiteQuery supportSQLiteQuery) {
        this.f42937n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42937n, supportSQLiteQuery, true, null);
        try {
            int iNr = CursorUtil.nr(cursorJ2, "id");
            int iNr2 = CursorUtil.nr(cursorJ2, "state");
            int iNr3 = CursorUtil.nr(cursorJ2, "output");
            int iNr4 = CursorUtil.nr(cursorJ2, "run_attempt_count");
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            while (cursorJ2.moveToNext()) {
                if (!cursorJ2.isNull(iNr)) {
                    String string = cursorJ2.getString(iNr);
                    if (((ArrayList) arrayMap.get(string)) == null) {
                        arrayMap.put(string, new ArrayList());
                    }
                }
                if (!cursorJ2.isNull(iNr)) {
                    String string2 = cursorJ2.getString(iNr);
                    if (((ArrayList) arrayMap2.get(string2)) == null) {
                        arrayMap2.put(string2, new ArrayList());
                    }
                }
            }
            cursorJ2.moveToPosition(-1);
            t(arrayMap);
            rl(arrayMap2);
            ArrayList arrayList = new ArrayList(cursorJ2.getCount());
            while (cursorJ2.moveToNext()) {
                ArrayList arrayList2 = !cursorJ2.isNull(iNr) ? (ArrayList) arrayMap.get(cursorJ2.getString(iNr)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = !cursorJ2.isNull(iNr) ? (ArrayList) arrayMap2.get(cursorJ2.getString(iNr)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                if (iNr != -1) {
                    workInfoPojo.f42955n = cursorJ2.getString(iNr);
                }
                if (iNr2 != -1) {
                    workInfoPojo.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iNr2));
                }
                if (iNr3 != -1) {
                    workInfoPojo.f42956t = Data.Uo(cursorJ2.getBlob(iNr3));
                }
                if (iNr4 != -1) {
                    workInfoPojo.nr = cursorJ2.getInt(iNr4);
                }
                workInfoPojo.f42954O = arrayList2;
                workInfoPojo.J2 = arrayList3;
                arrayList.add(workInfoPojo);
            }
            cursorJ2.close();
            return arrayList;
        } catch (Throwable th) {
            cursorJ2.close();
            throw th;
        }
    }

    public RawWorkInfoDao_Impl(RoomDatabase roomDatabase) {
        this.f42937n = roomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rl(ArrayMap arrayMap) {
        ArrayList arrayList;
        Set<String> setKeySet = arrayMap.keySet();
        if (!setKeySet.isEmpty()) {
            if (arrayMap.getSize() > 999) {
                ArrayMap arrayMap2 = new ArrayMap(999);
                int size = arrayMap.getSize();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    arrayMap2.put((String) arrayMap.xMQ(i2), (ArrayList) arrayMap.az(i2));
                    i2++;
                    i3++;
                    if (i3 == 999) {
                        rl(arrayMap2);
                        arrayMap2 = new ArrayMap(999);
                        i3 = 0;
                    }
                }
                if (i3 > 0) {
                    rl(arrayMap2);
                    return;
                }
                return;
            }
            StringBuilder sbRl = StringUtil.rl();
            sbRl.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = setKeySet.size();
            StringUtil.n(sbRl, size2);
            sbRl.append(")");
            RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo(sbRl.toString(), size2);
            int i5 = 1;
            for (String str : setKeySet) {
                if (str == null) {
                    roomSQLiteQueryUo.gh(i5);
                } else {
                    roomSQLiteQueryUo.k(i5, str);
                }
                i5++;
            }
            Cursor cursorJ2 = DBUtil.J2(this.f42937n, roomSQLiteQueryUo, false, null);
            try {
                int iNr = CursorUtil.nr(cursorJ2, "work_spec_id");
                if (iNr == -1) {
                    return;
                }
                while (cursorJ2.moveToNext()) {
                    if (!cursorJ2.isNull(iNr) && (arrayList = (ArrayList) arrayMap.get(cursorJ2.getString(iNr))) != null) {
                        arrayList.add(Data.Uo(cursorJ2.getBlob(0)));
                    }
                }
            } finally {
                cursorJ2.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(ArrayMap arrayMap) {
        ArrayList arrayList;
        Set<String> setKeySet = arrayMap.keySet();
        if (!setKeySet.isEmpty()) {
            if (arrayMap.getSize() > 999) {
                ArrayMap arrayMap2 = new ArrayMap(999);
                int size = arrayMap.getSize();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    arrayMap2.put((String) arrayMap.xMQ(i2), (ArrayList) arrayMap.az(i2));
                    i2++;
                    i3++;
                    if (i3 == 999) {
                        t(arrayMap2);
                        arrayMap2 = new ArrayMap(999);
                        i3 = 0;
                    }
                }
                if (i3 > 0) {
                    t(arrayMap2);
                    return;
                }
                return;
            }
            StringBuilder sbRl = StringUtil.rl();
            sbRl.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = setKeySet.size();
            StringUtil.n(sbRl, size2);
            sbRl.append(")");
            RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo(sbRl.toString(), size2);
            int i5 = 1;
            for (String str : setKeySet) {
                if (str == null) {
                    roomSQLiteQueryUo.gh(i5);
                } else {
                    roomSQLiteQueryUo.k(i5, str);
                }
                i5++;
            }
            Cursor cursorJ2 = DBUtil.J2(this.f42937n, roomSQLiteQueryUo, false, null);
            try {
                int iNr = CursorUtil.nr(cursorJ2, "work_spec_id");
                if (iNr == -1) {
                    return;
                }
                while (cursorJ2.moveToNext()) {
                    if (!cursorJ2.isNull(iNr) && (arrayList = (ArrayList) arrayMap.get(cursorJ2.getString(iNr))) != null) {
                        arrayList.add(cursorJ2.getString(0));
                    }
                }
            } finally {
                cursorJ2.close();
            }
        }
    }
}
