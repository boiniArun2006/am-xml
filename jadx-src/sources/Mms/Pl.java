package Mms;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g9s f6714n;
    private boolean rl;

    public void Ik() {
    }

    public void ck() {
    }

    public void nr() {
        this.rl = false;
    }

    public void rl() {
        this.rl = true;
    }

    public void t() {
        this.rl = false;
    }

    public Pl(g9s writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f6714n = writer;
        this.rl = true;
    }

    protected final void HI(boolean z2) {
        this.rl = z2;
    }

    public final void J2(char c2) {
        this.f6714n.n(c2);
    }

    public void KN(float f3) {
        this.f6714n.t(String.valueOf(f3));
    }

    public void O(byte b2) {
        this.f6714n.writeLong(b2);
    }

    public void Uo(double d2) {
        this.f6714n.t(String.valueOf(d2));
    }

    public void az(boolean z2) {
        this.f6714n.t(String.valueOf(z2));
    }

    public final void gh(String v2) {
        Intrinsics.checkNotNullParameter(v2, "v");
        this.f6714n.t(v2);
    }

    public void mUb(long j2) {
        this.f6714n.writeLong(j2);
    }

    public final boolean n() {
        return this.rl;
    }

    public void qie(short s2) {
        this.f6714n.writeLong(s2);
    }

    public void ty(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6714n.rl(value);
    }

    public void xMQ(int i2) {
        this.f6714n.writeLong(i2);
    }
}
