package JP;

import com.caoccao.javet.exceptions.JavetError;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class DAz {
    private final Object J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final w6 f4483O;
    private final boolean Uo;
    private final AtomicReferenceArray mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f4484n;
    private final w6 nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f4485t;
    private final boolean xMQ;

    public enum Ml {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean n() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    public static final class n {
        private boolean J2;
        private boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f4491O;
        private Object Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private w6 f4492n;
        private String nr;
        private w6 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Ml f4493t;

        private n() {
        }

        public n J2(Ml ml) {
            this.f4493t = ml;
            return this;
        }

        public n O(boolean z2) {
            this.KN = z2;
            return this;
        }

        public DAz n() {
            return new DAz(this.f4493t, this.nr, this.f4492n, this.rl, this.Uo, this.f4491O, this.J2, this.KN);
        }

        public n nr(w6 w6Var) {
            this.rl = w6Var;
            return this;
        }

        public n rl(String str) {
            this.nr = str;
            return this;
        }

        public n t(w6 w6Var) {
            this.f4492n = w6Var;
            return this;
        }
    }

    public interface w6 {
        InputStream n(Object obj);

        Object rl(InputStream inputStream);
    }

    public static n Uo() {
        return KN(null, null);
    }

    private DAz(Ml ml, String str, w6 w6Var, w6 w6Var2, Object obj, boolean z2, boolean z3, boolean z4) {
        this.mUb = new AtomicReferenceArray(2);
        this.f4484n = (Ml) t1.Xo.ck(ml, "type");
        this.rl = (String) t1.Xo.ck(str, "fullMethodName");
        this.f4485t = n(str);
        this.nr = (w6) t1.Xo.ck(w6Var, "requestMarshaller");
        this.f4483O = (w6) t1.Xo.ck(w6Var2, "responseMarshaller");
        this.J2 = obj;
        this.Uo = z2;
        this.KN = z3;
        this.xMQ = z4;
    }

    public static n KN(w6 w6Var, w6 w6Var2) {
        return new n().t(w6Var).nr(w6Var2);
    }

    public static String n(String str) {
        int iLastIndexOf = ((String) t1.Xo.ck(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf);
    }

    public static String rl(String str, String str2) {
        return ((String) t1.Xo.ck(str, "fullServiceName")) + "/" + ((String) t1.Xo.ck(str2, JavetError.PARAMETER_METHOD_NAME));
    }

    public boolean J2() {
        return this.KN;
    }

    public Ml O() {
        return this.f4484n;
    }

    public InputStream mUb(Object obj) {
        return this.nr.n(obj);
    }

    public String nr() {
        return this.f4485t;
    }

    public String t() {
        return this.rl;
    }

    public Object xMQ(InputStream inputStream) {
        return this.f4483O.rl(inputStream);
    }

    public String toString() {
        return t1.Dsr.t(this).nr("fullMethodName", this.rl).nr("type", this.f4484n).O("idempotent", this.Uo).O("safe", this.KN).O("sampledToLocalTracing", this.xMQ).nr("requestMarshaller", this.nr).nr("responseMarshaller", this.f4483O).nr("schemaDescriptor", this.J2).az().toString();
    }
}
