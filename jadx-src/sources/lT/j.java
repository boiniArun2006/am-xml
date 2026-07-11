package lT;

import UnP.w6;
import android.graphics.Bitmap;
import f6d.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j implements j.InterfaceC0917j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f70436n;

    public j(w6 w6Var) {
        this(w6Var, null);
    }

    @Override // f6d.j.InterfaceC0917j
    public void J2(int[] iArr) {
    }

    @Override // f6d.j.InterfaceC0917j
    public void O(byte[] bArr) {
    }

    public j(w6 w6Var, UnP.j jVar) {
        this.f70436n = w6Var;
    }

    @Override // f6d.j.InterfaceC0917j
    public void n(Bitmap bitmap) {
        this.f70436n.n(bitmap);
    }

    @Override // f6d.j.InterfaceC0917j
    public int[] nr(int i2) {
        return new int[i2];
    }

    @Override // f6d.j.InterfaceC0917j
    public byte[] rl(int i2) {
        return new byte[i2];
    }

    @Override // f6d.j.InterfaceC0917j
    public Bitmap t(int i2, int i3, Bitmap.Config config) {
        return this.f70436n.t(i2, i3, config);
    }
}
