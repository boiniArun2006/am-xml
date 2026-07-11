package stX;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f73349n;
    private final String rl;

    public /* synthetic */ I28(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str);
    }

    public abstract CN3 n(Object obj, CharSequence charSequence, int i2, int i3);

    private I28(Integer num, String str) {
        this.f73349n = num;
        this.rl = str;
    }

    public Integer rl() {
        return this.f73349n;
    }

    public final String t() {
        return this.rl;
    }
}
