package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class w6 implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f52614n = false;

    public static boolean az(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static int gh(boolean z2) {
        return z2 ? 1 : 0;
    }

    public static boolean nr(int i2) {
        return (i2 & 1) == 1;
    }

    public static boolean qie(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public static int ty(int i2, int i3) {
        return i2 & (~i3);
    }

    protected abstract void J2();

    protected abstract void KN(Object obj, int i2);

    protected abstract void Uo(Throwable th);

    @Override // com.facebook.imagepipeline.producers.Pl
    public synchronized void n() {
        if (this.f52614n) {
            return;
        }
        this.f52614n = true;
        try {
            J2();
        } catch (Exception e2) {
            mUb(e2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Pl
    public synchronized void onFailure(Throwable th) {
        if (this.f52614n) {
            return;
        }
        this.f52614n = true;
        try {
            Uo(th);
        } catch (Exception e2) {
            mUb(e2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Pl
    public synchronized void rl(Object obj, int i2) {
        if (this.f52614n) {
            return;
        }
        this.f52614n = nr(i2);
        try {
            KN(obj, i2);
        } catch (Exception e2) {
            mUb(e2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Pl
    public synchronized void t(float f3) {
        if (this.f52614n) {
            return;
        }
        try {
            xMQ(f3);
        } catch (Exception e2) {
            mUb(e2);
        }
    }

    protected abstract void xMQ(float f3);

    public static boolean O(int i2) {
        return !nr(i2);
    }

    protected void mUb(Exception exc) {
        Dzy.j.nY(getClass(), "unhandled exception", exc);
    }
}
