package IvA;

import com.alightcreative.app.motion.AlightMotionApplication;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class C {
    public static void n(AlightMotionApplication alightMotionApplication, kgE.fuX fux) {
        alightMotionApplication.iapManager = fux;
    }

    public static void rl(AlightMotionApplication alightMotionApplication, List list) {
        alightMotionApplication.initializers = list;
    }
}
