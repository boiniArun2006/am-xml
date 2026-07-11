package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class a0 extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f54102i;

    public static a0 c(Node node) {
        a0 a0Var = new a0();
        super.b(node);
        a0Var.f54102i = w1.a(w1.d(node, "VASTAdTagURI"));
        return a0Var;
    }

    public a0() {
        this.f54140f = 1;
    }
}
