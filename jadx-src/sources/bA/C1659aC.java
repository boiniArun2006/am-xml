package bA;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: bA.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C1659aC extends AbstractC1660fuX implements InterfaceC1654CN3 {
    private Drawable J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f43196r;

    @Override // bA.InterfaceC1656I28, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.J2 = null;
        this.f43196r = true;
    }

    @Override // bA.InterfaceC1654CN3
    public Drawable G7() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.J2;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // bA.InterfaceC1656I28
    public int getHeight() {
        Drawable drawable = this.J2;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // bA.InterfaceC1656I28
    public int getWidth() {
        Drawable drawable = this.J2;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // bA.InterfaceC1656I28
    public boolean isClosed() {
        return this.f43196r;
    }

    public C1659aC(Drawable drawable) {
        this.J2 = drawable;
    }

    @Override // bA.InterfaceC1656I28
    public int getSizeInBytes() {
        return getWidth() * getHeight() * 4;
    }
}
