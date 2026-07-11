package TD;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w6 {
    private static final w6 rl = new w6();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f10230t = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Queue f10231n = new ArrayBlockingQueue(20);

    public enum j {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    public static w6 n() {
        return f10230t ? new w6() : rl;
    }

    public void rl(j jVar) {
        if (f10230t) {
            for (int i2 = 5; !this.f10231n.offer(jVar) && i2 > 0; i2--) {
                this.f10231n.poll();
            }
        }
    }

    public String toString() {
        return this.f10231n.toString();
    }

    private w6() {
    }
}
