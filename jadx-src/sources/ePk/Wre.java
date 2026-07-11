package ePk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f63616n = new I28();

    public boolean J2(Exception exc) {
        return this.f63616n.Ik(exc);
    }

    public boolean O() {
        return this.f63616n.ck();
    }

    public boolean Uo(Object obj) {
        return this.f63616n.r(obj);
    }

    public I28 n() {
        return this.f63616n;
    }

    public void nr(Object obj) {
        if (Uo(obj)) {
        } else {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public void rl() {
        if (O()) {
        } else {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void t(Exception exc) {
        if (J2(exc)) {
        } else {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}
