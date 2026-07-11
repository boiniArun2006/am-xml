package androidx.work.impl.model;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.database.Cursor;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.collection.ArrayMap;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {
    private final SharedSQLiteStatement J2;
    private final SharedSQLiteStatement KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final SharedSQLiteStatement f42957O;
    private final SharedSQLiteStatement Uo;
    private final SharedSQLiteStatement mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f42958n;
    private final SharedSQLiteStatement nr;
    private final EntityInsertionAdapter rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SharedSQLiteStatement f42959t;
    private final SharedSQLiteStatement xMQ;

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$10, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class AnonymousClass10 implements Callable<List<String>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f42960n;
        final /* synthetic */ WorkSpecDao_Impl rl;

        protected void finalize() {
            this.f42960n.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List call() {
            this.rl.f42958n.xMQ();
            try {
                Cursor cursorJ2 = DBUtil.J2(this.rl.f42958n, this.f42960n, false, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                    while (cursorJ2.moveToNext()) {
                        arrayList.add(cursorJ2.getString(0));
                    }
                    this.rl.f42958n.P5();
                    cursorJ2.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorJ2.close();
                    throw th;
                }
            } finally {
                this.rl.f42958n.r();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$11, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AnonymousClass11 implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f42961n;
        final /* synthetic */ WorkSpecDao_Impl rl;

        protected void finalize() {
            this.f42961n.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List call() {
            this.rl.f42958n.xMQ();
            try {
                Cursor cursorJ2 = DBUtil.J2(this.rl.f42958n, this.f42961n, true, null);
                try {
                    int iO = CursorUtil.O(cursorJ2, "id");
                    int iO2 = CursorUtil.O(cursorJ2, "state");
                    int iO3 = CursorUtil.O(cursorJ2, "output");
                    int iO4 = CursorUtil.O(cursorJ2, "run_attempt_count");
                    ArrayMap arrayMap = new ArrayMap();
                    ArrayMap arrayMap2 = new ArrayMap();
                    while (cursorJ2.moveToNext()) {
                        if (!cursorJ2.isNull(iO)) {
                            String string = cursorJ2.getString(iO);
                            if (((ArrayList) arrayMap.get(string)) == null) {
                                arrayMap.put(string, new ArrayList());
                            }
                        }
                        if (!cursorJ2.isNull(iO)) {
                            String string2 = cursorJ2.getString(iO);
                            if (((ArrayList) arrayMap2.get(string2)) == null) {
                                arrayMap2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorJ2.moveToPosition(-1);
                    this.rl.iF(arrayMap);
                    this.rl.te(arrayMap2);
                    ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                    while (cursorJ2.moveToNext()) {
                        ArrayList arrayList2 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap.get(cursorJ2.getString(iO)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap2.get(cursorJ2.getString(iO)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                        workInfoPojo.f42955n = cursorJ2.getString(iO);
                        workInfoPojo.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO2));
                        workInfoPojo.f42956t = Data.Uo(cursorJ2.getBlob(iO3));
                        workInfoPojo.nr = cursorJ2.getInt(iO4);
                        workInfoPojo.f42954O = arrayList2;
                        workInfoPojo.J2 = arrayList3;
                        arrayList.add(workInfoPojo);
                    }
                    this.rl.f42958n.P5();
                    cursorJ2.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorJ2.close();
                    throw th;
                }
            } finally {
                this.rl.f42958n.r();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$12, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AnonymousClass12 implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f42962n;
        final /* synthetic */ WorkSpecDao_Impl rl;

        protected void finalize() {
            this.f42962n.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List call() {
            this.rl.f42958n.xMQ();
            try {
                Cursor cursorJ2 = DBUtil.J2(this.rl.f42958n, this.f42962n, true, null);
                try {
                    int iO = CursorUtil.O(cursorJ2, "id");
                    int iO2 = CursorUtil.O(cursorJ2, "state");
                    int iO3 = CursorUtil.O(cursorJ2, "output");
                    int iO4 = CursorUtil.O(cursorJ2, "run_attempt_count");
                    ArrayMap arrayMap = new ArrayMap();
                    ArrayMap arrayMap2 = new ArrayMap();
                    while (cursorJ2.moveToNext()) {
                        if (!cursorJ2.isNull(iO)) {
                            String string = cursorJ2.getString(iO);
                            if (((ArrayList) arrayMap.get(string)) == null) {
                                arrayMap.put(string, new ArrayList());
                            }
                        }
                        if (!cursorJ2.isNull(iO)) {
                            String string2 = cursorJ2.getString(iO);
                            if (((ArrayList) arrayMap2.get(string2)) == null) {
                                arrayMap2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorJ2.moveToPosition(-1);
                    this.rl.iF(arrayMap);
                    this.rl.te(arrayMap2);
                    ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                    while (cursorJ2.moveToNext()) {
                        ArrayList arrayList2 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap.get(cursorJ2.getString(iO)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap2.get(cursorJ2.getString(iO)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                        workInfoPojo.f42955n = cursorJ2.getString(iO);
                        workInfoPojo.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO2));
                        workInfoPojo.f42956t = Data.Uo(cursorJ2.getBlob(iO3));
                        workInfoPojo.nr = cursorJ2.getInt(iO4);
                        workInfoPojo.f42954O = arrayList2;
                        workInfoPojo.J2 = arrayList3;
                        arrayList.add(workInfoPojo);
                    }
                    this.rl.f42958n.P5();
                    cursorJ2.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorJ2.close();
                    throw th;
                }
            } finally {
                this.rl.f42958n.r();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$13, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AnonymousClass13 implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f42963n;
        final /* synthetic */ WorkSpecDao_Impl rl;

        protected void finalize() {
            this.f42963n.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List call() {
            this.rl.f42958n.xMQ();
            try {
                Cursor cursorJ2 = DBUtil.J2(this.rl.f42958n, this.f42963n, true, null);
                try {
                    int iO = CursorUtil.O(cursorJ2, "id");
                    int iO2 = CursorUtil.O(cursorJ2, "state");
                    int iO3 = CursorUtil.O(cursorJ2, "output");
                    int iO4 = CursorUtil.O(cursorJ2, "run_attempt_count");
                    ArrayMap arrayMap = new ArrayMap();
                    ArrayMap arrayMap2 = new ArrayMap();
                    while (cursorJ2.moveToNext()) {
                        if (!cursorJ2.isNull(iO)) {
                            String string = cursorJ2.getString(iO);
                            if (((ArrayList) arrayMap.get(string)) == null) {
                                arrayMap.put(string, new ArrayList());
                            }
                        }
                        if (!cursorJ2.isNull(iO)) {
                            String string2 = cursorJ2.getString(iO);
                            if (((ArrayList) arrayMap2.get(string2)) == null) {
                                arrayMap2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorJ2.moveToPosition(-1);
                    this.rl.iF(arrayMap);
                    this.rl.te(arrayMap2);
                    ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                    while (cursorJ2.moveToNext()) {
                        ArrayList arrayList2 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap.get(cursorJ2.getString(iO)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap2.get(cursorJ2.getString(iO)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                        workInfoPojo.f42955n = cursorJ2.getString(iO);
                        workInfoPojo.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO2));
                        workInfoPojo.f42956t = Data.Uo(cursorJ2.getBlob(iO3));
                        workInfoPojo.nr = cursorJ2.getInt(iO4);
                        workInfoPojo.f42954O = arrayList2;
                        workInfoPojo.J2 = arrayList3;
                        arrayList.add(workInfoPojo);
                    }
                    this.rl.f42958n.P5();
                    cursorJ2.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorJ2.close();
                    throw th;
                }
            } finally {
                this.rl.f42958n.r();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$14, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class AnonymousClass14 implements Callable<Long> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f42964n;
        final /* synthetic */ WorkSpecDao_Impl rl;

        protected void finalize() {
            this.f42964n.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long call() {
            Long lValueOf = null;
            Cursor cursorJ2 = DBUtil.J2(this.rl.f42958n, this.f42964n, false, null);
            try {
                if (cursorJ2.moveToFirst() && !cursorJ2.isNull(0)) {
                    lValueOf = Long.valueOf(cursorJ2.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorJ2.close();
            }
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int HI() {
        this.f42958n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.xMQ.rl();
        this.f42958n.xMQ();
        try {
            int iXQ = supportSQLiteStatementRl.XQ();
            this.f42958n.P5();
            return iXQ;
        } finally {
            this.f42958n.r();
            this.xMQ.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List Ik(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            int iO = CursorUtil.O(cursorJ2, "id");
            int iO2 = CursorUtil.O(cursorJ2, "state");
            ArrayList arrayList = new ArrayList(cursorJ2.getCount());
            while (cursorJ2.moveToNext()) {
                WorkSpec.IdAndState idAndState = new WorkSpec.IdAndState();
                idAndState.f42953n = cursorJ2.getString(iO);
                idAndState.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO2));
                arrayList.add(idAndState);
            }
            return arrayList;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List J2() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            int iO = CursorUtil.O(cursorJ2, "required_network_type");
            int iO2 = CursorUtil.O(cursorJ2, "requires_charging");
            int iO3 = CursorUtil.O(cursorJ2, "requires_device_idle");
            int iO4 = CursorUtil.O(cursorJ2, "requires_battery_not_low");
            int iO5 = CursorUtil.O(cursorJ2, "requires_storage_not_low");
            int iO6 = CursorUtil.O(cursorJ2, "trigger_content_update_delay");
            int iO7 = CursorUtil.O(cursorJ2, "trigger_max_content_delay");
            int iO8 = CursorUtil.O(cursorJ2, "content_uri_triggers");
            int iO9 = CursorUtil.O(cursorJ2, "id");
            int iO10 = CursorUtil.O(cursorJ2, "state");
            int iO11 = CursorUtil.O(cursorJ2, "worker_class_name");
            int iO12 = CursorUtil.O(cursorJ2, "input_merger_class_name");
            int iO13 = CursorUtil.O(cursorJ2, "input");
            int iO14 = CursorUtil.O(cursorJ2, "output");
            roomSQLiteQuery = roomSQLiteQueryUo;
            try {
                int iO15 = CursorUtil.O(cursorJ2, "initial_delay");
                int iO16 = CursorUtil.O(cursorJ2, "interval_duration");
                int iO17 = CursorUtil.O(cursorJ2, "flex_duration");
                int iO18 = CursorUtil.O(cursorJ2, "run_attempt_count");
                int iO19 = CursorUtil.O(cursorJ2, "backoff_policy");
                int iO20 = CursorUtil.O(cursorJ2, "backoff_delay_duration");
                int iO21 = CursorUtil.O(cursorJ2, "period_start_time");
                int iO22 = CursorUtil.O(cursorJ2, "minimum_retention_duration");
                int iO23 = CursorUtil.O(cursorJ2, "schedule_requested_at");
                int iO24 = CursorUtil.O(cursorJ2, "run_in_foreground");
                int iO25 = CursorUtil.O(cursorJ2, "out_of_quota_policy");
                int i2 = iO14;
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    String string = cursorJ2.getString(iO9);
                    int i3 = iO9;
                    String string2 = cursorJ2.getString(iO11);
                    int i5 = iO11;
                    Constraints constraints = new Constraints();
                    int i7 = iO;
                    constraints.gh(WorkTypeConverters.O(cursorJ2.getInt(iO)));
                    constraints.az(cursorJ2.getInt(iO2) != 0);
                    constraints.ty(cursorJ2.getInt(iO3) != 0);
                    constraints.qie(cursorJ2.getInt(iO4) != 0);
                    constraints.HI(cursorJ2.getInt(iO5) != 0);
                    int i8 = iO2;
                    int i9 = iO3;
                    constraints.ck(cursorJ2.getLong(iO6));
                    constraints.Ik(cursorJ2.getLong(iO7));
                    constraints.mUb(WorkTypeConverters.rl(cursorJ2.getBlob(iO8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO10));
                    workSpec.nr = cursorJ2.getString(iO12);
                    workSpec.f42949O = Data.Uo(cursorJ2.getBlob(iO13));
                    int i10 = i2;
                    workSpec.J2 = Data.Uo(cursorJ2.getBlob(i10));
                    i2 = i10;
                    int i11 = iO15;
                    workSpec.Uo = cursorJ2.getLong(i11);
                    int i12 = iO13;
                    int i13 = iO16;
                    workSpec.KN = cursorJ2.getLong(i13);
                    int i14 = iO4;
                    int i15 = iO17;
                    workSpec.xMQ = cursorJ2.getLong(i15);
                    int i16 = iO18;
                    workSpec.gh = cursorJ2.getInt(i16);
                    int i17 = iO19;
                    workSpec.qie = WorkTypeConverters.nr(cursorJ2.getInt(i17));
                    iO17 = i15;
                    int i18 = iO20;
                    workSpec.az = cursorJ2.getLong(i18);
                    int i19 = iO21;
                    workSpec.ty = cursorJ2.getLong(i19);
                    iO21 = i19;
                    int i20 = iO22;
                    workSpec.HI = cursorJ2.getLong(i20);
                    int i21 = iO23;
                    workSpec.ck = cursorJ2.getLong(i21);
                    int i22 = iO24;
                    workSpec.Ik = cursorJ2.getInt(i22) != 0;
                    int i23 = iO25;
                    workSpec.f42951r = WorkTypeConverters.J2(cursorJ2.getInt(i23));
                    workSpec.mUb = constraints;
                    arrayList.add(workSpec);
                    iO20 = i18;
                    iO4 = i14;
                    iO19 = i17;
                    iO25 = i23;
                    iO2 = i8;
                    iO13 = i12;
                    iO15 = i11;
                    iO16 = i13;
                    iO18 = i16;
                    iO23 = i21;
                    iO9 = i3;
                    iO11 = i5;
                    iO = i7;
                    iO24 = i22;
                    iO22 = i20;
                    iO3 = i9;
                }
                cursorJ2.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorJ2.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryUo;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo KN(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42958n.KN();
        this.f42958n.xMQ();
        try {
            WorkSpec.WorkInfoPojo workInfoPojo = null;
            Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, true, null);
            try {
                int iO = CursorUtil.O(cursorJ2, "id");
                int iO2 = CursorUtil.O(cursorJ2, "state");
                int iO3 = CursorUtil.O(cursorJ2, "output");
                int iO4 = CursorUtil.O(cursorJ2, "run_attempt_count");
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = new ArrayMap();
                while (cursorJ2.moveToNext()) {
                    if (!cursorJ2.isNull(iO)) {
                        String string = cursorJ2.getString(iO);
                        if (((ArrayList) arrayMap.get(string)) == null) {
                            arrayMap.put(string, new ArrayList());
                        }
                    }
                    if (!cursorJ2.isNull(iO)) {
                        String string2 = cursorJ2.getString(iO);
                        if (((ArrayList) arrayMap2.get(string2)) == null) {
                            arrayMap2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorJ2.moveToPosition(-1);
                iF(arrayMap);
                te(arrayMap2);
                if (cursorJ2.moveToFirst()) {
                    ArrayList arrayList = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap.get(cursorJ2.getString(iO)) : null;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    ArrayList arrayList2 = cursorJ2.isNull(iO) ? null : (ArrayList) arrayMap2.get(cursorJ2.getString(iO));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo2 = new WorkSpec.WorkInfoPojo();
                    workInfoPojo2.f42955n = cursorJ2.getString(iO);
                    workInfoPojo2.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO2));
                    workInfoPojo2.f42956t = Data.Uo(cursorJ2.getBlob(iO3));
                    workInfoPojo2.nr = cursorJ2.getInt(iO4);
                    workInfoPojo2.f42954O = arrayList;
                    workInfoPojo2.J2 = arrayList2;
                    workInfoPojo = workInfoPojo2;
                }
                this.f42958n.P5();
                cursorJ2.close();
                roomSQLiteQueryUo.release();
                return workInfoPojo;
            } catch (Throwable th) {
                cursorJ2.close();
                roomSQLiteQueryUo.release();
                throw th;
            }
        } finally {
            this.f42958n.r();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void O(WorkSpec workSpec) {
        this.f42958n.KN();
        this.f42958n.xMQ();
        try {
            this.rl.gh(workSpec);
            this.f42958n.P5();
        } finally {
            this.f42958n.r();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public boolean S() {
        boolean z2 = false;
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            if (cursorJ2.moveToFirst()) {
                if (cursorJ2.getInt(0) != 0) {
                    z2 = true;
                }
            }
            return z2;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List Uo(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorJ2.getCount());
            while (cursorJ2.moveToNext()) {
                arrayList.add(cursorJ2.getString(0));
            }
            return arrayList;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int ViF(String str) {
        this.f42958n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.J2.rl();
        if (str == null) {
            supportSQLiteStatementRl.gh(1);
        } else {
            supportSQLiteStatementRl.k(1, str);
        }
        this.f42958n.xMQ();
        try {
            int iXQ = supportSQLiteStatementRl.XQ();
            this.f42958n.P5();
            return iXQ;
        } finally {
            this.f42958n.r();
            this.J2.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int WPU(String str) {
        this.f42958n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.Uo.rl();
        if (str == null) {
            supportSQLiteStatementRl.gh(1);
        } else {
            supportSQLiteStatementRl.k(1, str);
        }
        this.f42958n.xMQ();
        try {
            int iXQ = supportSQLiteStatementRl.XQ();
            this.f42958n.P5();
            return iXQ;
        } finally {
            this.f42958n.r();
            this.Uo.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List XQ() {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorJ2.getCount());
            while (cursorJ2.moveToNext()) {
                arrayList.add(cursorJ2.getString(0));
            }
            return arrayList;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List Z() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            int iO = CursorUtil.O(cursorJ2, "required_network_type");
            int iO2 = CursorUtil.O(cursorJ2, "requires_charging");
            int iO3 = CursorUtil.O(cursorJ2, "requires_device_idle");
            int iO4 = CursorUtil.O(cursorJ2, "requires_battery_not_low");
            int iO5 = CursorUtil.O(cursorJ2, "requires_storage_not_low");
            int iO6 = CursorUtil.O(cursorJ2, "trigger_content_update_delay");
            int iO7 = CursorUtil.O(cursorJ2, "trigger_max_content_delay");
            int iO8 = CursorUtil.O(cursorJ2, "content_uri_triggers");
            int iO9 = CursorUtil.O(cursorJ2, "id");
            int iO10 = CursorUtil.O(cursorJ2, "state");
            int iO11 = CursorUtil.O(cursorJ2, "worker_class_name");
            int iO12 = CursorUtil.O(cursorJ2, "input_merger_class_name");
            int iO13 = CursorUtil.O(cursorJ2, "input");
            int iO14 = CursorUtil.O(cursorJ2, "output");
            roomSQLiteQuery = roomSQLiteQueryUo;
            try {
                int iO15 = CursorUtil.O(cursorJ2, "initial_delay");
                int iO16 = CursorUtil.O(cursorJ2, "interval_duration");
                int iO17 = CursorUtil.O(cursorJ2, "flex_duration");
                int iO18 = CursorUtil.O(cursorJ2, "run_attempt_count");
                int iO19 = CursorUtil.O(cursorJ2, "backoff_policy");
                int iO20 = CursorUtil.O(cursorJ2, "backoff_delay_duration");
                int iO21 = CursorUtil.O(cursorJ2, "period_start_time");
                int iO22 = CursorUtil.O(cursorJ2, "minimum_retention_duration");
                int iO23 = CursorUtil.O(cursorJ2, "schedule_requested_at");
                int iO24 = CursorUtil.O(cursorJ2, "run_in_foreground");
                int iO25 = CursorUtil.O(cursorJ2, "out_of_quota_policy");
                int i2 = iO14;
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    String string = cursorJ2.getString(iO9);
                    int i3 = iO9;
                    String string2 = cursorJ2.getString(iO11);
                    int i5 = iO11;
                    Constraints constraints = new Constraints();
                    int i7 = iO;
                    constraints.gh(WorkTypeConverters.O(cursorJ2.getInt(iO)));
                    constraints.az(cursorJ2.getInt(iO2) != 0);
                    constraints.ty(cursorJ2.getInt(iO3) != 0);
                    constraints.qie(cursorJ2.getInt(iO4) != 0);
                    constraints.HI(cursorJ2.getInt(iO5) != 0);
                    int i8 = iO2;
                    int i9 = iO3;
                    constraints.ck(cursorJ2.getLong(iO6));
                    constraints.Ik(cursorJ2.getLong(iO7));
                    constraints.mUb(WorkTypeConverters.rl(cursorJ2.getBlob(iO8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO10));
                    workSpec.nr = cursorJ2.getString(iO12);
                    workSpec.f42949O = Data.Uo(cursorJ2.getBlob(iO13));
                    int i10 = i2;
                    workSpec.J2 = Data.Uo(cursorJ2.getBlob(i10));
                    i2 = i10;
                    int i11 = iO15;
                    workSpec.Uo = cursorJ2.getLong(i11);
                    int i12 = iO13;
                    int i13 = iO16;
                    workSpec.KN = cursorJ2.getLong(i13);
                    int i14 = iO4;
                    int i15 = iO17;
                    workSpec.xMQ = cursorJ2.getLong(i15);
                    int i16 = iO18;
                    workSpec.gh = cursorJ2.getInt(i16);
                    int i17 = iO19;
                    workSpec.qie = WorkTypeConverters.nr(cursorJ2.getInt(i17));
                    iO17 = i15;
                    int i18 = iO20;
                    workSpec.az = cursorJ2.getLong(i18);
                    int i19 = iO21;
                    workSpec.ty = cursorJ2.getLong(i19);
                    iO21 = i19;
                    int i20 = iO22;
                    workSpec.HI = cursorJ2.getLong(i20);
                    int i21 = iO23;
                    workSpec.ck = cursorJ2.getLong(i21);
                    int i22 = iO24;
                    workSpec.Ik = cursorJ2.getInt(i22) != 0;
                    int i23 = iO25;
                    workSpec.f42951r = WorkTypeConverters.J2(cursorJ2.getInt(i23));
                    workSpec.mUb = constraints;
                    arrayList.add(workSpec);
                    iO20 = i18;
                    iO4 = i14;
                    iO19 = i17;
                    iO25 = i23;
                    iO2 = i8;
                    iO13 = i12;
                    iO15 = i11;
                    iO16 = i13;
                    iO18 = i16;
                    iO23 = i21;
                    iO9 = i3;
                    iO11 = i5;
                    iO = i7;
                    iO24 = i22;
                    iO22 = i20;
                    iO3 = i9;
                }
                cursorJ2.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorJ2.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryUo;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List aYN(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42958n.KN();
        this.f42958n.xMQ();
        try {
            Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, true, null);
            try {
                int iO = CursorUtil.O(cursorJ2, "id");
                int iO2 = CursorUtil.O(cursorJ2, "state");
                int iO3 = CursorUtil.O(cursorJ2, qUrazMnwDskFs.NymcxyxQZTJW);
                int iO4 = CursorUtil.O(cursorJ2, "run_attempt_count");
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = new ArrayMap();
                while (cursorJ2.moveToNext()) {
                    if (!cursorJ2.isNull(iO)) {
                        String string = cursorJ2.getString(iO);
                        if (((ArrayList) arrayMap.get(string)) == null) {
                            arrayMap.put(string, new ArrayList());
                        }
                    }
                    if (!cursorJ2.isNull(iO)) {
                        String string2 = cursorJ2.getString(iO);
                        if (((ArrayList) arrayMap2.get(string2)) == null) {
                            arrayMap2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorJ2.moveToPosition(-1);
                iF(arrayMap);
                te(arrayMap2);
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    ArrayList arrayList2 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap.get(cursorJ2.getString(iO)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap2.get(cursorJ2.getString(iO)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    workInfoPojo.f42955n = cursorJ2.getString(iO);
                    workInfoPojo.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO2));
                    workInfoPojo.f42956t = Data.Uo(cursorJ2.getBlob(iO3));
                    workInfoPojo.nr = cursorJ2.getInt(iO4);
                    workInfoPojo.f42954O = arrayList2;
                    workInfoPojo.J2 = arrayList3;
                    arrayList.add(workInfoPojo);
                }
                this.f42958n.P5();
                cursorJ2.close();
                roomSQLiteQueryUo.release();
                return arrayList;
            } catch (Throwable th) {
                cursorJ2.close();
                roomSQLiteQueryUo.release();
                throw th;
            }
        } finally {
            this.f42958n.r();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List az(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42958n.KN();
        this.f42958n.xMQ();
        try {
            Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, true, null);
            try {
                int iO = CursorUtil.O(cursorJ2, "id");
                int iO2 = CursorUtil.O(cursorJ2, "state");
                int iO3 = CursorUtil.O(cursorJ2, "output");
                int iO4 = CursorUtil.O(cursorJ2, "run_attempt_count");
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = new ArrayMap();
                while (cursorJ2.moveToNext()) {
                    if (!cursorJ2.isNull(iO)) {
                        String string = cursorJ2.getString(iO);
                        if (((ArrayList) arrayMap.get(string)) == null) {
                            arrayMap.put(string, new ArrayList());
                        }
                    }
                    if (!cursorJ2.isNull(iO)) {
                        String string2 = cursorJ2.getString(iO);
                        if (((ArrayList) arrayMap2.get(string2)) == null) {
                            arrayMap2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorJ2.moveToPosition(-1);
                iF(arrayMap);
                te(arrayMap2);
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    ArrayList arrayList2 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap.get(cursorJ2.getString(iO)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !cursorJ2.isNull(iO) ? (ArrayList) arrayMap2.get(cursorJ2.getString(iO)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    workInfoPojo.f42955n = cursorJ2.getString(iO);
                    workInfoPojo.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO2));
                    workInfoPojo.f42956t = Data.Uo(cursorJ2.getBlob(iO3));
                    workInfoPojo.nr = cursorJ2.getInt(iO4);
                    workInfoPojo.f42954O = arrayList2;
                    workInfoPojo.J2 = arrayList3;
                    arrayList.add(workInfoPojo);
                }
                this.f42958n.P5();
                cursorJ2.close();
                roomSQLiteQueryUo.release();
                return arrayList;
            } catch (Throwable th) {
                cursorJ2.close();
                roomSQLiteQueryUo.release();
                throw th;
            }
        } finally {
            this.f42958n.r();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int ck(String str, long j2) {
        this.f42958n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.KN.rl();
        supportSQLiteStatementRl.mUb(1, j2);
        if (str == null) {
            supportSQLiteStatementRl.gh(2);
        } else {
            supportSQLiteStatementRl.k(2, str);
        }
        this.f42958n.xMQ();
        try {
            int iXQ = supportSQLiteStatementRl.XQ();
            this.f42958n.P5();
            return iXQ;
        } finally {
            this.f42958n.r();
            this.KN.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List gh(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorJ2.getCount());
            while (cursorJ2.moveToNext()) {
                arrayList.add(cursorJ2.getString(0));
            }
            return arrayList;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec mUb(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int iO;
        int iO2;
        int iO3;
        int iO4;
        int iO5;
        int iO6;
        int iO7;
        int iO8;
        int iO9;
        int iO10;
        int iO11;
        int iO12;
        int iO13;
        int iO14;
        WorkSpec workSpec;
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            iO = CursorUtil.O(cursorJ2, pTYaLzzmJSGAPQ.IULsRfwhwnrT);
            iO2 = CursorUtil.O(cursorJ2, "requires_charging");
            iO3 = CursorUtil.O(cursorJ2, "requires_device_idle");
            iO4 = CursorUtil.O(cursorJ2, "requires_battery_not_low");
            iO5 = CursorUtil.O(cursorJ2, "requires_storage_not_low");
            iO6 = CursorUtil.O(cursorJ2, "trigger_content_update_delay");
            iO7 = CursorUtil.O(cursorJ2, "trigger_max_content_delay");
            iO8 = CursorUtil.O(cursorJ2, "content_uri_triggers");
            iO9 = CursorUtil.O(cursorJ2, "id");
            iO10 = CursorUtil.O(cursorJ2, "state");
            iO11 = CursorUtil.O(cursorJ2, "worker_class_name");
            iO12 = CursorUtil.O(cursorJ2, "input_merger_class_name");
            iO13 = CursorUtil.O(cursorJ2, "input");
            iO14 = CursorUtil.O(cursorJ2, "output");
            roomSQLiteQuery = roomSQLiteQueryUo;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = roomSQLiteQueryUo;
        }
        try {
            int iO15 = CursorUtil.O(cursorJ2, "initial_delay");
            int iO16 = CursorUtil.O(cursorJ2, "interval_duration");
            int iO17 = CursorUtil.O(cursorJ2, "flex_duration");
            int iO18 = CursorUtil.O(cursorJ2, "run_attempt_count");
            int iO19 = CursorUtil.O(cursorJ2, "backoff_policy");
            int iO20 = CursorUtil.O(cursorJ2, "backoff_delay_duration");
            int iO21 = CursorUtil.O(cursorJ2, "period_start_time");
            int iO22 = CursorUtil.O(cursorJ2, "minimum_retention_duration");
            int iO23 = CursorUtil.O(cursorJ2, "schedule_requested_at");
            int iO24 = CursorUtil.O(cursorJ2, "run_in_foreground");
            int iO25 = CursorUtil.O(cursorJ2, "out_of_quota_policy");
            if (cursorJ2.moveToFirst()) {
                String string = cursorJ2.getString(iO9);
                String string2 = cursorJ2.getString(iO11);
                Constraints constraints = new Constraints();
                constraints.gh(WorkTypeConverters.O(cursorJ2.getInt(iO)));
                constraints.az(cursorJ2.getInt(iO2) != 0);
                constraints.ty(cursorJ2.getInt(iO3) != 0);
                constraints.qie(cursorJ2.getInt(iO4) != 0);
                constraints.HI(cursorJ2.getInt(iO5) != 0);
                constraints.ck(cursorJ2.getLong(iO6));
                constraints.Ik(cursorJ2.getLong(iO7));
                constraints.mUb(WorkTypeConverters.rl(cursorJ2.getBlob(iO8)));
                WorkSpec workSpec2 = new WorkSpec(string, string2);
                workSpec2.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO10));
                workSpec2.nr = cursorJ2.getString(iO12);
                workSpec2.f42949O = Data.Uo(cursorJ2.getBlob(iO13));
                workSpec2.J2 = Data.Uo(cursorJ2.getBlob(iO14));
                workSpec2.Uo = cursorJ2.getLong(iO15);
                workSpec2.KN = cursorJ2.getLong(iO16);
                workSpec2.xMQ = cursorJ2.getLong(iO17);
                workSpec2.gh = cursorJ2.getInt(iO18);
                workSpec2.qie = WorkTypeConverters.nr(cursorJ2.getInt(iO19));
                workSpec2.az = cursorJ2.getLong(iO20);
                workSpec2.ty = cursorJ2.getLong(iO21);
                workSpec2.HI = cursorJ2.getLong(iO22);
                workSpec2.ck = cursorJ2.getLong(iO23);
                workSpec2.Ik = cursorJ2.getInt(iO24) != 0;
                workSpec2.f42951r = WorkTypeConverters.J2(cursorJ2.getInt(iO25));
                workSpec2.mUb = constraints;
                workSpec = workSpec2;
            } else {
                workSpec = null;
            }
            cursorJ2.close();
            roomSQLiteQuery.release();
            return workSpec;
        } catch (Throwable th2) {
            th = th2;
            cursorJ2.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void n(String str) {
        this.f42958n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.f42959t.rl();
        if (str == null) {
            supportSQLiteStatementRl.gh(1);
        } else {
            supportSQLiteStatementRl.k(1, str);
        }
        this.f42958n.xMQ();
        try {
            supportSQLiteStatementRl.XQ();
            this.f42958n.P5();
        } finally {
            this.f42958n.r();
            this.f42959t.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void nY(String str, long j2) {
        this.f42958n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.f42957O.rl();
        supportSQLiteStatementRl.mUb(1, j2);
        if (str == null) {
            supportSQLiteStatementRl.gh(2);
        } else {
            supportSQLiteStatementRl.k(2, str);
        }
        this.f42958n.xMQ();
        try {
            supportSQLiteStatementRl.XQ();
            this.f42958n.P5();
        } finally {
            this.f42958n.r();
            this.f42957O.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List nr(long j2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        roomSQLiteQueryUo.mUb(1, j2);
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            int iO = CursorUtil.O(cursorJ2, "required_network_type");
            int iO2 = CursorUtil.O(cursorJ2, "requires_charging");
            int iO3 = CursorUtil.O(cursorJ2, "requires_device_idle");
            int iO4 = CursorUtil.O(cursorJ2, "requires_battery_not_low");
            int iO5 = CursorUtil.O(cursorJ2, "requires_storage_not_low");
            int iO6 = CursorUtil.O(cursorJ2, "trigger_content_update_delay");
            int iO7 = CursorUtil.O(cursorJ2, "trigger_max_content_delay");
            int iO8 = CursorUtil.O(cursorJ2, "content_uri_triggers");
            int iO9 = CursorUtil.O(cursorJ2, "id");
            int iO10 = CursorUtil.O(cursorJ2, "state");
            int iO11 = CursorUtil.O(cursorJ2, "worker_class_name");
            int iO12 = CursorUtil.O(cursorJ2, "input_merger_class_name");
            int iO13 = CursorUtil.O(cursorJ2, "input");
            int iO14 = CursorUtil.O(cursorJ2, "output");
            roomSQLiteQuery = roomSQLiteQueryUo;
            try {
                int iO15 = CursorUtil.O(cursorJ2, "initial_delay");
                int iO16 = CursorUtil.O(cursorJ2, "interval_duration");
                int iO17 = CursorUtil.O(cursorJ2, "flex_duration");
                int iO18 = CursorUtil.O(cursorJ2, "run_attempt_count");
                int iO19 = CursorUtil.O(cursorJ2, "backoff_policy");
                int iO20 = CursorUtil.O(cursorJ2, "backoff_delay_duration");
                int iO21 = CursorUtil.O(cursorJ2, "period_start_time");
                int iO22 = CursorUtil.O(cursorJ2, "minimum_retention_duration");
                int iO23 = CursorUtil.O(cursorJ2, "schedule_requested_at");
                int iO24 = CursorUtil.O(cursorJ2, "run_in_foreground");
                int iO25 = CursorUtil.O(cursorJ2, "out_of_quota_policy");
                int i2 = iO14;
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    String string = cursorJ2.getString(iO9);
                    int i3 = iO9;
                    String string2 = cursorJ2.getString(iO11);
                    int i5 = iO11;
                    Constraints constraints = new Constraints();
                    int i7 = iO;
                    constraints.gh(WorkTypeConverters.O(cursorJ2.getInt(iO)));
                    constraints.az(cursorJ2.getInt(iO2) != 0);
                    constraints.ty(cursorJ2.getInt(iO3) != 0);
                    constraints.qie(cursorJ2.getInt(iO4) != 0);
                    constraints.HI(cursorJ2.getInt(iO5) != 0);
                    int i8 = iO2;
                    int i9 = iO3;
                    constraints.ck(cursorJ2.getLong(iO6));
                    constraints.Ik(cursorJ2.getLong(iO7));
                    constraints.mUb(WorkTypeConverters.rl(cursorJ2.getBlob(iO8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO10));
                    workSpec.nr = cursorJ2.getString(iO12);
                    workSpec.f42949O = Data.Uo(cursorJ2.getBlob(iO13));
                    int i10 = i2;
                    workSpec.J2 = Data.Uo(cursorJ2.getBlob(i10));
                    int i11 = iO15;
                    i2 = i10;
                    workSpec.Uo = cursorJ2.getLong(i11);
                    int i12 = iO12;
                    int i13 = iO16;
                    workSpec.KN = cursorJ2.getLong(i13);
                    int i14 = iO4;
                    int i15 = iO17;
                    workSpec.xMQ = cursorJ2.getLong(i15);
                    int i16 = iO18;
                    workSpec.gh = cursorJ2.getInt(i16);
                    int i17 = iO19;
                    workSpec.qie = WorkTypeConverters.nr(cursorJ2.getInt(i17));
                    iO17 = i15;
                    int i18 = iO20;
                    workSpec.az = cursorJ2.getLong(i18);
                    int i19 = iO21;
                    workSpec.ty = cursorJ2.getLong(i19);
                    iO21 = i19;
                    int i20 = iO22;
                    workSpec.HI = cursorJ2.getLong(i20);
                    int i21 = iO23;
                    workSpec.ck = cursorJ2.getLong(i21);
                    int i22 = iO24;
                    workSpec.Ik = cursorJ2.getInt(i22) != 0;
                    int i23 = iO25;
                    workSpec.f42951r = WorkTypeConverters.J2(cursorJ2.getInt(i23));
                    workSpec.mUb = constraints;
                    arrayList.add(workSpec);
                    iO20 = i18;
                    iO4 = i14;
                    iO19 = i17;
                    iO2 = i8;
                    iO25 = i23;
                    iO12 = i12;
                    iO15 = i11;
                    iO16 = i13;
                    iO18 = i16;
                    iO23 = i21;
                    iO9 = i3;
                    iO11 = i5;
                    iO = i7;
                    iO24 = i22;
                    iO22 = i20;
                    iO3 = i9;
                }
                cursorJ2.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorJ2.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryUo;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void o(String str, Data data) throws Throwable {
        this.f42958n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.nr.rl();
        byte[] bArrGh = Data.gh(data);
        if (bArrGh == null) {
            supportSQLiteStatementRl.gh(1);
        } else {
            supportSQLiteStatementRl.C(1, bArrGh);
        }
        if (str == null) {
            supportSQLiteStatementRl.gh(2);
        } else {
            supportSQLiteStatementRl.k(2, str);
        }
        this.f42958n.xMQ();
        try {
            supportSQLiteStatementRl.XQ();
            this.f42958n.P5();
        } finally {
            this.f42958n.r();
            this.nr.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List qie(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorJ2.getCount());
            while (cursorJ2.moveToNext()) {
                arrayList.add(Data.Uo(cursorJ2.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List r(int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        roomSQLiteQueryUo.mUb(1, i2);
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            int iO = CursorUtil.O(cursorJ2, "required_network_type");
            int iO2 = CursorUtil.O(cursorJ2, "requires_charging");
            int iO3 = CursorUtil.O(cursorJ2, "requires_device_idle");
            int iO4 = CursorUtil.O(cursorJ2, "requires_battery_not_low");
            int iO5 = CursorUtil.O(cursorJ2, "requires_storage_not_low");
            int iO6 = CursorUtil.O(cursorJ2, "trigger_content_update_delay");
            int iO7 = CursorUtil.O(cursorJ2, "trigger_max_content_delay");
            int iO8 = CursorUtil.O(cursorJ2, "content_uri_triggers");
            int iO9 = CursorUtil.O(cursorJ2, "id");
            int iO10 = CursorUtil.O(cursorJ2, "state");
            int iO11 = CursorUtil.O(cursorJ2, "worker_class_name");
            int iO12 = CursorUtil.O(cursorJ2, "input_merger_class_name");
            int iO13 = CursorUtil.O(cursorJ2, "input");
            int iO14 = CursorUtil.O(cursorJ2, "output");
            roomSQLiteQuery = roomSQLiteQueryUo;
            try {
                int iO15 = CursorUtil.O(cursorJ2, "initial_delay");
                int iO16 = CursorUtil.O(cursorJ2, "interval_duration");
                int iO17 = CursorUtil.O(cursorJ2, "flex_duration");
                int iO18 = CursorUtil.O(cursorJ2, "run_attempt_count");
                int iO19 = CursorUtil.O(cursorJ2, "backoff_policy");
                int iO20 = CursorUtil.O(cursorJ2, "backoff_delay_duration");
                int iO21 = CursorUtil.O(cursorJ2, "period_start_time");
                int iO22 = CursorUtil.O(cursorJ2, "minimum_retention_duration");
                int iO23 = CursorUtil.O(cursorJ2, "schedule_requested_at");
                int iO24 = CursorUtil.O(cursorJ2, "run_in_foreground");
                int iO25 = CursorUtil.O(cursorJ2, "out_of_quota_policy");
                int i3 = iO14;
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    String string = cursorJ2.getString(iO9);
                    int i5 = iO9;
                    String string2 = cursorJ2.getString(iO11);
                    int i7 = iO11;
                    Constraints constraints = new Constraints();
                    int i8 = iO;
                    constraints.gh(WorkTypeConverters.O(cursorJ2.getInt(iO)));
                    constraints.az(cursorJ2.getInt(iO2) != 0);
                    constraints.ty(cursorJ2.getInt(iO3) != 0);
                    constraints.qie(cursorJ2.getInt(iO4) != 0);
                    constraints.HI(cursorJ2.getInt(iO5) != 0);
                    int i9 = iO2;
                    int i10 = iO3;
                    constraints.ck(cursorJ2.getLong(iO6));
                    constraints.Ik(cursorJ2.getLong(iO7));
                    constraints.mUb(WorkTypeConverters.rl(cursorJ2.getBlob(iO8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO10));
                    workSpec.nr = cursorJ2.getString(iO12);
                    workSpec.f42949O = Data.Uo(cursorJ2.getBlob(iO13));
                    int i11 = i3;
                    workSpec.J2 = Data.Uo(cursorJ2.getBlob(i11));
                    i3 = i11;
                    int i12 = iO15;
                    workSpec.Uo = cursorJ2.getLong(i12);
                    int i13 = iO12;
                    int i14 = iO16;
                    workSpec.KN = cursorJ2.getLong(i14);
                    int i15 = iO4;
                    int i16 = iO17;
                    workSpec.xMQ = cursorJ2.getLong(i16);
                    int i17 = iO18;
                    workSpec.gh = cursorJ2.getInt(i17);
                    int i18 = iO19;
                    workSpec.qie = WorkTypeConverters.nr(cursorJ2.getInt(i18));
                    iO17 = i16;
                    int i19 = iO20;
                    workSpec.az = cursorJ2.getLong(i19);
                    int i20 = iO21;
                    workSpec.ty = cursorJ2.getLong(i20);
                    iO21 = i20;
                    int i21 = iO22;
                    workSpec.HI = cursorJ2.getLong(i21);
                    int i22 = iO23;
                    workSpec.ck = cursorJ2.getLong(i22);
                    int i23 = iO24;
                    workSpec.Ik = cursorJ2.getInt(i23) != 0;
                    int i24 = iO25;
                    workSpec.f42951r = WorkTypeConverters.J2(cursorJ2.getInt(i24));
                    workSpec.mUb = constraints;
                    arrayList.add(workSpec);
                    iO20 = i19;
                    iO4 = i15;
                    iO19 = i18;
                    iO25 = i24;
                    iO2 = i9;
                    iO12 = i13;
                    iO15 = i12;
                    iO16 = i14;
                    iO18 = i17;
                    iO23 = i22;
                    iO9 = i5;
                    iO11 = i7;
                    iO = i8;
                    iO24 = i23;
                    iO22 = i21;
                    iO3 = i10;
                }
                cursorJ2.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorJ2.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryUo;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int rl(WorkInfo.State state, String... strArr) {
        this.f42958n.KN();
        StringBuilder sbRl = StringUtil.rl();
        sbRl.append("UPDATE workspec SET state=");
        sbRl.append("?");
        sbRl.append(" WHERE id IN (");
        StringUtil.n(sbRl, strArr.length);
        sbRl.append(")");
        SupportSQLiteStatement supportSQLiteStatementGh = this.f42958n.gh(sbRl.toString());
        supportSQLiteStatementGh.mUb(1, WorkTypeConverters.mUb(state));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                supportSQLiteStatementGh.gh(i2);
            } else {
                supportSQLiteStatementGh.k(i2, str);
            }
            i2++;
        }
        this.f42958n.xMQ();
        try {
            int iXQ = supportSQLiteStatementGh.XQ();
            this.f42958n.P5();
            return iXQ;
        } finally {
            this.f42958n.r();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void t() {
        this.f42958n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.mUb.rl();
        this.f42958n.xMQ();
        try {
            supportSQLiteStatementRl.XQ();
            this.f42958n.P5();
        } finally {
            this.f42958n.r();
            this.mUb.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List ty(int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        roomSQLiteQueryUo.mUb(1, i2);
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            int iO = CursorUtil.O(cursorJ2, "required_network_type");
            int iO2 = CursorUtil.O(cursorJ2, "requires_charging");
            int iO3 = CursorUtil.O(cursorJ2, "requires_device_idle");
            int iO4 = CursorUtil.O(cursorJ2, "requires_battery_not_low");
            int iO5 = CursorUtil.O(cursorJ2, "requires_storage_not_low");
            int iO6 = CursorUtil.O(cursorJ2, "trigger_content_update_delay");
            int iO7 = CursorUtil.O(cursorJ2, "trigger_max_content_delay");
            int iO8 = CursorUtil.O(cursorJ2, "content_uri_triggers");
            int iO9 = CursorUtil.O(cursorJ2, "id");
            int iO10 = CursorUtil.O(cursorJ2, "state");
            int iO11 = CursorUtil.O(cursorJ2, "worker_class_name");
            int iO12 = CursorUtil.O(cursorJ2, "input_merger_class_name");
            int iO13 = CursorUtil.O(cursorJ2, "input");
            int iO14 = CursorUtil.O(cursorJ2, "output");
            roomSQLiteQuery = roomSQLiteQueryUo;
            try {
                int iO15 = CursorUtil.O(cursorJ2, "initial_delay");
                int iO16 = CursorUtil.O(cursorJ2, "interval_duration");
                int iO17 = CursorUtil.O(cursorJ2, "flex_duration");
                int iO18 = CursorUtil.O(cursorJ2, "run_attempt_count");
                int iO19 = CursorUtil.O(cursorJ2, "backoff_policy");
                int iO20 = CursorUtil.O(cursorJ2, "backoff_delay_duration");
                int iO21 = CursorUtil.O(cursorJ2, "period_start_time");
                int iO22 = CursorUtil.O(cursorJ2, "minimum_retention_duration");
                int iO23 = CursorUtil.O(cursorJ2, "schedule_requested_at");
                int iO24 = CursorUtil.O(cursorJ2, "run_in_foreground");
                int iO25 = CursorUtil.O(cursorJ2, "out_of_quota_policy");
                int i3 = iO14;
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    String string = cursorJ2.getString(iO9);
                    int i5 = iO9;
                    String string2 = cursorJ2.getString(iO11);
                    int i7 = iO11;
                    Constraints constraints = new Constraints();
                    int i8 = iO;
                    constraints.gh(WorkTypeConverters.O(cursorJ2.getInt(iO)));
                    constraints.az(cursorJ2.getInt(iO2) != 0);
                    constraints.ty(cursorJ2.getInt(iO3) != 0);
                    constraints.qie(cursorJ2.getInt(iO4) != 0);
                    constraints.HI(cursorJ2.getInt(iO5) != 0);
                    int i9 = iO2;
                    int i10 = iO3;
                    constraints.ck(cursorJ2.getLong(iO6));
                    constraints.Ik(cursorJ2.getLong(iO7));
                    constraints.mUb(WorkTypeConverters.rl(cursorJ2.getBlob(iO8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO10));
                    workSpec.nr = cursorJ2.getString(iO12);
                    workSpec.f42949O = Data.Uo(cursorJ2.getBlob(iO13));
                    int i11 = i3;
                    workSpec.J2 = Data.Uo(cursorJ2.getBlob(i11));
                    i3 = i11;
                    int i12 = iO15;
                    workSpec.Uo = cursorJ2.getLong(i12);
                    int i13 = iO12;
                    int i14 = iO16;
                    workSpec.KN = cursorJ2.getLong(i14);
                    int i15 = iO4;
                    int i16 = iO17;
                    workSpec.xMQ = cursorJ2.getLong(i16);
                    int i17 = iO18;
                    workSpec.gh = cursorJ2.getInt(i17);
                    int i18 = iO19;
                    workSpec.qie = WorkTypeConverters.nr(cursorJ2.getInt(i18));
                    iO17 = i16;
                    int i19 = iO20;
                    workSpec.az = cursorJ2.getLong(i19);
                    int i20 = iO21;
                    workSpec.ty = cursorJ2.getLong(i20);
                    iO21 = i20;
                    int i21 = iO22;
                    workSpec.HI = cursorJ2.getLong(i21);
                    int i22 = iO23;
                    workSpec.ck = cursorJ2.getLong(i22);
                    int i23 = iO24;
                    workSpec.Ik = cursorJ2.getInt(i23) != 0;
                    int i24 = iO25;
                    workSpec.f42951r = WorkTypeConverters.J2(cursorJ2.getInt(i24));
                    workSpec.mUb = constraints;
                    arrayList.add(workSpec);
                    iO20 = i19;
                    iO4 = i15;
                    iO19 = i18;
                    iO25 = i24;
                    iO2 = i9;
                    iO12 = i13;
                    iO15 = i12;
                    iO16 = i14;
                    iO18 = i17;
                    iO23 = i22;
                    iO9 = i5;
                    iO11 = i7;
                    iO = i8;
                    iO24 = i23;
                    iO22 = i21;
                    iO3 = i10;
                }
                cursorJ2.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorJ2.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryUo;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State xMQ(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42958n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
        try {
            return cursorJ2.moveToFirst() ? WorkTypeConverters.Uo(cursorJ2.getInt(0)) : null;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.f42958n = roomDatabase;
        this.rl = new EntityInsertionAdapter<WorkSpec>(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
            public void mUb(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) throws Throwable {
                String str = workSpec.f42950n;
                if (str == null) {
                    supportSQLiteStatement.gh(1);
                } else {
                    supportSQLiteStatement.k(1, str);
                }
                supportSQLiteStatement.mUb(2, WorkTypeConverters.mUb(workSpec.rl));
                String str2 = workSpec.f42952t;
                if (str2 == null) {
                    supportSQLiteStatement.gh(3);
                } else {
                    supportSQLiteStatement.k(3, str2);
                }
                String str3 = workSpec.nr;
                if (str3 == null) {
                    supportSQLiteStatement.gh(4);
                } else {
                    supportSQLiteStatement.k(4, str3);
                }
                byte[] bArrGh = Data.gh(workSpec.f42949O);
                if (bArrGh == null) {
                    supportSQLiteStatement.gh(5);
                } else {
                    supportSQLiteStatement.C(5, bArrGh);
                }
                byte[] bArrGh2 = Data.gh(workSpec.J2);
                if (bArrGh2 == null) {
                    supportSQLiteStatement.gh(6);
                } else {
                    supportSQLiteStatement.C(6, bArrGh2);
                }
                supportSQLiteStatement.mUb(7, workSpec.Uo);
                supportSQLiteStatement.mUb(8, workSpec.KN);
                supportSQLiteStatement.mUb(9, workSpec.xMQ);
                supportSQLiteStatement.mUb(10, workSpec.gh);
                supportSQLiteStatement.mUb(11, WorkTypeConverters.n(workSpec.qie));
                supportSQLiteStatement.mUb(12, workSpec.az);
                supportSQLiteStatement.mUb(13, workSpec.ty);
                supportSQLiteStatement.mUb(14, workSpec.HI);
                supportSQLiteStatement.mUb(15, workSpec.ck);
                supportSQLiteStatement.mUb(16, workSpec.Ik ? 1L : 0L);
                supportSQLiteStatement.mUb(17, WorkTypeConverters.xMQ(workSpec.f42951r));
                Constraints constraints = workSpec.mUb;
                if (constraints == null) {
                    supportSQLiteStatement.gh(18);
                    supportSQLiteStatement.gh(19);
                    supportSQLiteStatement.gh(20);
                    supportSQLiteStatement.gh(21);
                    supportSQLiteStatement.gh(22);
                    supportSQLiteStatement.gh(23);
                    supportSQLiteStatement.gh(24);
                    supportSQLiteStatement.gh(25);
                    return;
                }
                supportSQLiteStatement.mUb(18, WorkTypeConverters.KN(constraints.rl()));
                supportSQLiteStatement.mUb(19, constraints.Uo() ? 1L : 0L);
                supportSQLiteStatement.mUb(20, constraints.KN() ? 1L : 0L);
                supportSQLiteStatement.mUb(21, constraints.J2() ? 1L : 0L);
                supportSQLiteStatement.mUb(22, constraints.xMQ() ? 1L : 0L);
                supportSQLiteStatement.mUb(23, constraints.t());
                supportSQLiteStatement.mUb(24, constraints.nr());
                byte[] bArrT = WorkTypeConverters.t(constraints.n());
                if (bArrT == null) {
                    supportSQLiteStatement.gh(25);
                } else {
                    supportSQLiteStatement.C(25, bArrT);
                }
            }
        };
        this.f42959t = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.nr = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.f42957O = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.J2 = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.Uo = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.KN = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.xMQ = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.8
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.mUb = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.9
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iF(ArrayMap arrayMap) {
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
                        iF(arrayMap2);
                        arrayMap2 = new ArrayMap(999);
                        i3 = 0;
                    }
                }
                if (i3 > 0) {
                    iF(arrayMap2);
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
            Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void te(ArrayMap arrayMap) {
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
                        te(arrayMap2);
                        arrayMap2 = new ArrayMap(999);
                        i3 = 0;
                    }
                }
                if (i3 > 0) {
                    te(arrayMap2);
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
            Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, false, null);
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public List g(List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        StringBuilder sbRl = StringUtil.rl();
        sbRl.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.n(sbRl, size);
        sbRl.append(")");
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo(sbRl.toString(), size);
        Iterator it = list.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                roomSQLiteQueryUo.gh(i2);
            } else {
                roomSQLiteQueryUo.k(i2, str);
            }
            i2++;
        }
        this.f42958n.KN();
        this.f42958n.xMQ();
        try {
            Cursor cursorJ2 = DBUtil.J2(this.f42958n, roomSQLiteQueryUo, true, null);
            try {
                int iO = CursorUtil.O(cursorJ2, "id");
                int iO2 = CursorUtil.O(cursorJ2, aNrWBQYwFf.MiAVvcixfWjoN);
                int iO3 = CursorUtil.O(cursorJ2, "output");
                int iO4 = CursorUtil.O(cursorJ2, "run_attempt_count");
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = new ArrayMap();
                while (cursorJ2.moveToNext()) {
                    if (!cursorJ2.isNull(iO)) {
                        String string = cursorJ2.getString(iO);
                        if (((ArrayList) arrayMap.get(string)) == null) {
                            arrayMap.put(string, new ArrayList());
                        }
                    }
                    if (!cursorJ2.isNull(iO)) {
                        String string2 = cursorJ2.getString(iO);
                        if (((ArrayList) arrayMap2.get(string2)) == null) {
                            arrayMap2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorJ2.moveToPosition(-1);
                iF(arrayMap);
                te(arrayMap2);
                ArrayList arrayList3 = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    if (!cursorJ2.isNull(iO)) {
                        arrayList = (ArrayList) arrayMap.get(cursorJ2.getString(iO));
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (!cursorJ2.isNull(iO)) {
                        arrayList2 = (ArrayList) arrayMap2.get(cursorJ2.getString(iO));
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    workInfoPojo.f42955n = cursorJ2.getString(iO);
                    workInfoPojo.rl = WorkTypeConverters.Uo(cursorJ2.getInt(iO2));
                    workInfoPojo.f42956t = Data.Uo(cursorJ2.getBlob(iO3));
                    workInfoPojo.nr = cursorJ2.getInt(iO4);
                    workInfoPojo.f42954O = arrayList;
                    workInfoPojo.J2 = arrayList2;
                    arrayList3.add(workInfoPojo);
                }
                this.f42958n.P5();
                cursorJ2.close();
                roomSQLiteQueryUo.release();
                return arrayList3;
            } catch (Throwable th) {
                cursorJ2.close();
                roomSQLiteQueryUo.release();
                throw th;
            }
        } finally {
            this.f42958n.r();
        }
    }
}
