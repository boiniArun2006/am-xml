package X4;

import android.graphics.Typeface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j extends Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Typeface f11748n;
    private final InterfaceC0423j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f11749t;

    /* JADX INFO: renamed from: X4.j$j, reason: collision with other inner class name */
    public interface InterfaceC0423j {
        void n(Typeface typeface);
    }

    public void t() {
        this.f11749t = true;
    }

    private void nr(Typeface typeface) {
        if (this.f11749t) {
            return;
        }
        this.rl.n(typeface);
    }

    @Override // X4.Wre
    public void n(int i2) {
        nr(this.f11748n);
    }

    public j(InterfaceC0423j interfaceC0423j, Typeface typeface) {
        this.f11748n = typeface;
        this.rl = interfaceC0423j;
    }

    @Override // X4.Wre
    public void rl(Typeface typeface, boolean z2) {
        nr(typeface);
    }
}
