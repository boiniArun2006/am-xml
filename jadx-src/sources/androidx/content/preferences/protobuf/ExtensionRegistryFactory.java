package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class ExtensionRegistryFactory {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Class f37909n = t();

    public static ExtensionRegistryLite n() {
        ExtensionRegistryLite extensionRegistryLiteRl = rl("getEmptyRegistry");
        return extensionRegistryLiteRl != null ? extensionRegistryLiteRl : ExtensionRegistryLite.f37910t;
    }

    private static final ExtensionRegistryLite rl(String str) {
        Class cls = f37909n;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class t() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
