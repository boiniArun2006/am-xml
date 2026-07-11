package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class p extends g {
    public static p c(Node node) {
        p pVar = new p();
        super.b(node);
        w1.a(w1.d(node, "AdTitle"));
        w1.a(w1.d(node, "Description"));
        return pVar;
    }
}
