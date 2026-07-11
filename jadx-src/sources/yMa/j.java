package yMa;

import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile j f75596t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f75597n;
    private boolean rl;

    public j(w6 w6Var) {
        this.rl = false;
        this.f75597n = w6Var == null ? w6.t() : w6Var;
    }

    public static j O() {
        if (f75596t == null) {
            synchronized (j.class) {
                try {
                    if (f75596t == null) {
                        f75596t = new j();
                    }
                } finally {
                }
            }
        }
        return f75596t;
    }

    public void J2(String str) {
        if (this.rl) {
            this.f75597n.nr(str);
        }
    }

    public boolean KN() {
        return this.rl;
    }

    public void Uo(String str, Object... objArr) {
        if (this.rl) {
            this.f75597n.nr(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void gh(String str, Object... objArr) {
        if (this.rl) {
            this.f75597n.O(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void mUb(String str) {
        if (this.rl) {
            this.f75597n.O(str);
        }
    }

    public void n(String str) {
        if (this.rl) {
            this.f75597n.n(str);
        }
    }

    public void nr(String str, Object... objArr) {
        if (this.rl) {
            this.f75597n.rl(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void rl(String str, Object... objArr) {
        if (this.rl) {
            this.f75597n.n(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void t(String str) {
        if (this.rl) {
            this.f75597n.rl(str);
        }
    }

    public void xMQ(boolean z2) {
        this.rl = z2;
    }

    private j() {
        this(null);
    }
}
