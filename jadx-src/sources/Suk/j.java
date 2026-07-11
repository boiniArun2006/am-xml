package Suk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum j {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0349j f10065n = new C0349j(null);

    /* JADX INFO: renamed from: Suk.j$j, reason: collision with other inner class name */
    public static final class C0349j {
        public /* synthetic */ C0349j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0349j() {
        }

        public final j n(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            return Intrinsics.areEqual(rawValue, "MOBILE_APP_INSTALL") ? j.MOBILE_APP_INSTALL : Intrinsics.areEqual(rawValue, "CUSTOM_APP_EVENTS") ? j.CUSTOM : j.OTHER;
        }
    }
}
