package cb;

import bV.C1666j;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: cb.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface InterfaceC1680j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0592j f43657n = C0592j.f43658n;

    /* JADX INFO: renamed from: cb.j$j, reason: collision with other inner class name */
    public static final class C0592j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0592j f43658n = new C0592j();

        public final InterfaceC1680j n() {
            return new C1666j();
        }

        private C0592j() {
        }
    }

    Object n(Continuation continuation);

    Object rl(String str, Continuation continuation);

    void t(HX.j jVar);
}
