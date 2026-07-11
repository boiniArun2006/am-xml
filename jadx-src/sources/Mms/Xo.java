package Mms;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Xo extends Pl {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f6717t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xo(g9s writer, boolean z2) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f6717t = z2;
    }

    @Override // Mms.Pl
    public void ty(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f6717t) {
            super.ty(value);
        } else {
            super.gh(value);
        }
    }
}
