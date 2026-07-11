package Vwv;

import Vwv.n;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class j extends n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected final long f11365O;
    protected final JSONObject nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final HashSet f11366t;

    public j(n.InterfaceC0407n interfaceC0407n, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0407n);
        this.f11366t = new HashSet(hashSet);
        this.nr = jSONObject;
        this.f11365O = j2;
    }
}
