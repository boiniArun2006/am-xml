package mCM;

import android.content.Context;
import java.util.concurrent.Executor;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC2342j f70655O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f70656n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f70657t;

    public static Pl n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        return new Pl(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4, interfaceC2342j5);
    }

    public static com.google.firebase.functions.n t(Context context, String str, String str2, j jVar, Executor executor, Executor executor2) {
        return new com.google.firebase.functions.n(context, str, str2, jVar, executor, executor2);
    }

    public com.google.firebase.functions.n rl(String str) {
        return t((Context) this.f70656n.get(), (String) this.rl.get(), str, (j) this.f70657t.get(), (Executor) this.nr.get(), (Executor) this.f70655O.get());
    }

    public Pl(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        this.f70656n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f70657t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
        this.f70655O = interfaceC2342j5;
    }
}
