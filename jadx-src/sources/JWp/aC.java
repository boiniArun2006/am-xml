package JWp;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class aC {

    private enum j implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor n() {
        return j.INSTANCE;
    }

    public static Executor rl(Executor executor, int i2) {
        return new o(executor, i2);
    }

    public static Executor t(Executor executor) {
        return new qz(executor);
    }
}
