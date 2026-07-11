package Hh;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Xo {
    public static void rl(Throwable th, Class cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void t(Throwable th) throws Throwable {
        rl(th, Error.class);
        rl(th, RuntimeException.class);
    }

    public static RuntimeException n(Throwable th) throws Throwable {
        t((Throwable) C.Uo(th));
        throw new RuntimeException(th);
    }
}
