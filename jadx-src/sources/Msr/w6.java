package Msr;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public enum w6 {
    FAILED_INIT_ENCRYPTION("failed to init encryption"),
    FAILED_EXTRACT_ENCRYPTED_DATA("failed to extract encrypted data"),
    FAILED_STORE_ENCRYPTED_DATA("failed to store encrypted data"),
    IGNITE_SERVICE_UNAVAILABLE("Ignite service unavailable"),
    IGNITE_SERVICE_INVALID_SESSION("Invalid session token"),
    ONE_DT_EMPTY_ENTITY("received empty one dt from the service"),
    ONE_DT_AUTHENTICATOR_DESTROYED("authenticator already destroyed");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f6785g = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6789n;

    static {
        for (w6 w6Var : values()) {
            f6785g.put(w6Var.f6789n, w6Var);
        }
    }

    public final String n() {
        return this.f6789n;
    }

    w6(String str) {
        this.f6789n = str;
    }
}
