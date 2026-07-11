package AVk;

import java.util.Stack;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f78n;
    public final I28 nr;
    public final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StackTraceElement[] f79t;

    public static I28 n(Throwable th, Ml ml) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        I28 i28 = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            i28 = new I28(th2.getLocalizedMessage(), th2.getClass().getName(), ml.n(th2.getStackTrace()), i28);
        }
        return i28;
    }

    private I28(String str, String str2, StackTraceElement[] stackTraceElementArr, I28 i28) {
        this.f78n = str;
        this.rl = str2;
        this.f79t = stackTraceElementArr;
        this.nr = i28;
    }
}
