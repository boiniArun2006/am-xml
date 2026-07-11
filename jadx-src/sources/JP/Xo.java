package JP;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Xo {
    static final Logger rl = Logger.getLogger(Xo.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Xo f4527t = new Xo();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f4528n = 0;

    public interface j {
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final w6 f4529n;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f4529n = n(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                Xo.rl.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        private static w6 n(AtomicReference atomicReference) {
            try {
                return (w6) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(w6.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                atomicReference.set(e2);
                return new rv6();
            } catch (Exception e3) {
                throw new RuntimeException("Storage override failed to initialize", e3);
            }
        }
    }

    public static abstract class w6 {
        public abstract Xo n();

        public abstract void rl(Xo xo, Xo xo2);

        public abstract Xo t(Xo xo);
    }

    public boolean KN() {
        return false;
    }

    public eO Uo() {
        return null;
    }

    public Throwable t() {
        return null;
    }

    public void xMQ(j jVar) {
    }

    private static void gh(int i2) {
        if (i2 == 1000) {
            rl.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    static w6 mUb() {
        return n.f4529n;
    }

    static Object nr(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public void J2(Xo xo) {
        nr(xo, "toAttach");
        mUb().rl(this, xo);
    }

    public void n(j jVar, Executor executor) {
        nr(jVar, "cancellationListener");
        nr(executor, "executor");
    }

    private Xo() {
        gh(0);
    }

    public static Xo O() {
        Xo xoN = mUb().n();
        if (xoN == null) {
            return f4527t;
        }
        return xoN;
    }

    public Xo rl() {
        Xo xoT = mUb().t(this);
        if (xoT == null) {
            return f4527t;
        }
        return xoT;
    }
}
