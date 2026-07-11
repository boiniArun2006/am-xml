package Mms;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Q extends Pl {
    private int nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final kotlinx.serialization.json.n f6715t;

    @Override // Mms.Pl
    public void rl() {
        HI(true);
        this.nr++;
    }

    @Override // Mms.Pl
    public void t() {
        HI(false);
        gh("\n");
        int i2 = this.nr;
        for (int i3 = 0; i3 < i2; i3++) {
            gh(this.f6715t.O().ty());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(g9s writer, kotlinx.serialization.json.n json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f6715t = json;
    }

    @Override // Mms.Pl
    public void Ik() {
        this.nr--;
    }

    @Override // Mms.Pl
    public void ck() {
        J2(' ');
    }

    @Override // Mms.Pl
    public void nr() {
        if (n()) {
            HI(false);
        } else {
            t();
        }
    }
}
