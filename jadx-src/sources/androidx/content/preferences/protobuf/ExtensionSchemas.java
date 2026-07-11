package androidx.content.preferences.protobuf;

import androidx.media3.database.Kr.FlTC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@CheckReturnValue
final class ExtensionSchemas {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ExtensionSchema f37915n = new ExtensionSchemaLite();
    private static final ExtensionSchema rl = t();

    static ExtensionSchema n() {
        ExtensionSchema extensionSchema = rl;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new IllegalStateException(FlTC.lOpqQhr);
    }

    static ExtensionSchema rl() {
        return f37915n;
    }

    private static ExtensionSchema t() {
        if (Protobuf.nr) {
            return null;
        }
        try {
            return (ExtensionSchema) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
