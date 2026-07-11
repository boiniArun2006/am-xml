package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@CheckReturnValue
final class ListFieldSchemas {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ListFieldSchema f38074n = t();
    private static final ListFieldSchema rl = new ListFieldSchemaLite();

    static ListFieldSchema n() {
        return f38074n;
    }

    static ListFieldSchema rl() {
        return rl;
    }

    private static ListFieldSchema t() {
        if (Protobuf.nr) {
            return null;
        }
        try {
            return (ListFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
