package Jv;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface n {
    @Hh.Ml
    long nowNanos();

    @Hh.Ml
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }
}
