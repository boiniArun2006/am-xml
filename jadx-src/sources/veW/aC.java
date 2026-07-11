package veW;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class aC {
    static Executor n() {
        return new Pl(Executors.newSingleThreadExecutor());
    }
}
