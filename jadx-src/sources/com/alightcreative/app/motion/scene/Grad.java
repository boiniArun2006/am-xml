package com.alightcreative.app.motion.scene;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/alightcreative/app/motion/scene/Grad;", "", "x", "", "y", "z", "w", "<init>", "(DDDD)V", "getX", "()D", "setX", "(D)V", "getY", "setY", "getZ", "setZ", "getW", "setW", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class Grad {
    private double w;
    private double x;
    private double y;
    private double z;

    public Grad(double d2, double d4, double d5, double d6) {
        this.x = d2;
        this.y = d4;
        this.z = d5;
        this.w = d6;
    }

    public static /* synthetic */ Grad copy$default(Grad grad, double d2, double d4, double d5, double d6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = grad.x;
        }
        double d7 = d2;
        if ((i2 & 2) != 0) {
            d4 = grad.y;
        }
        double d8 = d4;
        if ((i2 & 4) != 0) {
            d5 = grad.z;
        }
        return grad.copy(d7, d8, d5, (i2 & 8) != 0 ? grad.w : d6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getW() {
        return this.w;
    }

    public final Grad copy(double x2, double y2, double z2, double w2) {
        return new Grad(x2, y2, z2, w2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Grad)) {
            return false;
        }
        Grad grad = (Grad) other;
        return Double.compare(this.x, grad.x) == 0 && Double.compare(this.y, grad.y) == 0 && Double.compare(this.z, grad.z) == 0 && Double.compare(this.w, grad.w) == 0;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.x) * 31) + Double.hashCode(this.y)) * 31) + Double.hashCode(this.z)) * 31) + Double.hashCode(this.w);
    }

    public String toString() {
        return "Grad(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", w=" + this.w + ")";
    }

    public final double getW() {
        return this.w;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final double getZ() {
        return this.z;
    }

    public final void setW(double d2) {
        this.w = d2;
    }

    public final void setX(double d2) {
        this.x = d2;
    }

    public final void setY(double d2) {
        this.y = d2;
    }

    public final void setZ(double d2) {
        this.z = d2;
    }

    public /* synthetic */ Grad(double d2, double d4, double d5, double d6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, d4, d5, (i2 & 8) != 0 ? 0.0d : d6);
    }
}
