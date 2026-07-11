package Ej;

import Ej.n;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j extends n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected final long f2359O;
    protected final JSONObject nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final HashSet f2360t;

    public j(n.InterfaceC0084n interfaceC0084n, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0084n);
        this.f2360t = new HashSet(hashSet);
        this.nr = jSONObject;
        this.f2359O = j2;
    }
}
