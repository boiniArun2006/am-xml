package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ExtensionRegistryLite {
    private static volatile ExtensionRegistryLite rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final ExtensionRegistryLite f37910t = new ExtensionRegistryLite(true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f37911n = Collections.EMPTY_MAP;

    private static class ExtensionClassHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Class f37912n = n();

        static Class n() {
            try {
                return Class.forName("androidx.datastore.preferences.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    private static final class ObjectIntPair {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f37913n;
        private final int rl;

        public boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f37913n == objectIntPair.f37913n && this.rl == objectIntPair.rl;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f37913n) * 65535) + this.rl;
        }

        ObjectIntPair(Object obj, int i2) {
            this.f37913n = obj;
            this.rl = i2;
        }
    }

    public static ExtensionRegistryLite rl() {
        ExtensionRegistryLite extensionRegistryLiteN;
        if (Protobuf.nr) {
            return f37910t;
        }
        ExtensionRegistryLite extensionRegistryLite = rl;
        if (extensionRegistryLite != null) {
            return extensionRegistryLite;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLiteN = rl;
                if (extensionRegistryLiteN == null) {
                    extensionRegistryLiteN = ExtensionRegistryFactory.n();
                    rl = extensionRegistryLiteN;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return extensionRegistryLiteN;
    }

    public GeneratedMessageLite.GeneratedExtension n(MessageLite messageLite, int i2) {
        return (GeneratedMessageLite.GeneratedExtension) this.f37911n.get(new ObjectIntPair(messageLite, i2));
    }

    ExtensionRegistryLite(boolean z2) {
    }
}
