package com.fyber.inneractive.sdk.model.vast;

import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.fyber.inneractive.sdk.util.w1;
import java.util.ArrayList;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f54176b;

    public static u a(Node node) {
        f fVar;
        u uVar = new u();
        uVar.f54175a = w1.b(node, NodeModuleProcess.PROPERTY_VERSION);
        ArrayList<Node> arrayListC = w1.c(node, "Ad");
        if (!arrayListC.isEmpty()) {
            uVar.f54176b = new ArrayList();
            for (Node node2 : arrayListC) {
                if (node2 == null) {
                    fVar = null;
                } else {
                    f fVar2 = new f();
                    fVar2.f54132a = w1.b(node2, "id");
                    Node nodeD = w1.d(node2, "Wrapper");
                    if (nodeD != null) {
                        fVar2.f54133b = a0.c(nodeD);
                    }
                    Node nodeD2 = w1.d(node2, "InLine");
                    if (nodeD2 != null) {
                        fVar2.f54134c = p.c(nodeD2);
                    }
                    fVar = fVar2;
                }
                uVar.f54176b.add(fVar);
            }
        }
        return uVar;
    }

    public final String toString() {
        return new StringBuilder("Vast: version - " + this.f54175a + "\nAds: ").toString();
    }
}
