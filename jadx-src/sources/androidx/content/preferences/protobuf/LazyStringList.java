package androidx.content.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface LazyStringList extends ProtocolStringList {
    void a(ByteString byteString);

    Object getRaw(int i2);

    List getUnderlyingElements();
}
