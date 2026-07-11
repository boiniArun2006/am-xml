package com.alightcreative.app.motion.activities;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f45708n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final QYU.j f45709t;

    public w6O(int i2, String label, QYU.j jVar) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f45708n = i2;
        this.rl = label;
        this.f45709t = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6O)) {
            return false;
        }
        w6O w6o = (w6O) obj;
        return this.f45708n == w6o.f45708n && Intrinsics.areEqual(this.rl, w6o.rl) && this.f45709t == w6o.f45709t;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f45708n) * 31) + this.rl.hashCode()) * 31;
        QYU.j jVar = this.f45709t;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "ResolutionUIModel(shortDimension=" + this.f45708n + ", label=" + this.rl + ", badge=" + this.f45709t + ")";
    }

    public final QYU.j n() {
        return this.f45709t;
    }

    public final String rl() {
        return this.rl;
    }

    public final int t() {
        return this.f45708n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ w6O(int i2, String str, QYU.j jVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            str = i2 + TtmlNode.TAG_P;
        }
        this(i2, str, (i3 & 4) != 0 ? null : jVar);
    }
}
