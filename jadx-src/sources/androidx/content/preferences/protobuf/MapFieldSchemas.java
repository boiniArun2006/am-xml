package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@CheckReturnValue
final class MapFieldSchemas {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final MapFieldSchema f38088n = t();
    private static final MapFieldSchema rl = new MapFieldSchemaLite();

    static MapFieldSchema n() {
        return f38088n;
    }

    static MapFieldSchema rl() {
        return rl;
    }

    private static MapFieldSchema t() {
        if (Protobuf.nr) {
            return null;
        }
        try {
            return (MapFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
