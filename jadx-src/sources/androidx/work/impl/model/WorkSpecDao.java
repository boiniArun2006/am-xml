package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Dao
public interface WorkSpecDao {
    int HI();

    List Ik(String str);

    List J2();

    WorkSpec.WorkInfoPojo KN(String str);

    void O(WorkSpec workSpec);

    boolean S();

    List Uo(String str);

    int ViF(String str);

    int WPU(String str);

    List XQ();

    List Z();

    List aYN(String str);

    List az(String str);

    int ck(String str, long j2);

    List g(List list);

    List gh(String str);

    WorkSpec mUb(String str);

    void n(String str);

    void nY(String str, long j2);

    List nr(long j2);

    void o(String str, Data data);

    List qie(String str);

    List r(int i2);

    int rl(WorkInfo.State state, String... strArr);

    void t();

    List ty(int i2);

    WorkInfo.State xMQ(String str);
}
