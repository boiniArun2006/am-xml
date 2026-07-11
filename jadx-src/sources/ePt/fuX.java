package ePt;

import android.content.Context;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX implements lK3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f63638n;

    public static fuX n(InterfaceC2342j interfaceC2342j) {
        return new fuX(interfaceC2342j);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public String get() {
        return t((Context) this.f63638n.get());
    }

    public fuX(InterfaceC2342j interfaceC2342j) {
        this.f63638n = interfaceC2342j;
    }

    public static String t(Context context) {
        return (String) lK3.Ml.nr(Wre.rl(context));
    }
}
