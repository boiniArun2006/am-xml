package com.alightcreative.app.motion.activities;

import com.alightcreative.app.motion.scene.SolidColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class FKk {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SolidColor f44531n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FKk)) {
            return false;
        }
        FKk fKk = (FKk) obj;
        return Intrinsics.areEqual(this.f44531n, fKk.f44531n) && Intrinsics.areEqual(this.rl, fKk.rl);
    }

    public int hashCode() {
        return (this.f44531n.hashCode() * 31) + this.rl.hashCode();
    }

    public String toString() {
        return "ColorUIModel(color=" + this.f44531n + ", label=" + this.rl + ")";
    }

    public FKk(SolidColor color, String label) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f44531n = color;
        this.rl = label;
    }

    public final SolidColor n() {
        return this.f44531n;
    }

    public final String rl() {
        return this.rl;
    }
}
