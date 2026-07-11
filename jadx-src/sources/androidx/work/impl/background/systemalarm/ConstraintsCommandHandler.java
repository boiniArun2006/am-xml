package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class ConstraintsCommandHandler {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f42848O = Logger.J2("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f42849n;
    public final WorkConstraintsTracker nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SystemAlarmDispatcher f42850t;

    void n() {
        List<WorkSpec> listJ2 = this.f42850t.Uo().HI().GR().J2();
        ConstraintProxy.n(this.f42849n, listJ2);
        this.nr.nr(listJ2);
        ArrayList arrayList = new ArrayList(listJ2.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (WorkSpec workSpec : listJ2) {
            String str = workSpec.f42950n;
            if (jCurrentTimeMillis >= workSpec.n() && (!workSpec.rl() || this.nr.t(str))) {
                arrayList.add(workSpec);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((WorkSpec) it.next()).f42950n;
            Intent intentRl = CommandHandler.rl(this.f42849n, str2);
            Logger.t().n(f42848O, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            SystemAlarmDispatcher systemAlarmDispatcher = this.f42850t;
            systemAlarmDispatcher.gh(new SystemAlarmDispatcher.AddRunnable(systemAlarmDispatcher, intentRl, this.rl));
        }
        this.nr.O();
    }

    public ConstraintsCommandHandler(Context context, int i2, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f42849n = context;
        this.rl = i2;
        this.f42850t = systemAlarmDispatcher;
        this.nr = new WorkConstraintsTracker(context, systemAlarmDispatcher.J2(), null);
    }
}
