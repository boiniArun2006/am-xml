package androidx.webkit.internal;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class ApiFeature implements ConditionallySupportedFeature {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f42501t = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f42502n;
    private final String rl;

    private static class LAZY_HOLDER {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Set f42503n = new HashSet(Arrays.asList(WebViewGlueCommunicator.nr().n()));
    }

    public static class O extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean rl() {
            return Build.VERSION.SDK_INT >= 26;
        }

        O(String str, String str2) {
            super(str, str2);
        }
    }

    public static class O_MR1 extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean rl() {
            return Build.VERSION.SDK_INT >= 27;
        }

        O_MR1(String str, String str2) {
            super(str, str2);
        }
    }

    public static class P extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean rl() {
            return Build.VERSION.SDK_INT >= 28;
        }

        P(String str, String str2) {
            super(str, str2);
        }
    }

    public static class Q extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean rl() {
            return Build.VERSION.SDK_INT >= 29;
        }

        Q(String str, String str2) {
            super(str, str2);
        }
    }

    public static class T extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean rl() {
            return Build.VERSION.SDK_INT >= 33;
        }

        T(String str, String str2) {
            super(str, str2);
        }
    }

    public abstract boolean rl();

    public static class M extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean rl() {
            return true;
        }

        M(String str, String str2) {
            super(str, str2);
        }
    }

    public static class N extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean rl() {
            return true;
        }

        N(String str, String str2) {
            super(str, str2);
        }
    }

    public static class NoFramework extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean rl() {
            return false;
        }

        NoFramework(String str, String str2) {
            super(str, str2);
        }
    }

    public static Set nr() {
        return Collections.unmodifiableSet(f42501t);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public String n() {
        return this.f42502n;
    }

    public boolean t() {
        return SuF.j.rl(LAZY_HOLDER.f42503n, this.rl);
    }

    ApiFeature(String str, String str2) {
        this.f42502n = str;
        this.rl = str2;
        f42501t.add(this);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
        if (!rl() && !t()) {
            return false;
        }
        return true;
    }
}
