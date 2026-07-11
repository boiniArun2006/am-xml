package com.google.protobuf;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class l3D {
    abstract int extensionNumber(Map.Entry<?, ?> entry);

    abstract Object findExtensionByNumber(QJ qj, yg ygVar, int i2);

    abstract Q getExtensions(Object obj);

    abstract Q getMutableExtensions(Object obj);

    abstract boolean hasExtensions(yg ygVar);

    abstract void makeImmutable(Object obj);

    abstract <UT, UB> UB parseExtension(Object obj, FKk fKk, Object obj2, QJ qj, Q q2, UB ub, xuv xuvVar) throws IOException;

    abstract void parseLengthPrefixedMessageSetItem(FKk fKk, Object obj, QJ qj, Q q2) throws IOException;

    abstract void parseMessageSetItem(C c2, Object obj, QJ qj, Q q2) throws IOException;

    abstract void serializeExtension(crp crpVar, Map.Entry<?, ?> entry) throws IOException;

    abstract void setExtensions(Object obj, Q q2);

    l3D() {
    }
}
