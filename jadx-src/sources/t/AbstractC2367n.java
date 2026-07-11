package t;

/* JADX INFO: renamed from: t.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC2367n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f73388n = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement rl(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f73388n + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
