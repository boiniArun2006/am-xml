package QVk;

import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface n {

    public static final class j {
        public static final C0286j ty = new C0286j(null);
        public Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public Map f8218O;
        public Uri Uo;
        public boolean az;
        public Float gh;
        public Object mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Map f8219n;
        public Map nr;
        public Float qie;
        public Map rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Map f8220t;
        public int KN = -1;
        public int xMQ = -1;

        /* JADX INFO: renamed from: QVk.n$j$j, reason: collision with other inner class name */
        public static final class C0286j {
            public /* synthetic */ C0286j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0286j() {
            }
        }
    }

    void T(String str);

    void Uo(String str, j jVar);

    void Z(String str, Object obj, j jVar);

    void jB(String str, Object obj, j jVar);

    void n(String str, Object obj);

    void rl(String str, Throwable th, j jVar);
}
