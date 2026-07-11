package lt;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sJa.w6;
import wRz.n;

/* JADX INFO: renamed from: lt.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface InterfaceC2271j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1050j f70573n = C1050j.f70574n;

    /* JADX INFO: renamed from: lt.j$j, reason: collision with other inner class name */
    public static final class C1050j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C1050j f70574n = new C1050j();

        public final InterfaceC2271j n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new n(tVM.j.f73471n.n(context), w6.rl);
        }

        private C1050j() {
        }
    }

    void n();

    Object rl(Continuation continuation);
}
