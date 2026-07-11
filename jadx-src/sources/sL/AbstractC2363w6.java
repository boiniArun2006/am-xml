package sL;

import io.grpc.n;
import java.util.logging.Logger;
import t1.s4;

/* JADX INFO: renamed from: sL.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC2363w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f73210n = Logger.getLogger(AbstractC2363w6.class.getName());
    static boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final n.w6 f73211t;

    /* JADX INFO: renamed from: sL.w6$j */
    enum j {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    static {
        rl = !s4.rl(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f73211t = n.w6.rl("internal-stub-type");
    }
}
