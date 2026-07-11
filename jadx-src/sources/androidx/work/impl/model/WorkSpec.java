package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.room.Entity;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Entity
@RestrictTo
public final class WorkSpec {
    public long HI;
    public boolean Ik;
    public Data J2;
    public long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Data f42949O;
    public long Uo;
    public long az;
    public long ck;
    public int gh;
    public Constraints mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f42950n;
    public String nr;
    public BackoffPolicy qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public OutOfQuotaPolicy f42951r;
    public WorkInfo.State rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f42952t;
    public long ty;
    public long xMQ;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f42948o = Logger.J2("WorkSpec");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Function f42947Z = new Function<List<WorkInfoPojo>, List<WorkInfo>>() { // from class: androidx.work.impl.model.WorkSpec.1
        @Override // androidx.arch.core.util.Function
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List apply(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((WorkInfoPojo) it.next()).n());
            }
            return arrayList;
        }
    };

    public static class IdAndState {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f42953n;
        public WorkInfo.State rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            if (this.rl != idAndState.rl) {
                return false;
            }
            return this.f42953n.equals(idAndState.f42953n);
        }

        public int hashCode() {
            return (this.f42953n.hashCode() * 31) + this.rl.hashCode();
        }
    }

    public static class WorkInfoPojo {
        public List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public List f42954O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f42955n;
        public int nr;
        public WorkInfo.State rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Data f42956t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            if (this.nr != workInfoPojo.nr) {
                return false;
            }
            String str = this.f42955n;
            if (str == null ? workInfoPojo.f42955n != null : !str.equals(workInfoPojo.f42955n)) {
                return false;
            }
            if (this.rl != workInfoPojo.rl) {
                return false;
            }
            Data data = this.f42956t;
            if (data == null ? workInfoPojo.f42956t != null : !data.equals(workInfoPojo.f42956t)) {
                return false;
            }
            List list = this.f42954O;
            if (list == null ? workInfoPojo.f42954O != null : !list.equals(workInfoPojo.f42954O)) {
                return false;
            }
            List list2 = this.J2;
            List list3 = workInfoPojo.J2;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f42955n;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            WorkInfo.State state = this.rl;
            int iHashCode2 = (iHashCode + (state != null ? state.hashCode() : 0)) * 31;
            Data data = this.f42956t;
            int iHashCode3 = (((iHashCode2 + (data != null ? data.hashCode() : 0)) * 31) + this.nr) * 31;
            List list = this.f42954O;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List list2 = this.J2;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }

        public WorkInfo n() {
            List list = this.J2;
            return new WorkInfo(UUID.fromString(this.f42955n), this.rl, this.f42956t, this.f42954O, (list == null || list.isEmpty()) ? Data.f42715t : (Data) this.J2.get(0), this.nr);
        }
    }

    public WorkSpec(String str, String str2) {
        this.rl = WorkInfo.State.ENQUEUED;
        Data data = Data.f42715t;
        this.f42949O = data;
        this.J2 = data;
        this.mUb = Constraints.xMQ;
        this.qie = BackoffPolicy.EXPONENTIAL;
        this.az = 30000L;
        this.ck = -1L;
        this.f42951r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f42950n = str;
        this.f42952t = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && WorkSpec.class == obj.getClass()) {
            WorkSpec workSpec = (WorkSpec) obj;
            if (this.Uo != workSpec.Uo || this.KN != workSpec.KN || this.xMQ != workSpec.xMQ || this.gh != workSpec.gh || this.az != workSpec.az || this.ty != workSpec.ty || this.HI != workSpec.HI || this.ck != workSpec.ck || this.Ik != workSpec.Ik || !this.f42950n.equals(workSpec.f42950n) || this.rl != workSpec.rl || !this.f42952t.equals(workSpec.f42952t)) {
                return false;
            }
            String str = this.nr;
            if (str == null ? workSpec.nr != null : !str.equals(workSpec.nr)) {
                return false;
            }
            if (this.f42949O.equals(workSpec.f42949O) && this.J2.equals(workSpec.J2) && this.mUb.equals(workSpec.mUb) && this.qie == workSpec.qie && this.f42951r == workSpec.f42951r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f42950n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f42952t.hashCode()) * 31;
        String str = this.nr;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f42949O.hashCode()) * 31) + this.J2.hashCode()) * 31;
        long j2 = this.Uo;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.KN;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.xMQ;
        int iHashCode3 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.mUb.hashCode()) * 31) + this.gh) * 31) + this.qie.hashCode()) * 31;
        long j5 = this.az;
        int i5 = (iHashCode3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.ty;
        int i7 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.HI;
        int i8 = (i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j9 = this.ck;
        return ((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.Ik ? 1 : 0)) * 31) + this.f42951r.hashCode();
    }

    public boolean nr() {
        return this.KN != 0;
    }

    public boolean rl() {
        return !Constraints.xMQ.equals(this.mUb);
    }

    public boolean t() {
        return this.rl == WorkInfo.State.ENQUEUED && this.gh > 0;
    }

    public String toString() {
        return "{WorkSpec: " + this.f42950n + "}";
    }

    public long n() {
        long j2;
        long jScalb;
        if (t()) {
            if (this.qie == BackoffPolicy.LINEAR) {
                jScalb = this.az * ((long) this.gh);
            } else {
                jScalb = (long) Math.scalb(this.az, this.gh - 1);
            }
            return this.ty + Math.min(18000000L, jScalb);
        }
        long j3 = 0;
        if (nr()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j4 = this.ty;
            if (j4 == 0) {
                j2 = jCurrentTimeMillis + this.Uo;
            } else {
                j2 = j4;
            }
            long j5 = this.xMQ;
            long j6 = this.KN;
            if (j5 != j6) {
                if (j4 == 0) {
                    j3 = j5 * (-1);
                }
                return j2 + j6 + j3;
            }
            if (j4 != 0) {
                j3 = j6;
            }
            return j2 + j3;
        }
        long jCurrentTimeMillis2 = this.ty;
        if (jCurrentTimeMillis2 == 0) {
            jCurrentTimeMillis2 = System.currentTimeMillis();
        }
        return jCurrentTimeMillis2 + this.Uo;
    }

    public WorkSpec(WorkSpec workSpec) {
        this.rl = WorkInfo.State.ENQUEUED;
        Data data = Data.f42715t;
        this.f42949O = data;
        this.J2 = data;
        this.mUb = Constraints.xMQ;
        this.qie = BackoffPolicy.EXPONENTIAL;
        this.az = 30000L;
        this.ck = -1L;
        this.f42951r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f42950n = workSpec.f42950n;
        this.f42952t = workSpec.f42952t;
        this.rl = workSpec.rl;
        this.nr = workSpec.nr;
        this.f42949O = new Data(workSpec.f42949O);
        this.J2 = new Data(workSpec.J2);
        this.Uo = workSpec.Uo;
        this.KN = workSpec.KN;
        this.xMQ = workSpec.xMQ;
        this.mUb = new Constraints(workSpec.mUb);
        this.gh = workSpec.gh;
        this.qie = workSpec.qie;
        this.az = workSpec.az;
        this.ty = workSpec.ty;
        this.HI = workSpec.HI;
        this.ck = workSpec.ck;
        this.Ik = workSpec.Ik;
        this.f42951r = workSpec.f42951r;
    }
}
