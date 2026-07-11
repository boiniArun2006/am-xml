package xfE;

import Hh.qz;
import aL.C1508w6;
import aL.InterfaceC1507n;
import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Ml {
    private final long J2;
    private final lN.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f75378O;
    private final aC Uo;
    private final Context gh;
    private final InterfaceC1507n mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f75379n;
    private final long nr;
    private final boolean qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qz f75380t;
    private final lN.w6 xMQ;

    class j implements qz {
        j() {
        }

        @Override // Hh.qz
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public File get() {
            Hh.C.Uo(Ml.this.gh);
            return Ml.this.gh.getApplicationContext().getCacheDir();
        }
    }

    public static final class n {
        private long J2;
        private lN.j KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f75382O;
        private aC Uo;
        private boolean gh;
        private InterfaceC1507n mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f75383n;
        private long nr;
        private final Context qie;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private qz f75384t;
        private lN.w6 xMQ;

        private n(Context context) {
            this.f75383n = 1;
            this.rl = "image_cache";
            this.nr = 41943040L;
            this.f75382O = 10485760L;
            this.J2 = 2097152L;
            this.Uo = new w6();
            this.qie = context;
        }

        public Ml ty() {
            return new Ml(this);
        }
    }

    public static n az(Context context) {
        return new n(context);
    }

    public long J2() {
        return this.nr;
    }

    public aC KN() {
        return this.Uo;
    }

    public lN.w6 O() {
        return this.xMQ;
    }

    public InterfaceC1507n Uo() {
        return this.mUb;
    }

    public long gh() {
        return this.J2;
    }

    public long mUb() {
        return this.f75378O;
    }

    public lN.j nr() {
        return this.KN;
    }

    public int qie() {
        return this.f75379n;
    }

    public String rl() {
        return this.rl;
    }

    public qz t() {
        return this.f75380t;
    }

    public boolean xMQ() {
        return this.qie;
    }

    protected Ml(n nVar) {
        boolean z2;
        lN.j jVarRl;
        lN.w6 w6VarKN;
        InterfaceC1507n interfaceC1507nRl;
        Context context = nVar.qie;
        this.gh = context;
        if (nVar.f75384t == null && context == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        Hh.C.mUb(z2, "Either a non-null context or a base directory path or supplier must be provided.");
        if (nVar.f75384t == null && context != null) {
            nVar.f75384t = new j();
        }
        this.f75379n = nVar.f75383n;
        this.rl = (String) Hh.C.Uo(nVar.rl);
        this.f75380t = (qz) Hh.C.Uo(nVar.f75384t);
        this.nr = nVar.nr;
        this.f75378O = nVar.f75382O;
        this.J2 = nVar.J2;
        this.Uo = (aC) Hh.C.Uo(nVar.Uo);
        if (nVar.KN != null) {
            jVarRl = nVar.KN;
        } else {
            jVarRl = lN.Wre.rl();
        }
        this.KN = jVarRl;
        if (nVar.xMQ != null) {
            w6VarKN = nVar.xMQ;
        } else {
            w6VarKN = lN.CN3.KN();
        }
        this.xMQ = w6VarKN;
        if (nVar.mUb != null) {
            interfaceC1507nRl = nVar.mUb;
        } else {
            interfaceC1507nRl = C1508w6.rl();
        }
        this.mUb = interfaceC1507nRl;
        this.qie = nVar.gh;
    }
}
