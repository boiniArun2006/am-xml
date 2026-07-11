package com.google.android.exoplayer2.analytics;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class PlayerId {
    public static final PlayerId UNSET;

    @Nullable
    private final j logSessionIdApi31;

    public PlayerId() {
        this((j) null);
        Assertions.checkState(Util.SDK_INT < 31);
    }

    private static final class j {
        public static final j rl = new j(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final LogSessionId f57566n;

        public j(LogSessionId logSessionId) {
            this.f57566n = logSessionId;
        }
    }

    static {
        UNSET = Util.SDK_INT < 31 ? new PlayerId() : new PlayerId(j.rl);
    }

    @RequiresApi
    public LogSessionId getLogSessionId() {
        return ((j) Assertions.checkNotNull(this.logSessionIdApi31)).f57566n;
    }

    @RequiresApi
    public PlayerId(LogSessionId logSessionId) {
        this(new j(logSessionId));
    }

    private PlayerId(@Nullable j jVar) {
        this.logSessionIdApi31 = jVar;
    }
}
