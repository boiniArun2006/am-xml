package g4f;

import a88.Pl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class w6 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static w6 f67055t = new w6();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f67056n = new ArrayList();
    private final ArrayList rl = new ArrayList();

    public static w6 O() {
        return f67055t;
    }

    public boolean Uo() {
        return this.rl.size() > 0;
    }

    public Collection n() {
        return Collections.unmodifiableCollection(this.rl);
    }

    public void rl(Pl pl) {
        this.f67056n.add(pl);
    }

    public Collection t() {
        return Collections.unmodifiableCollection(this.f67056n);
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
        this.f67056n.remove(pl);
        this.rl.remove(pl);
        if (zUo && !Uo()) {
            Dsr.nr().J2();
        }
    }
}
