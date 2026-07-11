package androidx.content.preferences.protobuf;

import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class RuntimeVersion {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RuntimeDomain f38134n;
    private static final Logger nr;
    public static final RuntimeDomain rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f38135t;

    public static final class ProtobufRuntimeVersionException extends RuntimeException {
    }

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        f38134n = runtimeDomain;
        rl = runtimeDomain;
        f38135t = n(4, 28, 2, "");
        nr = Logger.getLogger(RuntimeVersion.class.getName());
    }

    private static String n(int i2, int i3, int i5, String str) {
        return String.format("%d.%d.%d%s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5), str);
    }
}
