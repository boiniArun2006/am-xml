package AVk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class j implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f80n;
    private final Ml[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f81t;

    @Override // AVk.Ml
    public StackTraceElement[] n(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f80n) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrN = stackTraceElementArr;
        for (Ml ml : this.rl) {
            if (stackTraceElementArrN.length <= this.f80n) {
                break;
            }
            stackTraceElementArrN = ml.n(stackTraceElementArr);
        }
        return stackTraceElementArrN.length > this.f80n ? this.f81t.n(stackTraceElementArrN) : stackTraceElementArrN;
    }

    public j(int i2, Ml... mlArr) {
        this.f80n = i2;
        this.rl = mlArr;
        this.f81t = new n(i2);
    }
}
