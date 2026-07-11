package AVk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class n implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f82n;

    @Override // AVk.Ml
    public StackTraceElement[] n(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i2 = this.f82n;
        if (length <= i2) {
            return stackTraceElementArr;
        }
        int i3 = i2 / 2;
        int i5 = i2 - i3;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i2];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i5);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i3, stackTraceElementArr2, i5, i3);
        return stackTraceElementArr2;
    }

    public n(int i2) {
        this.f82n = i2;
    }
}
