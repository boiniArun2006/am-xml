package Pr;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7847n;
    private final String rl;

    public j(String privacyPolicyUrl, String str) {
        Intrinsics.checkNotNullParameter(privacyPolicyUrl, "privacyPolicyUrl");
        this.f7847n = privacyPolicyUrl;
        this.rl = str;
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f7847n;
    }

    public /* synthetic */ j(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2);
    }
}
