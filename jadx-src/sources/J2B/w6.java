package J2B;

import Vy.Pl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class w6 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static w6 f4434t = new w6();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f4435n = new ArrayList();
    private final ArrayList rl = new ArrayList();

    public static w6 O() {
        return f4434t;
    }

    public boolean Uo() {
        return this.rl.size() > 0;
    }

    public Collection n() {
        return Collections.unmodifiableCollection(this.rl);
    }

    public void rl(Pl pl) {
        this.f4435n.add(pl);
    }

    public Collection t() {
        return Collections.unmodifiableCollection(this.f4435n);
    }

    private w6() {
    }

    public void J2(Pl pl) {
        boolean zUo = Uo();
        this.rl.add(pl);
        if (!zUo) {
            Dsr.nr().O();
        }
    }

    public void nr(Pl pl) {
        boolean zUo = Uo();
        this.f4435n.remove(pl);
        this.rl.remove(pl);
        if (zUo && !Uo()) {
            Dsr.nr().J2();
        }
    }
}
