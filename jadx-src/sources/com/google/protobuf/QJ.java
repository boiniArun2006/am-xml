package com.google.protobuf;

import com.google.protobuf.g9s;
import com.safedk.android.analytics.brandsafety.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class QJ {
    static final QJ EMPTY_REGISTRY_LITE = new QJ(true);
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets;
    private static volatile QJ emptyRegistry;
    private final Map<n, g9s.CN3> extensionsByNumber;

    private static class j {
        static final Class<?> INSTANCE = resolveExtensionClass();

        static Class<?> resolveExtensionClass() {
            try {
                return Class.forName(QJ.EXTENSION_CLASS_NAME);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        private j() {
        }
    }

    private static final class n {
        private final int number;
        private final Object object;

        public boolean equals(Object obj) {
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.object == nVar.object && this.number == nVar.number;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }

        n(Object obj, int i2) {
            this.object = obj;
            this.number = i2;
        }
    }

    QJ() {
        this.extensionsByNumber = new HashMap();
    }

    public final void add(g9s.CN3 cn3) {
        this.extensionsByNumber.put(new n(cn3.getContainingTypeDefaultInstance(), cn3.getNumber()), cn3);
    }

    public static QJ getEmptyRegistry() {
        QJ qjCreateEmpty;
        if (!doFullRuntimeInheritanceCheck) {
            return EMPTY_REGISTRY_LITE;
        }
        QJ qj = emptyRegistry;
        if (qj != null) {
            return qj;
        }
        synchronized (QJ.class) {
            try {
                qjCreateEmpty = emptyRegistry;
                if (qjCreateEmpty == null) {
                    qjCreateEmpty = C1925z.createEmpty();
                    emptyRegistry = qjCreateEmpty;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qjCreateEmpty;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static QJ newInstance() {
        return doFullRuntimeInheritanceCheck ? C1925z.create() : new QJ();
    }

    public static void setEagerlyParseMessageSets(boolean z2) {
        eagerlyParseMessageSets = z2;
    }

    public <ContainingType extends yg> g9s.CN3 findLiteExtensionByNumber(ContainingType containingtype, int i2) {
        return this.extensionsByNumber.get(new n(containingtype, i2));
    }

    public QJ getUnmodifiable() {
        return new QJ(this);
    }

    QJ(QJ qj) {
        if (qj == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.EMPTY_MAP;
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(qj.extensionsByNumber);
        }
    }

    public final void add(eO eOVar) {
        if (g9s.CN3.class.isAssignableFrom(eOVar.getClass())) {
            add((g9s.CN3) eOVar);
        }
        if (doFullRuntimeInheritanceCheck && C1925z.isFullRegistry(this)) {
            try {
                getClass().getMethod(l.f62657l, j.INSTANCE).invoke(this, eOVar);
            } catch (Exception e2) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", eOVar), e2);
            }
        }
    }

    QJ(boolean z2) {
        this.extensionsByNumber = Collections.EMPTY_MAP;
    }
}
