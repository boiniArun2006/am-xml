package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class KeyFrames {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f35114n;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f35114n.isEmpty()) {
            sb.append("keyFrames:{\n");
            Iterator it = this.f35114n.iterator();
            while (it.hasNext()) {
                sb.append(((Keys) it.next()).toString());
            }
            sb.append("},\n");
        }
        return sb.toString();
    }
}
