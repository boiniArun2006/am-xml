package gVA;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f67567n = Logger.getLogger(n.class.getName());
    private static final AtomicBoolean rl = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gVA.n$n, reason: collision with other inner class name */
    public static abstract class EnumC0945n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ EnumC0945n[] f67568O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final EnumC0945n f67569n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final EnumC0945n f67570t;

        private EnumC0945n(String str, int i2) {
        }

        public abstract boolean n();

        /* JADX INFO: renamed from: gVA.n$n$j */
        enum j extends EnumC0945n {
            j(String str, int i2) {
                super(str, i2);
            }

            @Override // gVA.n.EnumC0945n
            public boolean n() {
                return !n.t();
            }
        }

        /* JADX INFO: renamed from: gVA.n$n$n, reason: collision with other inner class name */
        enum C0946n extends EnumC0945n {
            C0946n(String str, int i2) {
                super(str, i2);
            }

            @Override // gVA.n.EnumC0945n
            public boolean n() {
                if (n.t() && !n.rl()) {
                    return false;
                }
                return true;
            }
        }

        static {
            j jVar = new j("ALGORITHM_NOT_FIPS", 0);
            f67569n = jVar;
            C0946n c0946n = new C0946n("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f67570t = c0946n;
            f67568O = new EnumC0945n[]{jVar, c0946n};
        }

        public static EnumC0945n valueOf(String str) {
            return (EnumC0945n) Enum.valueOf(EnumC0945n.class, str);
        }

        public static EnumC0945n[] values() {
            return (EnumC0945n[]) f67568O.clone();
        }
    }

    static Boolean n() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f67567n.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean rl() {
        return n().booleanValue();
    }

    public static boolean t() {
        if (!gVA.j.n() && !rl.get()) {
            return false;
        }
        return true;
    }
}
