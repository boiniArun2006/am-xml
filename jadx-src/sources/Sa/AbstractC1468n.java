package Sa;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Sa.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC1468n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final RequestQueue f9784n;

    public static final RequestQueue n() {
        return f9784n;
    }

    static {
        RequestQueue requestQueueNewRequestQueue = Volley.newRequestQueue(IvA.n.rl().getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(requestQueueNewRequestQueue, "newRequestQueue(...)");
        f9784n = requestQueueNewRequestQueue;
    }
}
