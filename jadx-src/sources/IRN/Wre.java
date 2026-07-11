package IRN;

import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Wre {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final n f4209t = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final E8K.CN3 f4210n;
    private Ml rl;

    private static final class n implements Ml {
        private n() {
        }

        @Override // IRN.Ml
        public void O(long j2, String str) {
        }

        @Override // IRN.Ml
        public void n() {
        }

        @Override // IRN.Ml
        public void nr() {
        }

        @Override // IRN.Ml
        public String rl() {
            return null;
        }

        @Override // IRN.Ml
        public byte[] t() {
            return null;
        }
    }

    public Wre(E8K.CN3 cn3) {
        this.f4210n = cn3;
        this.rl = f4209t;
    }

    private File nr(String str) {
        return this.f4210n.Ik(str, "userlog");
    }

    void J2(File file, int i2) {
        this.rl = new Dsr(file, i2);
    }

    public final void O(String str) {
        this.rl.n();
        this.rl = f4209t;
        if (str == null) {
            return;
        }
        J2(nr(str), 65536);
    }

    public void Uo(long j2, String str) {
        this.rl.O(j2, str);
    }

    public void n() {
        this.rl.nr();
    }

    public byte[] rl() {
        return this.rl.t();
    }

    public String t() {
        return this.rl.rl();
    }

    public Wre(E8K.CN3 cn3, String str) {
        this(cn3);
        O(str);
    }
}
