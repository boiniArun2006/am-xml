package com.facebook.imageformat;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f52418n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f52417t = new j(null);
    public static final w6 nr = new w6("UNKNOWN", null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public interface n {
        w6 n(byte[] bArr, int i2);

        int rl();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f52418n, w6Var.f52418n) && Intrinsics.areEqual(this.rl, w6Var.rl);
    }

    public int hashCode() {
        int iHashCode = this.f52418n.hashCode() * 31;
        String str = this.rl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public w6(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f52418n = name;
        this.rl = str;
    }

    public final String n() {
        return this.f52418n;
    }

    public String toString() {
        return this.f52418n;
    }
}
