package Dzy;

import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class n implements w6 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f2093t = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f2094n = "unknown";
    private int rl = 5;

    @Override // Dzy.w6
    public void J2(String str, String str2, Throwable th) {
        az(6, str, str2, th);
    }

    @Override // Dzy.w6
    public void O(String str, String str2) {
        qie(3, str, str2);
    }

    @Override // Dzy.w6
    public void d(String str, String str2, Throwable th) {
        az(3, str, str2, th);
    }

    @Override // Dzy.w6
    public void e(String str, String str2, Throwable th) {
        az(6, str, str2, th);
    }

    @Override // Dzy.w6
    public void n(String str, String str2) {
        qie(5, str, str2);
    }

    @Override // Dzy.w6
    public void nr(String str, String str2) {
        qie(6, str, str2);
    }

    @Override // Dzy.w6
    public void rl(String str, String str2) {
        qie(6, str, str2);
    }

    @Override // Dzy.w6
    public void t(String str, String str2) {
        qie(2, str, str2);
    }

    @Override // Dzy.w6
    public void w(String str, String str2, Throwable th) {
        az(5, str, str2, th);
    }

    public static n KN() {
        return f2093t;
    }

    private String gh(String str) {
        if (this.f2094n == null) {
            return str;
        }
        return this.f2094n + ":" + str;
    }

    private static String mUb(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    private static String xMQ(String str, Throwable th) {
        return str + '\n' + mUb(th);
    }

    @Override // Dzy.w6
    public boolean Uo(int i2) {
        return this.rl <= i2;
    }

    private n() {
    }

    private void az(int i2, String str, String str2, Throwable th) {
        Log.println(i2, gh(str), xMQ(str2, th));
    }

    private void qie(int i2, String str, String str2) {
        Log.println(i2, gh(str), str2);
    }
}
