package g4f;

import a88.Pl;
import android.content.Context;
import g4f.Ml;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class j implements Ml.j {
    private static j J2 = new j(new Ml());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f67052O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected K7m.Wre f67053n = new K7m.Wre();
    private Ml nr;
    private Date rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f67054t;

    public static j n() {
        return J2;
    }

    private void nr() {
        if (!this.f67054t || this.rl == null) {
            return;
        }
        Iterator it = w6.O().n().iterator();
        while (it.hasNext()) {
            ((Pl) it.next()).ty().qie(t());
        }
    }

    public void O() {
        Date dateN = this.f67053n.n();
        Date date = this.rl;
        if (date == null || dateN.after(date)) {
            this.rl = dateN;
            nr();
        }
    }

    @Override // g4f.Ml.j
    public void a(boolean z2) {
        if (!this.f67052O && z2) {
            O();
        }
        this.f67052O = z2;
    }

    public void rl(Context context) {
        if (this.f67054t) {
            return;
        }
        this.nr.n(context);
        this.nr.rl(this);
        this.nr.xMQ();
        this.f67052O = this.nr.Uo();
        this.f67054t = true;
    }

    public Date t() {
        Date date = this.rl;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    private j(Ml ml) {
        this.nr = ml;
    }
}
